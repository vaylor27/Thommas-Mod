package net.vakror.thommas.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.vakror.thommas.item.ModItems;

public class ModShovel extends ShovelItem {
    public ModShovel(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        if (stack.getItem().equals(ModItems.AMETHYST_SHOVEL)){
            return true;
        }
        return super.hasGlint(stack);
    }
}
