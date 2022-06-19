package net.vakror.thommas.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.entity.ModBlockEntities;
import net.vakror.thommas.screen.ChestScreenHandler;
import net.vakror.thommas.screen.ModScreenHandlers;

public enum ChestTypes {
    NETHERITE(118, 12, new Identifier(Thommas.MOD_ID, "model/obsidian_chest")),
    OBSIDIAN(89, 12, new Identifier(Thommas.MOD_ID, "model/obsidian_chest")),
    CRYSTAL(108, 12, new Identifier(Thommas.MOD_ID, "model/crystal_chest")),
    DIAMOND(76, 12, new Identifier(Thommas.MOD_ID, "model/diamond_chest")),
    EMERALD(69, 12, new Identifier(Thommas.MOD_ID, "model/emerald_chest")),
    GOLD(58, 9, new Identifier(Thommas.MOD_ID, "model/gold_chest")),
    IRON(44, 9, new Identifier(Thommas.MOD_ID, "model/iron_chest")),
    COPPER(35, 9, new Identifier(Thommas.MOD_ID, "model/copper_chest")),
    WOOD(27, 9, new Identifier("entity/chest/normal")),
    BIG_CRYSTAL(118, 24, new Identifier(Thommas.MOD_ID, "model/crystal_chest")),
    MASSIVE_CRYSTAL(129, 36, new Identifier(Thommas.MOD_ID, "model/crystal_chest")),
    HUMONGOUS_CRYSTAL(144, 36, new Identifier(Thommas.MOD_ID, "model/crystal_chest"));

    public final int size;
    public final int rowLength;
    public final Identifier texture;

    ChestTypes(int size, int rowLength, Identifier texture) {
        this.size = size;
        this.rowLength = rowLength;
        this.texture = texture;
    }

    public int getRowCount() {
        return this.size / this.rowLength;
    }

    public static Block get(ChestTypes type) {
        return switch (type) {
            case COPPER -> ModBlocks.COPPER_CHEST;
            case IRON -> ModBlocks.IRON_CHEST;
            case GOLD -> ModBlocks.GOLD_CHEST;
            case DIAMOND -> ModBlocks.DIAMOND_CHEST;
            case EMERALD -> ModBlocks.EMERALD_CHEST;
            case CRYSTAL -> ModBlocks.CRYSTAL_CHEST;
            case OBSIDIAN -> ModBlocks.OBSIDIAN_CHEST;
            case BIG_CRYSTAL -> ModBlocks.BIG_CRYSTAL_CHEST;
            case MASSIVE_CRYSTAL -> ModBlocks.MASSIVE_CRYSTAL_CHEST;
            case HUMONGOUS_CRYSTAL -> ModBlocks.HUMONGOUS_CRYSTAL_CHEST;
            default -> Blocks.CHEST;
        };
    }

    // Used to implement Item Upgrades
    public ChestBlockEntity makeEntity(BlockPos pos, BlockState state) {
        return switch (this) {
            case COPPER -> ModBlockEntities.COPPER_CHEST.instantiate(pos, state);
            case IRON -> ModBlockEntities.IRON_CHEST.instantiate(pos, state);
            case GOLD -> ModBlockEntities.GOLD_CHEST.instantiate(pos, state);
            case DIAMOND -> ModBlockEntities.DIAMOND_CHEST.instantiate(pos, state);
            case EMERALD -> ModBlockEntities.EMERALD_CHEST.instantiate(pos, state);
            case CRYSTAL -> ModBlockEntities.CRYSTAL_CHEST.instantiate(pos, state);
            case OBSIDIAN -> ModBlockEntities.OBSIDIAN_CHEST.instantiate(pos, state);
            case BIG_CRYSTAL -> ModBlockEntities.BIG_CRYSTAL_CHEST.instantiate(pos, state);
            case MASSIVE_CRYSTAL -> ModBlockEntities.MASSIVE_CRYSTAL_CHEST.instantiate(pos, state);
            case HUMONGOUS_CRYSTAL -> ModBlockEntities.HUMONGOUS_CRYSTAL_CHEST.instantiate(pos, state);
            default -> new ChestBlockEntity(pos, state);
        };
    }

    public ScreenHandlerType<ChestScreenHandler> getScreenHandlerType() {
        return switch (this) {
            case COPPER -> ModScreenHandlers.COPPER_CHEST;
            case IRON -> ModScreenHandlers.IRON_CHEST;
            case GOLD -> ModScreenHandlers.GOLD_CHEST;
            case DIAMOND -> ModScreenHandlers.DIAMOND_CHEST;
            case EMERALD -> ModScreenHandlers.EMERALD_CHEST;
            case CRYSTAL -> ModScreenHandlers.CRYSTAL_CHEST;
            case OBSIDIAN -> ModScreenHandlers.OBSIDIAN_CHEST;
            case BIG_CRYSTAL -> ModScreenHandlers.BIG_CRYSTAL_CHEST;
            case MASSIVE_CRYSTAL -> ModScreenHandlers.MASSIVE_CRYSTAL_CHEST;
            case HUMONGOUS_CRYSTAL -> ModScreenHandlers.HUMONGOUS_CRYSTAL_CHEST;
            default -> ModScreenHandlers.IRON_CHEST;
        };
    }

    public BlockEntityType<? extends ChestBlockEntity> getBlockEntityType() {
        return switch (this) {
            case COPPER -> ModBlockEntities.COPPER_CHEST;
            case IRON -> ModBlockEntities.IRON_CHEST;
            case GOLD -> ModBlockEntities.GOLD_CHEST;
            case DIAMOND -> ModBlockEntities.DIAMOND_CHEST;
            case EMERALD -> ModBlockEntities.EMERALD_CHEST;
            case CRYSTAL -> ModBlockEntities.CRYSTAL_CHEST;
            case OBSIDIAN -> ModBlockEntities.OBSIDIAN_CHEST;
            case BIG_CRYSTAL -> ModBlockEntities.BIG_CRYSTAL_CHEST;
            case MASSIVE_CRYSTAL -> ModBlockEntities.MASSIVE_CRYSTAL_CHEST;
            case HUMONGOUS_CRYSTAL -> ModBlockEntities.HUMONGOUS_CRYSTAL_CHEST;
            default -> BlockEntityType.CHEST;
        };
    }
    public FabricBlockSettings setting() {
        return switch (this) {
            case COPPER, GOLD -> FabricBlockSettings.of(Material.METAL)
                    .hardness(3.0F)
                    .resistance(6.0F)
                    .sounds(BlockSoundGroup.COPPER)
                    .requiresTool();
            case IRON -> FabricBlockSettings.of(Material.METAL)
                    .hardness(5.0F)
                    .resistance(6.0F)
                    .sounds(BlockSoundGroup.COPPER)
                    .requiresTool();
            case DIAMOND, EMERALD -> FabricBlockSettings.of(Material.METAL)
                    .hardness(5.0F)
                    .resistance(6.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool();
            case CRYSTAL, BIG_CRYSTAL, MASSIVE_CRYSTAL, HUMONGOUS_CRYSTAL -> FabricBlockSettings.of(Material.GLASS)
                    .hardness(3.0F)
                    .resistance(3.0F)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .requiresTool();
            case OBSIDIAN -> FabricBlockSettings.of(Material.STONE)
                    .hardness(50.0F)
                    .resistance(1200.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .requiresTool();
            default -> FabricBlockSettings.of(Material.WOOD);
        };
    }
}