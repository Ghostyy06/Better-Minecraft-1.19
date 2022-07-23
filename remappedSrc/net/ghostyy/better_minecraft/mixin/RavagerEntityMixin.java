package net.ghostyy.better_minecraft.mixin;

import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.mob.RavagerEntity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(RavagerEntity.class)
public abstract class RavagerEntityMixin {

    public EntityGroup getGroup() {
        return EntityGroup.ILLAGER;
    }

}
