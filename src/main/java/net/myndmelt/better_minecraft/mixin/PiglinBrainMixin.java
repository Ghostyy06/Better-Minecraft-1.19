package net.myndmelt.better_minecraft.mixin;

import net.myndmelt.better_minecraft.item.ModArmorMaterials;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.PiglinBrain;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PiglinBrain.class)
public abstract class PiglinBrainMixin {

    @Inject(method = "wearsGoldArmor", at = @At("RETURN"))
    private static boolean wearsGoldArmor(LivingEntity entity, CallbackInfoReturnable<Boolean> info) {
        Iterable<ItemStack> iterable = entity.getArmorItems();
        for (ItemStack itemStack : iterable) {
            Item item = itemStack.getItem();
            if (!(item instanceof ArmorItem) || !isOfRequiredMaterial(item)) continue;
            return true;
        }
        return false;
    }

    private static boolean isOfRequiredMaterial(Item item) {
        return ((ArmorItem)item).getMaterial() == ArmorMaterials.GOLD || ((ArmorItem)item).getMaterial() == ModArmorMaterials.GILDED_NETHERITE;
    }
}
