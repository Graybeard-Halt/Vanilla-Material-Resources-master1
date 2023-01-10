package net.haltocarrick.vanillamaterialresources;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.haltocarrick.vanillamaterialresources.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class VanillaMaterialResourcesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FIRE_LEAVES, RenderLayer.getCutout());
    }
}
