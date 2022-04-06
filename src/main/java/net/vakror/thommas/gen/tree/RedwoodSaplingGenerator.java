package net.vakror.thommas.gen.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.vakror.thommas.gen.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class RedwoodSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.REDWOOD_TREE;
    }
}