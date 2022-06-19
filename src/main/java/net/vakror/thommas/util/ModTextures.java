package net.vakror.thommas.util;

import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.TexturedRenderLayers;
import net.vakror.thommas.block.ChestTypes;

public class ModTextures {
    public static void registerTextures() {
        ClientSpriteRegistryCallback.event(TexturedRenderLayers.CHEST_ATLAS_TEXTURE).register((texture, registry) -> {
            registry.register(ChestTypes.WOOD.texture);
            registry.register(ChestTypes.COPPER.texture);
            registry.register(ChestTypes.IRON.texture);
            registry.register(ChestTypes.GOLD.texture);
            registry.register(ChestTypes.DIAMOND.texture);
            registry.register(ChestTypes.EMERALD.texture);
            registry.register(ChestTypes.CRYSTAL.texture);
            registry.register(ChestTypes.OBSIDIAN.texture);
            registry.register(ChestTypes.BIG_CRYSTAL.texture);
            registry.register(ChestTypes.MASSIVE_CRYSTAL.texture);
            registry.register(ChestTypes.HUMONGOUS_CRYSTAL.texture);
        });
    }
}
