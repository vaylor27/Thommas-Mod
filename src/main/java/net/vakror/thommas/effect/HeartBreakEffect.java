package net.vakror.thommas.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class HeartBreakEffect extends StatusEffect {
    public HeartBreakEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int pAmplifier) {
        if (entity.isPlayer()) {
            LivingEntity player = (LivingEntity) entity;
            if (!entity.getWorld().isClient) {
                float newMaxHealth = (player.getMaxHealth() - pAmplifier);
                player.setHealth(newMaxHealth);
            }
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}
