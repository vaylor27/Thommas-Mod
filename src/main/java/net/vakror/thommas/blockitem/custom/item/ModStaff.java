package net.vakror.thommas.blockitem.custom.item;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.*;
import net.minecraft.util.ActionResult;

public class ModStaff extends PickaxeItem {
    public ModStaff(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient) {
            if (!context.getStack().hasEnchantments()) {
                context.getStack().addEnchantment(Enchantments.MENDING, 1);
                context.getStack().addEnchantment(Enchantments.EFFICIENCY, 5);
                context.getStack().addEnchantment(Enchantments.UNBREAKING, 3);
            }}
        return super.useOnBlock(context);
    }
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
