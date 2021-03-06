package net.myndmelt.better_minecraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.myndmelt.better_minecraft.Better_Minecraft;
import net.myndmelt.better_minecraft.item.custom.ModAxeItem;
import net.myndmelt.better_minecraft.item.custom.ModHoeItem;
import net.myndmelt.better_minecraft.item.custom.ModPickaxeItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.myndmelt.better_minecraft.Better_Minecraft.MOD_ID;

public class ModItems {

    //Registries
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        Better_Minecraft.LOGGER.info("Registering items for " + Better_Minecraft.MOD_ID);
    }
}
