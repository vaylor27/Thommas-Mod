package net.vakror.thommas.item.custom;

import java.util.List;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.predicate.entity.EntityPredicates;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ElectricMagnetItem extends Item {

    private final static String stateId = "ACTIVE";
    private final short speed;
    private final short maxRange;

    public ElectricMagnetItem(Settings settings, short speed, short maxRange) {
        super(settings);
        this.speed = speed;
        this.maxRange = maxRange;
    }

    private void initState(ItemStack stack) {
        if (!stack.isEmpty()) {
            if (!stack.hasNbt()) {
                stack.setNbt(new NbtCompound());
            }
            NbtCompound nbt = stack.getNbt();
            if (!nbt.contains(stateId)) {
                nbt.putBoolean(stateId, false);
            }
        }
    }

    private boolean getState(ItemStack stack) {
        if (!stack.isEmpty()) {
            this.initState(stack);
            return stack.getNbt().getBoolean(stateId);
        }
        return false;
    }

    private void setState(ItemStack stack, boolean state) {
        this.initState(stack);
        stack.getNbt().putBoolean(stateId, state);
    }

    private void switchState(ItemStack stack) {
        this.setState(stack, !getState(stack));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        ItemStack stack = playerEntity.getStackInHand(hand);
        this.switchState(stack);
        playerEntity.playSound(this.getState(stack) ? SoundEvents.BLOCK_BEACON_ACTIVATE : SoundEvents.BLOCK_BEACON_DEACTIVATE, 0.5F, 2F);

        return TypedActionResult.success(stack, false);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!(entity instanceof PlayerEntity))
            return;

        PlayerEntity player = (PlayerEntity) entity;
        boolean hasCollected = false;

        if (!this.getState(stack))
            return;

        if (player.isSneaking())
            return;

        for (Entity nearbyEntity : world.getEntitiesByType(EntityType.ITEM, player.getBoundingBox().expand(maxRange), EntityPredicates.VALID_ENTITY)) {
            ItemEntity itemEntity = (ItemEntity) nearbyEntity;
            Vec3d playerPosition = player.getEyePos().subtract(itemEntity.getPos());
            Vec3d itemVelocity = itemEntity.getVelocity().multiply(0.10D * speed).add(new Vec3d(playerPosition.x, playerPosition.y-1, playerPosition.z));

            itemEntity.setPickupDelay(0);
            itemEntity.setVelocity(itemVelocity);

            for (int i = 0; i < 2; i++) {
//                world.addParticle(ParticleTypes.PORTAL, itemEntity.getPos().x, itemEntity.getPos().y, itemEntity.getPos().z, (world.getRandom().nextDouble() - 0.5D), -world.getRandom().nextDouble(), (world.getRandom().nextDouble() - 0.5D));
            }

            hasCollected = true;
        }

        if ((!player.isCreative()) && hasCollected) {
            stack.damage(1, player, (p) -> {
                p.sendToolBreakStatus(player.getActiveHand());
            });
        }

    }

    @Environment(EnvType.CLIENT)
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("item.thommas.magnet.tooltip.range", maxRange));
            tooltip.add(Text.translatable("item.thommas.magnet.tooltip.speed", this.speed));
            tooltip.add(Text.translatable("item.thommas.magnet.tooltip.state", this.getState(itemStack) ? "Enabled" : "Disabled"));
        }
        else {
            tooltip.add(Text.translatable("item.thommas.magnet.tooltip"));
        }
    }

    @Environment(EnvType.CLIENT)
    @Override
    public boolean hasGlint(ItemStack itemStack) {
        return this.getState(itemStack);
    }

}
