package net.myndmelt.better_minecraft.world.gen;

import net.myndmelt.better_minecraft.world.feature.ModConfiguredFeatures;
import net.myndmelt.better_minecraft.world.feature.ModPlacedFeatures;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModFeatureGeneration.generateFeatures();
        ModConfiguredFeatures.registerConfiguredFeatures();
        ModPlacedFeatures.registerPlacedFeatures();
    }
}
