package net.vakror.thommas.rei.plugin;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.util.EntryStacks;
import me.shedaniel.rei.plugin.common.displays.crafting.DefaultCraftingDisplay;
import net.vakror.thommas.blockitem.ModBlocks;
import net.vakror.thommas.rei.MythrilScreen;

public class ExampleClientPlugin implements REIClientPlugin {
    CategoryIdentifier<DefaultCraftingDisplay<?>> MYTHRIL = CategoryIdentifier.of("thommas", "plugins/mythril_blaster");
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.addWorkstations(MYTHRIL, EntryStacks.of(ModBlocks.MYTHRIL_BLASTER));
        registry.add(new MythrilScreen());
    }
}
