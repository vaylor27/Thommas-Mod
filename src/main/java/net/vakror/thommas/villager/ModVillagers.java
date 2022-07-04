package net.vakror.thommas.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.vakror.thommas.Thommas;
import net.vakror.thommas.block.ModBlocks;
import net.vakror.thommas.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {


    public static final PointOfInterestType BLASTER_POI = registerPOI("blaster_poi", ModBlocks.MYTHRIL_BLASTER);
    public static final VillagerProfession BLAST_MASTER = registerProfession("blastmaster",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Thommas.MOD_ID, "blaster_poi")));

    public static final PointOfInterestType LIGHTNINGGOD_POI = registerPOI("lightninggod_poi", ModBlocks.LIGHTNING_CHANNELER_BLOCK);
    public static final VillagerProfession LIGHTNING_GOD = registerProfession("lightninggod",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Thommas.MOD_ID, "lightninggod_poi")));

    public static final PointOfInterestType COMBINER_POI = registerPOI("combiner_poi", ModBlocks.COMBINER);
    public static final VillagerProfession COMBINER = registerProfession("combiner",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Thommas.MOD_ID, "combiner_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(Thommas.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(Thommas.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_ARMORER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(Thommas.MOD_ID, name),
                6, 6, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerVillagers() {
        Thommas.LOGGER.debug("Registering Villagers for " + Thommas.MOD_ID);
    }
}