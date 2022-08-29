//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.vakror.thommas.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.vakror.thommas.util.Material;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    MYTHRIL("mythril", 45366, new int[]{6, 12, 8, 5}, 36, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F, 3.0F, () -> {
        return Ingredient.ofItems(ModItems.MYTHRIL_INGOT);
    }),
    TITANIUM("titanium", 64343, new int[]{9, 14, 15, 13}, 47, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, 8.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.TITANIUM_INGOT);
    }),
    LEAD("lead", 678924, new int[]{11, 17, 15, 13}, 47, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, 9.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.LEAD_INGOT);
    }),
    COBALT("cobalt", 54326, new int[]{11, 15, 18, 9}, 21,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.5F, 0.0F, () -> {
        return Ingredient.ofItems( ModItems.COBALT_INGOT);
    }),
    AMETHYST("amethyst", 6434634, new int[]{25, 23, 26, 24}, 56, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, 15.0F, 2.0F, () -> {
        return Ingredient.ofItems(ModItems.AMETHYST);
    }),
    CITRINE("citrine", 4255, new int[]{19, 21, 18, 20}, 56, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, 9.0F, 1.0F, () -> {
        return Ingredient.ofItems(ModItems.CITRINE);
    }),
    ORICHALCUM("orichalcum", 43532, new int[]{13, 15, 17, 12}, 29,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0.0F,
            () -> Ingredient.ofItems(ModItems.ORICHALCUM_INGOT)),

    LARIMAR("larimar", 1456, new int[]{6, 4, 9, 6}, 13, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2, 2, () -> {
        return Ingredient.ofItems(ItemStack.EMPTY.getItem());
    }),
    GARNET("garnet", 3642, new int[]{10, 7, 13, 10}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6, 6, () -> {
        return Ingredient.ofItems(ItemStack.EMPTY.getItem());
    }),
    CHAROITE("charoite", 1675, new int[]{7, 5, 10, 7}, 14, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3, 3, () -> {
        return Ingredient.ofItems(ItemStack.EMPTY.getItem());
    }),
    JADE("jade", 2467, new int[]{8, 6, 11, 8}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4, 4, () -> {
        return Ingredient.ofItems(ItemStack.EMPTY.getItem());
    }),
    RUBY("ruby", 1500, new int[]{23, 26, 8, 3}, 38, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F, 7.0F, () -> {
        return Ingredient.ofItems(ModItems.RUBY);
    });

    private static final int[] BASE_DURABILITY = new int[]{106, 95, 100, 93};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return Integer.parseInt(String.valueOf(Math.round(this.protectionAmounts[slot.getEntitySlotId()] * 0.3)));
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness * 5;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance * 0.5f;
    }
}
