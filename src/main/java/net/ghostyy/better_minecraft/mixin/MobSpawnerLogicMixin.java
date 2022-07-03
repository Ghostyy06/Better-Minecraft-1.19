package net.ghostyy.better_minecraft.mixin;

import net.minecraft.world.MobSpawnerLogic;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MobSpawnerLogic.class)
public abstract class MobSpawnerLogicMixin {

    private int minSpawnDelay = 200;
    private int maxSpawnDelay = 600;
    private int spawnCount = 5;
    private int maxNearbyEntities = 8;
}
