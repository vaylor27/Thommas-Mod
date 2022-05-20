//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.vakror.thommas.command.hack;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Collection;
import java.util.Iterator;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.command.argument.ItemStackArgument;
import net.minecraft.command.argument.ItemStackArgumentType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.TranslatableText;

public class VakrorGiveCommand {
    public static final int MAX_STACKS = 100;

    public VakrorGiveCommand() {
    }

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        dispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder) CommandManager.literal("vakrorgive").requires((source) -> {
            return source.hasPermissionLevel(0);
        })).then(CommandManager.argument("targets", EntityArgumentType.players()).then(((RequiredArgumentBuilder)CommandManager.argument("item", ItemStackArgumentType.itemStack()).executes((context) -> {
            return execute((ServerCommandSource)context.getSource(), ItemStackArgumentType.getItemStackArgument(context, "item"), EntityArgumentType.getPlayers(context, "targets"), 1);
        })).then(CommandManager.argument("count", IntegerArgumentType.integer(1)).executes((context) -> {
            return execute((ServerCommandSource)context.getSource(), ItemStackArgumentType.getItemStackArgument(context, "item"), EntityArgumentType.getPlayers(context, "targets"), IntegerArgumentType.getInteger(context, "count"));
        })))));
    }

    private static int execute(ServerCommandSource source, ItemStackArgument item, Collection<ServerPlayerEntity> targets, int count) throws CommandSyntaxException {
        int i = item.getItem().getMaxCount();
        int j = i * 100;
        if (count > j) {
            source.sendError(new TranslatableText("commands.give.failed.toomanyitems", new Object[]{j, item.createStack(count, false).toHoverableText()}));
            return 0;
        } else {
            Iterator var6 = targets.iterator();

            label44:
            while(var6.hasNext()) {
                ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)var6.next();
                int k = count;

                while(true) {
                    while(true) {
                        if (k <= 0) {
                            continue label44;
                        }

                        int l = Math.min(i, k);
                        k -= l;
                        ItemStack itemStack = item.createStack(l, false);
                        boolean bl = serverPlayerEntity.getInventory().insertStack(itemStack);
                        ItemEntity itemEntity;
                        if (bl && itemStack.isEmpty()) {
                            itemStack.setCount(1);
                            itemEntity = serverPlayerEntity.dropItem(itemStack, false);
                            if (itemEntity != null) {
                                itemEntity.setDespawnImmediately();
                            }

                            serverPlayerEntity.world.playSound((PlayerEntity)null, serverPlayerEntity.getX(), serverPlayerEntity.getY(), serverPlayerEntity.getZ(), SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.PLAYERS, 0.2F, ((serverPlayerEntity.getRandom().nextFloat() - serverPlayerEntity.getRandom().nextFloat()) * 0.7F + 1.0F) * 2.0F);
                            serverPlayerEntity.currentScreenHandler.sendContentUpdates();
                        } else {
                            itemEntity = serverPlayerEntity.dropItem(itemStack, false);
                            if (itemEntity != null) {
                                itemEntity.resetPickupDelay();
                                itemEntity.setOwner(serverPlayerEntity.getUuid());
                            }
                        }
                    }
                }
            }
            return targets.size();
        }
    }
}
