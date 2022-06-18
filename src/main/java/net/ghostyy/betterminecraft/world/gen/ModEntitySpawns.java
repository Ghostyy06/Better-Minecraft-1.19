package net.ghostyy.betterminecraft.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.mixin.object.builder.SpawnRestrictionAccessor;
import net.ghostyy.betterminecraft.entity.ModEntities;
import net.ghostyy.betterminecraft.util.ModTags;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.mob.GhastEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.world.Heightmap;

public class ModEntitySpawns {
    public static void addEntitySpawns() {
        BiomeModifications.addSpawn(BiomeSelectors.foundInTheEnd(),
                SpawnGroup.MONSTER, EntityType.ENDERMITE, 7, 1, 4);

        BiomeModifications.addSpawn(BiomeSelectors.tag(ModTags.Biomes.VOIDSTEEL_GENERATES_IN),
                SpawnGroup.MONSTER, ModEntities.ENDER_GHAST, 3, 1, 1);
        SpawnRestrictionAccessor.callRegister(ModEntities.ENDER_GHAST, SpawnRestriction.Location.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, GhastEntity::canMobSpawn);
    }
}
