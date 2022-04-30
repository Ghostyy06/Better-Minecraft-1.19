package net.ghostyy.betterminecraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.ghostyy.betterminecraft.Better_Minecraft;
import net.ghostyy.betterminecraft.item.custom.ModAxeItem;
import net.ghostyy.betterminecraft.item.custom.ModHoeItem;
import net.ghostyy.betterminecraft.item.custom.ModPickaxeItem;
import net.ghostyy.betterminecraft.item.custom.VoidsteelPickaxeItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Netherite Variants
    public static final Item GILDED_NETHERITE_SCRAP = registerItem("gilded_netherite_scrap",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item GILDED_NETHERITE_INGOT = registerItem("gilded_netherite_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item REINFORCED_NETHERITE_SCRAP = registerItem("reinforced_netherite_scrap",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item REINFORCED_NETHERITE_INGOT = registerItem("reinforced_netherite_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    //Voidsteel Materials
    public static final Item VOIDSTEEL_SCRAP = registerItem("voidsteel_scrap",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item VOIDSTEEL_INGOT = registerItem("voidsteel_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    //Voidsteel Tools
    public static final Item VOIDSTEEL_SWORD = registerItem("voidsteel_sword",
            new SwordItem(ModToolMaterials.VOIDSTEEL, 3, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item VOIDSTEEL_PICKAXE = registerItem("voidsteel_pickaxe",
            new VoidsteelPickaxeItem(ModToolMaterials.VOIDSTEEL, 1, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item VOIDSTEEL_AXE = registerItem("voidsteel_axe",
            new ModAxeItem(ModToolMaterials.VOIDSTEEL, 5, -3.0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item VOIDSTEEL_SHOVEL = registerItem("voidsteel_shovel",
            new ShovelItem(ModToolMaterials.VOIDSTEEL, 1.5f, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item VOIDSTEEL_HOE = registerItem("voidsteel_hoe",
            new ModHoeItem(ModToolMaterials.VOIDSTEEL, -5, 0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    //Gilded Netherite Tools
    public static final Item GILDED_NETHERITE_SWORD = registerItem("gilded_netherite_sword",
            new SwordItem(ModToolMaterials.GILDED_NETHERITE, 3, -2.0f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item GILDED_NETHERITE_PICKAXE = registerItem("gilded_netherite_pickaxe",
            new VoidsteelPickaxeItem(ModToolMaterials.GILDED_NETHERITE, 1, -2.4f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item GILDED_NETHERITE_AXE = registerItem("gilded_netherite_axe",
            new ModAxeItem(ModToolMaterials.GILDED_NETHERITE, 5, -2.6f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item GILDED_NETHERITE_SHOVEL = registerItem("gilded_netherite_shovel",
            new ShovelItem(ModToolMaterials.GILDED_NETHERITE, 1.5f, -2.6f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item GILDED_NETHERITE_HOE = registerItem("gilded_netherite_hoe",
            new ModHoeItem(ModToolMaterials.GILDED_NETHERITE, -4, 0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    //Reinforced Netherite Tools
    public static final Item REINFORCED_NETHERITE_SWORD = registerItem("reinforced_netherite_sword",
            new SwordItem(ModToolMaterials.REINFORCED_NETHERITE, 3, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item REINFORCED_NETHERITE_PICKAXE = registerItem("reinforced_netherite_pickaxe",
            new VoidsteelPickaxeItem(ModToolMaterials.REINFORCED_NETHERITE, 1, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item REINFORCED_NETHERITE_AXE = registerItem("reinforced_netherite_axe",
            new ModAxeItem(ModToolMaterials.REINFORCED_NETHERITE, 5, -3.0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item REINFORCED_NETHERITE_SHOVEL = registerItem("reinforced_netherite_shovel",
            new ShovelItem(ModToolMaterials.REINFORCED_NETHERITE, 1.5f, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));
    public static final Item REINFORCED_NETHERITE_HOE = registerItem("reinforced_netherite_hoe",
            new ModHoeItem(ModToolMaterials.REINFORCED_NETHERITE, -4, 0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS).fireproof()));

    //Amethyst Tools
    public static final Item AMETHYST_SWORD = registerItem("amethyst_sword",
            new SwordItem(ModToolMaterials.AMETHYST, 3, -2.4f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item AMETHYST_PICKAXE = registerItem("amethyst_pickaxe",
            new ModPickaxeItem(ModToolMaterials.AMETHYST, 1, -2.8f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item AMETHYST_AXE = registerItem("amethyst_axe",
            new ModAxeItem(ModToolMaterials.AMETHYST, 5, -3.1f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item AMETHYST_SHOVEL = registerItem("amethyst_shovel",
            new ShovelItem(ModToolMaterials.AMETHYST, 1.5f, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item AMETHYST_HOE = registerItem("amethyst_hoe",
            new ModHoeItem(ModToolMaterials.AMETHYST, -2, 0f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    //Voidsteel Armor
    public static final Item VOIDSTEEL_HELMET = registerItem("voidsteel_helmet",
            new ArmorItem(ModArmorMaterials.VOIDSTEEL, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item VOIDSTEEL_CHESTPLATE = registerItem("voidsteel_chestplate",
            new ArmorItem(ModArmorMaterials.VOIDSTEEL, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item VOIDSTEEL_LEGGINGS = registerItem("voidsteel_leggings",
            new ArmorItem(ModArmorMaterials.VOIDSTEEL, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item VOIDSTEEL_BOOTS = registerItem("voidsteel_boots",
            new ArmorItem(ModArmorMaterials.VOIDSTEEL, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

    //Gilded Netherite Armor
    public static final Item GILDED_NETHERITE_HELMET = registerItem("gilded_netherite_helmet",
            new ArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item GILDED_NETHERITE_CHESTPLATE = registerItem("gilded_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item GILDED_NETHERITE_LEGGINGS = registerItem("gilded_netherite_leggings",
            new ArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item GILDED_NETHERITE_BOOTS = registerItem("gilded_netherite_boots",
            new ArmorItem(ModArmorMaterials.GILDED_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

    //Reinforced Netherite Armor
    public static final Item REINFORCED_NETHERITE_HELMET = registerItem("reinforced_netherite_helmet",
            new ArmorItem(ModArmorMaterials.REINFORCED_NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item REINFORCED_NETHERITE_CHESTPLATE = registerItem("reinforced_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.REINFORCED_NETHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item REINFORCED_NETHERITE_LEGGINGS = registerItem("reinforced_netherite_leggings",
            new ArmorItem(ModArmorMaterials.REINFORCED_NETHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));
    public static final Item REINFORCED_NETHERITE_BOOTS = registerItem("reinforced_netherite_boots",
            new ArmorItem(ModArmorMaterials.REINFORCED_NETHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));

    //Registries
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Better_Minecraft.MODID, name), item);
    }
    public static void registerModItems() {
        Better_Minecraft.LOGGER.info("Registering mod items for " + Better_Minecraft.MODID);
    }
}