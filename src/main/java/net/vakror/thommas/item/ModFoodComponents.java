package net.vakror.thommas.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(8).saturationModifier(0.8f).build();
    public static final FoodComponent GRAPE = new FoodComponent.Builder().hunger(6).saturationModifier(1.0f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(10).saturationModifier(0.9f).build();
    public static final FoodComponent ROTTEN_STRAWBERRY = new FoodComponent.Builder().hunger(1).saturationModifier(0.0f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 470, 2), 0.6f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 2), 0.6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 500, 4), 0.5f).build();
    public static final FoodComponent CAVEWHEAT = new FoodComponent.Builder().hunger(6).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1000), 0.5f).build();
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(6).saturationModifier(1.0f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 2000), 0.5f).snack().meat().build();
    public static final FoodComponent PICKLE = new FoodComponent.Builder().hunger(5).saturationModifier(1.0f).snack().statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 2000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2000), 0.5f).alwaysEdible().build();
    public static final FoodComponent GOLDEN_PICKLE = new FoodComponent.Builder().hunger(8).saturationModifier(1.0f).snack().statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 4000), 0.5f).statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 4000), 0.5f).alwaysEdible().build();
    public static final FoodComponent ENCHANTED_GOLDEN_PICKLE = new FoodComponent.Builder().hunger(10).saturationModifier(1.0f).snack().statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 5000), 1f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 5000), 1f).alwaysEdible().build();
    public static final FoodComponent WISDOM_FRUIT = new FoodComponent.Builder().hunger(5).alwaysEdible().snack().saturationModifier(1.0f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2000, 8), 1).build();
    public static final FoodComponent SWEETPOD_STEW = new FoodComponent.Builder().hunger(8).alwaysEdible().snack().saturationModifier(1.0f).build();
    public static final FoodComponent RAW_PORK_SLAB = new FoodComponent.Builder().hunger(4).alwaysEdible().snack().statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 2000, 1), 0.5f).saturationModifier(0.0f).build();
    public static FoodComponent TURNIP = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
    public static final FoodComponent SALTED_PORK_SLAB = new FoodComponent.Builder().hunger(5).alwaysEdible().snack().saturationModifier(0.2f).build();
    public static final FoodComponent COOKED_PORK_SLAB = new FoodComponent.Builder().hunger(19).alwaysEdible().snack().saturationModifier(1).build();
    public static final FoodComponent PLUMP_HELMET = new FoodComponent.Builder().hunger(15).alwaysEdible().snack().saturationModifier(1).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2000), 1).build();
}
