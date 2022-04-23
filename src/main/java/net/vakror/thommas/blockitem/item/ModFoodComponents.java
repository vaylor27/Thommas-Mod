package net.vakror.thommas.blockitem.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build();
    public static final FoodComponent GRAPE = new FoodComponent.Builder().hunger(12).saturationModifier(1.0f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(9).saturationModifier(0.9f).build();
    public static final FoodComponent ROTTEN = new FoodComponent.Builder().hunger(2).saturationModifier(0.0f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 470, 2), 0.6f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 2), 0.6f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 500, 4), 0.5f).build();

}
