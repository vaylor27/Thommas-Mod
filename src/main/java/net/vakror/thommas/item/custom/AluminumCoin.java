package net.vakror.thommas.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.vakror.thommas.item.ModItems;

import java.util.Random;

public class AluminumCoin extends Item {
    public AluminumCoin(Settings settings) {
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
                if (random <= 14) {
                    user.setStackInHand(hand, new ItemStack(ModItems.ALUMINUM_COIN, (count - 1)));
                    user.dropItem(new ItemStack(ModItems.DUST, 2), true);
                } else if (random <= 16) {
                    user.setStackInHand(hand, new ItemStack(ModItems.ALUMINUM_COIN, (count - 1)));
                    user.dropItem(new ItemStack(ModItems.MAGIC_DUST, 3), true);
                } else if (random == 17) {
                    user.setStackInHand(hand, new ItemStack(ModItems.ALUMINUM_COIN, (count - 1)));
                    user.dropItem(new ItemStack(ModItems.MAGIC_CHARGE, 4), true);
                } else if (random <= 19) {
                    user.setStackInHand(hand, new ItemStack(ModItems.ALUMINUM_COIN, (count - 1)));
                    user.dropItem(new ItemStack(ModItems.PICKLE, 1), true);
                } else if (random == 20) {
                    user.setStackInHand(hand, new ItemStack(ModItems.ALUMINUM_COIN, (count - 1)));
                    user.dropItem(new ItemStack(ModItems.BRONZE_COIN, 1), true);
                }
                else {
                    user.setStackInHand(hand, new ItemStack(ModItems.ALUMINUM_COIN, (count - 1)));
                }
            }
        return super.use(world, user, hand);
    }
}
