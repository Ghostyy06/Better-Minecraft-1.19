package net.ghostyy.better_minecraft.mixin;

import net.minecraft.enchantment.ImpalingEnchantment;
import net.minecraft.entity.EntityGroup;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ImpalingEnchantment.class)
public abstract class ImpalingMixin {

    @Inject(method = "getAttackDamage", at = @At("RETURN"))
    public float getAttackDamage(int level, EntityGroup group, CallbackInfoReturnable<Float> info) {
        if (group == EntityGroup.AQUATIC) {
            return (float)level * 2.5f;
        }
        return (float)level;
    }
}
