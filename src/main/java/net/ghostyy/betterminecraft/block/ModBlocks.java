package net.ghostyy.betterminecraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ghostyy.betterminecraft.Better_Minecraft;
import net.ghostyy.betterminecraft.block.custom.ModButtonBlock;
import net.ghostyy.betterminecraft.sound.ModSounds;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

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

    //Ore Variants
    public static final Block ANDESITE_COAL_ORE = registerOreVariant("andesite", "coal",
            Blocks.COAL_ORE, ItemGroup.BUILDING_BLOCKS, 0, 2);
    public static final Block ANDESITE_COPPER_ORE = registerOreVariant("andesite", "copper",
            Blocks.COPPER_ORE, ItemGroup.BUILDING_BLOCKS, 0, 0);
    public static final Block ANDESITE_DIAMOND_ORE = registerOreVariant("andesite", "diamond",
            Blocks.DIAMOND_ORE, ItemGroup.BUILDING_BLOCKS, 3, 7);
    public static final Block ANDESITE_EMERALD_ORE = registerOreVariant("andesite", "emerald",
            Blocks.EMERALD_ORE, ItemGroup.BUILDING_BLOCKS, 3, 7);
    public static final Block ANDESITE_GOLD_ORE = registerOreVariant("andesite", "gold",
            Blocks.GOLD_ORE, ItemGroup.BUILDING_BLOCKS, 0, 0);
    public static final Block ANDESITE_IRON_ORE = registerOreVariant("andesite", "iron",
            Blocks.IRON_ORE, ItemGroup.BUILDING_BLOCKS, 0, 0);
    public static final Block ANDESITE_LAPIS_ORE = registerOreVariant("andesite", "lapis",
            Blocks.LAPIS_ORE, ItemGroup.BUILDING_BLOCKS, 2, 5);
    public static final Block ANDESITE_REDSTONE_ORE = registerRedstoneOreVariant("andesite", "redstone",
            Blocks.REDSTONE_ORE, ItemGroup.BUILDING_BLOCKS);
    
    public static final Block DIORITE_COAL_ORE = registerOreVariant("diorite", "coal",
            Blocks.COAL_ORE, ItemGroup.BUILDING_BLOCKS, 0, 2);
    public static final Block DIORITE_COPPER_ORE = registerOreVariant("diorite", "copper",
            Blocks.COPPER_ORE, ItemGroup.BUILDING_BLOCKS, 0, 0);
    public static final Block DIORITE_DIAMOND_ORE = registerOreVariant("diorite", "diamond",
            Blocks.DIAMOND_ORE, ItemGroup.BUILDING_BLOCKS, 3, 7);
    public static final Block DIORITE_EMERALD_ORE = registerOreVariant("diorite", "emerald",
            Blocks.EMERALD_ORE, ItemGroup.BUILDING_BLOCKS, 3, 7);
    public static final Block DIORITE_GOLD_ORE = registerOreVariant("diorite", "gold",
            Blocks.GOLD_ORE, ItemGroup.BUILDING_BLOCKS, 0, 0);
    public static final Block DIORITE_IRON_ORE = registerOreVariant("diorite", "iron",
            Blocks.IRON_ORE, ItemGroup.BUILDING_BLOCKS, 0, 0);
    public static final Block DIORITE_LAPIS_ORE = registerOreVariant("diorite", "lapis",
            Blocks.LAPIS_ORE, ItemGroup.BUILDING_BLOCKS, 2, 5);
    public static final Block DIORITE_REDSTONE_ORE = registerRedstoneOreVariant("diorite", "redstone",
            Blocks.REDSTONE_ORE, ItemGroup.BUILDING_BLOCKS);

    public static final Block GRANITE_COAL_ORE = registerOreVariant("granite", "coal",
            Blocks.COAL_ORE, ItemGroup.BUILDING_BLOCKS, 0, 2);
    public static final Block GRANITE_COPPER_ORE = registerOreVariant("granite", "copper",
            Blocks.COPPER_ORE, ItemGroup.BUILDING_BLOCKS, 0, 0);
    public static final Block GRANITE_DIAMOND_ORE = registerOreVariant("granite", "diamond",
            Blocks.DIAMOND_ORE, ItemGroup.BUILDING_BLOCKS, 3, 7);
    public static final Block GRANITE_EMERALD_ORE = registerOreVariant("granite", "emerald",
            Blocks.EMERALD_ORE, ItemGroup.BUILDING_BLOCKS, 3, 7);
    public static final Block GRANITE_GOLD_ORE = registerOreVariant("granite", "gold",
            Blocks.GOLD_ORE, ItemGroup.BUILDING_BLOCKS, 0, 0);
    public static final Block GRANITE_IRON_ORE = registerOreVariant("granite", "iron",
            Blocks.IRON_ORE, ItemGroup.BUILDING_BLOCKS, 0, 0);
    public static final Block GRANITE_LAPIS_ORE = registerOreVariant("granite", "lapis",
            Blocks.LAPIS_ORE, ItemGroup.BUILDING_BLOCKS, 2, 5);
    public static final Block GRANITE_REDSTONE_ORE = registerRedstoneOreVariant("granite", "redstone",
            Blocks.REDSTONE_ORE, ItemGroup.BUILDING_BLOCKS);

    public static final Block TUFF_COAL_ORE = registerOreVariant("tuff", "coal",
            Blocks.COAL_ORE, ItemGroup.BUILDING_BLOCKS, 0, 2);
    public static final Block TUFF_COPPER_ORE = registerOreVariant("tuff", "copper",
            Blocks.COPPER_ORE, ItemGroup.BUILDING_BLOCKS, 0, 0);
    public static final Block TUFF_DIAMOND_ORE = registerOreVariant("tuff", "diamond",
            Blocks.DIAMOND_ORE, ItemGroup.BUILDING_BLOCKS, 3, 7);
    public static final Block TUFF_EMERALD_ORE = registerOreVariant("tuff", "emerald",
            Blocks.EMERALD_ORE, ItemGroup.BUILDING_BLOCKS, 3, 7);
    public static final Block TUFF_GOLD_ORE = registerOreVariant("tuff", "gold",
            Blocks.GOLD_ORE, ItemGroup.BUILDING_BLOCKS, 0, 0);
    public static final Block TUFF_IRON_ORE = registerOreVariant("tuff", "iron",
            Blocks.IRON_ORE, ItemGroup.BUILDING_BLOCKS, 0, 0);
    public static final Block TUFF_LAPIS_ORE = registerOreVariant("tuff", "lapis",
            Blocks.LAPIS_ORE, ItemGroup.BUILDING_BLOCKS, 2, 5);
    public static final Block TUFF_REDSTONE_ORE = registerRedstoneOreVariant("tuff", "redstone",
            Blocks.REDSTONE_ORE, ItemGroup.BUILDING_BLOCKS);

    //Redstone
    public static final Block IRON_BUTTON = registerBlock("iron_button",
            new ModButtonBlock(true, FabricBlockSettings.copyOf(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE)), ItemGroup.REDSTONE, false);
    public static final Block GOLD_BUTTON = registerBlock("gold_button",
            new ModButtonBlock(false, FabricBlockSettings.copyOf(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE)), ItemGroup.REDSTONE, false);

    private static Block registerBlock(String name, Block block, ItemGroup group, boolean fireproof) {
        registerBlockItem(name, block, group, fireproof);
        return Registry.register(Registry.BLOCK, new Identifier(Better_Minecraft.MODID, name), block);
    }
    private static void registerBlockItem(String name, Block block, ItemGroup group, boolean fireproof) {
        if (fireproof) {
            Registry.register(Registry.ITEM, new Identifier(Better_Minecraft.MODID, name),
                    new BlockItem(block, new FabricItemSettings().group(group).fireproof()));
        } else {
            Registry.register(Registry.ITEM, new Identifier(Better_Minecraft.MODID, name),
                    new BlockItem(block, new FabricItemSettings().group(group)));
        }
    }
    private static Block registerOreVariant(String stoneType, String oreType, Block copyOf, ItemGroup group, int minXP, int maxXP) {
        String path;
        path = (stoneType + "_" + oreType + "_ore");
        Block block;
        block = new OreBlock(FabricBlockSettings.copyOf(copyOf), UniformIntProvider.create(minXP, maxXP));
        registerBlockItem(path, block, group, false);
        return Registry.register(Registry.BLOCK, new Identifier(Better_Minecraft.MODID, path), block);
    }
            //Redstone ore uses custom block class
    private static Block registerRedstoneOreVariant(String stoneType, String oreType, Block copyOf, ItemGroup group) {
        String path;
        path = (stoneType + "_" + oreType + "_ore");
        Block block;
        block = new RedstoneOreBlock(FabricBlockSettings.copyOf(copyOf));
        registerBlockItem(path, block, group, false);
        return Registry.register(Registry.BLOCK, new Identifier(Better_Minecraft.MODID, path), block);
    }

    public static void registerModBlocks() {
        Better_Minecraft.LOGGER.info("Registering mod blocks for " + Better_Minecraft.MODID);
    }
}