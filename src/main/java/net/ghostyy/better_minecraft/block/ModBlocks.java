package net.ghostyy.better_minecraft.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ghostyy.better_minecraft.Better_Minecraft;
import net.ghostyy.better_minecraft.block.custom.ModButtonBlock;
import net.ghostyy.better_minecraft.block.custom.SoulMagmaBlock;
import net.ghostyy.better_minecraft.sound.ModSounds;
import net.ghostyy.better_minecraft.util.ModRegistry;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ModBlocks {

    //Voidsteel
    public static final Block VOIDSTEEL_DEBRIS = ModRegistry.registerBlock("voidsteel_debris",
            new Block(FabricBlockSettings.of(Material.METAL).mapColor(MapColor.BLACK).strength(40.0f,1600.0f)
                    .requiresTool().sounds(ModSounds.VOIDSTEEL_DEBRIS)), ItemGroup.BUILDING_BLOCKS, true);
    public static final Block VOIDSTEEL_BLOCK = ModRegistry.registerBlock("voidsteel_block",
            new Block(FabricBlockSettings.of(Material.METAL).mapColor(MapColor.BLACK).strength(60.0f,1600.0f)
                    .requiresTool().sounds(ModSounds.VOIDSTEEL_BLOCK)), ItemGroup.BUILDING_BLOCKS, true);

    //Calcite
    public static final Block CALCITE_STAIRS = ModRegistry.registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CALCITE)), ItemGroup.BUILDING_BLOCKS, false);
    public static final Block CALCITE_SLAB = ModRegistry.registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)), ItemGroup.BUILDING_BLOCKS, false);
    public static final Block CALCITE_WALL = ModRegistry.registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)), ItemGroup.DECORATIONS, false);

    //Bookshelves
    public static final Block BIRCH_BOOKSHELF = ModRegistry.registerBlock("birch_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block SPRUCE_BOOKSHELF = ModRegistry.registerBlock("spruce_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block JUNGLE_BOOKSHELF = ModRegistry.registerBlock("jungle_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block ACACIA_BOOKSHELF = ModRegistry.registerBlock("acacia_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block DARK_OAK_BOOKSHELF = ModRegistry.registerBlock("dark_oak_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block CRIMSON_BOOKSHELF = ModRegistry.registerBlock("crimson_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block WARPED_BOOKSHELF = ModRegistry.registerBlock("warped_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block MANGROVE_BOOKSHELF = ModRegistry.registerBlock("mangrove_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);

    //Generic Blocks
    public static final Block SOUL_MAGMA = ModRegistry.registerBlock("soul_magma",
            new SoulMagmaBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.BRIGHT_TEAL).requiresTool().luminance(state -> 3)
                    .ticksRandomly().strength(0.5f).allowsSpawning((state, world, pos, entitytype) -> entitytype.isFireImmune())
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ItemGroup.BUILDING_BLOCKS, false);
    public static final Block REINFORCED_WOOD = ModRegistry.registerBlock("reinforced_wood",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 5.5f).requiresTool().sounds(BlockSoundGroup.WOOD)),
            ItemGroup.BUILDING_BLOCKS, false);

    //Redstone
    public static final Block IRON_BUTTON = ModRegistry.registerBlock("iron_button",
            new ModButtonBlock(true, FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)), ItemGroup.REDSTONE, false);
    public static final Block GOLD_BUTTON = ModRegistry.registerBlock("gold_button",
            new ModButtonBlock(false, FabricBlockSettings.copyOf(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)), ItemGroup.REDSTONE, false);

    public static void registerModBlocks() {
        Better_Minecraft.LOGGER.info("Registering blocks for " + Better_Minecraft.MOD_ID);
    }
    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
}