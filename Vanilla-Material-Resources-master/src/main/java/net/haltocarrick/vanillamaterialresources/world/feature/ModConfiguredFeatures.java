package net.haltocarrick.vanillamaterialresources.world.feature;

import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.haltocarrick.vanillamaterialresources.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_ECHO_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.ECHO_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSLATE_ECHO_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> NETHER_ECHO_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER,
                    ModBlocks.NETHERRACK_ECHO_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> END_ECHO_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.END_ECHO_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> NETHER_DIAMOND_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                    ModBlocks.NETHERRACK_DIAMOND_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> END_DIAMOND_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.END_DIAMOND_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> NETHER_LAPIS_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                    ModBlocks.NETHERRACK_LAPIS_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> END_LAPIS_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.END_LAPIS_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> NETHER_EMERALD_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                    ModBlocks.NETHERRACK_EMERALD_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> END_EMERALD_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.END_EMERALD_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_COAL_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.END_COAL_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> NETHER_COAL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                    ModBlocks.NETHERRACK_COAL_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> END_GOLD_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.END_GOLD_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> NETHER_IRON_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                    ModBlocks.NETHERRACK_IRON_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> END_IRON_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.END_IRON_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> NETHER_COPPER_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                    ModBlocks.NETHERRACK_COPPER_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> END_COPPER_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.END_COPPER_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> NETHER_REDSTONE_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.NETHERRACK,
                    ModBlocks.NETHERRACK_REDSTONE_ORE.getDefaultState()));
    public static final List<OreFeatureConfig.Target> END_REDSTONE_ORES = List.of(
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE),
                    ModBlocks.END_REDSTONE_ORE.getDefaultState()));



    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ECHO_ORE =
            ConfiguredFeatures.register("echo_ore", Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_ECHO_ORES, 4));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_ECHO_ORE =
            ConfiguredFeatures.register("end_echo_ore", Feature.ORE,
                    new OreFeatureConfig(END_ECHO_ORES, 4));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_ECHO_ORE =
            ConfiguredFeatures.register("netherrack_echo_ore", Feature.ORE,
                    new OreFeatureConfig(NETHER_ECHO_ORES, 4));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_DIAMOND_ORE =
            ConfiguredFeatures.register("end_diamond_ore", Feature.ORE,
                    new OreFeatureConfig(END_DIAMOND_ORES, 6));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_DIAMOND_ORE =
            ConfiguredFeatures.register("netherrack_diamond_ore", Feature.ORE,
                    new OreFeatureConfig(NETHER_DIAMOND_ORES, 6));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_LAPIS_ORE =
            ConfiguredFeatures.register("end_lapis_ore", Feature.ORE,
                    new OreFeatureConfig(END_LAPIS_ORES, 7));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_LAPIS_ORE =
            ConfiguredFeatures.register("netherrack_lapis_ore", Feature.ORE,
                    new OreFeatureConfig(NETHER_LAPIS_ORES, 7));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_EMERALD_ORE =
            ConfiguredFeatures.register("end_emerald_ore", Feature.ORE,
                    new OreFeatureConfig(END_EMERALD_ORES, 3));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_EMERALD_ORE =
            ConfiguredFeatures.register("netherrack_emerald_ore", Feature.ORE,
                    new OreFeatureConfig(NETHER_EMERALD_ORES, 3));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_COAL_ORE =
            ConfiguredFeatures.register("end_coal_ore", Feature.ORE,
                    new OreFeatureConfig(END_COAL_ORES, 17));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_COAL_ORE =
            ConfiguredFeatures.register("netherrack_coal_ore", Feature.ORE,
                    new OreFeatureConfig(NETHER_COAL_ORES, 17));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_GOLD_ORE =
            ConfiguredFeatures.register("end_gold_ore", Feature.ORE,
                    new OreFeatureConfig(END_GOLD_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_COPPER_ORE =
            ConfiguredFeatures.register("netherrack_copper_ore", Feature.ORE,
                    new OreFeatureConfig(NETHER_COPPER_ORES, 15));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_COPPER_ORE =
            ConfiguredFeatures.register("end_copper_ore", Feature.ORE,
                    new OreFeatureConfig(END_COPPER_ORES, 15));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_REDSTONE_ORE =
            ConfiguredFeatures.register("netherrack_redstone_ore", Feature.ORE,
                    new OreFeatureConfig(NETHER_REDSTONE_ORES, 8));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_REDSTONE_ORE =
            ConfiguredFeatures.register("end_redstone_ore", Feature.ORE,
                    new OreFeatureConfig(END_REDSTONE_ORES, 8));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_IRON_ORE =
            ConfiguredFeatures.register("netherrack_iron_ore", Feature.ORE,
                    new OreFeatureConfig(NETHER_IRON_ORES, 9));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_IRON_ORE =
            ConfiguredFeatures.register("end_iron_ore", Feature.ORE,
                    new OreFeatureConfig(END_IRON_ORES, 9));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + VanillaMaterialResources.MOD_ID);
    }
}