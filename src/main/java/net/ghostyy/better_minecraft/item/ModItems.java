package net.ghostyy.better_minecraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.ghostyy.better_minecraft.Better_Minecraft;
import net.ghostyy.better_minecraft.item.custom.ModAxeItem;
import net.ghostyy.better_minecraft.item.custom.ModHoeItem;
import net.ghostyy.better_minecraft.item.custom.ModPickaxeItem;
import net.ghostyy.better_minecraft.util.ModRegistry;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;

public class ModItems {

    //Materials
    public static final Item VOIDSTEEL_SCRAP = ModRegistry.registerItem("voidsteel_scrap",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item VOIDSTEEL_INGOT = ModRegistry.registerItem("voidsteel_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    //Voidsteel Tools
    public static final Item VOIDSTEEL_SWORD = ModRegistry.registerItem("voidsteel_sword",
            new SwordItem(ModToolMaterials.VOIDSTEEL, 3, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item VOIDSTEEL_PICKAXE = ModRegistry.registerItem("voidsteel_pickaxe",
            new ModPickaxeItem(ModToolMaterials.VOIDSTEEL, 1, -3.0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item VOIDSTEEL_AXE = ModRegistry.registerItem("voidsteel_axe",
            new ModAxeItem(ModToolMaterials.VOIDSTEEL, 5, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item VOIDSTEEL_SHOVEL = ModRegistry.registerItem("voidsteel_shovel",
            new ShovelItem(ModToolMaterials.VOIDSTEEL, 1.5f, -3.0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item VOIDSTEEL_HOE = ModRegistry.registerItem("voidsteel_hoe",
            new ModHoeItem(ModToolMaterials.VOIDSTEEL, -5, 0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    //Voidsteel Armor
    public static final Item VOIDSTEEL_HELMET = ModRegistry.registerItem("voidsteel_helmet",
            new ArmorItem(ModArmorMaterials.VOIDSTEEL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item VOIDSTEEL_CHESTPLATE = ModRegistry.registerItem("voidsteel_chestplate",
            new ArmorItem(ModArmorMaterials.VOIDSTEEL, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item VOIDSTEEL_LEGGINGS = ModRegistry.registerItem("voidsteel_leggings",
            new ArmorItem(ModArmorMaterials.VOIDSTEEL, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item VOIDSTEEL_BOOTS = ModRegistry.registerItem("voidsteel_boots",
            new ArmorItem(ModArmorMaterials.VOIDSTEEL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

    public static void registerModItems() {
        Better_Minecraft.LOGGER.info("Registering items for " + Better_Minecraft.MOD_ID);
    }
}
