//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.vakror.thommas.blockitem.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.vakror.thommas.blockitem.ModItems;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    MYTHRIL("mythril", 46, new int[]{3, 6, 8, 3}, 36, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F, 3.0F, () -> {
        return Ingredient.ofItems(ModItems.MYTHRIL_INGOT);
    }),
    TITANIUM("titanium", 64343, new int[]{4, 7, 9, 14}, 47, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, 8.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.TITANIUM_INGOT);
    }),
    LEAD("lead", 678924, new int[]{6, 5, 5, 4}, 47, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, 9.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.LEAD_INGOT);
    }),
    AMETHYST("amethyst", 64334, new int[]{25, 24, 26, 23}, 56, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, 15.0F, 2.0F, () -> {
        return Ingredient.ofItems(ModItems.AMETHYST);
    }),
    CITRINE("citrine", 4255, new int[]{6, 8, 10, 14}, 56, SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA, 9.0F, 1.0F, () -> {
        return Ingredient.ofItems(ModItems.CITRINE);
    }),
    RUBY("ruby", 1500, new int[]{3, 6, 8, 3}, 38, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F, 7.0F, () -> {
        return Ingredient.ofItems(ModItems.RUBY);
    });

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
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
        return this.protectionAmounts[slot.getEntitySlotId()];
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
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
