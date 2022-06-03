package net.vakror.thommas.world.gen.tree.sapling;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.vakror.thommas.world.gen.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class CherryBlossomSaplingGenerator extends SaplingGenerator {

    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.CHERRY_BLOSSOM_TREE;
    }
}
