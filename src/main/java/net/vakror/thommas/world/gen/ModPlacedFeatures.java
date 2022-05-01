package net.vakror.thommas.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.vakror.thommas.Thommas;
import static net.vakror.thommas.config.ModConfigs.*;

import java.util.Arrays;

import static net.vakror.thommas.world.gen.ModConfiguredFeatures.*;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> HONEY_OASIS = PlacedFeatures.register("honey_oasis", ModConfiguredFeatures.HONEY_OASIS, RarityFilterPlacementModifier.of(20), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());

}
