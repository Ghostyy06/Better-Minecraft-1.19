package net.ghostyy.betterminecraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.ghostyy.betterminecraft.item.ModItems;
import net.minecraft.util.Identifier;

public class Better_Minecraft_Client implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        getTriBowPredicates();

    }

    public void getTriBowPredicates() {
        FabricModelPredicateProviderRegistry.register(ModItems.TRI_BOW, new Identifier("pull"), (itemStack, clientWorld, livingEntity, seed) -> {
            if (livingEntity == null) {
                return 0.0F;
            }
            return livingEntity.getActiveItem() != itemStack ? 0.0F : (itemStack.getMaxUseTime() - livingEntity.getItemUseTimeLeft()) / 20.0F;
        });

        FabricModelPredicateProviderRegistry.register(ModItems.TRI_BOW, new Identifier("pulling"), (itemStack, clientWorld, livingEntity, seed) -> {
            if (livingEntity == null) {
                return 0.0F;
            }
            return livingEntity.isUsingItem() && livingEntity.getActiveItem() == itemStack ? 1.0F : 0.0F;
        });
    }
}
