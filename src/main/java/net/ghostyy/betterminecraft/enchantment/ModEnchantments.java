package net.ghostyy.betterminecraft.enchantment;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.ghostyy.betterminecraft.enchantment.custom.ModDamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {

    public static final Enchantment BANE_OF_ILLAGERS = register("bane_of_illagers",
            new ModDamageEnchantment(Enchantment.Rarity.UNCOMMON, 0, EquipmentSlot.MAINHAND));

    public static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(Better_Minecraft.MODID, name), enchantment);
    }

    public static void registerModEnchantments() {
        Better_Minecraft.LOGGER.info("Registering mod enchantments for " + Better_Minecraft.MODID);
    }
}
