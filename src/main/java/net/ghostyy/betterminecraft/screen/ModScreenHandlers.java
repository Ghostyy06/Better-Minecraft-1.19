package net.ghostyy.betterminecraft.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.ghostyy.betterminecraft.Better_Minecraft;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static ScreenHandlerType<NetheriteBlastFurnaceScreenHandler> NETHERITE_BLAST_FURNACE_SCREEN_HANDLER;

    public static void registerModScreenHandlers() {
        NETHERITE_BLAST_FURNACE_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(Better_Minecraft.MODID, "netherite_blast_furnace"),
                        NetheriteBlastFurnaceScreenHandler::new);
    }
}
