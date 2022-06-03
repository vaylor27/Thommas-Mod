package net.vakror.thommas.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.vakror.thommas.util.ModTags;

public class ModGemSteelStaffItem extends MiningToolItem {

    protected ModGemSteelStaffItem(float attackDamage, float attackSpeed, ToolMaterial material, Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.ALL, settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
