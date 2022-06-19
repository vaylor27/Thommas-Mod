package net.vakror.thommas.util;

import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.vakror.thommas.block.entity.ModBlockEntities;
import net.vakror.thommas.client.ChestEntityRenderer;

public class ModBlockEntityRenderer {
    public static void registerBlockEntityRenderer() {
        BlockEntityRendererRegistry.register(ModBlockEntities.COPPER_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.IRON_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.GOLD_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.DIAMOND_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.EMERALD_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.CRYSTAL_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.OBSIDIAN_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.BIG_CRYSTAL_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.MASSIVE_CRYSTAL_CHEST, ChestEntityRenderer::new);
        BlockEntityRendererRegistry.register(ModBlockEntities.HUMONGOUS_CRYSTAL_CHEST, ChestEntityRenderer::new);
    }
}
