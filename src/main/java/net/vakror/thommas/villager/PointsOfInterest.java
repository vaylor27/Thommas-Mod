package net.vakror.thommas.villager;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.poi.PointOfInterestType;
import net.vakror.thommas.block.ModBlocks;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class PointsOfInterest {

    public static final RegistryKey<PointOfInterestType> BLASTER_POI = of("blasterpoi");
    public static final RegistryKey<PointOfInterestType> COMBINER_POI = of("combinerpoi");
    public static final RegistryKey<PointOfInterestType> LIGHTNING_GOD_POI = of("lightninggodpoi");
    private static final Map<BlockState, RegistryEntry<PointOfInterestType>> POI_STATES_TO_TYPE;
    protected static final Set<BlockState> POI_STATES;

    private static RegistryKey<PointOfInterestType> of(String id) {
        return RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(id));
    }

    public static void registerPois(Registry<PointOfInterestType> registry) {
        register(registry, COMBINER_POI, getStatesOfBlock(ModBlocks.COMBINER), 1, 1);
        register(registry, BLASTER_POI, getStatesOfBlock(ModBlocks.MYTHRIL_BLASTER), 1, 1);
        register(registry, LIGHTNING_GOD_POI, getStatesOfBlock(ModBlocks.LIGHTNING_CHANNELER_BLOCK), 1, 1);
    }

    private static Set<BlockState> getStatesOfBlock(Block block) {
        return ImmutableSet.copyOf(block.getStateManager().getStates());
    }

    private static PointOfInterestType register(Registry<PointOfInterestType> registry, RegistryKey<PointOfInterestType> key, Set<BlockState> states, int ticketCount, int searchDistance) {
        PointOfInterestType pointOfInterestType = new PointOfInterestType(states, ticketCount, searchDistance);
        Registry.register(registry, key, pointOfInterestType);
        registerStates(registry.entryOf(key));
        return pointOfInterestType;
    }

    private static void registerStates(RegistryEntry<PointOfInterestType> poiType) {
        poiType.value().blockStates().forEach((state) -> {
            RegistryEntry<PointOfInterestType> registryEntry2 = POI_STATES_TO_TYPE.put(state, poiType);
            if (registryEntry2 != null) {
                throw Util.throwOrPause(new IllegalStateException(String.format("%s is defined in more than one PoI type", state)));
            }
        });
    }


    public static Optional<RegistryEntry<PointOfInterestType>> getTypeForState(BlockState state) {
        return Optional.ofNullable(POI_STATES_TO_TYPE.get(state));
    }

    static {
        POI_STATES_TO_TYPE = Maps.newHashMap();
        POI_STATES = new ObjectOpenHashSet(POI_STATES_TO_TYPE.keySet());
    }

    public static void registers(Identifier id, int ticketCount, int searchDistance, Block block) {
        PointOfInterestHelper.register(id, ticketCount, searchDistance, block);
    }
}
