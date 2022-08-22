package net.vakror.thommas.item.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.vakror.thommas.item.ModItems;

public class ModPickaxeItem extends PickaxeItem {
    public ModPickaxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);


    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        if (stack.getItem().equals(ModItems.AMETHYST_PICKAXE)){
            return true;
        }
        return super.hasGlint(stack);
    }
}
