package net.vakror.thommas.util;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.item.ModItemGroup;

public class CompressedBlock {
    public CompressedBlock(String name, Block origBlock) {
        ModBlocks.registerBlock("once_compressed_" + name,
                new Block(FabricBlockSettings.copy(origBlock)), ModItemGroup.BLOCKS);
        ModBlocks.registerBlock("twice_compressed_" + name,
                new Block(FabricBlockSettings.copy(origBlock)), ModItemGroup.BLOCKS);
        ModBlocks.registerBlock("thrice_compressed_" + name,
                new Block(FabricBlockSettings.copy(origBlock)), ModItemGroup.BLOCKS);
        ModBlocks.registerBlock("quadrice_compressed_" + name,
                new Block(FabricBlockSettings.copy(origBlock)), ModItemGroup.BLOCKS);
    }

    public static Block registerOnceCompressedBlock(String name, Block origBlock) {
        Block block = ModBlocks.registerBlock("once_compressed_" + name,
                new Block(FabricBlockSettings.copy(origBlock)), ModItemGroup.BLOCKS);
        Thommas.comprBlocks.add(block);
        return block;
    }

    public static Block registerTwiceCompressedBlock(String name, Block origBlock) {
        Block block = ModBlocks.registerBlock("twice_compressed_" + name,
                new Block(FabricBlockSettings.copy(origBlock)), ModItemGroup.BLOCKS);
        Thommas.comprBlocks.add(block);
        return block;
    }

    public static Block registerThriceCompressedBlock(String name, Block origBlock) {
        Block block = ModBlocks.registerBlock("thrice_compressed_" + name,
                new Block(FabricBlockSettings.copy(origBlock)), ModItemGroup.BLOCKS);
        Thommas.comprBlocks.add(block);
        return block;
    }

    public static Block registerQuadriceCompressedBlock(String name, Block origBlock) {
        Block block = ModBlocks.registerBlock("quadrice_compressed_" + name,
                new Block(FabricBlockSettings.copy(origBlock)), ModItemGroup.BLOCKS);
        Thommas.comprBlocks.add(block);
        return block;
    }
}
