package net.vakror.thommas.item.custom;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.vakror.thommas.item.ModItems;

public class ModHoe extends HoeItem {
    public ModHoe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        if (stack.getItem().equals(ModItems.AMETHYST_HOE)){
            return true;
        }
        return super.hasGlint(stack);
    }
}
