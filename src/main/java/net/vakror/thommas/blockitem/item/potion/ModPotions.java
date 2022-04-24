package net.vakror.thommas.blockitem.item.potion;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.effect.ModEffects;
import net.vakror.thommas.blockitem.ModItems;
import net.vakror.thommas.mixin.BrewingRecipeRegistryMixin;

public class ModPotions {
    public static Potion FREEZE_POTION;
    public static Potion BLEED_POTION;
    public static Potion HEARTBREAK_POTION;

    private static Potion registerPotion(String name, StatusEffect effect) {
        return Registry.register(Registry.POTION, new Identifier(Thommas.MOD_ID, name),
                new Potion(new StatusEffectInstance(effect, 2000, 2)));
    }

    public static void registerPotions() {
        FREEZE_POTION = registerPotion("freeze_potion", ModEffects.FREEZE);
        BLEED_POTION = registerPotion("bleed_potion", ModEffects.BLEED);
        HEARTBREAK_POTION = registerPotion("heartbreak_potion", ModEffects.HEARTBREAK);
        registerPotionRecipes();

    }

    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.MYTHRIL_INGOT,
                ModPotions.FREEZE_POTION);

        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.DIRT,
                Potions.EMPTY);

        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(FREEZE_POTION, Items.FERMENTED_SPIDER_EYE,
                BLEED_POTION);

        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.TURTLE_MASTER, Items.FERMENTED_SPIDER_EYE,
                HEARTBREAK_POTION);

        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.LONG_TURTLE_MASTER, Items.FERMENTED_SPIDER_EYE,
                HEARTBREAK_POTION);

        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.STRONG_TURTLE_MASTER, Items.FERMENTED_SPIDER_EYE,
                HEARTBREAK_POTION);
    }
}
