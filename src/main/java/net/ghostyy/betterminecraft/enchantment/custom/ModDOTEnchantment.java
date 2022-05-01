package net.ghostyy.betterminecraft.enchantment.custom;

import net.minecraft.client.particle.FireSmokeParticle;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.FireAspectEnchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;

public class ModDOTEnchantment extends Enchantment {

    public static final int POISON = 0;
    public static final int WITHER = 1;
    public static final int[] BASE_POWERS = new int[]{5, 15};
    public static final int[] POWERS_PER_LEVEL = new int[]{20, 20};
    public static final int[] MIN_MAX_POWER_DIFFERENCES = new int[]{20, 20};
    public final int typeIndex;

    public ModDOTEnchantment(Rarity weight, int typeIndex, EquipmentSlot ... slotTypes) {
        super(weight, EnchantmentTarget.WEAPON, slotTypes);
        this.typeIndex = typeIndex;
    }

    @Override
    public int getMinPower(int level) {
        return BASE_POWERS[this.typeIndex] + (level - 1) * POWERS_PER_LEVEL[this.typeIndex];
    }

    @Override
    public int getMaxPower(int level) {
        return this.getMinPower(level) + MIN_MAX_POWER_DIFFERENCES[this.typeIndex];
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {
            switch (typeIndex) {
                case 0: ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.POISON,
                        20*2*level, level-1, true, false, false));
                case 1: ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER,
                        20*2*level, level-1, true, false, false));
                default:
            }
        }
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return !(other instanceof ModDOTEnchantment) && !(other instanceof FireAspectEnchantment);
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        if(stack.getItem() instanceof AxeItem) {
            return true;
        }
        return super.isAcceptableItem(stack);
    }
}
