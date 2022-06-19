package net.ghostyy.betterminecraft.mixin;

import net.ghostyy.betterminecraft.Better_Minecraft;
import net.minecraft.enchantment.MendingEnchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MendingEnchantment.class)
public class MendingMixin {

    public boolean isAvailableForEnchantedBookOffer() {
        Better_Minecraft.LOGGER.info("disabled mending enchantment in librarian villagers");
        return false;
    }
}
