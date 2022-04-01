package net.vakror.thommas.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.text.LiteralText;
import net.minecraft.util.Util;

public class ILoveU extends Enchantment {
    public ILoveU(Rarity weight, EnchantmentTarget type, EquipmentSlot slotTypes) {
        super(weight, type, new EquipmentSlot[]{slotTypes});
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (!user.getWorld().isClient) {
            if (target.isPlayer()) {
                if (target.isAlive()) {
                    LivingEntity newTarget = (LivingEntity) target;
                    newTarget.heal(20f);
                    float health = user.getHealth();
                    user.setHealth((health - 6));
                    user.sendSystemMessage(new LiteralText("You, " + user.getName() + ", Have sacrificed some of your health to heal " + newTarget.getName() + "! You are a very nice person!"), Util.NIL_UUID);
                }
            } else if (!target.isPlayer()) {
                target.damage(DamageSource.MAGIC, 10f);
                user.sendSystemMessage(new LiteralText("You, " + user.getName() + ", cannot be kind to a " + target.getEntityName() + "! Its a " + target.getType() + "!"), Util.NIL_UUID);
            }
        }
        super.onTargetDamaged(user, target, level);
    }
}
