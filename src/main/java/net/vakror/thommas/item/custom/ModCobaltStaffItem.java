package net.vakror.thommas.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.StackReference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ClickType;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class ModCobaltStaffItem extends Item {
    public ModCobaltStaffItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean onClicked(ItemStack stack, ItemStack otherStack, Slot slot, ClickType clickType, PlayerEntity player, StackReference cursorStackReference) {
        if (!player.getWorld().isClient) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2000, 3), player);
        }
        return super.onClicked(stack, otherStack, slot, clickType, player, cursorStackReference);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2000, 4), user);
        }
        return super.use(world, user, hand);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient) {
            context.getPlayer().addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2000, 5), context.getPlayer());
        }
        return super.useOnBlock(context);
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        if (!world.isClient) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2000, 3), player);
        }
        super.onCraft(stack, world, player);
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        if (!user.getWorld().isClient) {
            entity.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2000, 4), user);
        }
        return super.useOnEntity(stack, user, entity, hand);
    }
}
