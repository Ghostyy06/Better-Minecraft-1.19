package net.ghostyy.betterminecraft.mixin;

import net.ghostyy.betterminecraft.util.GhostSlotClear;
import net.minecraft.client.gui.screen.recipebook.RecipeBookGhostSlots;
import net.minecraft.client.gui.screen.recipebook.RecipeBookWidget;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.transformer.meta.MixinInner;

@Mixin(RecipeBookWidget.class)
public class RecipeBookWidgetMixin implements GhostSlotClear {


    @Shadow
    @Final
    protected RecipeBookGhostSlots ghostSlots;

    @Override
    public void clearGhostSlots() {
        this.ghostSlots.reset();
    }
}