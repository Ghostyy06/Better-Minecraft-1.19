package net.ghostyy.betterminecraft.recipe;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Better_Minecraft.MODID, NetheriteBlastFurnaceRecipe.Serializer.ID),
                NetheriteBlastFurnaceRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Better_Minecraft.MODID, NetheriteBlastFurnaceRecipe.Type.ID),
                NetheriteBlastFurnaceRecipe.Type.INSTANCE);
    }
}
