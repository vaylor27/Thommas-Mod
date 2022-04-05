package net.vakror.thommas.recipe;

import net.vakror.thommas.Thommas;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void registerRecipes() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Thommas.MOD_ID, MythrilBlasterRecipe.Serializer.ID),
                MythrilBlasterRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Thommas.MOD_ID, MythrilBlasterRecipe.Type.ID),
                MythrilBlasterRecipe.Type.INSTANCE);
    }
}
