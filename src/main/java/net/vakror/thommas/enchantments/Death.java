package net.vakror.thommas.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class Death extends Enchantment {
    public Death(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        if (!attacker.world.isClient && !attacker.isInvisible() && !attacker.isInvulnerable() && !attacker.isPlayer()) {
            attacker.kill();
        }
        super.onUserDamaged(user, attacker, level);
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.world.isClient() && !target.isInvisible() && !target.isInvulnerable() && !target.isPlayer()) {
            target.kill();
        }

        super.onTargetDamaged(user, target, level);
    }
}
