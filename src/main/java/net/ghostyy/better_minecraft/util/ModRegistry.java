package net.ghostyy.better_minecraft.util;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.ghostyy.better_minecraft.Better_Minecraft;
import net.ghostyy.better_minecraft.block.ModBlocks;
import net.ghostyy.better_minecraft.mixin.BrewingRecipeRegistryMixin;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Potion;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.ghostyy.better_minecraft.Better_Minecraft.MOD_ID;

public class ModRegistry {

    //Item Registries
    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    //Block Registries
    public static Block registerBlock(String name, Block block, ItemGroup group, boolean fireproof) {
        registerBlockItem(name, block, group, fireproof);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }
    public static void registerBlockItem(String name, Block block, ItemGroup group, boolean fireproof) {
        if (fireproof) {
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings().group(group).fireproof()));
        } else {
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                    new BlockItem(block, new FabricItemSettings().group(group)));
        }
    }
    public static Block registerOreVariant(String stoneType, String oreType, Block block) {
        String name;
        name = (stoneType + "_" + oreType + "_ore");
        registerBlockItem(name, block, ItemGroup.BUILDING_BLOCKS, false);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    //Enchantment Registries
    public static Enchantment registerEnchantment(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(Better_Minecraft.MOD_ID, name), enchantment);
    }

    //Potion Registries
    public static Potion registerPotion(String name, StatusEffect effect, int duration, int amplifier) {
        return Registry.register(Registry.POTION, new Identifier(Better_Minecraft.MOD_ID, name),
                new Potion(new StatusEffectInstance(effect, duration, amplifier)));
    }
    public static Potion registerPotionVariant(String name, String baseName, StatusEffect effect, int duration, int amplifier) {
        return Registry.register(Registry.POTION, new Identifier(Better_Minecraft.MOD_ID, name),
                new Potion(baseName, new StatusEffectInstance(effect, duration, amplifier)));
    }
    public static void registerPotionRecipe(Potion input, Item item, Potion output) {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(input, item, output);
    }

    //Fuel Registries
    public static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModBlocks.BIRCH_BOOKSHELF.asItem(), 300);
        registry.add(ModBlocks.SPRUCE_BOOKSHELF.asItem(), 300);
        registry.add(ModBlocks.JUNGLE_BOOKSHELF.asItem(), 300);
        registry.add(ModBlocks.ACACIA_BOOKSHELF.asItem(), 300);
        registry.add(ModBlocks.DARK_OAK_BOOKSHELF.asItem(), 300);
        registry.add(ModBlocks.CRIMSON_BOOKSHELF.asItem(), 300);
        registry.add(ModBlocks.WARPED_BOOKSHELF.asItem(), 300);
        registry.add(ModBlocks.MANGROVE_BOOKSHELF.asItem(), 300);
        registry.add(ModBlocks.REINFORCED_WOOD.asItem(), 600);
    }
}
