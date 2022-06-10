package net.ghostyy.betterminecraft.mixin;

import net.minecraft.enchantment.ProtectionEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin (ProtectionEnchantment.class)
public abstract class ProtectionMixin {

    @Inject(method = "getMaxLevel", at = @At("RETURN"))
    public int getMaxLevel(CallbackInfoReturnable<Integer> ci) {
        return 5;
    }
}
