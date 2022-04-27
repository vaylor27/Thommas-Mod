package net.vakror.thommas.effect;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class BleedEffect extends StatusEffect {
    public BleedEffect(StatusEffectCategory statusEffectCategory, int color) {
        super(statusEffectCategory, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int pAmplifier) {
        if (entity.getHealth() > 5.0F) {
            entity.damage(DamageSource.MAGIC, 5.0F);
        }
        if (entity.getHealth() < 10.0) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2000, 2));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 2000, 2));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 2000, 2));
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 2000, 2));
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int pDuration, int pAmplifier) {
        return true;
    }
}
