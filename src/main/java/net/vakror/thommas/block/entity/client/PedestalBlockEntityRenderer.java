package net.vakror.thommas.block.entity.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Vec3f;
import net.vakror.thommas.block.entity.PedestalBlockEntity;

@SuppressWarnings("all")
public class PedestalBlockEntityRenderer implements BlockEntityRenderer<PedestalBlockEntity> {
    public PedestalBlockEntityRenderer(BlockEntityRendererFactory.Context context) {

    }

    @Override
    public void render(PedestalBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();

        ItemStack itemStack = entity.inventory.get(0);
        matrices.push();
        matrices.translate(0.5f, 0.925f + 0.05 * Math.cos(2 * entity.getRotation() * Math.PI / 180), 0.5f);
        matrices.scale(1.25f, 1.25f, 1.25f);
        matrices.multiply(Vec3f.NEGATIVE_Y.getDegreesQuaternion(entity.getRotation()));
        int lightAbove = WorldRenderer.getLightmapCoordinates(entity.getWorld(), entity.getPos().up());
        itemRenderer.renderItem(itemStack, ModelTransformation.Mode.GROUND, lightAbove, overlay, matrices, vertexConsumers, 0);

        matrices.pop();
        entity.addRotation(-0.25f);
    }
}
