package net.ghostyy.betterminecraft.mixin;

import net.minecraft.enchantment.PowerEnchantment;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PowerEnchantment.class)
public abstract class PowerMixin {

    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof BowItem || stack.getItem() instanceof CrossbowItem;
    }

}
