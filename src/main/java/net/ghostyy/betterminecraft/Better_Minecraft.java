package net.ghostyy.betterminecraft;

import com.google.common.collect.Lists;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.ghostyy.betterminecraft.block.ModBlocks;
import net.ghostyy.betterminecraft.effects.potions.ModPotions;
import net.ghostyy.betterminecraft.enchantment.ModEnchantments;
import net.ghostyy.betterminecraft.entity.ModEntities;
import net.ghostyy.betterminecraft.item.ModItems;
import net.ghostyy.betterminecraft.world.gen.ModEntitySpawns;
import net.ghostyy.betterminecraft.world.gen.ModWorldGeneration;
import net.ghostyy.betterminecraft.world.structure.ModStructures;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Better_Minecraft implements ModInitializer {

	public static final String MOD_ID = "better_minecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static List<Pair<String, String[]>> woodTypes = Lists.newArrayList(
	);



	public static final ItemGroup CREATIVE_UTILS = FabricItemGroupBuilder.create(new Identifier(Better_Minecraft.MOD_ID, "creative_utils"))
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

	@Override
	public void onInitialize() {

		//Sets up all registries and worldgen
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModEnchantments.registerModEnchantments();
		ModStructures.registerModStructureFeatures();
		ModEntitySpawns.addEntitySpawns();
		ModEntities.registerEntityAttributes();
		ModPotions.registerPotions();


		woodTypes.add(Pair.of("birch", new String[0]));
		woodTypes.add(Pair.of("spruce", new String[0]));
		woodTypes.add(Pair.of("jungle", new String[0]));
		woodTypes.add(Pair.of("acacia", new String[0]));
		woodTypes.add(Pair.of("dark_oak", new String[0]));
		woodTypes.add(Pair.of("mangrove", new String[0]));
		woodTypes.add(Pair.of("crimson", new String[0]));
		woodTypes.add(Pair.of("warped", new String[0]));
	}
}
