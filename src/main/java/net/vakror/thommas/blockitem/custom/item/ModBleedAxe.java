package net.vakror.thommas.blockitem.custom.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.vakror.thommas.effect.ModEffects;

public class ModBleedAxe extends AxeItem {
    public ModBleedAxe(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(ModEffects.BLEED, 200, 2), attacker);
        return super.postHit(stack, target, attacker);
    }
}
