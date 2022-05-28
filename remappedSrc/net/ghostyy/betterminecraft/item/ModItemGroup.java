package net.ghostyy.betterminecraft.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.ghostyy.betterminecraft.Better_Minecraft;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup CREATIVE_UTILS = FabricItemGroupBuilder.create(new Identifier(Better_Minecraft.MODID, "creative_utils"))
            .icon(() -> new ItemStack(Blocks.REPEATING_COMMAND_BLOCK))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(Blocks.COMMAND_BLOCK));
                stacks.add(new ItemStack(Blocks.CHAIN_COMMAND_BLOCK));
                stacks.add(new ItemStack(Blocks.REPEATING_COMMAND_BLOCK));
                stacks.add(new ItemStack(Items.COMMAND_BLOCK_MINECART));
                stacks.add(new ItemStack(Blocks.BARRIER));
                stacks.add(new ItemStack(Blocks.SPAWNER));
                stacks.add(new ItemStack(Blocks.DRAGON_EGG));
                stacks.add(new ItemStack(Blocks.STRUCTURE_VOID));
                stacks.add(new ItemStack(Blocks.STRUCTURE_BLOCK));
                stacks.add(new ItemStack(Blocks.JIGSAW));
                stacks.add(new ItemStack(Items.DEBUG_STICK));
                stacks.add(new ItemStack(Items.LIGHT));
                stacks.add(new ItemStack(Blocks.SCULK_SENSOR));
                stacks.add(new ItemStack(Items.BUNDLE));
            })
            .build();
}
