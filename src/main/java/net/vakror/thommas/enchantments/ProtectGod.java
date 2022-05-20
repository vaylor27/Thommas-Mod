package net.vakror.thommas.enchantments;

import net.minecraft.client.MinecraftClient;
import net.minecraft.enchantment.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;

public class ProtectGod extends Enchantment {
    protected ProtectGod(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public int getMinPower(int level) {
        return 6 + (level) * 20;
    }

    @Override
    public int getMaxPower(int level) {
        return this.getMinPower(level) + 46;
    }

    @Override
    public int getMaxLevel() {
        return 50;
    }

    @Override
    public int getProtectionAmount(int level, DamageSource source) {
        if (source.isOutOfWorld()) {
            return 0;
        }
        else {
            return level * 25;
        }
    }

    @Override
    protected boolean canAccept(Enchantment other) {
        if (other instanceof ProtectionEnchantment) {
            return false;
        }
        else {
            return super.canAccept(other);
        }
    }
}
