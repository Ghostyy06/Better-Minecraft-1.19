package net.ghostyy.betterminecraft.enchantment;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.ghostyy.betterminecraft.enchantment.custom.*;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {

    public static final Enchantment BANE_OF_ILLAGERS = register("bane_of_illagers",
            new ExtraDamageEnchantment(Enchantment.Rarity.UNCOMMON, ExtraDamageEnchantment.ILLAGERS, EquipmentSlot.MAINHAND));
    public static final Enchantment SNIPE = register("snipe",
            new SnipeEnchantment(Enchantment.Rarity.RARE, EquipmentSlot.MAINHAND));

    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(Better_Minecraft.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        Better_Minecraft.LOGGER.info("Registering enchantments for " + Better_Minecraft.MOD_ID);
    }
}
