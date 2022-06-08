package net.ghostyy.betterminecraft;

import net.fabricmc.api.ClientModInitializer;
import net.ghostyy.betterminecraft.item.custom.TriBowItem;
import net.minecraft.client.MinecraftClient;

public class Better_Minecraft_Client implements ClientModInitializer {


    public static final MinecraftClient mc = MinecraftClient.getInstance();

    @Override
    public void onInitializeClient() {

        TriBowItem.getTriBowPredicates();

    }
}
