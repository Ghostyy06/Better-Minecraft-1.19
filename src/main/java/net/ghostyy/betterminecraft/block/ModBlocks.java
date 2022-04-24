package net.ghostyy.betterminecraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.ghostyy.betterminecraft.Better_Minecraft;
import net.ghostyy.betterminecraft.sound.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block VOIDSTEEL_DEBRIS = registerBlock("voidsteel_debris",
            new Block(FabricBlockSettings.of(Material.METAL).mapColor(MapColor.BLACK).strength(40f,1600f).requiresTool().sounds(ModSounds.VOIDSTEEL_DEBRIS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block VOIDSTEEL_BLOCK = registerBlock("voidsteel_block",
            new Block(FabricBlockSettings.of(Material.METAL).mapColor(MapColor.BLACK).strength(60f,1600f).requiresTool().sounds(BlockSoundGroup.NETHERITE)), ItemGroup.BUILDING_BLOCKS);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Better_Minecraft.MODID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Better_Minecraft.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks() {
        Better_Minecraft.LOGGER.info("Registering mod blocks for" + Better_Minecraft.MODID);
    }
}
