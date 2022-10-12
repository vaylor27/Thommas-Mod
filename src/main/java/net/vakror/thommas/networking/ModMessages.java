package net.vakror.thommas.networking;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.minecraft.util.Identifier;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.networking.packet.EnergySyncS2CPacket;
import net.vakror.thommas.networking.packet.FluidSyncS2CPacket;

public class ModMessages {
    public static final Identifier ENERGY_SYNC = new Identifier(Thommas.MOD_ID, "energy_sync");
    public static final Identifier FLUID_SYNC = new Identifier(Thommas.MOD_ID, "fluid_sync");
    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(ENERGY_SYNC, EnergySyncS2CPacket::receive);
        ClientPlayNetworking.registerGlobalReceiver(FLUID_SYNC, FluidSyncS2CPacket::receive);
    }
}
