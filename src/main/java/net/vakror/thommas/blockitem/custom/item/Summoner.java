package net.vakror.thommas.blockitem.custom.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;

public class Summoner extends Item {
    public Summoner(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
            if (!context.getWorld().isClient) {
                EntityType.LIGHTNING_BOLT.spawn((ServerWorld) context.getWorld(), null, null, context.getPlayer(), context.getBlockPos(),
                        SpawnReason.TRIGGERED, true, true);
        }
        return super.useOnBlock(context);
    }
}