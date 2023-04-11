package net.haltocarrick.vanillamaterialresources.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.haltocarrick.vanillamaterialresources.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.minecraft.block.Material.AMETHYST;

public class ModBlocks {



    public  static final Block ECHO_BLOCK = register("echo_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.ECHO);
    public  static final Block ECHO_ORE = register("echo_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 3.0f).requiresTool()),ModItemGroup.ECHO);
    public  static final Block DEEPSLATE_ECHO_ORE = register("deepslate_echo_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f, 3.0f).requiresTool()),ModItemGroup.ECHO);

    //end ore
    public  static final Block END_ECHO_ORE = register("end_echo_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_IRON_ORE = register("end_iron_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_REDSTONE_ORE = register("end_redstone_ore",
            new RedstoneOreBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_DIAMOND_ORE = register("end_diamond_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_COPPER_ORE = register("end_copper_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_COAL_ORE = register("end_coal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_EMERALD_ORE = register("end_emerald_ore",
            new RedstoneOreBlock(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_GOLD_ORE = register("end_gold_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);
    public  static final Block END_LAPIS_ORE = register("end_lapis_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f, 9.0f).requiresTool()), ModItemGroup.END_ORE);

    //netherrack ores
    public  static final Block NETHERRACK_ECHO_ORE = register("netherrack_echo_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_IRON_ORE = register("netherrack_iron_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_REDSTONE_ORE = register("netherrack_redstone_ore",
            new RedstoneOreBlock(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_DIAMOND_ORE = register("netherrack_diamond_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_COAL_ORE = register("netherrack_coal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_EMERALD_ORE = register("netherrack_emerald_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_LAPIS_ORE = register("netherrack_lapis_ore",
            new RedstoneOreBlock(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);
    public  static final Block NETHERRACK_COPPER_ORE = register("netherrack_copper_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.4f).requiresTool()), ModItemGroup.NETHER_ORE);


    private static Block register(String name, Block block, ItemGroup group) {
        registerBlock(name, block, group);
    return Registry.register(Registry.BLOCK, new Identifier(VanillaMaterialResources.MOD_ID, name), block);
    }
    private static Item registerBlock(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(VanillaMaterialResources.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        VanillaMaterialResources.LOGGER.info("Registering Mod Blocks for " + VanillaMaterialResources.MOD_ID);
    }
}
