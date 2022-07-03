package net.ghostyy.better_minecraft.effects.potions;

import net.ghostyy.better_minecraft.Better_Minecraft;
import net.ghostyy.better_minecraft.item.ModItems;
import net.ghostyy.better_minecraft.util.ModRegistry;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;

public class ModPotions {

    public static Potion WITHER = ModRegistry.registerPotion("wither", StatusEffects.WITHER, 900, 0);
    public static Potion LONG_WITHER = ModRegistry.registerPotionVariant("long_wither","wither", StatusEffects.WITHER, 1800, 0);
    public static Potion STRONG_WITHER = ModRegistry.registerPotionVariant("strong_wither", "wither", StatusEffects.WITHER, 450, 1);

    //Registries
    public static void registerPotions() {
        Better_Minecraft.LOGGER.info("Registering potions for " + Better_Minecraft.MOD_ID);
        registerPotionRecipes();
    }
    private static void registerPotionRecipes() {
        ModRegistry.registerPotionRecipe(Potions.AWKWARD, ModItems.SHULKER_PEARL, ModPotions.WITHER);
        ModRegistry.registerPotionRecipe(ModPotions.WITHER, Items.REDSTONE, ModPotions.LONG_WITHER);
        ModRegistry.registerPotionRecipe(ModPotions.WITHER, Items.GLOWSTONE_DUST, ModPotions.STRONG_WITHER);
    }
}
