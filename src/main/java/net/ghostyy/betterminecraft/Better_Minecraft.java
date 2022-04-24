package net.ghostyy.betterminecraft;

import net.fabricmc.api.ModInitializer;
import net.ghostyy.betterminecraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Better_Minecraft implements ModInitializer {

	public static final String MODID = "better_minecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
