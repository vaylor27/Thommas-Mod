package net.vakror.thommas.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.entity.custom.RaccoonEntity;
import net.vakror.thommas.entity.custom.RatEntity;
import net.vakror.thommas.entity.custom.TigerEntity;

public class ModEntities {
    public static final EntityType<RaccoonEntity> RACCOON = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(Thommas.MOD_ID, "raccoon"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RaccoonEntity::new)
                    .dimensions(EntityDimensions.changing(1f, 0.7f)).build());

    public static final EntityType<TigerEntity> TIGER = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Thommas.MOD_ID, "tiger"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TigerEntity::new)
                    .dimensions(EntityDimensions.fixed(1f, 0.75f)).build());

    public static final EntityType<RatEntity> RAT = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(Thommas.MOD_ID, "rat"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RatEntity::new)
                    .dimensions(EntityDimensions.fixed(0.2f, 0.2f)).build());

}
