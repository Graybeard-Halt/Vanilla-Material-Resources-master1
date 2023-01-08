package net.haltocarrick.vanillamaterialresources.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.haltocarrick.vanillamaterialresources.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
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
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_DIAMOND_ORE = registerBlock("end_diamond_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);

    //netherrack ores
    public  static final Block NETHERRACK_ECHO_ORE = registerBlock("netherrack_echo_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_IRON_ORE = registerBlock("netherrack_iron_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_REDSTONE_ORE = registerBlock("netherrack_redstone_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_DIAMOND_ORE = registerBlock("netherrack_diamond_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);

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
