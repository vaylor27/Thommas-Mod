package net.vakror.thommas.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.util.ModTags;

import java.util.List;

public class ModPaxel extends MiningToolItem {
    public ModPaxel(float attackDamage, float attackSpeed, ToolMaterial material, Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.PAXEL, settings);
    }
}
