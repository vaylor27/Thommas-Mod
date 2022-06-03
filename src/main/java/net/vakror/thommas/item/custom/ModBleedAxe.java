package net.vakror.thommas.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.vakror.thommas.effect.ModEffects;

import java.util.Random;

public class ModBleedAxe extends AxeItem {
    public ModBleedAxe(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        int random = new Random().nextInt(0, 10);
        if (random == 3) {
            target.addStatusEffect(new StatusEffectInstance(ModEffects.BLEED, 200, 2), attacker);
        }
        return super.postHit(stack, target, attacker);
    }
}