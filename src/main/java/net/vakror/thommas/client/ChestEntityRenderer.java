package net.vakror.thommas.client;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.block.entity.ChestBlockEntityRenderer;
import net.minecraft.client.render.block.entity.LightmapCoordinatesRetriever;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3f;
import net.minecraft.world.World;
import net.vakror.thommas.block.custom.GenericChestBlock;
import net.vakror.thommas.block.entity.BigCrystalChestEntity;
import net.vakror.thommas.block.entity.CrystalChestEntity;
import net.vakror.thommas.block.entity.HumongousCrystalChestEntity;
import net.vakror.thommas.block.entity.MassiveCrystalChestEntity;

@Environment(EnvType.CLIENT)
public class ChestEntityRenderer<T extends ChestBlockEntity> extends ChestBlockEntityRenderer<T> {

    private final ModelPart chestLid;
    private final ModelPart chestBottom;
    private final ModelPart chestLock;

    public ChestEntityRenderer(BlockEntityRendererFactory.Context context) {
        super(context);

        ModelPart modelPart = context.getLayerModelPart(EntityModelLayers.CHEST);
        this.chestLid = modelPart.getChild("lid");
        this.chestBottom = modelPart.getChild("bottom");
        this.chestLock = modelPart.getChild("lock");
    }

