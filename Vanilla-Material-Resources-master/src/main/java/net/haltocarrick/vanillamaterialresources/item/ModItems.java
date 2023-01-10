package net.haltocarrick.vanillamaterialresources.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.haltocarrick.vanillamaterialresources.item.custom.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ECHO_INGOT = registerItem("echo_ingot",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.ECHO)));
    public static final Item ECHO_SHARD = registerItem("echo_shard",
            new Item(new FabricItemSettings().fireproof().group(ModItemGroup.ECHO)));
    public static final Item ECHO_SWORD = registerItem("echo_sword",
            new ModBlindnessSwordItem(ModToolMaterials.ECHO, 3, -2.6f,
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
    //Copper
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterials.COPPER, 2, -2.6f,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new ModAxeItem(ModToolMaterials.COPPER, 3, -5f,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterials.COPPER, -1, -2f,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new ModPickaxeItem(ModToolMaterials.COPPER, -2, -3f,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoeItem(ModToolMaterials.COPPER, -1, -1f,
                    new FabricItemSettings().group(ModItemGroup.COPPER)));
    //Armor Echo
    public static final Item ECHO_CHESTPLATE = registerItem("echo_chestplate",
            new ModNightVisionArmorItem(ModArmorMaterials.ECHO, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.ECHO)));
    public static final Item ECHO_LEGGINGS = registerItem("echo_leggings",
            new ArmorItem(ModArmorMaterials.ECHO, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.ECHO)));
    public static final Item ECHO_HELMET = registerItem("echo_helmet",
            new ArmorItem(ModArmorMaterials.ECHO, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.ECHO)));
    public static final Item ECHO_BOOTS = registerItem("echo_boots",
            new ArmorItem(ModArmorMaterials.ECHO, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.ECHO)));
    //Armor Blackout
    public static final Item BLACKOUT_CHESTPLATE = registerItem("blackout_chestplate",
            new ModInvsibleArmorItem(ModArmorMaterials.BLACKOUT, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.BLACKOUT)));
    public static final Item BLACKOUT_LEGGINGS = registerItem("blackout_leggings",
            new ArmorItem(ModArmorMaterials.BLACKOUT, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.BLACKOUT)));
    public static final Item BLACKOUT_HELMET = registerItem("blackout_helmet",
            new ArmorItem(ModArmorMaterials.BLACKOUT, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.BLACKOUT)));
    public static final Item BLACKOUT_BOOTS = registerItem("blackout_boots",
            new ArmorItem(ModArmorMaterials.BLACKOUT, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.BLACKOUT)));





    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaMaterialResources.MOD_ID, name), item);
    }

    public static void registerModItems(){
        VanillaMaterialResources.LOGGER.info("Registering Mod Items for " + VanillaMaterialResources.MOD_ID);
    }
}
