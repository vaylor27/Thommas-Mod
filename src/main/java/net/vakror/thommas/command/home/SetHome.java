package net.vakror.thommas.command.home;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.util.IEntityDataSaver;

public class SetHome {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("home")
                .then(CommandManager.literal("set").executes(SetHome::run)));
    }

    public static int run(CommandContext<ServerCommandSource> context) {
        IEntityDataSaver player = (IEntityDataSaver)context.getSource().getPlayer();
        BlockPos playerPos = context.getSource().getPlayer().getBlockPos();
        String pos = "(" + playerPos.getX() + ", " + playerPos.getY() + ", " + playerPos.getZ() + ")";

        player.getPersistentData().putIntArray("homepos",
                new int[] {playerPos.getX(), playerPos.getY(), playerPos.getZ() });

        context.getSource().sendFeedback(Text.literal("Set home at " + pos), true);
        return 1;
    }
}
