package net.ghostyy.better_minecraft.enchantment;

import net.ghostyy.better_minecraft.Better_Minecraft;
import net.ghostyy.better_minecraft.enchantment.custom.*;
import net.ghostyy.better_minecraft.util.ModRegistry;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {

    public static final Enchantment SNIPE = registerEnchantment("snipe",
            new SnipeEnchantment(Enchantment.Rarity.RARE, EquipmentSlot.MAINHAND));

    //Registries
    private static Enchantment registerEnchantment(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(Better_Minecraft.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        Better_Minecraft.LOGGER.info("Registering enchantments for " + Better_Minecraft.MOD_ID);
    }
}
