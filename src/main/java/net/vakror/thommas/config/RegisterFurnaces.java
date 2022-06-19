package net.vakror.thommas.config;

import net.vakror.thommas.Thommas;

import java.util.Arrays;
import java.util.List;

public class RegisterFurnaces {
    public static List<FurnaceData> furnaceData = Arrays.asList(
            FurnaceData.of("iron", 2, 2, 0),
            FurnaceData.of("gold", 3f, 2, 5),
            FurnaceData.of("emerald", 4f, 3f, 7),
            FurnaceData.of("diamond", 4f, 3f, 9),
            FurnaceData.of("obsidian", 5f, 4f, 16),
            FurnaceData.of("steel_oven", 46f, 2f, 100)
    );

    public static void register() {
        Thommas.LOGGER.info("Registering Custom Furnaces for " + Thommas.MOD_ID + "!");
    }
}
