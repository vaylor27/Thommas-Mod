package net.vakror.thommas.blockitem.custom.item;

import net.minecraft.entity.EntityPose;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WisdomFruit extends Item{
    public WisdomFruit(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user instanceof PlayerEntity && !world.isClient) {
            ((PlayerEntity)user).getItemCooldownManager().set(this, 2000);
            user.setPose(EntityPose.SLEEPING);
        }
        return super.finishUsing(stack, world, user);
    }
}
