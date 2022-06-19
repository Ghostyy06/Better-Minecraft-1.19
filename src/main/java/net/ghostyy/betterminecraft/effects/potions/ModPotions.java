package net.ghostyy.betterminecraft.effects.potions;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.ghostyy.betterminecraft.item.ModItems;
import net.ghostyy.betterminecraft.mixin.BrewingRecipeRegistryMixin;
import net.ghostyy.betterminecraft.util.ModTags;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPotions {

    public static Potion LEVITATION = registerPotion("levitation", StatusEffects.LEVITATION, 900, 0);
    public static Potion LONG_LEVITATION = registerPotionVariant("long_levitation","levitation", StatusEffects.LEVITATION, 1800, 0);
    public static Potion STRONG_LEVITATION = registerPotionVariant("strong_levitation", "levitation", StatusEffects.LEVITATION, 450, 1);

    //Registries
    private static Potion registerPotion(String name, StatusEffect effect, int duration, int amplifier) {
        return Registry.register(Registry.POTION, new Identifier(Better_Minecraft.MOD_ID, name),
                new Potion(new StatusEffectInstance(effect, duration, amplifier)));
    }
    private static Potion registerPotionVariant(String name, String baseName, StatusEffect effect, int duration, int amplifier) {
        return Registry.register(Registry.POTION, new Identifier(Better_Minecraft.MOD_ID, name),
                new Potion(baseName, new StatusEffectInstance(effect, duration, amplifier)));
    }
    public static void registerPotions() {
        Better_Minecraft.LOGGER.info("Registering potions for " + Better_Minecraft.MOD_ID);
        registerPotionRecipes();
    }
    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.ENDER_GHAST_TEAR, ModPotions.LEVITATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LEVITATION, Items.REDSTONE, ModPotions.LONG_LEVITATION);
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(ModPotions.LEVITATION, Items.GLOWSTONE_DUST, ModPotions.STRONG_LEVITATION);
    }
}
