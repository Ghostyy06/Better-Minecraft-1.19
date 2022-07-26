package net.myndmelt.better_minecraft.mixin;

import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockRenderView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BiomeColors.class)
public abstract class BiomeColorsMixin {

    @Inject(method = "getWaterColor", at = @At("RETURN"))
    private static int getWaterColor(BlockRenderView world, BlockPos pos, CallbackInfoReturnable<Integer> info) {
        return 4574685;
    }
}
