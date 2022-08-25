package net.vakror.thommas.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class Leech extends Enchantment {
    public Leech(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public int getMaxLevel() {
        return 6;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.world.isClient()) {
            if (target.isAlive()) {
                LivingEntity newTarget = (LivingEntity) target;
                user.heal((newTarget.getMaxHealth()-newTarget.getHealth() / 10) * level);
            }
        }

        super.onTargetDamaged(user, target, level);
    }
}
