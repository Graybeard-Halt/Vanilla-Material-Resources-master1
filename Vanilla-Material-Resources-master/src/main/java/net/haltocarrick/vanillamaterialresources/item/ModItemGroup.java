package net.haltocarrick.vanillamaterialresources.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.haltocarrick.vanillamaterialresources.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup NETHER_ORE = FabricItemGroupBuilder.build(new Identifier(VanillaMaterialResources.MOD_ID,
            "nether_ore"), () -> new ItemStack(Items.NETHERRACK));
    public static final ItemGroup END_ORE = FabricItemGroupBuilder.build(new Identifier(VanillaMaterialResources.MOD_ID,
            "end_ore"), () -> new ItemStack(Items.END_STONE));
    public static final ItemGroup ECHO = FabricItemGroupBuilder.build(new Identifier(VanillaMaterialResources.MOD_ID,
            "echo"), () -> new ItemStack(ModItems.ECHO_INGOT));
    public static final ItemGroup COPPER = FabricItemGroupBuilder.build(new Identifier(VanillaMaterialResources.MOD_ID,
            "copper"), () -> new ItemStack(Items.COPPER_INGOT));
    public static final ItemGroup BLACKOUT = FabricItemGroupBuilder.build(new Identifier(VanillaMaterialResources.MOD_ID,
            "blackout"), () -> new ItemStack(Items.BLACK_DYE ));

}
