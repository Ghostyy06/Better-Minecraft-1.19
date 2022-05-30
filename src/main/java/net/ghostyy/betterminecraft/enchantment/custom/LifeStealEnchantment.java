package net.ghostyy.betterminecraft.enchantment.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.FireAspectEnchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public class LifeStealEnchantment extends Enchantment {

    private static final int BASE_POWER = 5;
    private static final int POWER_PER_LEVEL = 20;
    private static final int MIN_MAX_POWER_DIFFERENCE = 20;

    public LifeStealEnchantment(Rarity weight, EquipmentSlot ... slotTypes) {
        super(weight, EnchantmentTarget.WEAPON, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return BASE_POWER + (level - 1) * POWER_PER_LEVEL;
    }

    @Override
    public int getMaxPower(int level) {
        return this.getMinPower(level) + MIN_MAX_POWER_DIFFERENCE;
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if(user.getRandom().nextFloat() <= 0.1f * (float)level) {
            user.heal((float) level);
        }
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return other instanceof DOTEnchantment || other instanceof FireAspectEnchantment;
    }
}
