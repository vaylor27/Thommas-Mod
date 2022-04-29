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
    public static final RegistryEntry<PlacedFeature> JACARANDA_PLACED = PlacedFeatures.register("jacaranda_placed",
            JACARANDA_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0, 0.01F, 2)));

    public static final RegistryEntry<PlacedFeature> REDWOOD_PLACED = PlacedFeatures.register("redwood_placed",
            REDWOOD_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0, 0.01F, 5)));

    public static final RegistryEntry<PlacedFeature> EBONY_PLACED = PlacedFeatures.register("ebony_placed",
            EBONY_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(0, 0.1F, 15)));




    public static final PlacedFeature MYTHRIL_ORE_OVERWORLD_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_MYTHRIL_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));
    public static final PlacedFeature MYTHRIL_ORE_NETHER_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(NETHER_MYTHRIL_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_NETHER_MYTHRIL_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));
    public static final PlacedFeature DEEPSLATE_MYTHRIL_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(DEEPSLATE_MYTHRIL_ORE_OVERWORLD_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_DEEPSLATE_MYTHRIL_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));
    public static final PlacedFeature RUBY_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(RUBY_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_RUBY_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));
    public static final PlacedFeature ALUMINUM_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(ALUMINUM_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_ALUMINUM_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature AMBER_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(AMBER_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_AMBER_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));


    public static final PlacedFeature BITUMEN_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(BITUMEN_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_BITUMEN_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature CHLOROPHYTE_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(CHLOROPHYTE_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_CHLOROPHYTE_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature COPPER_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(COPPER_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_COPPER_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature CRIMTANE_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(CRIMTANE_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_CRIMTANE_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature DEMONITE_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(DEMONITE_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_DEMONITE_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature PURE_DIAMOND_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(PURE_DIAMOND_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_PURE_DIAMOND_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature PURE_EMERALD_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(PURE_EMERALD_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_PURE_EMERALD_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature LEAD_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(LEAD_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_LEAD_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature LUMENITE_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(LUMENITE_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_LUMENITE_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature METEORITE_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(METEORITE_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_METEORITE_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature PLATINUM_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(PLATINUM_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_PLATINUM_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature SALTPETER_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(SALTPETER_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_SALTPETER_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature SAPPHIRE_ORE_PLACED_FEATUrE= new PlacedFeature(
            RegistryEntry.of(SAPPHIRE_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_SAPPHIRE_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature SILVER_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(SILVER_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_SILVER_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature SULPHUR_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(SULPHUR_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_SULPHUR_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature TIN_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(TIN_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_TIN_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature TITANIUM_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(TITANIUM_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_TITANIUM_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature TOPAZ_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(TOPAZ_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_TOPAZ_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature TUNGSTEN_ORE_PLACED_FEATURE= new PlacedFeature(
            RegistryEntry.of(TUNGSTEN_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_TUNGSTEN_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature SALT_ORE_PLACED_FEATURE = new PlacedFeature(
            RegistryEntry.of(SALT_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_SALT_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));

    public static final PlacedFeature STONE_ZINC_ORE_PLACED_FEATURES = new PlacedFeature(
            RegistryEntry.of(STONE_ZINC_ORE_CONFIGURED_FEATURE),
            Arrays.asList(
                    CountPlacementModifier.of(NUMBER_OF_STONE_ZINC_ORE_VEINS_IN_CHUNK), // Number of veins per chunk
                    SquarePlacementModifier.of(),
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))
            ));




    public static final RegistryEntry<PlacedFeature> CORRUPTED_PLACED = PlacedFeatures.register("corrupted_placed",
            ModConfiguredFeatures.CORRUPTED_FLOWER, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> ORCHID_PLACED = PlacedFeatures.register("orchid_placed",
            ORCHID, RarityFilterPlacementModifier.of(3), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> HYACINTH_PLACED = PlacedFeatures.register("hyacinth_placed",
            HYACINTH, RarityFilterPlacementModifier.of(4), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static final RegistryEntry<PlacedFeature> PINK_PLACED = PlacedFeatures.register("pink_placed",
            PINK_ROSE, RarityFilterPlacementModifier.of(3), SquarePlacementModifier.of(),
            PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

    public static void registerOrePlacedFeatures() {
        registerPlacedFeature(MYTHRIL_ORE_OVERWORLD_PLACED_FEATURE, "mythril_ore");
        registerPlacedFeature(MYTHRIL_ORE_NETHER_PLACED_FEATURE, "nether_mythril_ore");
        registerPlacedFeature(DEEPSLATE_MYTHRIL_ORE_PLACED_FEATURE, "deepslate_mythril_ore");
        registerPlacedFeature(RUBY_ORE_PLACED_FEATURE, "ruby_ore");
        registerPlacedFeature(ALUMINUM_ORE_PLACED_FEATURE, "aluminum_ore");
        registerPlacedFeature(AMBER_ORE_PLACED_FEATURE, "amber_ore");
        registerPlacedFeature(BITUMEN_ORE_PLACED_FEATURE, "bitumen_ore");
        registerPlacedFeature(CHLOROPHYTE_ORE_PLACED_FEATURE, "chlorophyte_ore");
        registerPlacedFeature(COPPER_ORE_PLACED_FEATURE, "copper_ore");
        registerPlacedFeature(CRIMTANE_ORE_PLACED_FEATURE, "crimtane_ore");
        registerPlacedFeature(DEMONITE_ORE_PLACED_FEATURE, "nether_demonite_ore");
        registerPlacedFeature(PURE_DIAMOND_ORE_PLACED_FEATURE, "pure_diamond_ore");
        registerPlacedFeature(PURE_EMERALD_ORE_PLACED_FEATURE, "pure_emerald_ore");
        registerPlacedFeature(LEAD_ORE_PLACED_FEATURE, "lead_ore");
        registerPlacedFeature(LUMENITE_ORE_PLACED_FEATURE, "lumenite_ore");
        registerPlacedFeature(METEORITE_ORE_PLACED_FEATURE, "meteorite_ore");
        registerPlacedFeature(PLATINUM_ORE_PLACED_FEATURE, "platinum_ore");
        registerPlacedFeature(SALTPETER_ORE_PLACED_FEATURE, "saltpeter_ore");
        registerPlacedFeature(SAPPHIRE_ORE_PLACED_FEATUrE, "sapphire_ore");
        registerPlacedFeature(SILVER_ORE_PLACED_FEATURE, "silver_ore");
        registerPlacedFeature(SULPHUR_ORE_PLACED_FEATURE, "sulphur_ore");
        registerPlacedFeature(TIN_ORE_PLACED_FEATURE, "tin_ore");
        registerPlacedFeature(TITANIUM_ORE_PLACED_FEATURE, "titanium_ore");
        registerPlacedFeature(TOPAZ_ORE_PLACED_FEATURE, "topaz_ore");
        registerPlacedFeature(TUNGSTEN_ORE_PLACED_FEATURE, "tungsten_ore");
        registerPlacedFeature(SALT_ORE_PLACED_FEATURE, "salt_ore");
    }

    public static final RegistryEntry<PlacedFeature> HONEY_OASIS = PlacedFeatures.register("honey_oasis", ModConfiguredFeatures.HONEY_OASIS, RarityFilterPlacementModifier.of(20), SquarePlacementModifier.of(), PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP, BiomePlacementModifier.of());



    private static void registerPlacedFeature(PlacedFeature feature, String name) {
        if (name.contains("nether")) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(Thommas.MOD_ID, name)));
        }
        if (name.contains("end")) {
            BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(Thommas.MOD_ID, name)));
        }
        else  {
            BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                    RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                            new Identifier(Thommas.MOD_ID, name)));
        }

        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(Thommas.MOD_ID, name), feature);
    }


}
