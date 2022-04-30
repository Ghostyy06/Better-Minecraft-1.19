package net.ghostyy.betterminecraft.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class ModPlacedFeatures {

    //Gilded Netherite Debris
    public static final RegistryEntry<PlacedFeature> GILDED_NETHERITE_DEBRIS = PlacedFeatures.register("gilded_debris",
            ModConfiguredFeatures.GILDED_NETHERITE_DEBRIS, SquarePlacementModifier.of(), HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(24)), BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> GILDED_NETHERITE_DEBRIS_SMALL = PlacedFeatures.register("gilded_debris_small",
            ModConfiguredFeatures.GILDED_NETHERITE_DEBRIS_SMALL, SquarePlacementModifier.of(), PlacedFeatures.EIGHT_ABOVE_AND_BELOW_RANGE, BiomePlacementModifier.of());

    //Reinforced Netherite Debris
    public static final RegistryEntry<PlacedFeature> REINFORCED_NETHERITE_DEBRIS = PlacedFeatures.register("reinforced_debris",
            ModConfiguredFeatures.REINFORCED_NETHERITE_DEBRIS, SquarePlacementModifier.of(), HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(24)), BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> REINFORCED_NETHERITE_DEBRIS_SMALL = PlacedFeatures.register("reinforced_debris_small",
            ModConfiguredFeatures.REINFORCED_NETHERITE_DEBRIS_SMALL, SquarePlacementModifier.of(), PlacedFeatures.EIGHT_ABOVE_AND_BELOW_RANGE, BiomePlacementModifier.of());

    //Voidsteel Debris
    public static final RegistryEntry<PlacedFeature> VOIDSTEEL_DEBRIS = PlacedFeatures.register("voidsteel_debris",
            ModConfiguredFeatures.VOIDSTEEL_DEBRIS, SquarePlacementModifier.of(), HeightRangePlacementModifier.trapezoid(YOffset.fixed(24), YOffset.fixed(40)), BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> VOIDSTEEL_DEBRIS_SMALL = PlacedFeatures.register("voidsteel_debris_small",
            ModConfiguredFeatures.VOIDSTEEL_DEBRIS_SMALL, SquarePlacementModifier.of(), PlacedFeatures.EIGHT_ABOVE_AND_BELOW_RANGE, BiomePlacementModifier.of());

    //End Obsidian
    public static final RegistryEntry<PlacedFeature> OBSIDIAN = PlacedFeatures.register("end_obsidian",
            ModConfiguredFeatures.OBSIDIAN, ModOreFeatures.modifiersWithCount(3, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));

}
