package net.ghostyy.betterminecraft.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.ghostyy.betterminecraft.Better_Minecraft;
import net.ghostyy.betterminecraft.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<NetheriteBlastFurnaceEntity> NETHERITE_BLAST_FURNACE;

    public static void registerModBlockEntities() {
        NETHERITE_BLAST_FURNACE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Better_Minecraft.MODID, "netherite_blast_furnace"),
                FabricBlockEntityTypeBuilder.create(NetheriteBlastFurnaceEntity::new,
                        ModBlocks.NETHERITE_BLAST_FURNACE).build(null));
    }
}
