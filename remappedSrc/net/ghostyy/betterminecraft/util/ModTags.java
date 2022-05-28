package net.ghostyy.betterminecraft.util;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {

    public static class Blocks {

        public static TagKey<Block> BASE_STONE_END = createTag("base_stone_end");
        public static TagKey<Block> BOOKSHELVES = createCommonTag("bookshelves");
        public static TagKey<Block> MINEABLE_VOIDSTEEL = createTag("mineable_voidsteel");

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
}
