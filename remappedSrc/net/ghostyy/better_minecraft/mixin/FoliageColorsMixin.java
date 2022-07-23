package net.ghostyy.better_minecraft.mixin;

import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FoliageColors.class)
public abstract class FoliageColorsMixin {

    @Inject(method = "getSpruceColor", at = @At("RETURN"))
    private static int getSpruceColor(CallbackInfoReturnable<Integer> info) {
        return 2795314;
    }

    @Inject(method = "getBirchColor", at = @At("RETURN"))
    private static int getBirchColor(CallbackInfoReturnable<Integer> info) {
        return 4304452;
    }
}
