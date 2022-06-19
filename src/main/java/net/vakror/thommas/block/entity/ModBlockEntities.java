package net.vakror.thommas.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.FurnaceBlocks;
import net.vakror.thommas.block.ModBlocks;

public class ModBlockEntities {
    public static BlockEntityType<MythrilBlasterBlockEntity> MYTHRIL_BLASTER;
    public static BlockEntityType<LightningChannelerBlockEntity> LIGHTNING_CHANNELER_BLOCK_ENTITY;
    public static BlockEntityType<CombinerBlockEntity> COMBINER_BLOCK_ENTITY;
    public static BlockEntityType<OrichalcumBlasterEntity> ORICHALCUM_BLASTER;
    public static BlockEntityType<VakrorFurnaceEntity> VAKROR_FURNACE;
    public static BlockEntityType<UpgraderBlockEntity> UPGRADER_BLOCK_ENTITY;
    public static final BlockEntityType<CopperChestEntity> COPPER_CHEST = FabricBlockEntityTypeBuilder.create(CopperChestEntity::new, ModBlocks.COPPER_CHEST).build(null);
    public static final BlockEntityType<IronChestEntity> IRON_CHEST = FabricBlockEntityTypeBuilder.create(IronChestEntity::new, ModBlocks.IRON_CHEST).build(null);
    public static final BlockEntityType<GoldChestEntity> GOLD_CHEST = FabricBlockEntityTypeBuilder.create(GoldChestEntity::new, ModBlocks.GOLD_CHEST).build(null);
    public static final BlockEntityType<DiamondChestEntity> DIAMOND_CHEST = FabricBlockEntityTypeBuilder.create(DiamondChestEntity::new, ModBlocks.DIAMOND_CHEST).build(null);
    public static final BlockEntityType<EmeraldChestEntity> EMERALD_CHEST = FabricBlockEntityTypeBuilder.create(EmeraldChestEntity::new, ModBlocks.EMERALD_CHEST).build(null);
    public static final BlockEntityType<CrystalChestEntity> CRYSTAL_CHEST = FabricBlockEntityTypeBuilder.create(CrystalChestEntity::new, ModBlocks.CRYSTAL_CHEST).build(null);
    public static final BlockEntityType<ObsidianChestEntity> OBSIDIAN_CHEST = FabricBlockEntityTypeBuilder.create(ObsidianChestEntity::new, ModBlocks.OBSIDIAN_CHEST).build(null);
    public static final BlockEntityType<BigCrystalChestEntity> BIG_CRYSTAL_CHEST = FabricBlockEntityTypeBuilder.create(BigCrystalChestEntity::new, ModBlocks.BIG_CRYSTAL_CHEST).build(null);
    public static final BlockEntityType<MassiveCrystalChestEntity> MASSIVE_CRYSTAL_CHEST = FabricBlockEntityTypeBuilder.create(MassiveCrystalChestEntity::new, ModBlocks.MASSIVE_CRYSTAL_CHEST).build(null);
    public static final BlockEntityType<HumongousCrystalChestEntity> HUMONGOUS_CRYSTAL_CHEST = FabricBlockEntityTypeBuilder.create(HumongousCrystalChestEntity::new, ModBlocks.HUMONGOUS_CRYSTAL_CHEST).build(null);


    public static void registerAllBlockEntities() {
        VAKROR_FURNACE = register(
                "fabric_furnace",
                FabricBlockEntityTypeBuilder.create(VakrorFurnaceEntity::new,
                        FurnaceBlocks.getFurnaces().toArray(new Block[0])
                ).build(null));

        MYTHRIL_BLASTER = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(Thommas.MOD_ID, "mythril_blaster"),
                FabricBlockEntityTypeBuilder.create(MythrilBlasterBlockEntity::new,
                        ModBlocks.MYTHRIL_BLASTER).build(null));

        LIGHTNING_CHANNELER_BLOCK_ENTITY =
                Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Thommas.MOD_ID, "lightning_channeler"),
                        FabricBlockEntityTypeBuilder.create(LightningChannelerBlockEntity::new,
                                ModBlocks.LIGHTNING_CHANNELER_BLOCK).build(null));

        COMBINER_BLOCK_ENTITY =
                Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Thommas.MOD_ID, "combiner"),
                        FabricBlockEntityTypeBuilder.create(CombinerBlockEntity::new,
                                ModBlocks.COMBINER).build(null));

        ORICHALCUM_BLASTER =
                Registry.register(Registry.BLOCK_ENTITY_TYPE,
                    new Identifier(Thommas.MOD_ID, "orichalcum_blaster"),
                    FabricBlockEntityTypeBuilder.create(OrichalcumBlasterEntity::new,
                            ModBlocks.ORICHALCUM_BLASTER).build(null));

        UPGRADER_BLOCK_ENTITY =
                Registry.register(Registry.BLOCK_ENTITY_TYPE,
                    new Identifier(Thommas.MOD_ID, "upgrader"),
                    FabricBlockEntityTypeBuilder.create(UpgraderBlockEntity::new,
                            ModBlocks.UPGRADER).build(null));


        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Thommas.MOD_ID, "copper_chest"), COPPER_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Thommas.MOD_ID, "iron_chest"), IRON_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Thommas.MOD_ID, "gold_chest"), GOLD_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Thommas.MOD_ID, "diamond_chest"), DIAMOND_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Thommas.MOD_ID, "emerald_chest"), EMERALD_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Thommas.MOD_ID, "crystal_chest"), CRYSTAL_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Thommas.MOD_ID, "obsidian_chest"), OBSIDIAN_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Thommas.MOD_ID, "big_crystal_chest"), BIG_CRYSTAL_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Thommas.MOD_ID, "massive_crystal_chest"), MASSIVE_CRYSTAL_CHEST);
        Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Thommas.MOD_ID, "humongous_crystal_chest"), HUMONGOUS_CRYSTAL_CHEST);
    }

    private static <T extends BlockEntity> BlockEntityType<T> register(String name, BlockEntityType<T> type) {
        return Registry.register(Registry.BLOCK_ENTITY_TYPE, Thommas.id(name), type);
    }
}
