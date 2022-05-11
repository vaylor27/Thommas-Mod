package net.vakror.thommas.recipe;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Thommas.MOD_ID, MythrilBlasterRecipe.Serializer.ID),
                MythrilBlasterRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Thommas.MOD_ID, MythrilBlasterRecipe.Type.ID),
                MythrilBlasterRecipe.Type.INSTANCE);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Thommas.MOD_ID, LightningChannelerRecipe.Serializer.ID),
                LightningChannelerRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Thommas.MOD_ID, LightningChannelerRecipe.Type.ID),
                LightningChannelerRecipe.Type.INSTANCE);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Thommas.MOD_ID, CombinerRecipe.Serializer.ID),
                CombinerRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Thommas.MOD_ID, CombinerRecipe.Type.ID),
                CombinerRecipe.Type.INSTANCE);
    }
}
