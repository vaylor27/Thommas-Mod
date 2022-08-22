package net.vakror.thommas.world.biome;

import net.fabricmc.fabric.api.biome.v1.TheEndBiomes;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

import static net.vakror.thommas.Thommas.MOD_ID;

public class ModBiomes {
    public static final RegistryKey<Biome> HIGHLANDS_FOREST = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "highlands_forest"));
    public static final RegistryKey<Biome> TREE_FOREST = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "tree_forest"));
    public static final RegistryKey<Biome> MIDLANDS_FOREST = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "midlands_forest"));
    public static final RegistryKey<Biome> BARRENS_FOREST = RegistryKey.of(Registry.BIOME_KEY, new Identifier(MOD_ID, "barrens_forest"));

    public static void registerBiomes() {


        Registry.register(BuiltinRegistries.BIOME, TREE_FOREST.getValue(), OverworldBiomeCreator.createPlains(false,false,false));
        Registry.register(BuiltinRegistries.BIOME, HIGHLANDS_FOREST.getValue(), createEndHighlands());
        Registry.register(BuiltinRegistries.BIOME, MIDLANDS_FOREST.getValue(), createEndMidlands());
        Registry.register(BuiltinRegistries.BIOME, BARRENS_FOREST.getValue(), createEndBarrens());


        TheEndBiomes.addHighlandsBiome(HIGHLANDS_FOREST, 5.0);
        TheEndBiomes.addMidlandsBiome(HIGHLANDS_FOREST, MIDLANDS_FOREST, 10.0);
        TheEndBiomes.addBarrensBiome(HIGHLANDS_FOREST, BARRENS_FOREST, 10.0);
    }


    // These are used for testing the spacing of custom end biomes.
    public static Biome createEndHighlands() {
        GenerationSettings.Builder builder = new GenerationSettings.Builder();
        return composeEndSpawnSettings(builder);
    }

    public static Biome createEndMidlands() {
        GenerationSettings.Builder builder = (new GenerationSettings.Builder());
        return composeEndSpawnSettings(builder);
    }

    public static Biome createEndBarrens() {
        GenerationSettings.Builder builder = (new GenerationSettings.Builder());
        return composeEndSpawnSettings(builder);
    }

    public static Biome composeEndSpawnSettings(GenerationSettings.Builder builder) {
        SpawnSettings.Builder builder2 = new SpawnSettings.Builder();
        DefaultBiomeFeatures.addMushroomMobs(builder2);
        return (new Biome.Builder()).precipitation(Biome.Precipitation.RAIN).temperature(0.5F).downfall(0.5F).effects((new BiomeEffects.Builder()).waterColor(4159204).waterFogColor(329011).fogColor(10518688).skyColor(14252153).moodSound(BiomeMoodSound.CAVE).build()).spawnSettings(builder2.build()).generationSettings(builder.build()).build();
    }

}
