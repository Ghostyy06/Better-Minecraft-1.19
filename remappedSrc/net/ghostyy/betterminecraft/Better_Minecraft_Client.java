package net.ghostyy.betterminecraft;

import net.fabricmc.api.ClientModInitializer;
import net.ghostyy.betterminecraft.item.custom.TriBowItem;

public class Better_Minecraft_Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        TriBowItem.getTriBowPredicates();

    }
}
