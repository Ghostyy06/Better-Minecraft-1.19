package net.ghostyy.betterminecraft.enchantment.custom;

import net.ghostyy.betterminecraft.enchantment.ModEnchantments;
import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;

public class ModDamageEnchantment extends Enchantment {
    public static final int ILLAGERS = 0;
    private static final int[] BASE_POWERS = new int[]{5};
    private static final int[] POWERS_PER_LEVEL = new int[]{8};
    private static final int[] MIN_MAX_POWER_DIFFERENCES = new int[]{20};
    public final int typeIndex;
    public ModDamageEnchantment(Rarity weight, int typeIndex, EquipmentSlot ... slot) {
        super(weight, EnchantmentTarget.WEAPON, slot);
        this.typeIndex = typeIndex;
    }

    @Override
    public int getMaxLevel() {
        return 5;
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
    public float getAttackDamage(int level, EntityGroup group) {
        if(typeIndex == 0 && group == EntityGroup.ILLAGER) {
            return level * 1.75f;
        }
        return 0.0f;
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        return !(other instanceof DamageEnchantment) && !(other instanceof ModDamageEnchantment);
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        if(stack.getItem() instanceof AxeItem) {
            return true;
        }
        return super.isAcceptableItem(stack);
    }
}
