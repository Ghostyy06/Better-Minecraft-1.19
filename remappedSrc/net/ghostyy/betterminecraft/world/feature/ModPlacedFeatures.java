package net.ghostyy.betterminecraft.world.feature;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.carver.Carver;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.carver.RavineCarver;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class ModPlacedFeatures {

    //Voidsteel Debris
    public static final RegistryEntry<PlacedFeature> VOIDSTEEL_DEBRIS = PlacedFeatures.register("voidsteel_debris",
            ModConfiguredFeatures.VOIDSTEEL_DEBRIS, SquarePlacementModifier.of(),
            HeightRangePlacementModifier.trapezoid(YOffset.fixed(24), YOffset.fixed(40)), BiomePlacementModifier.of());
    public static final RegistryEntry<PlacedFeature> VOIDSTEEL_DEBRIS_SMALL = PlacedFeatures.register("voidsteel_debris_small",
            ModConfiguredFeatures.VOIDSTEEL_DEBRIS_SMALL, SquarePlacementModifier.of(),
            PlacedFeatures.EIGHT_ABOVE_AND_BELOW_RANGE, BiomePlacementModifier.of());

    //End Obsidian
    public static final RegistryEntry<PlacedFeature> OBSIDIAN_CLUMP = PlacedFeatures.register("end_obsidian_clump",
            ModConfiguredFeatures.OBSIDIAN_CLUMP, ModOreFeatures.modifiersWithCount(4,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));
    public static final RegistryEntry<PlacedFeature> OBSIDIAN_SHATTERED = PlacedFeatures.register("end_obsidian_shattered",
            ModConfiguredFeatures.OBSIDIAN_SHATTERED, ModOreFeatures.modifiersWithCount(16,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));
    public static final RegistryEntry<PlacedFeature> CRYING_OBSIDIAN_CLUMP = PlacedFeatures.register("end_crying_obsidian_clump",
            ModConfiguredFeatures.CRYING_OBSIDIAN_CLUMP, ModOreFeatures.modifiersWithCount(4,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));
    public static final RegistryEntry<PlacedFeature> CRYING_OBSIDIAN_SHATTERED = PlacedFeatures.register("end_crying_obsidian_shattered",
            ModConfiguredFeatures.CRYING_OBSIDIAN_SHATTERED, ModOreFeatures.modifiersWithCount(16,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.belowTop(0))));

    //Init
    public static void registerModPlacedFeatures() {
        Better_Minecraft.LOGGER.info("Registering mod placed features for " + Better_Minecraft.MODID);
    }

}
