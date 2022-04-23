package net.vakror.thommas.blockitem.item.potion;

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

    private static Potion registerPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(Thommas.MOD_ID, name),
                new Potion(new StatusEffectInstance(ModEffects.FREEZE, 200, 0)));
    }

    public static void registerPotions() {
        FREEZE_POTION = registerPotion("freeze_potion");
        registerPotionRecipes();

    }

    private static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.MYTHRIL_INGOT,
                ModPotions.FREEZE_POTION);

        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, Items.DIRT,
                Potions.EMPTY);
    }
}
