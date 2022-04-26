package net.ghostyy.betterminecraft.block.entity;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.ghostyy.betterminecraft.block.ModBlocks;
import net.ghostyy.betterminecraft.block.custom.NetheriteBlastFurnaceBlock;
import net.ghostyy.betterminecraft.item.ModItems;
import net.ghostyy.betterminecraft.recipe.NetheriteBlastFurnaceRecipe;
import net.ghostyy.betterminecraft.screen.NetheriteBlastFurnaceScreen;
import net.ghostyy.betterminecraft.screen.NetheriteBlastFurnaceScreenHandler;
import net.ghostyy.betterminecraft.util.inventory.ImplementedInventory;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.WordPackedArray;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class NetheriteBlastFurnaceEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(4, ItemStack.EMPTY);

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 299;
    private int fuelTime = 0;
    private int maxFuelTime = 0;

    public NetheriteBlastFurnaceEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.NETHERITE_BLAST_FURNACE, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    case 0: return NetheriteBlastFurnaceEntity.this.progress;
                    case 1: return NetheriteBlastFurnaceEntity.this.maxProgress;
                    case 2: return NetheriteBlastFurnaceEntity.this.fuelTime;
                    case 3: return NetheriteBlastFurnaceEntity.this.maxFuelTime;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch (index) {
                    case 0: NetheriteBlastFurnaceEntity.this.progress = value; break;
                    case 1: NetheriteBlastFurnaceEntity.this.maxProgress = value; break;
                    case 2: NetheriteBlastFurnaceEntity.this.fuelTime = value; break;
                    case 3: NetheriteBlastFurnaceEntity.this.maxFuelTime = value; break;
                }
            }

            public int size() {
                return 4;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public Text getDisplayName() {
        return new TranslatableText("container.netherite_blast_furnace");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new NetheriteBlastFurnaceScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("blast_furnace.progress", progress);
        nbt.putInt("blast_furnace.fuelTime", fuelTime);
        nbt.putInt("blast_furnace.maxFuelTime", maxFuelTime);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        Inventories.readNbt(nbt, inventory);
        nbt.getInt("blast_furnace.progress");
        nbt.getInt("blast_furnace.fuelTime");
        nbt.getInt("blast_furnace.maxFuelTime");
    }

    private void consumeFuel() {
        if(!getStack(0).isEmpty()) {
            this.fuelTime = FuelRegistry.INSTANCE.get(this.removeStack(0, 1).getItem()) / 16;
            this.maxFuelTime = this.fuelTime;
        }
    }

    public static void tick(World world, BlockPos pos, BlockState state, NetheriteBlastFurnaceEntity entity) {
        if(isConsumingFuel(entity)) {
            entity.fuelTime--;
        }

        if(hasRecipe(entity)) {
            if(hasFuelInFuelSlot(entity) && !isConsumingFuel(entity)) {
                entity.consumeFuel();
            }
            if(isConsumingFuel(entity)) {
                entity.progress++;
                if(entity.progress > entity.maxProgress) {
                    craftItem(entity);
                }
            }
        } else {
            entity.resetProgress();
        }
        if(isConsumingFuel(entity)) {
            state = state.with(NetheriteBlastFurnaceBlock.LIT, entity.fuelTime > 1);
            world.setBlockState(pos, state, Block.NOTIFY_ALL);
        }
    }

    private static boolean hasFuelInFuelSlot(NetheriteBlastFurnaceEntity entity) {
        return !entity.getStack(0).isEmpty();
    }

    private static boolean isConsumingFuel(NetheriteBlastFurnaceEntity entity) {
        return entity.fuelTime > 0;
    }

    private static boolean hasRecipe(NetheriteBlastFurnaceEntity entity) {
        World world = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<NetheriteBlastFurnaceRecipe> match = world.getRecipeManager()
                .getFirstMatch(NetheriteBlastFurnaceRecipe.Type.INSTANCE, inventory, world);

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getOutput());
    }

    private static void craftItem(NetheriteBlastFurnaceEntity entity) {
        World world = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<NetheriteBlastFurnaceRecipe> match = world.getRecipeManager()
                .getFirstMatch(NetheriteBlastFurnaceRecipe.Type.INSTANCE, inventory, world);

        if(match.isPresent()) {
            entity.removeStack(1,1);
            entity.removeStack(2,1);

            entity.setStack(3, new ItemStack(match.get().getOutput().getItem(),
                    entity.getStack(3).getCount() + 1));

            entity.resetProgress();
        }
    }

    private void resetProgress() {
        this.progress = 0;
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, ItemStack output) {
        return inventory.getStack(3).getItem() == output.getItem() || inventory.getStack(3).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(3).getMaxCount() > inventory.getStack(3).getCount();
    }
}