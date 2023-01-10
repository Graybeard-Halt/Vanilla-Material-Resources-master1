package net.haltocarrick.vanillamaterialresources.world.feature;

import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.haltocarrick.vanillamaterialresources.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_ECHO_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.ECHO_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_ECHO_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ECHO_ORE =
            ConfiguredFeatures.register("echo_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_ECHO_ORES, 9));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + VanillaMaterialResources.MOD_ID);
    }
}