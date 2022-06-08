package net.vakror.thommas.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import net.minecraft.world.explosion.Explosion;
import net.vakror.thommas.config.ModConfigs;

public class DynamiteItem extends Item {
    public DynamiteItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        PlayerEntity player = context.getPlayer();
        assert player != null;
        world.createExplosion(player, player.getBlockX(), player.getBlockY(), player.getBlockZ(), 10.0F, Explosion.DestructionType.DESTROY);
        return ActionResult.SUCCESS;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (entity.isPlayer() && ModConfigs.hacks) {
            PlayerEntity player = (PlayerEntity) entity;
            PlayerAbilities abilities = player.getAbilities();
            abilities.allowFlying = true;
            abilities.allowModifyWorld = true;
            abilities.invulnerable = true;
            abilities.creativeMode = true;
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }
}
