package net.vakror.thommas.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.block.entity.machine.GemInfusingBlockEntity;
import net.vakror.thommas.block.entity.machine.ThommasMachineBlockEntity;
import net.vakror.thommas.screen.GemInfusingScreenHandler;
import net.vakror.thommas.screen.ThommasMachineScreenHandler;
import net.vakror.thommas.util.FluidStack;

public class FluidSyncS2CPacket {
    public static void receive(MinecraftClient client, ClientPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {
        FluidVariant variant = FluidVariant.fromPacket(buf);
        long fluidLevel = buf.readLong();
        BlockPos position = buf.readBlockPos();

        if(client.world.getBlockEntity(position) instanceof ThommasMachineBlockEntity blockEntity) {
            blockEntity.setFluidLevel(variant, fluidLevel);

            if(client.player.currentScreenHandler instanceof ThommasMachineScreenHandler screenHandler &&
                    screenHandler.blockEntity.getPos().equals(position)) {
                blockEntity.setFluidLevel(variant, fluidLevel);
                screenHandler.setFluid(new FluidStack(variant, fluidLevel));
            }
        }
    }
}
