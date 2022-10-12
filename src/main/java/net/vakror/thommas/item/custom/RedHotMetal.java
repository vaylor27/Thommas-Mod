package net.vakror.thommas.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.vakror.thommas.item.ModItems;

public class RedHotMetal extends Item {

    public RedHotMetal(Settings settings) {
        super(settings);
    }

    public Item getAxeHeadItem() {
        if (this.asItem().equals(ModItems.MYTHRIL_INGOT)) {
            return ModItems.MYTHRIL_AXE;
        }
        if (this.asItem().equals(ModItems.RUBY)) {
            return ModItems.RUBY_AXE;
        }
        if (this.asItem().equals(ModItems.TITANIUM_INGOT)) {
            return ModItems.TITANIUM_AXE;
        }
        if (this.asItem().equals(ModItems.AMETHYST)) {
            return ModItems.AMETHYST_AXE;
        }
        if (this.asItem().equals(ModItems.CITRINE)) {
            return ModItems.CITRINE_AXE;
        }
        if (this.asItem().equals(ModItems.ADAMANTIUM_INGOT)) {
            return ModItems.ADAMANTIUM_AXE;
        }
        if (this.asItem().equals(ModItems.TIN_INGOT)) {
            return ModItems.TIN_AXE;
        }
        if (this.asItem().equals(ModItems.STEEL_INGOT)) {
            return ModItems.STEEL_AXE;
        }
        if (this.asItem().equals(ModItems.LEAD_INGOT)) {
            return ModItems.LEAD_AXE;
        }
        if (this.asItem().equals(Items.COPPER_INGOT)) {
            return ModItems.COPPER_AXE;
        }
        if (this.asItem().equals(ModItems.BRONZE_INGOT)) {
            return ModItems.BRONZE_AXE;
        }
        if (this.asItem().equals(ModItems.ORICHALCUM_INGOT)) {
            return ModItems.ORICHALCUM_AXE;
        }
        if (this.asItem().equals(ModItems.COBALT_INGOT)) {
            return ModItems.COBALT_AXE;
        }
        if (this.asItem().equals(ModItems.BENITOITE_SHARD)) {
            return ModItems.BENITOITE_AXE;
        }
        else return null;
    }

    public Item getShovelHeadItem() {
        if (this.asItem().equals(ModItems.MYTHRIL_INGOT)) {
            return ModItems.MYTHRIL_SHOVEL;
        }
        if (this.asItem().equals(ModItems.RUBY)) {
            return ModItems.RUBY_SHOVEL;
        }
        if (this.asItem().equals(ModItems.TITANIUM_INGOT)) {
            return ModItems.TITANIUM_SHOVEL;
        }
        if (this.asItem().equals(ModItems.AMETHYST)) {
            return ModItems.AMETHYST_SHOVEL;
        }
        if (this.asItem().equals(ModItems.CITRINE)) {
            return ModItems.CITRINE_SHOVEL;
        }
        if (this.asItem().equals(ModItems.ADAMANTIUM_INGOT)) {
            return ModItems.ADAMANTIUM_SHOVEL;
        }
        if (this.asItem().equals(ModItems.TIN_INGOT)) {
            return ModItems.TIN_SHOVEL;
        }
        if (this.asItem().equals(ModItems.STEEL_INGOT)) {
            return ModItems.STEEL_SHOVEL;
        }
        if (this.asItem().equals(ModItems.LEAD_INGOT)) {
            return ModItems.LEAD_SHOVEL;
        }
        if (this.asItem().equals(Items.COPPER_INGOT)) {
            return ModItems.COPPER_SHOVEL;
        }
        if (this.asItem().equals(ModItems.BRONZE_INGOT)) {
            return ModItems.BRONZE_SHOVEL;
        }
        if (this.asItem().equals(ModItems.ORICHALCUM_INGOT)) {
            return ModItems.ORICHALCUM_SHOVEL;
        }
        if (this.asItem().equals(ModItems.COBALT_INGOT)) {
            return ModItems.COBALT_SHOVEL;
        }
        if (this.asItem().equals(ModItems.BENITOITE_SHARD)) {
            return ModItems.BENITOITE_SHOVEL;
        }
        else return null;
    }

