package net.vakror.thommas;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.block.FurnaceBlocks;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.block.entity.chest.BigCrystalChestEntity;
import net.vakror.thommas.block.entity.chest.CrystalChestEntity;
import net.vakror.thommas.block.entity.chest.HumongousCrystalChestEntity;
import net.vakror.thommas.block.entity.chest.MassiveCrystalChestEntity;
import net.vakror.thommas.entity.ModEntities;
import net.vakror.thommas.entity.client.RaccoonRenderer;
import net.vakror.thommas.entity.client.RatRenderer;
import net.vakror.thommas.entity.client.TigerRenderer;
import net.vakror.thommas.entity.client.armor.LeadArmorRenderer;
import net.vakror.thommas.entity.client.armor.MythrilArmorRenderer;
import net.vakror.thommas.entity.client.armor.OrichalcumArmorRenderer;
import net.vakror.thommas.entity.client.armor.RubyArmorRenderer;
import net.vakror.thommas.fluid.ModFluids;
import net.vakror.thommas.item.ModItems;
import net.vakror.thommas.screen.*;
import net.vakror.thommas.util.ModBlockEntityRenderer;
import net.vakror.thommas.util.ModModelPredicateProvider;
import net.vakror.thommas.util.ModTextures;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class ThommasClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModBlockEntityRenderer.registerBlockEntityRenderer();
        ModTextures.registerTextures();
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DETRANIUM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAFE_DETRANIUM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KAUPEN_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAFE_KAUPEN_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORRUPTED_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_CORRUPTED_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WINTER_WINDOW, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAPE_VINE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAWBERRY_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUBY_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PEPPER_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TOMATO_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JACARANDA_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JACARANDA_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.REDWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.REDWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MYTHRIL_BLASTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CROWN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORCHID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_ORCHID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HYACINTH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_HYACINTH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OATS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CUCUMBER_PLANT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PINK_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EBONY_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLIGHTSPORE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAVEWHEAT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BONETREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GOLDENWOOD_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BONETREE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GOLDENWOOD_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRONETREE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRONETREE_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOAMBLOSSOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOAMBLOSSOM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUEBELLS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BLUEBELLS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SWEETPOD, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PLUMP_HELMET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_BLOSSOM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_BLOSSOM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TURNIP_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_PINK_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORICHALCUM_BLASTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_BLOSSOM_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_BLOSSOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AMETHYST_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KAUPEN_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAFE_KAUPEN_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TITANIUM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AMETHYST_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(FurnaceBlocks.IRON_FURNACE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FurnaceBlocks.GOLD_FURNACE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FurnaceBlocks.EMERALD_FURNACE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FurnaceBlocks.DIAMOND_FURNACE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(FurnaceBlocks.OBSIDIAN_FURNACE, RenderLayer.getTranslucent());


        ModModelPredicateProvider.registerModModels();

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HONEY_STILL,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0xe9860c));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HONEY_FLOWING,
                new SimpleFluidRenderHandler(SimpleFluidRenderHandler.WATER_STILL,
                        SimpleFluidRenderHandler.WATER_FLOWING,
                        SimpleFluidRenderHandler.WATER_OVERLAY, 0xe9860c));

        ScreenRegistry.register(ModScreenHandlers.MYTHRIL_BLASTER_SCREEN_HANDLER, MythrilBlasterScreen::new);
        ScreenRegistry.register(ModScreenHandlers.LIGHTNING_CHANNELER_SCREEN_HANDLER, LightningChannelerScreen::new);
        ScreenRegistry.register(ModScreenHandlers.COMBINER_SCREEN_HANDLER, CombinerScreen::new);
        ScreenRegistry.register(ModScreenHandlers.ORICHALCUM_BLASTER_SCREEN_HANDLER, OrichalcumBlasterScreen::new);
        ScreenRegistry.register(ModScreenHandlers.UPGRADER_SCREEN_HANDLER, UpgraderScreen::new);

        EntityRendererRegistry.register(ModEntities.RACCOON, RaccoonRenderer::new);
        EntityRendererRegistry.register(ModEntities.RAT, RatRenderer::new);
        EntityRendererRegistry.register(ModEntities.TIGER, TigerRenderer::new);

        GeoArmorRenderer.registerArmorRenderer(new OrichalcumArmorRenderer(), ModItems.ORICHALCUM_BOOTS,
                ModItems.ORICHALCUM_LEGGINGS, ModItems.ORICHALCUM_CHESTPLATE, ModItems.ORICHALCUM_HELMET);

        GeoArmorRenderer.registerArmorRenderer(new MythrilArmorRenderer(), ModItems.MYTHRIL_BOOTS,
                ModItems.MYTHRIL_LEGGINGS, ModItems.MYTHRIL_CHESTPLATE, ModItems.MYTHRIL_HELMET);

        GeoArmorRenderer.registerArmorRenderer(new RubyArmorRenderer(), ModItems.RUBY_BOOTS,
                ModItems.RUBY_LEGGINGS, ModItems.RUBY_CHESTPLATE, ModItems.RUBY_HELMET);

        GeoArmorRenderer.registerArmorRenderer(new LeadArmorRenderer(), ModItems.LEAD_BOOTS,
                ModItems.LEAD_LEGGINGS, ModItems.LEAD_CHESTPLATE, ModItems.LEAD_HELMET);


        // Crystal Chest Rendering
        ClientPlayNetworking.registerGlobalReceiver(Thommas.UPDATE_INV_PACKET_ID_NORMAL, (client, handler, buf, responseSender) -> {
            BlockPos pos = buf.readBlockPos();
            DefaultedList<ItemStack> inv = DefaultedList.ofSize(12, ItemStack.EMPTY);
            for (int i = 0; i < 12; i++) {
                inv.set(i, buf.readItemStack());
            }
            client.execute(() -> {
                assert MinecraftClient.getInstance().world != null;
                CrystalChestEntity blockEntity = (CrystalChestEntity) MinecraftClient.getInstance().world.getBlockEntity(pos);
                assert blockEntity != null;
                blockEntity.setInvStackList(inv);
            });
        });


        ClientPlayNetworking.registerGlobalReceiver(Thommas.UPDATE_INV_PACKET_ID_BIG, (client, handler, buf, responseSender) -> {
            BlockPos pos = buf.readBlockPos();
            DefaultedList<ItemStack> inv = DefaultedList.ofSize(12, ItemStack.EMPTY);
            for (int i = 0; i < 12; i++) {
                inv.set(i, buf.readItemStack());
            }
            client.execute(() -> {
                assert MinecraftClient.getInstance().world != null;
                BigCrystalChestEntity blockEntity = (BigCrystalChestEntity) MinecraftClient.getInstance().world.getBlockEntity(pos);
                assert blockEntity != null;
                blockEntity.setInvStackList(inv);
            });
        });


        ClientPlayNetworking.registerGlobalReceiver(Thommas.UPDATE_INV_PACKET_ID_MASSIVE, (client, handler, buf, responseSender) -> {
            BlockPos pos = buf.readBlockPos();
            DefaultedList<ItemStack> inv = DefaultedList.ofSize(12, ItemStack.EMPTY);
            for (int i = 0; i < 12; i++) {
                inv.set(i, buf.readItemStack());
            }
            client.execute(() -> {
                assert MinecraftClient.getInstance().world != null;
                MassiveCrystalChestEntity blockEntity = (MassiveCrystalChestEntity) MinecraftClient.getInstance().world.getBlockEntity(pos);
                assert blockEntity != null;
                blockEntity.setInvStackList(inv);
            });
        });


        ClientPlayNetworking.registerGlobalReceiver(Thommas.UPDATE_INV_PACKET_ID_HUMONGOUS, (client, handler, buf, responseSender) -> {
            BlockPos pos = buf.readBlockPos();
            DefaultedList<ItemStack> inv = DefaultedList.ofSize(12, ItemStack.EMPTY);
            for (int i = 0; i < 12; i++) {
                inv.set(i, buf.readItemStack());
            }
            client.execute(() -> {
                assert MinecraftClient.getInstance().world != null;
                HumongousCrystalChestEntity blockEntity = (HumongousCrystalChestEntity) MinecraftClient.getInstance().world.getBlockEntity(pos);
                assert blockEntity != null;
                blockEntity.setInvStackList(inv);
            });
        });


        ModScreenHandlers.registerChestScreenHandlers();
    }
}
