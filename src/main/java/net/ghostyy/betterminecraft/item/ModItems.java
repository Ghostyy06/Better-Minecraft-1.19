package net.ghostyy.betterminecraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.ghostyy.betterminecraft.Better_Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item VOIDSTEEL_INGOT = registerItem("voidsteel_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Better_Minecraft.MODID, name), item);
    }
    public static void registerModItems() {
        Better_Minecraft.LOGGER.info("Registering mod items for" + Better_Minecraft.MODID);
    }
}
