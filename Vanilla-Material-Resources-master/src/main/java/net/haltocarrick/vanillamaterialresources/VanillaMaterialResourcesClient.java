package net.haltocarrick.vanillamaterialresources;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.haltocarrick.vanillamaterialresources.block.ModBlocks;
import net.haltocarrick.vanillamaterialresources.entity.ModEntities;
import net.haltocarrick.vanillamaterialresources.entity.client.DragonRenderer;
import net.minecraft.client.render.RenderLayer;

public class VanillaMaterialResourcesClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.dragon, DragonRenderer::new);
    }
}
