package net.haltocarrick.vanillamaterialresources.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.haltocarrick.vanillamaterialresources.item.custom.ModAxeItem;
import net.haltocarrick.vanillamaterialresources.item.custom.ModHoeItem;
import net.haltocarrick.vanillamaterialresources.item.custom.ModPickaxeItem;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ECHO_INGOT = registerItem("echo_ingot",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.ECHO)));
    public static final Item ECHO_SHARD = registerItem("echo_shard",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.ECHO)));
    public static final Item ECHO_SWORD = registerItem("echo_sword",
            new SwordItem(ModToolMaterials.ECHO, 4, 5f,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECHO)));
    public static final Item ECHO_AXE = registerItem("echo_axe",
            new ModAxeItem(ModToolMaterials.ECHO, 5, -5f,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECHO)));
    public static final Item ECHO_SHOVEL = registerItem("echo_shovel",
            new ShovelItem(ModToolMaterials.ECHO, 1, -2f,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECHO)));
    public static final Item ECHO_PICKAXE = registerItem("echo_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ECHO, 2, -3f,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECHO)));
    public static final Item ECHO_HOE = registerItem("echo_hoe",
            new ModHoeItem(ModToolMaterials.ECHO, -1, -1f,
                    new FabricItemSettings().fireproof().group(ModItemGroup.ECHO)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaMaterialResources.MOD_ID, name), item);
    }

    public static void registerModItems(){
        VanillaMaterialResources.LOGGER.info("Registering Mod Items for " + VanillaMaterialResources.MOD_ID);
    }
}
