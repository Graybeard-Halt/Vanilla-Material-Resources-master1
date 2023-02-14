package net.haltocarrick.vanillamaterialresources.entity.client;

import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.haltocarrick.vanillamaterialresources.entity.custom.DragonEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DragonRenderer extends GeoEntityRenderer<DragonEntity> {
    public DragonRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new DragonModel());
    }

    @Override
    public Identifier getTextureResource(DragonEntity instance) {
        return new Identifier(VanillaMaterialResources.MOD_ID, "textures/entity/dragon/dragon.png");
    }

}