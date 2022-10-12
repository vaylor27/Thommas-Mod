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

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Thommas.MOD_ID, UpgraderRecipe.Serializer.ID),
                UpgraderRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Thommas.MOD_ID, UpgraderRecipe.Type.ID),
                UpgraderRecipe.Type.INSTANCE);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Thommas.MOD_ID, HoneySuckerRecipe.Serializer.ID),
                HoneySuckerRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Thommas.MOD_ID, HoneySuckerRecipe.Type.ID),
                HoneySuckerRecipe.Type.INSTANCE);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Thommas.MOD_ID, GemInfusingRecipe.Serializer.ID),
                GemInfusingRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Thommas.MOD_ID, GemInfusingRecipe.Type.ID),
                GemInfusingRecipe.Type.INSTANCE);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Thommas.MOD_ID, CrushingRecipe.Serializer.ID),
                CrushingRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Thommas.MOD_ID, CrushingRecipe.Type.ID),
                CrushingRecipe.Type.INSTANCE);
    }
}
