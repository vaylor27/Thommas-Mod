package net.vakror.thommas.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;

public class ModBlockEntities {
    public static BlockEntityType<MythrilBlasterBlockEntity> MYTHRIL_BLASTER;
    public static BlockEntityType<LightningChannelerBlockEntity> LIGHTNING_CHANNELER_BLOCK_ENTITY;
    public static BlockEntityType<CombinerBlockEntity> COMBINER_BLOCK_ENTITY;
    public static BlockEntityType<OrichalcumBlasterEntity> ORICHALCUM_BLASTER;



    public static void registerAllBlockEntities() {
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
    }
}
