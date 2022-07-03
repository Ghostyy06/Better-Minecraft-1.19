package net.ghostyy.better_minecraft.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.ghostyy.better_minecraft.util.ModTags;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

public class ModEntitySpawns {
    public static void addEntitySpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.tag(ModTags.Biomes.WARPED_FOREST),
                SpawnGroup.MONSTER, EntityType.ENDERMAN, 10, 2, 4);
        BiomeModifications.addSpawn(BiomeSelectors.tag(ModTags.Biomes.WARPED_FOREST),
                SpawnGroup.MONSTER, EntityType.PHANTOM, 1, 0, 1);
    }
}
