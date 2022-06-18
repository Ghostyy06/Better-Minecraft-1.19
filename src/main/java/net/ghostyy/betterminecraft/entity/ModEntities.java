package net.ghostyy.betterminecraft.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.ghostyy.betterminecraft.Better_Minecraft;
import net.ghostyy.betterminecraft.entity.client.EnderGhastRenderer;
import net.ghostyy.betterminecraft.entity.custom.EnderGhastEntity;
import net.ghostyy.betterminecraft.entity.custom.EnderGhastFireballEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.projectile.AbstractFireballEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {

    public static final EntityType<EnderGhastEntity> ENDER_GHAST = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(Better_Minecraft.MOD_ID, "ender_ghast"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, EnderGhastEntity::new)
                    .dimensions(EntityDimensions.fixed(4.0f, 4.0f)).fireImmune().build());

    public static void registerEntityAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.ENDER_GHAST, EnderGhastEntity.setAttributes());
    }
}
