package net.ghostyy.betterminecraft.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    VOIDSTEEL(MiningLevels.NETHERITE+1, 2742, 10.0f, 5.5f, 25,
            () -> Ingredient.ofItems(ModItems.VOIDSTEEL_INGOT)),
    GILDED_NETHERITE(MiningLevels.NETHERITE, 1796, 12.0f, 4.0f, 30,
            () -> Ingredient.ofItems(ModItems.GILDED_NETHERITE_INGOT)),
    REINFORCED_NETHERITE(MiningLevels.NETHERITE, 2539, 9.0f, 5.0f, 12,
            () -> Ingredient.ofItems(ModItems.REINFORCED_NETHERITE_INGOT)),
    AMETHYST(MiningLevels.IRON, 200, 11.0f, 2.5f, 40,
            () -> Ingredient.ofItems(Items.AMETHYST_SHARD));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
