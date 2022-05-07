package net.ghostyy.betterminecraft.mixin;

import net.minecraft.world.MobSpawnerLogic;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MobSpawnerLogic.class)
public abstract class MobSpawnerLogicMixin {

    private int minSpawnDelay = 0;
    private int maxSpawnDelay = 1;
}
