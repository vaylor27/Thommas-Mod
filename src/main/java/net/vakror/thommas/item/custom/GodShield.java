package net.vakror.thommas.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.world.World;

public class GodShield extends ShieldItem {
    public GodShield(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity.isLiving()) {
            LivingEntity livingEntity = (LivingEntity) entity;
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1, 1), null);
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1, 2), null);
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1, 2), null);
            livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 1, 4), null);
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
