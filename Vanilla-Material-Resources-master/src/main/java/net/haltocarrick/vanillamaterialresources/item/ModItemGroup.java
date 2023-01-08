package net.haltocarrick.vanillamaterialresources.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup NETHER_ORE = FabricItemGroupBuilder.build(new Identifier(VanillaMaterialResources.MOD_ID,
            "nether_ore"), () -> new ItemStack(Items.NETHERRACK));
    public static final ItemGroup END_ORE = FabricItemGroupBuilder.build(new Identifier(VanillaMaterialResources.MOD_ID,
            "end_ore"), () -> new ItemStack(Items.END_STONE));
}
