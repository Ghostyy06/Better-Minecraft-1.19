package net.ghostyy.betterminecraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.ghostyy.betterminecraft.screen.ModScreenHandlers;
import net.ghostyy.betterminecraft.screen.NetheriteBlastFurnaceScreen;

public class Better_Minecraft_Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ScreenRegistry.register(ModScreenHandlers.NETHERITE_BLAST_FURNACE_SCREEN_HANDLER, NetheriteBlastFurnaceScreen::new);

    }
}
