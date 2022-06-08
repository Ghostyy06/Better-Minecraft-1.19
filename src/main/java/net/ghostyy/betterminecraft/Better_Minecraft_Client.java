package net.ghostyy.betterminecraft;

import net.fabricmc.api.ClientModInitializer;
import net.ghostyy.betterminecraft.item.custom.TriBowItem;
import net.minecraft.client.MinecraftClient;

public class Better_Minecraft_Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        TriBowItem.getTriBowPredicates();

    }
}
