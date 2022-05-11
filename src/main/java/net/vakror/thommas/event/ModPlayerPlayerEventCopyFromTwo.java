package net.vakror.thommas.event;

import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.minecraft.server.network.ServerPlayerEntity;
import net.vakror.thommas.util.IEntityDataSaver;
import net.vakror.thommas.util.IEntityDataSaverNumber2;

public class ModPlayerPlayerEventCopyFromTwo implements ServerPlayerEvents.CopyFrom {
    @Override
    public void copyFromPlayer(ServerPlayerEntity oldPlayer, ServerPlayerEntity newPlayer, boolean alive) {
        IEntityDataSaverNumber2 original = ((IEntityDataSaverNumber2) oldPlayer);
        IEntityDataSaverNumber2 player = ((IEntityDataSaverNumber2) newPlayer);

        player.data().putIntArray("homepos", original.data().getIntArray("homepos"));
    }
}
