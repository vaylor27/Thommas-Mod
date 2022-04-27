package net.vakror.thommas.blockitem.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build();
    public static final FoodComponent GRAPE = new FoodComponent.Builder().hunger(12).saturationModifier(1.0f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(9).saturationModifier(0.9f).build();
    public static final FoodComponent ROTTEN = new FoodComponent.Builder().hunger(2).saturationModifier(0.0f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 470, 2), 0.6f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 2), 0.6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 500, 4), 0.5f).build();
    public static final FoodComponent CAVE = new FoodComponent.Builder().hunger(18).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1000), 0.5f).build();
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(25).saturationModifier(1.0f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 2000), 0.5f).snack().meat().build();
    public static final FoodComponent PICKLE = new FoodComponent.Builder().hunger(100).saturationModifier(1.0f).snack().statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 2000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2000), 0.5f).alwaysEdible().build();
    public static final FoodComponent GOLDEN_PICKLE = new FoodComponent.Builder().hunger(500).saturationModifier(1.0f).snack().statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 4000), 0.5f).alwaysEdible().build();
    public static final FoodComponent ENCHANTED_GOLDEN_PICKLE = new FoodComponent.Builder().hunger(1000).saturationModifier(1.0f).snack().statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5000), 1f).alwaysEdible().build();
}
