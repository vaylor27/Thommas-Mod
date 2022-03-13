package net.vakror.thommas.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class TheMassacre extends Enchantment {
    public TheMassacre(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public int getMaxLevel() {
        return 5;
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        PlayerEntity player = (PlayerEntity) user;
        if (level == 5) {
            attacker.damage(DamageSource.player(player), 10);
        }
        else {
            attacker.damage(DamageSource.player(player), 5);
        }

        super.onUserDamaged(user, attacker, level);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.world.isClient()) {
            ServerWorld world = (ServerWorld) user.world;
            PlayerEntity player = (PlayerEntity) user;
            BlockPos position = target.getBlockPos();

            if (level == 1) {
                EntityType.DRAGON_FIREBALL.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
            }
            else if (level == 2) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
            }
            else if (level == 3) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.DRAGON_FIREBALL.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
            }
            else if (level == 4) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
            }
            else if (level == 5) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);

            }
        }

        super.onTargetDamaged(user, target, level);
    }
}
