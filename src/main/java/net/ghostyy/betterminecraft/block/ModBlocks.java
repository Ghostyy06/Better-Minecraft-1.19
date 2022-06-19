package net.ghostyy.betterminecraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ghostyy.betterminecraft.Better_Minecraft;
import net.ghostyy.betterminecraft.block.custom.ModButtonBlock;
import net.ghostyy.betterminecraft.block.custom.SoulMagmaBlock;
import net.ghostyy.betterminecraft.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.BlockView;

public class ModBlocks {

    //Voidsteel
    public static final Block VOIDSTEEL_DEBRIS = registerBlock("voidsteel_debris",
            new Block(FabricBlockSettings.of(Material.METAL).mapColor(MapColor.BLACK).strength(40.0f,1600.0f)
                    .requiresTool().sounds(ModSounds.VOIDSTEEL_DEBRIS)), ItemGroup.BUILDING_BLOCKS, true);
    public static final Block VOIDSTEEL_BLOCK = registerBlock("voidsteel_block",
            new Block(FabricBlockSettings.of(Material.METAL).mapColor(MapColor.BLACK).strength(60.0f,1600.0f)
                    .requiresTool().sounds(ModSounds.VOIDSTEEL_BLOCK)), ItemGroup.BUILDING_BLOCKS, true);

    //Calcite
    public static final Block CALCITE_STAIRS = registerBlock("calcite_stairs",
            new StairsBlock(Blocks.CALCITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CALCITE)), ItemGroup.BUILDING_BLOCKS, false);
    public static final Block CALCITE_SLAB = registerBlock("calcite_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)), ItemGroup.BUILDING_BLOCKS, false);
    public static final Block CALCITE_WALL = registerBlock("calcite_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.CALCITE)), ItemGroup.DECORATIONS, false);

    //Bookshelves
    public static final Block BIRCH_BOOKSHELF = registerBlock("birch_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block SPRUCE_BOOKSHELF = registerBlock("spruce_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block JUNGLE_BOOKSHELF = registerBlock("jungle_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block ACACIA_BOOKSHELF = registerBlock("acacia_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block DARK_OAK_BOOKSHELF = registerBlock("dark_oak_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block CRIMSON_BOOKSHELF = registerBlock("crimson_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block WARPED_BOOKSHELF = registerBlock("warped_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);
    public static final Block MANGROVE_BOOKSHELF = registerBlock("mangrove_bookshelf",
            new Block(FabricBlockSettings.copyOf(Blocks.BOOKSHELF)), ItemGroup.DECORATIONS, false);

    //Generic Blocks
    public static final Block SOUL_MAGMA = registerBlock("soul_magma",
            new SoulMagmaBlock(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.BRIGHT_TEAL).requiresTool().luminance(state -> 3)
                    .ticksRandomly().strength(0.5f).allowsSpawning((state, world, pos, entitytype) -> entitytype.isFireImmune())
                    .postProcess(ModBlocks::always).emissiveLighting(ModBlocks::always)), ItemGroup.BUILDING_BLOCKS, false);

    //Redstone
    public static final Block IRON_BUTTON = registerBlock("iron_button",
            new ModButtonBlock(true, FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)), ItemGroup.REDSTONE, false);
    public static final Block GOLD_BUTTON = registerBlock("gold_button",
            new ModButtonBlock(false, FabricBlockSettings.copyOf(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)), ItemGroup.REDSTONE, false);

    //Crafting table variants
    public static final Block BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table",
            new CraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)), ItemGroup.DECORATIONS, false);
    public static final Block SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table",
            new CraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)), ItemGroup.DECORATIONS, false);
    public static final Block JUNGLE_CRAFTING_TABLE = registerBlock("jungle_crafting_table",
            new CraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)), ItemGroup.DECORATIONS, false);
    public static final Block ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table",
            new CraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)), ItemGroup.DECORATIONS, false);
    public static final Block DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table",
            new CraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)), ItemGroup.DECORATIONS, false);
    public static final Block MANGROVE_CRAFTING_TABLE = registerBlock("mangrove_crafting_table",
            new CraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)), ItemGroup.DECORATIONS, false);
    public static final Block CRIMSON_CRAFTING_TABLE = registerBlock("crimson_crafting_table",
            new CraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)), ItemGroup.DECORATIONS, false);
    public static final Block WARPED_CRAFTING_TABLE = registerBlock("warped_crafting_table",
            new CraftingTableBlock(FabricBlockSettings.copyOf(Blocks.CRAFTING_TABLE)), ItemGroup.DECORATIONS, false);

    //Registries
    private static Block registerBlock(String name, Block block, ItemGroup group, boolean fireproof) {
        registerBlockItem(name, block, group, fireproof);
        return Registry.register(Registry.BLOCK, new Identifier(Better_Minecraft.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block, ItemGroup group, boolean fireproof) {
        if (fireproof) {
            Registry.register(Registry.ITEM, new Identifier(Better_Minecraft.MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings().group(group).fireproof()));
        } else {
            Registry.register(Registry.ITEM, new Identifier(Better_Minecraft.MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings().group(group)));
        }
    }
    private static Block registerOreVariant(String stoneType, String oreType, Block block) {
        String name;
        name = (stoneType + "_" + oreType + "_ore");
        registerBlockItem(name, block, ItemGroup.BUILDING_BLOCKS, false);
        return Registry.register(Registry.BLOCK, new Identifier(Better_Minecraft.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        Better_Minecraft.LOGGER.info("Registering blocks for " + Better_Minecraft.MOD_ID);
    }
    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
}