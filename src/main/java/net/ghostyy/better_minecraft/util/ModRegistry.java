package net.ghostyy.better_minecraft.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.ghostyy.better_minecraft.block.ModBlocks;

public class ModRegistry {

    //Fuel Registries
    public static void registerFuels() {
        FuelRegistry registry = FuelRegistry.INSTANCE;
        registry.add(ModBlocks.BIRCH_BOOKSHELF, 300);
        registry.add(ModBlocks.SPRUCE_BOOKSHELF, 300);
        registry.add(ModBlocks.JUNGLE_BOOKSHELF, 300);
        registry.add(ModBlocks.ACACIA_BOOKSHELF, 300);
        registry.add(ModBlocks.DARK_OAK_BOOKSHELF, 300);
        registry.add(ModBlocks.CRIMSON_BOOKSHELF, 300);
        registry.add(ModBlocks.WARPED_BOOKSHELF, 300);
        registry.add(ModBlocks.MANGROVE_BOOKSHELF, 300);
        registry.add(ModBlocks.REINFORCED_WOOD, 600);
    }
}
