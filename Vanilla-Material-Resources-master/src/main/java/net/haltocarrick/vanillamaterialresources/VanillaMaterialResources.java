package net.haltocarrick.vanillamaterialresources;

import net.fabricmc.api.ModInitializer;
import net.haltocarrick.vanillamaterialresources.block.ModBlocks;
import net.haltocarrick.vanillamaterialresources.item.ModItems;
import net.haltocarrick.vanillamaterialresources.util.ModLootTablesModder;
import net.haltocarrick.vanillamaterialresources.world.feature.ModConfiguredFeatures;
import net.haltocarrick.vanillamaterialresources.world.gen.ModWorldGen;
import net.haltocarrick.vanillamaterialresources.world.village.VillageAddtions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class VanillaMaterialResources implements ModInitializer {
	public static final String MOD_ID = "vanillamaterialresources";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModWorldGen.generateModWorldGen();
		ModLootTablesModder.modifyLootTables();
		VillageAddtions.registerNewVillage();

		GeckoLib.initialize();

	}

}
