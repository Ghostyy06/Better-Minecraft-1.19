package net.ghostyy.betterminecraft.mixin;

import net.ghostyy.betterminecraft.enchantment.ModEnchantments;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;
import org.checkerframework.checker.units.qual.A;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CrossbowItem.class)
public abstract class CrossbowItemMixin {

    @Inject(method = "getSpeed", at = @At("RETURN"))
    private static float getSpeed(ItemStack stack, CallbackInfoReturnable info) {
        if (CrossbowItem.hasProjectile(stack, Items.FIREWORK_ROCKET)) {
            return 1.6f + (getSnipelevel(stack) * 0.25f);
        }
        return 3.15f + (getSnipelevel(stack) * 0.5f);
    }

    @Inject(method = "createArrow", at = @At("RETURN"))
    private static PersistentProjectileEntity createArrow(World world, LivingEntity entity, ItemStack crossbow, ItemStack arrow, CallbackInfoReturnable info) {
        ArrowItem arrowItem = (ArrowItem)(arrow.getItem() instanceof ArrowItem ? arrow.getItem() : Items.ARROW);
        PersistentProjectileEntity persistentProjectileEntity = arrowItem.createArrow(world, arrow, entity);
        if (entity instanceof PlayerEntity) {
            persistentProjectileEntity.setCritical(true);
        }
        persistentProjectileEntity.setSound(SoundEvents.ITEM_CROSSBOW_HIT);
        persistentProjectileEntity.setShotFromCrossbow(true);
        if(getPowerLevel(crossbow) > 0) {
            persistentProjectileEntity.setDamage(persistentProjectileEntity.getDamage() + (double)getPowerLevel(crossbow) * 0.5 + 0.5);
        }
        int i = EnchantmentHelper.getLevel(Enchantments.PIERCING, crossbow);
        if (i > 0) {
            persistentProjectileEntity.setPierceLevel((byte)i);
        }
        return persistentProjectileEntity;
    }

    private static int getSnipelevel(ItemStack stack) {
        return EnchantmentHelper.getLevel(ModEnchantments.SNIPE, stack);
    }

    private static int getPowerLevel(ItemStack stack) {
        return EnchantmentHelper.getLevel(Enchantments.POWER, stack);
    }
}
