package net.vakror.thommas.blockitem.custom.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.vakror.thommas.blockitem.ModItems;

import java.util.Random;

public class BronzeCoin extends Item {
    public BronzeCoin(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
            int random = new Random().nextInt(0, 20);
            int count;
            if (!world.isClient) {
                if (hand.equals(Hand.MAIN_HAND)) {
                    count = user.getMainHandStack().getCount();
                } else {
                    count = user.getOffHandStack().getCount();
                }
                user.setStackInHand(hand, new ItemStack(ModItems.BRONZE_COIN, (count - 1)));
                if (random <= 10)
                    return null;
                else if (random <= 14)
                    user.dropItem(new ItemStack(ModItems.CORRUPTED_DUST, 2), true);
                else if (random <= 16)
                    user.dropItem(new ItemStack(ModItems.COAL_COKE, 3), true);
                else if (random == 17)
                    user.dropItem(new ItemStack(ModItems.MAGIC_GEM, 3), true);
                else if (random <= 19)
                    user.dropItem(new ItemStack(ModItems.PICKLE, 2), true);
                else if (random == 20)
                    user.dropItem(new ItemStack(ModItems.BRONZE_COIN_FANCY, 1), true);
            }
        return super.use(world, user, hand);
    }
}
