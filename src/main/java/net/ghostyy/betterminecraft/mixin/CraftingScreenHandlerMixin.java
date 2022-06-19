package net.ghostyy.betterminecraft.mixin;

import net.minecraft.block.CraftingTableBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.CraftingScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import org.checkerframework.checker.fenum.qual.SwingHorizontalOrientation;
import org.checkerframework.checker.units.qual.Area;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CraftingScreenHandler.class)
public abstract class CraftingScreenHandlerMixin {

    @Shadow
    @Final
    private ScreenHandlerContext context;

    @Inject(method = "canUse", at = @At("RETURN"))
    public boolean canUse(PlayerEntity player, CallbackInfoReturnable<Boolean> info) {
        return this.context.get((world, pos) -> world.getBlockState(pos).getBlock() instanceof CraftingTableBlock, true);
    }
}
