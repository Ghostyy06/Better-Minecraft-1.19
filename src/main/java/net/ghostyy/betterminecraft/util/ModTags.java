package net.ghostyy.betterminecraft.util;

import net.ghostyy.betterminecraft.Better_Minecraft;
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
            return TagKey.of(Registry.BLOCK_KEY ,new Identifier(Better_Minecraft.MODID, name));
        }
        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY ,new Identifier("c", name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY ,new Identifier(Better_Minecraft.MODID, name));
        }
        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY ,new Identifier("c", name));
        }
    }

    public static class Biomes {

        public static final TagKey<Biome> NETHER_WASTES = createCommonTag("nether_wastes");
        public static final TagKey<Biome> SOUL_SAND_VALLEY = createCommonTag("soul_sand_valley");

        private static TagKey<Biome> createTag(String name) {
            return TagKey.of(Registry.BIOME_KEY ,new Identifier(Better_Minecraft.MODID, name));
        }
        private static TagKey<Biome> createCommonTag(String name) {
            return TagKey.of(Registry.BIOME_KEY ,new Identifier("c", name));
        }
    }
}
