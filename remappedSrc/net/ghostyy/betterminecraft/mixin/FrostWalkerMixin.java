package net.ghostyy.betterminecraft.mixin;

import net.minecraft.enchantment.FrostWalkerEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin (FrostWalkerEnchantment.class)
public abstract class FrostWalkerMixin {

    @Inject(method = "getMaxLevel", at = @At("RETURN"))
    public int getMaxLevel(CallbackInfoReturnable ci) {
        return 3;
    }
}
