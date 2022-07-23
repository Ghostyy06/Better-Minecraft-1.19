package net.ghostyy.better_minecraft.world.feature;

import net.ghostyy.better_minecraft.Better_Minecraft;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.NetherConfiguredFeatures;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

public class ModPlacedFeatures {

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
            ModConfiguredFeatures.SOUL_MAGMA, ModOreFeatures.modifiersWithCount(2,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(64), YOffset.belowTop(0))));

    //Extra Basalt Pillars
    public static final RegistryEntry<PlacedFeature> WASTES_BASALT_PILLAR = PlacedFeatures.register("wastes_basalt_pillar",
            NetherConfiguredFeatures.BASALT_PILLAR, CountPlacementModifier.of(10),
            SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_TOP_RANGE);
    public static final RegistryEntry<PlacedFeature> SOUL_SAND_VALLEY_BASALT_PILLAR = PlacedFeatures.register("soul_sand_valley_basalt_pillar",
            NetherConfiguredFeatures.BASALT_PILLAR, CountPlacementModifier.of(20),
            SquarePlacementModifier.of(), PlacedFeatures.BOTTOM_TO_TOP_RANGE);

    //Netherite Variants
    public static final RegistryEntry<PlacedFeature> GILDED_DEBRIS_SMALL = PlacedFeatures.register("gilded_debris_small",
            ModConfiguredFeatures.GILDED_DEBRIS_SMALL, SquarePlacementModifier.of(), PlacedFeatures.EIGHT_ABOVE_AND_BELOW_RANGE);
    public static final RegistryEntry<PlacedFeature> GILDED_DEBRIS_LARGE = PlacedFeatures.register("gilded_debris_large",
            ModConfiguredFeatures.GILDED_DEBRIS_LARGE, SquarePlacementModifier.of(),
            HeightRangePlacementModifier.trapezoid(YOffset.fixed(104), YOffset.fixed(120)));
    public static final RegistryEntry<PlacedFeature> REINFORCED_DEBRIS_SMALL = PlacedFeatures.register("reinforced_debris_small",
            ModConfiguredFeatures.REINFORCED_DEBRIS_SMALL, SquarePlacementModifier.of(), PlacedFeatures.EIGHT_ABOVE_AND_BELOW_RANGE);
    public static final RegistryEntry<PlacedFeature> REINFORCED_DEBRIS_LARGE = PlacedFeatures.register("reinforced_debris_large",
            ModConfiguredFeatures.REINFORCED_DEBRIS_LARGE, SquarePlacementModifier.of(),
            HeightRangePlacementModifier.trapezoid(YOffset.fixed(104), YOffset.fixed(120)));

    //Init
    public static void registerPlacedFeatures() {
        Better_Minecraft.LOGGER.info("Registering placed features for " + Better_Minecraft.MOD_ID);
    }

}
