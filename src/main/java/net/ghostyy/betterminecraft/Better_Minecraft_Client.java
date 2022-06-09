package net.ghostyy.betterminecraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.ghostyy.betterminecraft.item.custom.TriBowItem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.screen.ScreenHandlerType;

public class Better_Minecraft_Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        TriBowItem.getTriBowPredicates();

    }
}
