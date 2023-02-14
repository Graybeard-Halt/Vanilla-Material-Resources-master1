package net.haltocarrick.vanillamaterialresources.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> ECHO_ORE_PLACED = PlacedFeatures.register("echo_ore_placed",
            ModConfiguredFeatures.ECHO_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> NETHER_ECHO_ORE_PLACED = PlacedFeatures.register("nether_echo_ore_placed",
            ModConfiguredFeatures.NETHER_ECHO_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> END_ECHO_ORE_PLACED = PlacedFeatures.register("end_echo_ore_placed",
            ModConfiguredFeatures.END_ECHO_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> NETHER_DIAMOND_ORE_PLACED = PlacedFeatures.register("nether_diamond_ore_placed",
            ModConfiguredFeatures.NETHER_DIAMOND_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> END_DIAMOND_PLACED = PlacedFeatures.register("end_diamond_ore_placed",
            ModConfiguredFeatures.END_DIAMOND_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> NETHER_EMERALD_ORE_PLACED = PlacedFeatures.register("nether_emerald_ore_placed",
            ModConfiguredFeatures.NETHER_EMERALD_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> END_EMERALD_ORE_PLACED = PlacedFeatures.register("end_emerald_ore_placed",
            ModConfiguredFeatures.END_EMERALD_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> NETHER_LAPIS_ORE_PLACED = PlacedFeatures.register("nether_lapis_ore_placed",
            ModConfiguredFeatures.NETHER_LAPIS_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> END_LAPIS_PLACED = PlacedFeatures.register("end_lapis_ore_placed",
            ModConfiguredFeatures.END_LAPIS_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> END_COPPER_ORE_PLACED = PlacedFeatures.register("end_copper_ore_placed",
            ModConfiguredFeatures.END_COPPER_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> NETHER_COPPER_ORE_PLACED = PlacedFeatures.register("nether_copper_ore_placed",
            ModConfiguredFeatures.NETHER_COPPER_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> NETHER_COAL_ORE_PLACED = PlacedFeatures.register("nether_coal_ore_placed",
            ModConfiguredFeatures.NETHER_COAL_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> END_COAL_PLACED = PlacedFeatures.register("end_coal_ore_placed",
            ModConfiguredFeatures.END_COAL_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> NETHER_IRON_ORE_PLACED = PlacedFeatures.register("nether_iron_ore_placed",
            ModConfiguredFeatures.NETHER_IRON_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> END_IRON_ORE_PLACED = PlacedFeatures.register("end_iron_ore_placed",
            ModConfiguredFeatures.END_IRON_ORE, ModOreFeatures.modifiersWithCount(90,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> NETHER_REDSTONE_ORE_PLACED = PlacedFeatures.register("nether_redstone_ore_placed",
            ModConfiguredFeatures.NETHER_REDSTONE_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> END_REDSTONE_PLACED = PlacedFeatures.register("end_redstone_ore_placed",
            ModConfiguredFeatures.END_REDSTONE_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> END_GOLD_PLACED = PlacedFeatures.register("end_gold_ore_placed",
            ModConfiguredFeatures.END_GOLD_ORE, ModOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

}
