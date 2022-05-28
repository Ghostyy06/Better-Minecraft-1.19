package net.ghostyy.betterminecraft.mixin;

import net.minecraft.entity.decoration.ArmorStandEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ArmorStandEntity.class)
public abstract class ArmorStandEntityMixin {

    @Inject(method = "shouldShowArms", at = @At("RETURN"))
    public boolean shouldShowArms(CallbackInfoReturnable info) {
        return true;
    }
}
