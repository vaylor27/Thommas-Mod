//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.vakror.thommas.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    MYTHRIL(MiningLevels.DIAMOND, 1365, 34.0F, 2.0F, 28, () -> {
        return Ingredient.ofItems(ModItems.MYTHRIL_INGOT);
    }),
    RUBY(MiningLevels.NETHERITE, 41366, 48.0F, 7.0F, 34, () -> {
        return Ingredient.ofItems(ModItems.RUBY);
    }),
    ORICHALCUM(MiningLevels.DIAMOND, 46733, 57.5F, 3.5F, 25, () ->
            Ingredient.ofItems(ModItems.ORICHALCUM_INGOT)),

    ADAMANTIUM(MiningLevels.NETHERITE, 436575, 53.0F, 1.0F, 36, () -> {
        return Ingredient.ofItems(ModItems.ADAMANTIUM_INGOT);
    }),

    PURE_DIAMOND(MiningLevels.NETHERITE, 43652, 30.0F, 8.0F, 0, () -> {
        return Ingredient.ofItems(ModItems.PURE_DIAMOND_GEM);
    }),

    COPPER(MiningLevels.NETHERITE, 256721, 44.0F, 8.0F, 0, () -> {
        return Ingredient.ofItems(ModItems.PURE_DIAMOND_GEM);
    }),
    GEM_STEEL(MiningLevels.NETHERITE, 314675237, 1000.0F, 50.0F, 49, () -> {
        return Ingredient.ofItems(ModItems.GEM_STEEL_INGOT);
    }),
    CANE(MiningLevels.WOOD, 398042570, 0.0F, 14.0F, 0, () -> {
        return Ingredient.ofItems(Items.STICK);
    }),
    HAND_DRILL(MiningLevels.IRON, 4361, 30.0F, 2.0F, 10, () -> {
        return Ingredient.ofItems(Items.OAK_LOG);
    }),

    TITANIUM(MiningLevels.NETHERITE, 17854, 55.0F, 7.0F, 40, () -> {
        return Ingredient.ofItems(ModItems.TITANIUM_INGOT);
    }),

    TIN(MiningLevels.NETHERITE, 46352, 45.0F, 7.0F, 40, () -> {
        return Ingredient.ofItems(ModItems.TIN_INGOT);
    }),
    AMETHYST(MiningLevels.NETHERITE, 544522, 50, 10F, 30, () -> {
        return Ingredient.ofItems(ModItems.AMETHYST);
    }),
    COBALT(MiningLevels.NETHERITE, 96785, 46, 7F, 25, () -> {
        return Ingredient.ofItems(ModItems.AMETHYST);
    }),
    CITRINE(MiningLevels.NETHERITE, 5424365, 56, 20.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.CITRINE);
    }),

    LEAD(MiningLevels.NETHERITE, 5423921, 42, 1.0F, 20, () -> {
        return Ingredient.ofItems(ModItems.CITRINE);
    }),

    STEEL(MiningLevels.NETHERITE, 45432, 46, 16.0F, 20, () -> {
        return Ingredient.ofItems(ModItems.STEEL_INGOT);
    }),

    BRONZE(MiningLevels.NETHERITE, 34657, 42, 3.0f, 20, () -> {
        return Ingredient.ofItems(ModItems.BRONZE_INGOT);
    }),

    BONE(MiningLevels.NETHERITE, 46532, 46, 3.0f, 20, () -> {
        return Ingredient.ofItems(ModItems.BRONZE_INGOT);
    }),

    MAGIC(MiningLevels.DIAMOND, 26934, 44.0F, 2.0F, 30, () -> {
        return Ingredient.ofItems(ModItems.MAGIC_INGOT);
    });

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
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
        return this.repairIngredient.get();
    }
}
