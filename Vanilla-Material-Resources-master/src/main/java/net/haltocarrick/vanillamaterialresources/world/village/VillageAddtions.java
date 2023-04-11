package net.haltocarrick.vanillamaterialresources.world.village;

import fzzyhmstrs.structurized_reborn.impl.FabricStructurePoolRegistry;
import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.minecraft.util.Identifier;

public class VillageAddtions {
    public static  void registerNewVillage() {
        FabricStructurePoolRegistry.registerSimple(
                new Identifier("minecraft:village/plains/houses"),
                new Identifier(VanillaMaterialResources.MOD_ID, "house"), 100
        );
    }
}
