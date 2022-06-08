package net.vakror.thommas.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;

public class ModEffects{
    public static StatusEffect FREEZE;
    public static StatusEffect BLEED;
    public static StatusEffect HEARTBREAK;

    private static StatusEffect registerFreezeEffect() {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(Thommas.MOD_ID, "freeze"),
                new FreezeEffect(StatusEffectCategory.HARMFUL, 3124687));
    }

    private static StatusEffect registerBleedEffect() {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(Thommas.MOD_ID, "bleed"),
                new BleedEffect(StatusEffectCategory.HARMFUL, 3124687));
    }

    private static StatusEffect registerHeartBreakEffect() {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(Thommas.MOD_ID, "heartbreak"),
                new HeartBreakEffect(StatusEffectCategory.HARMFUL, 2351212));
    }

    public static void registerEffects() {
        FREEZE = registerFreezeEffect();
        BLEED = registerBleedEffect();
        HEARTBREAK = registerHeartBreakEffect();
    }
}