    public Item getPickAxeHeadItem() {
        if (this.asItem().equals(ModItems.MYTHRIL_INGOT)) {
            return ModItems.MYTHRIL_PICK;
        }
        if (this.asItem().equals(ModItems.RUBY)) {
            return ModItems.RUBY_PICKAXE;
        }
        if (this.asItem().equals(ModItems.TITANIUM_INGOT)) {
            return ModItems.TITANIUM_PICKAXE;
        }
        if (this.asItem().equals(ModItems.AMETHYST)) {
            return ModItems.AMETHYST_PICKAXE;
        }
        if (this.asItem().equals(ModItems.CITRINE)) {
            return ModItems.CITRINE_PICKAXE;
        }
        if (this.asItem().equals(ModItems.ADAMANTIUM_INGOT)) {
            return ModItems.ADAMANTIUM_PICKAXE;
        }
        if (this.asItem().equals(ModItems.TIN_INGOT)) {
            return ModItems.TIN_PICKAXE;
        }
        if (this.asItem().equals(ModItems.STEEL_INGOT)) {
            return ModItems.STEEL_PICKAXE;
        }
        if (this.asItem().equals(ModItems.LEAD_INGOT)) {
            return ModItems.LEAD_PICKAXE;
        }
        if (this.asItem().equals(Items.COPPER_INGOT)) {
            return ModItems.COPPER_PICKAXE;
        }
        if (this.asItem().equals(ModItems.BRONZE_INGOT)) {
            return ModItems.BRONZE_PICKAXE;
        }
        if (this.asItem().equals(ModItems.ORICHALCUM_INGOT)) {
            return ModItems.ORICHALCUM_PICKAXE;
        }
        if (this.asItem().equals(ModItems.COBALT_INGOT)) {
            return ModItems.COBALT_PICKAXE;
        }
        if (this.asItem().equals(ModItems.BENITOITE_SHARD)) {
            return ModItems.BENITOITE_PICKAXE;
        }
        else return null;
    }

    public Item getSwordBladeItem() {
        if (this.asItem().equals(ModItems.MYTHRIL_INGOT)) {
            return ModItems.MYTHRIL_SWORD;
        }
        if (this.asItem().equals(ModItems.RUBY)) {
            return ModItems.RUBY_SWORD;
        }
        if (this.asItem().equals(ModItems.TITANIUM_INGOT)) {
            return ModItems.TITANIUM_SWORD;
        }
        if (this.asItem().equals(ModItems.AMETHYST)) {
            return ModItems.AMETHYST_SWORD;
        }
        if (this.asItem().equals(ModItems.CITRINE)) {
            return ModItems.CITRINE_SWORD;
        }
        if (this.asItem().equals(ModItems.ADAMANTIUM_INGOT)) {
            return ModItems.ADAMANTIUM_SWORD;
        }
        if (this.asItem().equals(ModItems.TIN_INGOT)) {
            return ModItems.TIN_SWORD;
        }
        if (this.asItem().equals(ModItems.STEEL_INGOT)) {
            return ModItems.STEEL_SWORD;
        }
        if (this.asItem().equals(ModItems.LEAD_INGOT)) {
            return ModItems.LEAD_SWORD;
        }
        if (this.asItem().equals(Items.COPPER_INGOT)) {
            return ModItems.COPPER_SWORD;
        }
        if (this.asItem().equals(ModItems.BRONZE_INGOT)) {
            return ModItems.BRONZE_SWORD;
        }
        if (this.asItem().equals(ModItems.ORICHALCUM_INGOT)) {
            return ModItems.ORICHALCUM_SWORD;
        }
        if (this.asItem().equals(ModItems.COBALT_INGOT)) {
            return ModItems.COBALT_SWORD;
        }
        if (this.asItem().equals(ModItems.BENITOITE_SHARD)) {
            return ModItems.BENITOITE_SWORD;
        }
        else return null;
    }

    public Item getHoeHeadItem() {
        if (this.asItem().equals(ModItems.MYTHRIL_INGOT)) {
            return ModItems.MYTHRIL_HOE;
        }
        if (this.asItem().equals(ModItems.RUBY)) {
            return ModItems.RUBY_HOE;
        }
        if (this.asItem().equals(ModItems.TITANIUM_INGOT)) {
            return ModItems.TITANIUM_HOE;
        }
        if (this.asItem().equals(ModItems.AMETHYST)) {
            return ModItems.AMETHYST_HOE;
        }
        if (this.asItem().equals(ModItems.CITRINE)) {
            return ModItems.CITRINE_HOE;
        }
        if (this.asItem().equals(ModItems.ADAMANTIUM_INGOT)) {
            return ModItems.ADAMANTIUM_HOE;
        }
        if (this.asItem().equals(ModItems.TIN_INGOT)) {
            return ModItems.TIN_HOE;
        }
        if (this.asItem().equals(ModItems.STEEL_INGOT)) {
            return ModItems.STEEL_HOE;
        }
        if (this.asItem().equals(ModItems.LEAD_INGOT)) {
            return ModItems.LEAD_HOE;
        }
        if (this.asItem().equals(Items.COPPER_INGOT)) {
            return ModItems.COPPER_HOE;
        }
        if (this.asItem().equals(ModItems.BRONZE_INGOT)) {
            return ModItems.BRONZE_HOE;
        }
        if (this.asItem().equals(ModItems.ORICHALCUM_INGOT)) {
            return ModItems.ORICHALCUM_HOE;
        }
        if (this.asItem().equals(ModItems.COBALT_INGOT)) {
            return ModItems.COBALT_HOE;
        }
        if (this.asItem().equals(ModItems.BENITOITE_SHARD)) {
            return ModItems.BENITOITE_HOE;
        }
        else return null;
    }
}
