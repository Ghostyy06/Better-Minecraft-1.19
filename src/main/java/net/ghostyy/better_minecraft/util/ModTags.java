package net.ghostyy.better_minecraft.util;

import net.ghostyy.better_minecraft.Better_Minecraft;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class ModTags {

    public static class Blocks {

        public static TagKey<Block> BASE_STONE_END = createTag("base_stone_end");
        public static TagKey<Block> BOOKSHELVES = createCommonTag("bookshelves");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(Better_Minecraft.MOD_ID, name));
        }
        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Better_Minecraft.MOD_ID, name));
        }
        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }

    public static class Biomes {

        public static final TagKey<Biome> NETHER_WASTES = createCommonTag("nether_wastes");
        public static final TagKey<Biome> SOUL_SAND_VALLEY = createCommonTag("soul_sand_valley");
        public static final TagKey<Biome> OUTER_END_ISLANDS = createTag("outer_end_islands");
        public static final TagKey<Biome> WARPED_FOREST = createCommonTag("warped_forest");

        private static TagKey<Biome> createTag(String name) {
            return TagKey.of(Registry.BIOME_KEY, new Identifier(Better_Minecraft.MOD_ID, name));
        }
        private static TagKey<Biome> createCommonTag(String name) {
            return TagKey.of(Registry.BIOME_KEY, new Identifier("c", name));
        }
    }
}
