package net.ghostyy.betterminecraft.item.custom;

import net.ghostyy.betterminecraft.util.ModTags;
import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.BlockTags;

public class VoidsteelPickaxeItem extends MiningToolItem {
    public VoidsteelPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.MINEABLE_VOIDSTEEL, settings);
    }
}
