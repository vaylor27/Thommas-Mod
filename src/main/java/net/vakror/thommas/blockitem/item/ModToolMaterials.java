//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.vakror.thommas.blockitem.item;

import java.util.function.Supplier;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;
import net.vakror.thommas.blockitem.ModItems;

public enum ModToolMaterials implements ToolMaterial {
    MYTHRIL(MiningLevels.DIAMOND, 738, 14.0F, 2.0F, 28, () -> {
        return Ingredient.ofItems(ModItems.MYTHRIL_INGOT);
    }),
    RUBY(MiningLevels.NETHERITE, 1500, 23.0F, 5.0F, 34, () -> {
        return Ingredient.ofItems(ModItems.RUBY);
    }),
    ADAMANTIUM(MiningLevels.NETHERITE, 2452, 43.0F, 2.0F, 36, () -> {
        return Ingredient.ofItems(ModItems.ADAMANTIUM_INGOT);
    }),
    PURE_DIAMOND(MiningLevels.NETHERITE, 4000, 10.0F, 8.0F, 0, () -> {
        return Ingredient.ofItems(ModItems.PURE_DIAMOND_GEM);
    }),
    GEM_STEEL(MiningLevels.NETHERITE, 10000000, 1000.0F, 50.0F, 49, () -> {
        return Ingredient.ofItems(ModItems.GEM_STEEL_INGOT);
    }),
    CANE(MiningLevels.WOOD, 1000000000, 0.0F, 14.0F, 0, () -> {
        return Ingredient.ofItems(Items.STICK);
    }),
    HAND_DRILL(MiningLevels.IRON, 1000, 10.0F, 2.0F, 10, () -> {
        return Ingredient.ofItems(Items.OAK_LOG);
    }),

    MAGIC(MiningLevels.DIAMOND, 2600, 14.0F, 2.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.MAGIC_INGOT);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
