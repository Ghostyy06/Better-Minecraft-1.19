package net.ghostyy.betterminecraft.util;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import javax.swing.plaf.basic.BasicEditorPaneUI;

public class ModTags {

    //Blocks
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(Better_Minecraft.MODID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c", name));
        }

        public static final TagKey<Block> BASE_STONE_END = createTag("base_stone_end");
    }

    //Items
    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier(Better_Minecraft.MODID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }


    }
}
