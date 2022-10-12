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
import net.vakror.thommas.block.entity.machine.CrusherBlockEntity;

@SuppressWarnings("all")
public class CrusherBlockEntityRenderer implements BlockEntityRenderer<CrusherBlockEntity> {
    public CrusherBlockEntityRenderer(BlockEntityRendererFactory.Context context) {

    }

    @Override
    public void render(CrusherBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();

        ItemStack itemStack = entity.inventory.get(0);
        matrices.push();
        matrices.translate(10, 10, 10);
        matrices.scale(0.75f, 0.75f, 0.75f);
        int lightAbove = WorldRenderer.getLightmapCoordinates(entity.getWorld(), entity.getPos().up());
        itemRenderer.renderItem(itemStack, ModelTransformation.Mode.GROUND, lightAbove, overlay, matrices, vertexConsumers, 0);

        matrices.pop();
    }
}
