package net.vakror.thommas.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;

public class ModEnchantments {
    public static Enchantment THE_MASSACRE = register("the_massacre",
            new TheMassacre(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static Enchantment I_LOVE = register("i_love_u",
            new ILoveU(Enchantment.Rarity.UNCOMMON, EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));


    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(Thommas.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments(){
        Thommas.LOGGER.info("Registering Enchantments for " + Thommas.MOD_ID + "!");
    }
}
