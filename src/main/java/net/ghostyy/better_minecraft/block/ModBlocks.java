package net.ghostyy.better_minecraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ghostyy.better_minecraft.Better_Minecraft;
import net.ghostyy.better_minecraft.block.custom.ModButtonBlock;
import net.ghostyy.better_minecraft.block.custom.SoulMagmaBlock;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

import static net.ghostyy.better_minecraft.Better_Minecraft.MOD_ID;

public class ModBlocks {

    //Soul Magma
    public static final Block SOUL_MAGMA = registerBlock("soul_magma",
            new SoulMagmaBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.BRIGHT_TEAL).requiresTool().luminance(state -> 3)
                    .ticksRandomly().strength(0.5f).allowsSpawning((state, world, pos, entitytype) -> entitytype.isFireImmune())
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ItemGroup.BUILDING_BLOCKS, false);
    public static final Block REINFORCED_WOOD = registerBlock("reinforced_wood",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 5.5f).requiresTool().sounds(BlockSoundGroup.WOOD)),
            ItemGroup.BUILDING_BLOCKS, false);

    //Redstone
    public static final Block IRON_BUTTON = registerBlock("iron_button",
            new ModButtonBlock(true, FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)), ItemGroup.REDSTONE, false);
    public static final Block GOLD_BUTTON = registerBlock("gold_button",
            new ModButtonBlock(false, FabricBlockSettings.copyOf(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)), ItemGroup.REDSTONE, false);

    //Registries
    private static Block registerBlock(String name, Block block, ItemGroup group, boolean fireproof) {
        registerBlockItem(name, block, group, fireproof);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block, ItemGroup group, boolean fireproof) {
        if (fireproof) {
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings().group(group).fireproof()));
        } else {
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings().group(group)));
        }
    }
    private static Block registerOreVariant(String stoneType, String oreType, Block block) {
        String name;
        name = (stoneType + "_" + oreType + "_ore");
        registerBlockItem(name, block, ItemGroup.BUILDING_BLOCKS, false);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }
    
    public static void registerModBlocks() {
        Better_Minecraft.LOGGER.info("Registering blocks for " + Better_Minecraft.MOD_ID);
    }
    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
}