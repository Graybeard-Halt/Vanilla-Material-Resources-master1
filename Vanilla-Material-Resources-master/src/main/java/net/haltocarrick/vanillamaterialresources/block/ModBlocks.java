package net.haltocarrick.vanillamaterialresources.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.haltocarrick.vanillamaterialresources.block.custom.FireWoodBlock;
import net.haltocarrick.vanillamaterialresources.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public  static final Block ECHO_BLOCK = registerBlock("echo_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public  static final Block ECHO_ORE = registerBlock("echo_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()),ItemGroup.BUILDING_BLOCKS);
    public  static final Block DEEPSLATE_ECHO_ORE = registerBlock("deepslate_echo_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3.0f).requiresTool()),ItemGroup.BUILDING_BLOCKS);

    //end ore
    public  static final Block END_ECHO_ORE = registerBlock("end_echo_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_IRON_ORE = registerBlock("end_iron_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_REDSTONE_ORE = registerBlock("end_redstone_ore",
            new RedstoneOreBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_DIAMOND_ORE = registerBlock("end_diamond_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_COPPER_ORE = registerBlock("end_copper_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_COAL_ORE = registerBlock("end_coal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_EMERALD_ORE = registerBlock("end_emerald_ore",
            new RedstoneOreBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_GOLD_ORE = registerBlock("end_gold_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_LAPIS_ORE = registerBlock("end_lapis_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);

    //netherrack ores
    public  static final Block NETHERRACK_ECHO_ORE = registerBlock("netherrack_echo_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_IRON_ORE = registerBlock("netherrack_iron_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_REDSTONE_ORE = registerBlock("netherrack_redstone_ore",
            new RedstoneOreBlock(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_DIAMOND_ORE = registerBlock("netherrack_diamond_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_COAL_ORE = registerBlock("netherrack_coal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_EMERALD_ORE = registerBlock("netherrack_emerald_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_LAPIS_ORE = registerBlock("netherrack_lapis_ore",
            new RedstoneOreBlock(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_COPPER_ORE = registerBlock("netherrack_copper_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
//wood
    public  static final Block FIRE_LOG = registerBlock("fire_log",
            new FireWoodBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4f).requiresTool()), ModItemGroup.FIRE_WOOD);
    public  static final Block FIRE_WOOD = registerBlock("fire_wood",
            new FireWoodBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4f).requiresTool()), ModItemGroup.FIRE_WOOD);
    public  static final Block STRIPPED_FIRE_LOG = registerBlock("stripped_fire_log",
            new FireWoodBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4f).requiresTool()), ModItemGroup.FIRE_WOOD);
    public  static final Block STRIPPED_FIRE_WOOD = registerBlock("stripped_fire_wood",
            new FireWoodBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4f).requiresTool()), ModItemGroup.FIRE_WOOD);
    public  static final Block FIRE_PLANKS = registerBlock("fire_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(4f).requiresTool()), ModItemGroup.FIRE_WOOD);
    public  static final Block FIRE_LEAVES = registerBlock("fire_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque().requiresTool()), ModItemGroup.FIRE_WOOD);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
    return Registry.register(Registry.BLOCK, new Identifier(VanillaMaterialResources.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(VanillaMaterialResources.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        VanillaMaterialResources.LOGGER.info("Registering Mod Blocks for " + VanillaMaterialResources.MOD_ID);
    }
}
