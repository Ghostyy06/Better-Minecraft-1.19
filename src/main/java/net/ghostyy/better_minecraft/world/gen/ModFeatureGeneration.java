package net.ghostyy.better_minecraft.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.ghostyy.better_minecraft.util.ModTags;
import net.ghostyy.better_minecraft.world.feature.ModPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

public class ModFeatureGeneration {
    public static void generateFeatures() {
        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.VOIDSTEEL_GENERATES_IN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.VOIDSTEEL_DEBRIS.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.VOIDSTEEL_GENERATES_IN),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.VOIDSTEEL_DEBRIS_SMALL.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.OBSIDIAN_CLUMP.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CRYING_OBSIDIAN_SHATTERED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.NETHER_WASTES),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.BLACKSTONE.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.tag(ModTags.Biomes.SOUL_SAND_VALLEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.SOUL_MAGMA.getKey().get());
    }
}
