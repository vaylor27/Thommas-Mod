package net.vakror.thommas.world.structure;

import com.mojang.serialization.Codec;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.structure.Structure;
import net.minecraft.world.gen.structure.StructureType;
import net.vakror.thommas.Thommas;

public class ModStructures {
    public static StructureType<?> HOUSE;
    public static StructureType<?> SKY_STRUCTURES;
    public static StructureType<?> ORE_ATTIC;
    public static StructureType<?> ABANDONED_ORE_ATTIC;
    public static StructureType<?> ORE_PLATFORM;

    public static void registerStructureFeatures() {
        SKY_STRUCTURES = register(new Identifier(Thommas.MOD_ID, "sky_structures"), SkyStructures.CODEC);
        HOUSE = register(new Identifier(Thommas.MOD_ID, "house"), HouseStructure.CODEC);
        ORE_ATTIC = register(new Identifier(Thommas.MOD_ID, "ore_attic"), OreAttic.CODEC);
        ABANDONED_ORE_ATTIC = register(new Identifier(Thommas.MOD_ID, "abandoned_ore_attic"), AbandonedOreAttic.CODEC);
        ORE_PLATFORM = register(new Identifier(Thommas.MOD_ID, "ore"), OrePlatform.CODEC);
    }

    // Helper method to register since compiler will complain about typing if we did () -> SkyStructures.CODEC directly.
    private static <S extends Structure> StructureType<S> register(Identifier id, Codec<S> codec) {
        return Registry.register(Registry.STRUCTURE_TYPE, id, () -> codec);
    }
}
