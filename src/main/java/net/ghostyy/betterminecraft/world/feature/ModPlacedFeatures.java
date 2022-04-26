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

    //Voidsteel Debris
    public static final RegistryEntry<PlacedFeature> VOIDSTEEL_DEBRIS = PlacedFeatures.register("voidsteel_debris",
            ModConfiguredFeatures.VOIDSTEEL_DEBRIS, SquarePlacementModifier.of(), HeightRangePlacementModifier.trapezoid(YOffset.fixed(24), YOffset.fixed(40)), BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> VOIDSTEEL_DEBRIS_SMALL = PlacedFeatures.register("voidsteel_debris_small",
            ModConfiguredFeatures.VOIDSTEEL_DEBRIS_SMALL, SquarePlacementModifier.of(), PlacedFeatures.EIGHT_ABOVE_AND_BELOW_RANGE, BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> OBSIDIAN = PlacedFeatures.register("end_obsidian",
            ModConfiguredFeatures.OBSIDIAN, ModOreFeatures.modifiersWithCount(3, HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));

}