    @Override
    public void render(T entity, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        World world = entity.getWorld();

        BlockState blockState = world != null ? entity.getCachedState() : Blocks.CHEST.getDefaultState().with(ChestBlock.FACING, Direction.SOUTH);
        Block block = blockState.getBlock();

        if (block instanceof GenericChestBlock) {
            GenericChestBlock chest = (GenericChestBlock)block;

            matrices.push();
            float rotation = blockState.get(ChestBlock.FACING).asRotation();
            matrices.translate(0.5D, 0.5D, 0.5D);
            matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(-rotation));
            matrices.translate(-0.5D, -0.5D, -0.5D);

            DoubleBlockProperties.PropertySource<? extends ChestBlockEntity> properties;
            if (world == null) {
                properties = DoubleBlockProperties.PropertyRetriever::getFallback;
            } else {
                properties = chest.getBlockEntitySource(blockState, world, entity.getPos(), true);
            }

            float g = properties.apply(GenericChestBlock.getAnimationProgressRetriever(entity)).get(tickDelta);
            g = 1.0F - g;
            g = 1.0F - g * g * g;
            int i = ((Int2IntFunction)properties.apply(new LightmapCoordinatesRetriever())).applyAsInt(light);

            SpriteIdentifier spriteIdentifier = new SpriteIdentifier(TexturedRenderLayers.CHEST_ATLAS_TEXTURE, chest.getType().texture);
            VertexConsumer vertexConsumer = spriteIdentifier.getVertexConsumer(vertexConsumers, RenderLayer::getEntityCutout);

            renderMatrices(matrices, vertexConsumer, this.chestLid, this.chestLock, this.chestBottom, g, i, overlay);

            if (entity instanceof CrystalChestEntity) {
                renderItems(matrices, (CrystalChestEntity) entity, tickDelta, vertexConsumers, light, overlay);
            }

            else if (entity instanceof BigCrystalChestEntity) {
                renderItems(matrices, (BigCrystalChestEntity) entity, tickDelta, vertexConsumers, light, overlay);
            }

            else if (entity instanceof MassiveCrystalChestEntity) {
                renderItems(matrices, (MassiveCrystalChestEntity) entity, tickDelta, vertexConsumers, light, overlay);
            }

            else if (entity instanceof HumongousCrystalChestEntity) {
                renderItems(matrices, (HumongousCrystalChestEntity) entity, tickDelta, vertexConsumers, light, overlay);
            }

            matrices.pop();
        }
    }

    private void renderItems(MatrixStack matrices, CrystalChestEntity chestEntity, float tickDelta, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        DefaultedList<ItemStack> inv = chestEntity.getInvStackList();
        int counter = 0;
        for (int j = 0; j < 3; j++) {
            renderItem(0.55, 0.3 + (j * 0.5), 0.7, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
        for (int j = 0; j < 3; j++) {
            renderItem(1.4, 0.3 + (j * 0.5), 0.7, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
        for (int j = 0; j < 3; j++) {
            renderItem(0.55, 0.3 + (j * 0.5), 1.4, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
        for (int j = 0; j < 3; j++) {
            renderItem(1.4, 0.3 + (j * 0.5), 1.4, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
    }

    private void renderItems(MatrixStack matrices, BigCrystalChestEntity chestEntity, float tickDelta, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        DefaultedList<ItemStack> inv = chestEntity.getInvStackList();
        int counter = 0;
        for (int j = 0; j < 3; j++) {
            renderItem(0.55, 0.3 + (j * 0.5), 0.7, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
        for (int j = 0; j < 3; j++) {
            renderItem(1.4, 0.3 + (j * 0.5), 0.7, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
        for (int j = 0; j < 3; j++) {
            renderItem(0.55, 0.3 + (j * 0.5), 1.4, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
        for (int j = 0; j < 3; j++) {
            renderItem(1.4, 0.3 + (j * 0.5), 1.4, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
    }

    private void renderItems(MatrixStack matrices, MassiveCrystalChestEntity chestEntity, float tickDelta, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        DefaultedList<ItemStack> inv = chestEntity.getInvStackList();
        int counter = 0;
        for (int j = 0; j < 3; j++) {
            renderItem(0.55, 0.3 + (j * 0.5), 0.7, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
        for (int j = 0; j < 3; j++) {
            renderItem(1.4, 0.3 + (j * 0.5), 0.7, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
        for (int j = 0; j < 3; j++) {
            renderItem(0.55, 0.3 + (j * 0.5), 1.4, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
        for (int j = 0; j < 3; j++) {
            renderItem(1.4, 0.3 + (j * 0.5), 1.4, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
    }

    private void renderItems(MatrixStack matrices, HumongousCrystalChestEntity chestEntity, float tickDelta, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        DefaultedList<ItemStack> inv = chestEntity.getInvStackList();
        int counter = 0;
        for (int j = 0; j < 3; j++) {
            renderItem(0.55, 0.3 + (j * 0.5), 0.7, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
        for (int j = 0; j < 3; j++) {
            renderItem(1.4, 0.3 + (j * 0.5), 0.7, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
        for (int j = 0; j < 3; j++) {
            renderItem(0.55, 0.3 + (j * 0.5), 1.4, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
        for (int j = 0; j < 3; j++) {
            renderItem(1.4, 0.3 + (j * 0.5), 1.4, inv, counter, matrices, chestEntity, tickDelta, vertexConsumers, light, overlay);
            counter++;
        }
    }

    private void renderItem(double x, double y, double z, DefaultedList<ItemStack> inv, int counter, MatrixStack matrices, CrystalChestEntity chestEntity, float tickDelta, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.pop();
        matrices.push();
        ItemStack item = inv.get(counter);
        matrices.scale(0.5f, 0.5f, 0.5f);
        matrices.translate(x, y, z);
        matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(chestEntity.getWorld().getTime() + tickDelta));
        MinecraftClient.getInstance().getItemRenderer().renderItem(item, ModelTransformation.Mode.GROUND, light, overlay, matrices, vertexConsumers, 0); //(int) chestEntity.getPos().asLong()
    }

    private void renderItem(double x, double y, double z, DefaultedList<ItemStack> inv, int counter, MatrixStack matrices, BigCrystalChestEntity chestEntity, float tickDelta, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.pop();
        matrices.push();
        ItemStack item = inv.get(counter);
        matrices.scale(0.5f, 0.5f, 0.5f);
        matrices.translate(x, y, z);
        matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(chestEntity.getWorld().getTime() + tickDelta));
        MinecraftClient.getInstance().getItemRenderer().renderItem(item, ModelTransformation.Mode.GROUND, light, overlay, matrices, vertexConsumers, 0); //(int) chestEntity.getPos().asLong()
    }

    private void renderItem(double x, double y, double z, DefaultedList<ItemStack> inv, int counter, MatrixStack matrices, MassiveCrystalChestEntity chestEntity, float tickDelta, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.pop();
        matrices.push();
        ItemStack item = inv.get(counter);
        matrices.scale(0.5f, 0.5f, 0.5f);
        matrices.translate(x, y, z);
        matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(chestEntity.getWorld().getTime() + tickDelta));
        MinecraftClient.getInstance().getItemRenderer().renderItem(item, ModelTransformation.Mode.GROUND, light, overlay, matrices, vertexConsumers, 0); //(int) chestEntity.getPos().asLong()
    }

    private void renderItem(double x, double y, double z, DefaultedList<ItemStack> inv, int counter, MatrixStack matrices, HumongousCrystalChestEntity chestEntity, float tickDelta, VertexConsumerProvider vertexConsumers, int light, int overlay) {
        matrices.pop();
        matrices.push();
        ItemStack item = inv.get(counter);
        matrices.scale(0.5f, 0.5f, 0.5f);
        matrices.translate(x, y, z);
        matrices.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(chestEntity.getWorld().getTime() + tickDelta));
        MinecraftClient.getInstance().getItemRenderer().renderItem(item, ModelTransformation.Mode.GROUND, light, overlay, matrices, vertexConsumers, 0); //(int) chestEntity.getPos().asLong()
    }


    private static void renderMatrices(MatrixStack matrices, VertexConsumer vertices, ModelPart lid, ModelPart latch, ModelPart base, float openFactor, int light, int overlay) {
        lid.pitch = -openFactor * 1.5707964F;
        latch.pitch = lid.pitch;
        lid.render(matrices, vertices, light, overlay);
        latch.render(matrices, vertices, light, overlay);
        base.render(matrices, vertices, light, overlay);
    }
}