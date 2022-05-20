
package net.vakror.thommas.command.hack;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementProgress;
import net.minecraft.command.CommandException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.command.argument.IdentifierArgumentType;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.TranslatableText;

public class VakrorAdvancementCommand {
    private static final SuggestionProvider<ServerCommandSource> SUGGESTION_PROVIDER = (context, builder) -> {
        Collection<Advancement> collection = ((ServerCommandSource) context.getSource()).getServer().getAdvancementLoader().getAdvancements();
        return CommandSource.suggestIdentifiers(collection.stream().map(Advancement::getId), builder);
    };

    public VakrorAdvancementCommand() {
    }

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        dispatcher.register((LiteralArgumentBuilder) ((LiteralArgumentBuilder) ((LiteralArgumentBuilder) CommandManager.literal("vakroradvancement").requires((source) -> {
            return source.hasPermissionLevel(0);
        })).then(CommandManager.literal("grant").then(((RequiredArgumentBuilder) ((RequiredArgumentBuilder) ((RequiredArgumentBuilder) ((RequiredArgumentBuilder) CommandManager.argument("targets", EntityArgumentType.players()).then(CommandManager.literal("only").then(((RequiredArgumentBuilder) CommandManager.argument("advancement", IdentifierArgumentType.identifier()).suggests(SUGGESTION_PROVIDER).executes((context) -> {
            return executeAdvancement((ServerCommandSource) context.getSource(), EntityArgumentType.getPlayers(context, "targets"), VakrorAdvancementCommand.Operation.GRANT, select(IdentifierArgumentType.getAdvancementArgument(context, "advancement"), VakrorAdvancementCommand.Selection.ONLY));
        })).then(CommandManager.argument("criterion", StringArgumentType.greedyString()).suggests((context, builder) -> {
            return CommandSource.suggestMatching(IdentifierArgumentType.getAdvancementArgument(context, "advancement").getCriteria().keySet(), builder);
        }).executes((context) -> {
            return executeCriterion((ServerCommandSource) context.getSource(), EntityArgumentType.getPlayers(context, "targets"), VakrorAdvancementCommand.Operation.GRANT, IdentifierArgumentType.getAdvancementArgument(context, "advancement"), StringArgumentType.getString(context, "criterion"));
        }))))).then(CommandManager.literal("from").then(CommandManager.argument("advancement", IdentifierArgumentType.identifier()).suggests(SUGGESTION_PROVIDER).executes((context) -> {
            return executeAdvancement((ServerCommandSource) context.getSource(), EntityArgumentType.getPlayers(context, "targets"), VakrorAdvancementCommand.Operation.GRANT, select(IdentifierArgumentType.getAdvancementArgument(context, "advancement"), VakrorAdvancementCommand.Selection.FROM));
        })))).then(CommandManager.literal("until").then(CommandManager.argument("advancement", IdentifierArgumentType.identifier()).suggests(SUGGESTION_PROVIDER).executes((context) -> {
            return executeAdvancement((ServerCommandSource) context.getSource(), EntityArgumentType.getPlayers(context, "targets"), VakrorAdvancementCommand.Operation.GRANT, select(IdentifierArgumentType.getAdvancementArgument(context, "advancement"), VakrorAdvancementCommand.Selection.UNTIL));
        })))).then(CommandManager.literal("through").then(CommandManager.argument("advancement", IdentifierArgumentType.identifier()).suggests(SUGGESTION_PROVIDER).executes((context) -> {
            return executeAdvancement((ServerCommandSource) context.getSource(), EntityArgumentType.getPlayers(context, "targets"), VakrorAdvancementCommand.Operation.GRANT, select(IdentifierArgumentType.getAdvancementArgument(context, "advancement"), VakrorAdvancementCommand.Selection.THROUGH));
        })))).then(CommandManager.literal("everything").executes((context) -> {
            return executeAdvancement((ServerCommandSource) context.getSource(), EntityArgumentType.getPlayers(context, "targets"), VakrorAdvancementCommand.Operation.GRANT, ((ServerCommandSource) context.getSource()).getServer().getAdvancementLoader().getAdvancements());
        }))))).then(CommandManager.literal("revoke").then(((RequiredArgumentBuilder) ((RequiredArgumentBuilder) ((RequiredArgumentBuilder) ((RequiredArgumentBuilder) CommandManager.argument("targets", EntityArgumentType.players()).then(CommandManager.literal("only").then(((RequiredArgumentBuilder) CommandManager.argument("advancement", IdentifierArgumentType.identifier()).suggests(SUGGESTION_PROVIDER).executes((context) -> {
            return executeAdvancement((ServerCommandSource) context.getSource(), EntityArgumentType.getPlayers(context, "targets"), VakrorAdvancementCommand.Operation.REVOKE, select(IdentifierArgumentType.getAdvancementArgument(context, "advancement"), VakrorAdvancementCommand.Selection.ONLY));
        })).then(CommandManager.argument("criterion", StringArgumentType.greedyString()).suggests((context, builder) -> {
            return CommandSource.suggestMatching(IdentifierArgumentType.getAdvancementArgument(context, "advancement").getCriteria().keySet(), builder);
        }).executes((context) -> {
            return executeCriterion((ServerCommandSource) context.getSource(), EntityArgumentType.getPlayers(context, "targets"), VakrorAdvancementCommand.Operation.REVOKE, IdentifierArgumentType.getAdvancementArgument(context, "advancement"), StringArgumentType.getString(context, "criterion"));
        }))))).then(CommandManager.literal("from").then(CommandManager.argument("advancement", IdentifierArgumentType.identifier()).suggests(SUGGESTION_PROVIDER).executes((context) -> {
            return executeAdvancement((ServerCommandSource) context.getSource(), EntityArgumentType.getPlayers(context, "targets"), VakrorAdvancementCommand.Operation.REVOKE, select(IdentifierArgumentType.getAdvancementArgument(context, "advancement"), VakrorAdvancementCommand.Selection.FROM));
        })))).then(CommandManager.literal("until").then(CommandManager.argument("advancement", IdentifierArgumentType.identifier()).suggests(SUGGESTION_PROVIDER).executes((context) -> {
            return executeAdvancement((ServerCommandSource) context.getSource(), EntityArgumentType.getPlayers(context, "targets"), VakrorAdvancementCommand.Operation.REVOKE, select(IdentifierArgumentType.getAdvancementArgument(context, "advancement"), VakrorAdvancementCommand.Selection.UNTIL));
        })))).then(CommandManager.literal("through").then(CommandManager.argument("advancement", IdentifierArgumentType.identifier()).suggests(SUGGESTION_PROVIDER).executes((context) -> {
            return executeAdvancement((ServerCommandSource) context.getSource(), EntityArgumentType.getPlayers(context, "targets"), VakrorAdvancementCommand.Operation.REVOKE, select(IdentifierArgumentType.getAdvancementArgument(context, "advancement"), VakrorAdvancementCommand.Selection.THROUGH));
        })))).then(CommandManager.literal("everything").executes((context) -> {
            return executeAdvancement((ServerCommandSource) context.getSource(), EntityArgumentType.getPlayers(context, "targets"), VakrorAdvancementCommand.Operation.REVOKE, ((ServerCommandSource) context.getSource()).getServer().getAdvancementLoader().getAdvancements());
        })))));
    }

    private static int executeAdvancement(ServerCommandSource source, Collection<ServerPlayerEntity> targets, VakrorAdvancementCommand.Operation operation, Collection<Advancement> selection) {
        int i = 0;

        ServerPlayerEntity serverPlayerEntity;
        for (Iterator var5 = targets.iterator(); var5.hasNext(); i += operation.processAll(serverPlayerEntity, selection)) {
            serverPlayerEntity = (ServerPlayerEntity) var5.next();

        }
        return i;
    }

    private static int executeCriterion(ServerCommandSource source, Collection<ServerPlayerEntity> targets, VakrorAdvancementCommand.Operation operation, Advancement advancement, String criterion) {
        int i = 0;
        if (!advancement.getCriteria().containsKey(criterion)) {
            throw new CommandException(new TranslatableText("commands.advancement.criterionNotFound", new Object[]{advancement.toHoverableText(), criterion}));
        } else {
            Iterator var6 = targets.iterator();

            while(var6.hasNext()) {
                ServerPlayerEntity serverPlayerEntity = (ServerPlayerEntity)var6.next();
                if (operation.processEachCriterion(serverPlayerEntity, advancement, criterion)) {
                    ++i;
                }
            }

            if (i == 0) {
                if (targets.size() == 1) {
                    throw new CommandException(new TranslatableText(operation.getCommandPrefix() + ".criterion.to.one.failure", new Object[]{criterion, advancement.toHoverableText(), ((ServerPlayerEntity)targets.iterator().next()).getDisplayName()}));
                } else {
                    throw new CommandException(new TranslatableText(operation.getCommandPrefix() + ".criterion.to.many.failure", new Object[]{criterion, advancement.toHoverableText(), targets.size()}));
                }
            } else {
                if (targets.size() == 1) {
                } else {
                }

                return i;
            }
        }
    }

    private static List<Advancement> select(Advancement advancement, VakrorAdvancementCommand.Selection selection) {
        List<Advancement> list = Lists.newArrayList();
        if (selection.before) {
            for(Advancement advancement2 = advancement.getParent(); advancement2 != null; advancement2 = advancement2.getParent()) {
                list.add(advancement2);
            }
        }

        list.add(advancement);
        if (selection.after) {
            addChildrenRecursivelyToList(advancement, list);
        }

        return list;
    }

    private static void addChildrenRecursivelyToList(Advancement parent, List<Advancement> childList) {
        Iterator var2 = parent.getChildren().iterator();

        while(var2.hasNext()) {
            Advancement advancement = (Advancement)var2.next();
            childList.add(advancement);
            addChildrenRecursivelyToList(advancement, childList);
        }

    }

    static enum Operation {
        GRANT("grant") {
            protected boolean processEach(ServerPlayerEntity player, Advancement advancement) {
                AdvancementProgress advancementProgress = player.getAdvancementTracker().getProgress(advancement);
                if (advancementProgress.isDone()) {
                    return false;
                } else {
                    Iterator var4 = advancementProgress.getUnobtainedCriteria().iterator();

                    while(var4.hasNext()) {
                        String string = (String)var4.next();
                        player.getAdvancementTracker().grantCriterion(advancement, string);
                    }

                    return true;
                }
            }

            protected boolean processEachCriterion(ServerPlayerEntity player, Advancement advancement, String criterion) {
                return player.getAdvancementTracker().grantCriterion(advancement, criterion);
            }
        },
        REVOKE("revoke") {
            protected boolean processEach(ServerPlayerEntity player, Advancement advancement) {
                AdvancementProgress advancementProgress = player.getAdvancementTracker().getProgress(advancement);
                if (!advancementProgress.isAnyObtained()) {
                    return false;
                } else {
                    Iterator var4 = advancementProgress.getObtainedCriteria().iterator();

                    while(var4.hasNext()) {
                        String string = (String)var4.next();
                        player.getAdvancementTracker().revokeCriterion(advancement, string);
                    }

                    return true;
                }
            }

            protected boolean processEachCriterion(ServerPlayerEntity player, Advancement advancement, String criterion) {
                return player.getAdvancementTracker().revokeCriterion(advancement, criterion);
            }
        };

        private final String commandPrefix;

        Operation(String name) {
            this.commandPrefix = "commands.advancement." + name;
        }

        public int processAll(ServerPlayerEntity player, Iterable<Advancement> advancements) {
            int i = 0;
            Iterator var4 = advancements.iterator();

            while(var4.hasNext()) {
                Advancement advancement = (Advancement)var4.next();
                if (this.processEach(player, advancement)) {
                    ++i;
                }
            }

            return i;
        }

        protected abstract boolean processEach(ServerPlayerEntity player, Advancement advancement);

        protected abstract boolean processEachCriterion(ServerPlayerEntity player, Advancement advancement, String criterion);

        protected String getCommandPrefix() {
            return this.commandPrefix;
        }
    }

    static enum Selection {
        ONLY(false, false),
        THROUGH(true, true),
        FROM(false, true),
        UNTIL(true, false),
        EVERYTHING(true, true);

        final boolean before;
        final boolean after;

        private Selection(boolean before, boolean after) {
            this.before = before;
            this.after = after;
        }
    }
}
