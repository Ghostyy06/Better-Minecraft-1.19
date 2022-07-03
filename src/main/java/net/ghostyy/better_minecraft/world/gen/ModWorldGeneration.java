package net.ghostyy.better_minecraft.world.gen;

import net.ghostyy.better_minecraft.world.feature.ModConfiguredFeatures;
import net.ghostyy.better_minecraft.world.feature.ModPlacedFeatures;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModFeatureGeneration.generateFeatures();
        ModConfiguredFeatures.registerConfiguredFeatures();
        ModPlacedFeatures.registerModPlacedFeatures();
    }
}
