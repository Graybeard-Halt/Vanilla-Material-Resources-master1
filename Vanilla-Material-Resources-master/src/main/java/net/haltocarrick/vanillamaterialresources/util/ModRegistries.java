package net.haltocarrick.vanillamaterialresources.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.haltocarrick.vanillamaterialresources.block.ModBlocks;

public class ModRegistries {
    public static void registerModStuffs() {
        registerStrippables();
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.FIRE_LOG, ModBlocks.STRIPPED_FIRE_LOG);
        StrippableBlockRegistry.register(ModBlocks.FIRE_WOOD, ModBlocks.STRIPPED_FIRE_WOOD);
    }

}

