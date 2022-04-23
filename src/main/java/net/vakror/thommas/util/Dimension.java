package net.vakror.thommas.util;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.vakror.thommas.Thommas;

public class Dimension {
    // Go to https://misode.github.io/dimension/ and https://misode.github.io/dimension-type/ to generate dimension json files
    public Dimension(String name, boolean flat, Block blockOfPortal, int r, int g, int b) {
        registerDimension(name, flat, blockOfPortal, r, g, b);
    }
    private static void registerDimension(String name, boolean flat, Block blockOfPortal, int r, int g, int b) {
        int[] colorOfPortal;
        colorOfPortal = new int[3];
        colorOfPortal[0] = r;
        colorOfPortal[1] = g;
        colorOfPortal[2] = b;
        registerDimensionWithPortal(name, flat, blockOfPortal, colorOfPortal);
    }

    private static void registerDimensionWithPortal(String name, boolean flat, Block blockOfPortal, int[] rgb) {
        RegistryKey<DimensionOptions> DIMENSION_KEY = RegistryKey.of(Registry.DIMENSION_KEY,
                new Identifier(Thommas.MOD_ID, name));
        RegistryKey<World> WORLD_KEY = RegistryKey.of(Registry.WORLD_KEY, DIMENSION_KEY.getValue());
        RegistryKey<DimensionType> TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
                new Identifier(Thommas.MOD_ID, name + "_type"));
        if (flat) {
            CustomPortalBuilder.beginPortal()
                    .frameBlock(blockOfPortal)
                    .destDimID(DIMENSION_KEY.getValue())
                    .tintColor(rgb[0], rgb[1], rgb[2])
                    .flatPortal()
                    .registerPortal();
        }
        else {
            CustomPortalBuilder.beginPortal()
                    .frameBlock(blockOfPortal)
                    .destDimID(DIMENSION_KEY.getValue())
                    .tintColor(rgb[0], rgb[1], rgb[2])
                    .registerPortal();
        }
    }
}
