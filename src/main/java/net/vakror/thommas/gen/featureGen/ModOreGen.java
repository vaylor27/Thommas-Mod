package net.vakror.thommas.gen.featureGen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.vakror.thommas.Thommas;

import static net.vakror.thommas.gen.ModPlacedFeatures.*;
import static net.vakror.thommas.gen.ModPlacedFeatures.RUBY_ORE_PLACED_FEATURE;

public class ModOreGen {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Thommas.MOD_ID, "ruby_ore")));

        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Thommas.MOD_ID, "nether_mythril_ore")));

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Thommas.MOD_ID, "deepslate_overworld_mythril_ore")));

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier(Thommas.MOD_ID, "overworld_mythril_ore")));



        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Thommas.MOD_ID, "overworld_mythril_ore"),
                MYTHRIL_ORE_OVERWORLD_PLACED_FEATURE);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Thommas.MOD_ID, "deepslate_overworld_mythril_ore"),
                DEEPSLATE_MYTHRIL_ORE_OVERWORLD_PLACED_FEATURE);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Thommas.MOD_ID, "nether_mythril_ore"),
                NETHER_MYTHRIL_ORE_PLACED_FEATURE);

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Thommas.MOD_ID, "ruby_ore"),
                RUBY_ORE_PLACED_FEATURE);
    }
}
