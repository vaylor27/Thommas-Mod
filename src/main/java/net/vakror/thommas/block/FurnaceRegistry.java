package net.vakror.thommas.block;

import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class FurnaceRegistry {
    public static final List<Block> allFurnaces = new ArrayList<>();

    public static List<Block> getAllFurnaces() {
        return allFurnaces;
    }
}
