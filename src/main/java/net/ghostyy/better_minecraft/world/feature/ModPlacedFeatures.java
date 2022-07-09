package net.ghostyy.better_minecraft.world.feature;

import net.ghostyy.better_minecraft.Better_Minecraft;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.NetherConfiguredFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.UndergroundConfiguredFeatures;
import net.minecraft.world.gen.placementmodifier.*;

public class ModPlacedFeatures {

    //Voidsteel Debris
    public static final RegistryEntry<PlacedFeature> VOIDSTEEL_DEBRIS = PlacedFeatures.register("voidsteel_debris",
            ModConfiguredFeatures.VOIDSTEEL_DEBRIS, ModOreFeatures.modifiersWithCount(3,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(16), YOffset.aboveBottom(32))));

    //End Obsidian
    public static final RegistryEntry<PlacedFeature> OBSIDIAN_CLUMP = PlacedFeatures.register("obsidian_clump",
            ModConfiguredFeatures.OBSIDIAN_CLUMP, ModOreFeatures.modifiersWithCount(4,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));
    public static final RegistryEntry<PlacedFeature> CRYING_OBSIDIAN_SHATTERED = PlacedFeatures.register("crying_obsidian_shattered",
            ModConfiguredFeatures.CRYING_OBSIDIAN_SHATTERED, ModOreFeatures.modifiersWithCount(16,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));

    //Nether Blackstone
    public static final RegistryEntry<PlacedFeature> BLACKSTONE_CLUMP = PlacedFeatures.register("blackstone_clump",
            ModConfiguredFeatures.BLACKSTONE_CLUMP, ModOreFeatures.modifiersWithCount(15,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(24), YOffset.fixed(104))));

    //Soul Magma
    public static final RegistryEntry<PlacedFeature> SOUL_MAGMA = PlacedFeatures.register("soul_magma",
            ModConfiguredFeatures.SOUL_MAGMA, ModOreFeatures.modifiersWithCount(4,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(64), YOffset.belowTop(0))));

    //Extra Basalt Pillars
    public static final RegistryEntry<PlacedFeature> WASTES_BASALT_PILLAR = PlacedFeatures.register("wastes_basalt_pillar",
            NetherConfiguredFeatures.BASALT_PILLAR, CountPlacementModifier.of(10),
            SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_TOP_RANGE);
    public static final RegistryEntry<PlacedFeature> SOUL_SAND_VALLEY_BASALT_PILLAR = PlacedFeatures.register("soul_sand_valley_basalt_pillar",
            NetherConfiguredFeatures.BASALT_PILLAR, CountPlacementModifier.of(40),
            SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_TOP_RANGE);

    //Nether Ores
    public static final RegistryEntry<PlacedFeature> NETHER_COAL_ORE = PlacedFeatures.register("nether_coal_ore",
            ModConfiguredFeatures.NETHER_COAL_ORE, ModOreFeatures.modifiersWithCount(15,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.getTop())));
    public static final RegistryEntry<PlacedFeature> NETHER_IRON_ORE = PlacedFeatures.register("nether_iron_ore",
            ModConfiguredFeatures.NETHER_IRON_ORE, ModOreFeatures.modifiersWithCount(12,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.getTop())));
    public static final RegistryEntry<PlacedFeature> NETHER_REDSTONE_ORE = PlacedFeatures.register("nether_redstone_ore",
            ModConfiguredFeatures.NETHER_REDSTONE_ORE, ModOreFeatures.modifiersWithCount(8,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.getTop())));
    public static final RegistryEntry<PlacedFeature> NETHER_LAPIS_ORE = PlacedFeatures.register("nether_lapis_ore",
            ModConfiguredFeatures.NETHER_LAPIS_ORE, ModOreFeatures.modifiersWithCount(8,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.getTop())));

    //End Ores
    public static final RegistryEntry<PlacedFeature> END_LAPIS_ORE = PlacedFeatures.register("end_lapis_ore",
            ModConfiguredFeatures.END_LAPIS_ORE, ModOreFeatures.modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.getTop())));
    public static final RegistryEntry<PlacedFeature> END_REDSTONE_ORE = PlacedFeatures.register("end_redstone_ore",
            ModConfiguredFeatures.END_REDSTONE_ORE, ModOreFeatures.modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.getTop())));
    public static final RegistryEntry<PlacedFeature> END_GOLD_ORE = PlacedFeatures.register("end_gold_ore",
            ModConfiguredFeatures.END_GOLD_ORE, ModOreFeatures.modifiersWithCount(6,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.getTop())));
    public static final RegistryEntry<PlacedFeature> END_EMERALD_ORE = PlacedFeatures.register("end_emerald_ore",
            ModConfiguredFeatures.END_EMERALD_ORE, ModOreFeatures.modifiersWithCount(4,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.getTop())));

    //Init
    public static void registerModPlacedFeatures() {
        Better_Minecraft.LOGGER.info("Registering placed features for " + Better_Minecraft.MOD_ID);
    }

}
