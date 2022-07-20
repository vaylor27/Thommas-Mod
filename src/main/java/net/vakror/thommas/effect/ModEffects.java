package net.vakror.thommas.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;

public class ModEffects{
    public static StatusEffect FREEZE;
    public static StatusEffect BLEED;
    public static StatusEffect HEARTBREAK;
    public static StatusEffect IRON_SKIN;

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

    private static StatusEffect registerIronSkinEffect() {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(Thommas.MOD_ID, "iron_skin"),
                new IronSkinEffect(StatusEffectCategory.BENEFICIAL, 448584)
                        .addAttributeModifier(EntityAttributes.GENERIC_ARMOR, "03C3C89D-7037-4B41-869F-B146B3864D2E", 6, EntityAttributeModifier.Operation.MULTIPLY_BASE)
                        .addAttributeModifier(EntityAttributes.GENERIC_ARMOR_TOUGHNESS, "04C3C89D-7037-4B42-869F-B146B3864D2E", 6, EntityAttributeModifier.Operation.MULTIPLY_BASE)
                        .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "03C3C80D-7037-4B42-869F-B146B3864D2E", 1, EntityAttributeModifier.Operation.ADDITION)
                        .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, "03C3C79D-7037-4B42-869F-B146B3864D2E", -0.15000000596046448D, EntityAttributeModifier.Operation.ADDITION)
                        .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, "03C3C89D-7037-4C42-869F-B146B3864D2E", 1, EntityAttributeModifier.Operation.ADDITION)
                        .addAttributeModifier(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, "03C3C89D-7037-4C42-953F-B146B3864D2E", 2, EntityAttributeModifier.Operation.ADDITION));
    }

    public static void registerEffects() {
        FREEZE = registerFreezeEffect();
        BLEED = registerBleedEffect();
        HEARTBREAK = registerHeartBreakEffect();
        IRON_SKIN = registerIronSkinEffect();
    }
}
