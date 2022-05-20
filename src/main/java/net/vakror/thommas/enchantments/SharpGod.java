package net.vakror.thommas.enchantments;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;

public class SharpGod extends Enchantment {

    private static final int BASE_POWERS = 5;
    private static final int POWERS_PER_LEVEL = 11;
    private static final int MIN_MAX_POWER_DIFFERENCES = 40;

    public SharpGod(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public boolean isTreasure() {
        return true;
    }

    @Override
    public int getMaxLevel() {
        return 50;
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        if (!attacker.world.isClient && !attacker.isInvisible() && !attacker.isInvulnerable() && !attacker.isPlayer()) {
            attacker.kill();
        }
        super.onUserDamaged(user, attacker, level);
    }

    @Override
    public boolean canAccept(Enchantment other) {
        return !(other instanceof DamageEnchantment);
    }

    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        return stack.getItem() instanceof AxeItem || stack.getItem() instanceof SwordItem || super.isAcceptableItem(stack);
    }

    public int getMinPower(int level) {
        return BASE_POWERS;
    }

    public int getMaxPower(int level) {
        return this.getMinPower(level) + MIN_MAX_POWER_DIFFERENCES;
    }

    public float getAttackDamage(int level, EntityGroup group) {
            return 8 + (float)Math.max(0, level) * 9;
    }
}
