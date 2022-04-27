package net.vakror.thommas.blockitem.custom.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.vakror.thommas.blockitem.ModItems;

public class AmuletItem extends Item {
    public AmuletItem(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity.isPlayer() && !world.isClient) {
            PlayerEntity player = (PlayerEntity) entity;
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION));
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
