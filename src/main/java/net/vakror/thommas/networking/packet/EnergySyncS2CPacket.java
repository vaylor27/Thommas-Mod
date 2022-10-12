package net.vakror.thommas.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.block.entity.machine.CrusherBlockEntity;
import net.vakror.thommas.block.entity.machine.GemInfusingBlockEntity;
import net.vakror.thommas.block.entity.machine.ThommasMachineBlockEntity;
import net.vakror.thommas.screen.CrushingScreenHandler;
import net.vakror.thommas.screen.GemInfusingScreenHandler;

public class EnergySyncS2CPacket {
    public static void receive(MinecraftClient client, ClientPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {
        if (client.world != null) {
            long energy = buf.readLong();
            BlockPos position = buf.readBlockPos();


            if (client.world.getBlockEntity(position) instanceof ThommasMachineBlockEntity blockEntity) {
                blockEntity.setEnergyLevel(energy);
            }
        }
    }
}
