package net.ghostyy.betterminecraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ghostyy.betterminecraft.Better_Minecraft;
import net.ghostyy.betterminecraft.block.custom.ModButtonBlock;
import net.ghostyy.betterminecraft.block.custom.SoulMagmaBlock;
import net.ghostyy.betterminecraft.sound.ModSounds;
import net.minecraft.block.*;
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

    //Ore Varients
    public static final Block ANDESITE_COAL_ORE = registerOreVariant("andesite", "coal",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE), UniformIntProvider.create(0, 2)));
    public static final Block ANDESITE_COPPER_ORE = registerOreVariant("andesite", "copper",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block ANDESITE_DIAMOND_ORE = registerOreVariant("andesite", "diamond",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE), UniformIntProvider.create(3, 7)));
    public static final Block ANDESITE_EMERALD_ORE = registerOreVariant("andesite", "emerald",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE), UniformIntProvider.create(3, 7)));
    public static final Block ANDESITE_GOLD_ORE = registerOreVariant("andesite", "gold",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block ANDESITE_IRON_ORE = registerOreVariant("andesite", "iron",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block ANDESITE_LAPIS_ORE = registerOreVariant("andesite", "lapis",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE), UniformIntProvider.create(2, 5)));
    public static final Block ANDESITE_REDSTONE_ORE = registerOreVariant("andesite", "redstone",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_ORE)));

    public static final Block DIORITE_COAL_ORE = registerOreVariant("diorite", "coal",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE), UniformIntProvider.create(0, 2)));
    public static final Block DIORITE_COPPER_ORE = registerOreVariant("diorite", "copper",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block DIORITE_DIAMOND_ORE = registerOreVariant("diorite", "diamond",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE), UniformIntProvider.create(3, 7)));
    public static final Block DIORITE_EMERALD_ORE = registerOreVariant("diorite", "emerald",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE), UniformIntProvider.create(3, 7)));
    public static final Block DIORITE_GOLD_ORE = registerOreVariant("diorite", "gold",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block DIORITE_IRON_ORE = registerOreVariant("diorite", "iron",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DIORITE_LAPIS_ORE = registerOreVariant("diorite", "lapis",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE), UniformIntProvider.create(2, 5)));
    public static final Block DIORITE_REDSTONE_ORE = registerOreVariant("diorite", "redstone",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_ORE)));

    public static final Block GRANITE_COAL_ORE = registerOreVariant("granite", "coal",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE), UniformIntProvider.create(0, 2)));
    public static final Block GRANITE_COPPER_ORE = registerOreVariant("granite", "copper",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block GRANITE_DIAMOND_ORE = registerOreVariant("granite", "diamond",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE), UniformIntProvider.create(3, 7)));
    public static final Block GRANITE_EMERALD_ORE = registerOreVariant("granite", "emerald",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE), UniformIntProvider.create(3, 7)));
    public static final Block GRANITE_GOLD_ORE = registerOreVariant("granite", "gold",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block GRANITE_IRON_ORE = registerOreVariant("granite", "iron",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block GRANITE_LAPIS_ORE = registerOreVariant("granite", "lapis",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE), UniformIntProvider.create(2, 5)));
    public static final Block GRANITE_REDSTONE_ORE = registerOreVariant("granite", "redstone",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_ORE)));

    public static final Block TUFF_COAL_ORE = registerOreVariant("tuff", "coal",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE), UniformIntProvider.create(0, 2)));
    public static final Block TUFF_COPPER_ORE = registerOreVariant("tuff", "copper",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block TUFF_DIAMOND_ORE = registerOreVariant("tuff", "diamond",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE), UniformIntProvider.create(3, 7)));
    public static final Block TUFF_EMERALD_ORE = registerOreVariant("tuff", "emerald",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_ORE), UniformIntProvider.create(3, 7)));
    public static final Block TUFF_GOLD_ORE = registerOreVariant("tuff", "gold",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block TUFF_IRON_ORE = registerOreVariant("tuff", "iron",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block TUFF_LAPIS_ORE = registerOreVariant("tuff", "lapis",
            new OreBlock(FabricBlockSettings.copyOf(Blocks.LAPIS_ORE), UniformIntProvider.create(2, 5)));
    public static final Block TUFF_REDSTONE_ORE = registerOreVariant("tuff", "redstone",
            new RedstoneOreBlock(FabricBlockSettings.copyOf(Blocks.REDSTONE_ORE)));

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
        Better_Minecraft.LOGGER.info("Registering mod blocks for " + Better_Minecraft.MOD_ID);
    }
    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }
}