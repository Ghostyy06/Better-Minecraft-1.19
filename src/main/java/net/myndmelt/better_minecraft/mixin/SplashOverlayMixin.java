package net.myndmelt.better_minecraft.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.SplashOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(SplashOverlay.class)
public abstract class SplashOverlayMixin {

    /**
     *
     * @param client
     * @author myndmelt
     * @reason bc i had to
     */
    @Overwrite
    public static void init(MinecraftClient client) {
        return;
    }
}
