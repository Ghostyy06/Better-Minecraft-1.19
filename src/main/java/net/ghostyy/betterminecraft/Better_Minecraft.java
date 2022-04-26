package net.ghostyy.betterminecraft;

import net.fabricmc.api.ModInitializer;
import net.ghostyy.betterminecraft.block.ModBlocks;
import net.ghostyy.betterminecraft.block.entity.ModBlockEntities;
import net.ghostyy.betterminecraft.item.ModItems;
import net.ghostyy.betterminecraft.recipe.ModRecipes;
import net.ghostyy.betterminecraft.screen.ModScreenHandlers;
import net.ghostyy.betterminecraft.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Better_Minecraft implements ModInitializer {

	public static final String MODID = "better_minecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModBlockEntities.registerModBlockEntities();
		ModRecipes.registerRecipes();
		ModScreenHandlers.registerModScreenHandlers();
	}
}
