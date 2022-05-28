package net.vakror.thommas.world.structure;

import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.StructureFeature;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.mixin.StructureFeatureAccessor;

public class ModStructures {
    public static StructureFeature<?> SKY_STRUCTURES = new SkyStructures();
    public static StructureFeature<?> HOUSE = new HouseStructure();
    public static StructureFeature<?> ORE_ATTIC = new OreAttic();
    public static StructureFeature<?> ABANDONED_ORE_ATTIC = new AbandonedOreAttic();
    public static void registerStructureFeatures() {
        StructureFeatureAccessor.callRegister(new Identifier(Thommas.MOD_ID, "sky_structures").toString(), SKY_STRUCTURES, GenerationStep.Feature.SURFACE_STRUCTURES);
        StructureFeatureAccessor.callRegister(new Identifier(Thommas.MOD_ID, "house").toString(), HOUSE, GenerationStep.Feature.SURFACE_STRUCTURES);
        StructureFeatureAccessor.callRegister(new Identifier(Thommas.MOD_ID, "ore_attic").toString(), ORE_ATTIC, GenerationStep.Feature.SURFACE_STRUCTURES);
        StructureFeatureAccessor.callRegister(new Identifier(Thommas.MOD_ID, "abandoned_ore_attic").toString(), ABANDONED_ORE_ATTIC, GenerationStep.Feature.SURFACE_STRUCTURES);
    }
}