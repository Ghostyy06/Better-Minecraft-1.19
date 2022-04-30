package net.ghostyy.betterminecraft.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.world.gen.feature.DungeonFeature;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(DungeonFeature.class)
public abstract class DungeonFeatureMixin {

    private static final EntityType<?>[] MOB_SPAWNER_ENTITIES = new EntityType[]{
            EntityType.SKELETON, EntityType.ZOMBIE, EntityType.ZOMBIE,
            EntityType.SPIDER, EntityType.ENDERMAN, EntityType.WITCH, EntityType.CREEPER
    };
}