package net.vakror.thommas.item.custom;

import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.vakror.thommas.util.ModTags;

public class ModPaxel extends MiningToolItem {
    public ModPaxel(float attackDamage, float attackSpeed, ToolMaterial material, Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.PAXEL, settings);
    }
}
