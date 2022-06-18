package net.ghostyy.betterminecraft.entity.client;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.ghostyy.betterminecraft.entity.custom.EnderGhastEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.GhastEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.GhastEntityModel;
import net.minecraft.entity.mob.GhastEntity;
import net.minecraft.util.Identifier;

public class EnderGhastRenderer extends GhastEntityRenderer {

    private static final Identifier BASE_TEXTURE = new Identifier(Better_Minecraft.MOD_ID, "textures/entity/ender_ghast/ender_ghast.png");

    private static final Identifier SHOOTING_TEXTURE = new Identifier(Better_Minecraft.MOD_ID, "textures/entity/ender_ghast/ender_ghast_shooting.png");

    public EnderGhastRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(GhastEntity ghastEntity) {
        if (ghastEntity.isShooting()) {
            return SHOOTING_TEXTURE;
        }
        return BASE_TEXTURE;
    }
}
