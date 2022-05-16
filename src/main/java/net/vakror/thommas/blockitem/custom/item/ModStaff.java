package net.vakror.thommas.blockitem.custom.item;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.*;
import net.minecraft.tag.TagKey;
import net.minecraft.util.ActionResult;
import net.vakror.thommas.util.ModTags;

public class ModStaff extends MiningToolItem {

    protected ModStaff(float attackDamage, float attackSpeed, ToolMaterial material, Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.ALL, settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
