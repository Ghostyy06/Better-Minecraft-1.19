package net.ghostyy.better_minecraft.enchantment;

import net.ghostyy.better_minecraft.Better_Minecraft;
import net.ghostyy.better_minecraft.enchantment.custom.*;
import net.ghostyy.better_minecraft.util.ModRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;

public class ModEnchantments {

    public static final Enchantment BANE_OF_ILLAGERS = ModRegistry.registerEnchantment("bane_of_illagers",
            new ExtraDamageEnchantment(Enchantment.Rarity.UNCOMMON, ExtraDamageEnchantment.ILLAGERS, EquipmentSlot.MAINHAND));
    public static final Enchantment SNIPE = ModRegistry.registerEnchantment("snipe",
            new SnipeEnchantment(Enchantment.Rarity.RARE, EquipmentSlot.MAINHAND));

    public static void registerModEnchantments() {
        Better_Minecraft.LOGGER.info("Registering enchantments for " + Better_Minecraft.MOD_ID);
    }
}
