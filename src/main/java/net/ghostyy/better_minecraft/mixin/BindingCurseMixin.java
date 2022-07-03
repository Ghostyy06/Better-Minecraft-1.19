package net.ghostyy.better_minecraft.mixin;

import net.minecraft.enchantment.BindingCurseEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin (BindingCurseEnchantment.class)
public abstract class  BindingCurseMixin {

    @Inject(method = "isTreasure", at = @At("RETURN"))
    public boolean isTreasure(CallbackInfoReturnable<Boolean> ci) {
        return false;
    }
    @Inject(method = "getMinPower", at = @At("RETURN"))
    public int getMinPower(int level, CallbackInfoReturnable<Boolean> ci) {
        return 25;
    }
    @Inject(method = "getMaxPower", at = @At("RETURN"))
    public int getMaxPower(int level, CallbackInfoReturnable<Boolean> ci) {
        return 50;
    }
}
