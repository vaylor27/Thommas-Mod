package net.vakror.thommas.blockitem.custom.item;

import net.minecraft.block.Block;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.TagKey;
import net.vakror.thommas.util.ModTags;

public class PickAxeLe extends MiningToolItem {
    public PickAxeLe(float attackDamage, float attackSpeed, ToolMaterial material, Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.PAXEL, settings);
    }
}
