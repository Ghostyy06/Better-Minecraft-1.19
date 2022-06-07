package net.ghostyy.betterminecraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.ghostyy.betterminecraft.block.ModBlocks;
import net.ghostyy.betterminecraft.enchantment.ModEnchantments;
import net.ghostyy.betterminecraft.item.ModItems;
import net.ghostyy.betterminecraft.world.gen.ModWorldGeneration;
import net.ghostyy.betterminecraft.world.structure.ModStructures;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Better_Minecraft implements ModInitializer {

	public static final String MODID = "better_minecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	//Item Group (Since it isn't loaded anywhere else)
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
				stacks.add(new ItemStack(Items.BUNDLE));
			})
			.build();

	@Override
	public void onInitialize() {

		//Sets up all registries and worldgen
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModEnchantments.registerModEnchantments();
		ModStructures.registerModStructureFeatures();
	}
}
