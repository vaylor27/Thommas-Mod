package net.vakror.thommas.event;

import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.minecraft.server.network.ServerPlayerEntity;
import net.vakror.thommas.util.IEntityDataSaver;

public class ModPlayerPlayerEventCopyFrom implements ServerPlayerEvents.CopyFrom {
    @Override
    public void copyFromPlayer(ServerPlayerEntity oldPlayer, ServerPlayerEntity newPlayer, boolean alive) {
        IEntityDataSaver original = ((IEntityDataSaver) oldPlayer);
        IEntityDataSaver player = ((IEntityDataSaver) newPlayer);

        player.getPersistentData().putIntArray("homepos", original.getPersistentData().getIntArray("homepos"));
    }
}
