package net.vakror.thommas.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.minecraft.block.Block;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;

public class ModVillagers {
    public static final PointOfInterestType BLASTER_POI = registerPOI("blasterpoi", ModBlocks.MYTHRIL_BLASTER);
    public static final VillagerProfession BLAST_MASTER = registerProfession("blastmaster",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Thommas.MOD_ID, "blasterpoi")));

    public static final VillagerProfession COMBINER = register("combiner", ModBlocks.COMBINER);

    public static final PointOfInterestType LIGHTNING_GOD_POI = registerPOI("lightninggodpoi", ModBlocks.LIGHTNING_CHANNELER_BLOCK);
    public static final VillagerProfession LIGHTNING_GOD = registerProfession("lightninggod",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Thommas.MOD_ID, "lightninggodpoi")));

    public static VillagerProfession register(String name, Block block) {
        registerPOI(name + "poi", block);
        return registerProfession(name, RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Thommas.MOD_ID, name + "poi")));
    }

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(Thommas.MOD_ID, name), VillagerProfessionBuilder.create().id(new Identifier(Thommas.MOD_ID, name)).workstation(type).workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return Registry.register(Registry.POINT_OF_INTEREST_TYPE, new Identifier(Thommas.MOD_ID, name),
                new PointOfInterestType(ImmutableSet.copyOf(block.getStateManager().getStates()), 1, 7));
    }
}