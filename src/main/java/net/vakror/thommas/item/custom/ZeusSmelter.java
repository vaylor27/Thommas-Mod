package net.vakror.thommas.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.block.ModBlocks;

public class ZeusSmelter extends Item {
    public ZeusSmelter(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos pos = context.getBlockPos();
        ServerWorld world = (ServerWorld) context.getWorld();
        BlockState blockState = world.getBlockState(pos);
        Block block = blockState.getBlock();
        if (block == ModBlocks.RAW_MYTHRIL_BLOCK) {
            if (!world.isClient) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, context.getPlayer(), pos, SpawnReason.TRIGGERED, true, true);
            }
        }
        return super.useOnBlock(context);
    }
}
