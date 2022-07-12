package net.ghostyy.better_minecraft.mixin;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.InfinityEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(InfinityEnchantment.class)
public abstract class InfinityMixin {

    @Inject(method = "canAccept", at = @At("RETURN"))
    public boolean canAccept(Enchantment other, CallbackInfoReturnable<Boolean> info) {
        return !(other instanceof InfinityEnchantment);
    }
}
