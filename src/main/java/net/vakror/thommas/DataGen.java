package net.vakror.thommas;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class DataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(ItemModels::new);
    }

    private static class ItemModels extends FabricModelProvider {
        private ItemModels(FabricDataGenerator generator) {
            super(generator);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
            // ...
        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {
            for (Item item: Thommas.crushedOres) {
                itemModelGenerator.register(item, Models.GENERATED);
            }
        }
    }

}