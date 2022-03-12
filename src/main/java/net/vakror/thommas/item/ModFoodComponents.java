package net.vakror.thommas.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f).build();
    public static final FoodComponent ROTTEN = new FoodComponent.Builder().hunger(2).saturationModifier(0.0f).statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 470, 2), 1.75f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 2), 3.0f).build();

}
