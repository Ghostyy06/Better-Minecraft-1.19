package net.ghostyy.betterminecraft.mixin;

import net.minecraft.enchantment.FireAspectEnchantment;
import net.minecraft.enchantment.KnockbackEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin (KnockbackEnchantment.class)
public abstract class KnockbackMixin {

    @Inject(method = "getMaxLevel", at = @At("RETURN"))
    public int getMaxLevel(CallbackInfoReturnable ci) {
        return 3;
    }
}
