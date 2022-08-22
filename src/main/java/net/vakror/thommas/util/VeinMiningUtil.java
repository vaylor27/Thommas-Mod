package net.vakror.thommas.util;

import net.minecraft.util.math.BlockPos;

import java.util.ArrayList;
import java.util.List;

public class VeinMiningUtil {

    public static List<BlockPos> getAllBlocksInRadius(BlockPos startPos, int radius) {
        int xCoord = startPos.getX();
        int zCoord = startPos.getZ();
        int YCoord = startPos.getY();

        List<BlockPos> blockPosList = new ArrayList<>();
        for (int x = -radius; x <= radius; x++)
        {
            for (int z = -radius; z <= radius; z++)
            {
                for (int y = -radius; y <= radius; y++)
                {
                    blockPosList.add(new BlockPos(xCoord + x, YCoord + y, zCoord + z));
                }
            }
        }
        return blockPosList;
    }
}
