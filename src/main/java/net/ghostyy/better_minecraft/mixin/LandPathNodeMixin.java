package net.ghostyy.better_minecraft.mixin;

import net.ghostyy.better_minecraft.block.ModBlocks;
import net.ghostyy.better_minecraft.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;
import net.minecraft.entity.ai.pathing.LandPathNodeMaker;
import net.minecraft.tag.BlockTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LandPathNodeMaker.class)
public class LandPathNodeMixin {

    @Inject(method = "inflictsFireDamage", at = @At("TAIL"))
    private static boolean inflictsFireDamage(BlockState state, CallbackInfoReturnable<Boolean> info) {
        return state.isIn(BlockTags.FIRE) || state.isOf(Blocks.LAVA) || state.isIn(ModTags.Blocks.MAGMA_BLOCKS) || CampfireBlock.isLitCampfire(state) || state.isOf(Blocks.LAVA_CAULDRON);
    }
}
