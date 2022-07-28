package net.myndmelt.better_minecraft.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.myndmelt.better_minecraft.util.ModTags;
import net.myndmelt.better_minecraft.world.feature.ModPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

import java.util.function.Predicate;

public class ModFeatureGeneration {

    private static final Predicate<BiomeSelectionContext> OUTER_END_ISLANDS =
            BiomeSelectors.tag(ModTags.Biomes.OUTER_END_ISLANDS);

    public static void generateFeatures() {

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.OBSIDIAN_CLUMP.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CRYING_OBSIDIAN_SHATTERED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.NETHER_WASTES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.BLACKSTONE_CLUMP.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SOUL_MAGMA.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.NETHER_WASTES),
                GenerationStep.Feature.LOCAL_MODIFICATIONS, ModPlacedFeatures.WASTES_BASALT_PILLAR.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.SOUL_SAND_VALLEY),
                GenerationStep.Feature.LOCAL_MODIFICATIONS, ModPlacedFeatures.SOUL_SAND_VALLEY_BASALT_PILLAR.getKey().get());
    }
}
