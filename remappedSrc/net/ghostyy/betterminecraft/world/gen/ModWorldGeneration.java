package net.ghostyy.betterminecraft.world.gen;

import net.ghostyy.betterminecraft.world.feature.ModConfiguredFeatures;
import net.ghostyy.betterminecraft.world.feature.ModPlacedFeatures;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModFeatureGeneration.generateFeatures();
        ModConfiguredFeatures.registerConfiguredFeatures();
        ModPlacedFeatures.registerModPlacedFeatures();
    }
}
