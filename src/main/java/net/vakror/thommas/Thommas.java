package net.vakror.thommas;

import net.fabricmc.api.ModInitializer;
import net.vakror.thommas.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Thommas implements ModInitializer {
	public static final String MOD_ID = "thommas";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
