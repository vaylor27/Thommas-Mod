package net.vakror.thommas.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.vakror.thommas.effect.ModEffects;
import net.vakror.thommas.item.ModItems;

public class ModBleedSword extends SwordItem {
    public ModBleedSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(ModEffects.BLEED, 200, 2), attacker);
        return super.postHit(stack, target, attacker);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        if (stack.getItem().equals(ModItems.AMETHYST_SWORD)){
            return true;
        }
        return super.hasGlint(stack);
    }
}
