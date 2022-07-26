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

    //Gilded Netherite
    public static Item GILDED_NETHERITE_SCRAP = registerItem("gilded_netherite_scrap", 
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static Item GILDED_NETHERITE_INGOT = registerItem("gilded_netherite_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    //Reinforced Netherite
    public static Item REINFORCED_NETHERITE_SCRAP = registerItem("reinforced_netherite_scrap",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static Item REINFORCED_NETHERITE_INGOT = registerItem("reinforced_netherite_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    //Gilded Netherite Tools
    public static Item GILDED_NETHERITE_SWORD = registerItem("gilded_netherite_sword",
            new SwordItem(ModToolMaterials.GILDED_NETHERITE, 3, -2.0f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static Item GILDED_NETHERITE_PICKAXE = registerItem("gilded_netherite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.GILDED_NETHERITE, 1, -2.4f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static Item GILDED_NETHERITE_AXE = registerItem("gilded_netherite_axe",
            new ModAxeItem(ModToolMaterials.GILDED_NETHERITE, 5, -2.6f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static Item GILDED_NETHERITE_SHOVEL = registerItem("gilded_netherite_shovel",
            new ShovelItem(ModToolMaterials.GILDED_NETHERITE, 1.5f, -2.6f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static Item GILDED_NETHERITE_HOE = registerItem("gilded_netherite_hoe",
            new ModHoeItem(ModToolMaterials.GILDED_NETHERITE, -3.5f, -2.0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    //Gilded Netherite Armor
    public static Item GILDED_NETHERITE_HELMET = registerItem("gilded_netherite_helmet",
            new ArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static Item GILDED_NETHERITE_CHESTPLATE = registerItem("gilded_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static Item GILDED_NETHERITE_LEGGINGS = registerItem("gilded_netherite_leggings",
            new ArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static Item GILDED_NETHERITE_BOOTS = registerItem("gilded_netherite_boots",
            new ArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    //Reinforced Netherite Tools
    public static Item REINFORCED_NETHERITE_SWORD = registerItem("reinforced_netherite_sword",
            new SwordItem(ModToolMaterials.REINFORCED_NETHERITE, 3, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static Item REINFORCED_NETHERITE_PICKAXE = registerItem("reinforced_netherite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.REINFORCED_NETHERITE, 1, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static Item REINFORCED_NETHERITE_AXE = registerItem("reinforced_netherite_axe",
            new ModAxeItem(ModToolMaterials.REINFORCED_NETHERITE, 5, -3.0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static Item REINFORCED_NETHERITE_SHOVEL = registerItem("reinforced_netherite_shovel",
            new ShovelItem(ModToolMaterials.REINFORCED_NETHERITE, 1.5f, -3.0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static Item REINFORCED_NETHERITE_HOE = registerItem("reinforced_netherite_hoe",
            new ModHoeItem(ModToolMaterials.REINFORCED_NETHERITE, -4.5f, -2.4f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    //Reinforced Netherite Armor
    public static Item REINFORCED_NETHERITE_HELMET = registerItem("reinforced_netherite_helmet",
            new ArmorItem(ModArmorMaterials.REINFORCED_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static Item REINFORCED_NETHERITE_CHESTPLATE = registerItem("reinforced_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.REINFORCED_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static Item REINFORCED_NETHERITE_LEGGINGS = registerItem("reinforced_netherite_leggings",
            new ArmorItem(ModArmorMaterials.REINFORCED_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static Item REINFORCED_NETHERITE_BOOTS = registerItem("reinforced_netherite_boots",
            new ArmorItem(ModArmorMaterials.REINFORCED_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    //Registries
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    public static void registerModItems() {
        Better_Minecraft.LOGGER.info("Registering items for " + Better_Minecraft.MOD_ID);
    }
}
