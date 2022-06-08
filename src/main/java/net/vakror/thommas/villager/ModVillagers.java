package net.vakror.thommas.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import org.jetbrains.annotations.Nullable;

import java.util.function.Predicate;

import static net.vakror.thommas.villager.PointsOfInterest.*;

public class ModVillagers {
    public static final VillagerProfession BLAST_MASTER = registerProfession("blastmaster", BLASTER_POI, SoundEvents.ENTITY_VILLAGER_WORK_TOOLSMITH);
    public static final VillagerProfession LIGHTNING_GOD = registerProfession("lightninggod", LIGHTNING_GOD_POI, SoundEvents.ENTITY_VILLAGER_WORK_TOOLSMITH);
    public static final VillagerProfession COMBINER = registerProfession("combiner", COMBINER_POI, SoundEvents.ENTITY_VILLAGER_WORK_TOOLSMITH);


    private static VillagerProfession registerProfession(String id, RegistryKey<PointOfInterestType> heldWorkstation, @Nullable SoundEvent workSound) {
        return register(id, (entry) -> {
            return entry.matchesKey(heldWorkstation);
        }, (entry) -> {
            return entry.matchesKey(heldWorkstation);
        }, workSound);
    }
    private static VillagerProfession register(String id, Predicate<RegistryEntry<PointOfInterestType>> heldWorkstation, Predicate<RegistryEntry<PointOfInterestType>> acquirableWorkstation, @Nullable SoundEvent workSound) {
        return register(id, heldWorkstation, acquirableWorkstation, ImmutableSet.of(), ImmutableSet.of(), workSound);
    }

    private static VillagerProfession register(String id, RegistryKey<PointOfInterestType> heldWorkstation, ImmutableSet<Item> gatherableItems, ImmutableSet<Block> secondaryJobSites, @Nullable SoundEvent workSound) {
        return register(id, (entry) -> {
            return entry.matchesKey(heldWorkstation);
        }, (entry) -> {
            return entry.matchesKey(heldWorkstation);
        }, gatherableItems, secondaryJobSites, workSound);
    }

    private static VillagerProfession register(String id, Predicate<RegistryEntry<PointOfInterestType>> heldWorkstation, Predicate<RegistryEntry<PointOfInterestType>> acquirableWorkstation, ImmutableSet<Item> gatherableItems, ImmutableSet<Block> secondaryJobSites, @Nullable SoundEvent workSound) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(id), new VillagerProfession(id, heldWorkstation, acquirableWorkstation, gatherableItems, secondaryJobSites, workSound));
    }

    public static PointOfInterestType registerPOI(Identifier id, int ticketCount, int searchDistance, Block block) {
        return PointOfInterestHelper.register(id, ticketCount, searchDistance, block);
    }
}