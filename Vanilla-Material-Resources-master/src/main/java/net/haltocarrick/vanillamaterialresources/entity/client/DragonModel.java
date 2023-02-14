package net.haltocarrick.vanillamaterialresources.entity.client;

import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.haltocarrick.vanillamaterialresources.entity.custom.DragonEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class DragonModel extends AnimatedGeoModel<DragonEntity> {


    @Override
    public Identifier getModelResource(DragonEntity object) {
        return new Identifier(VanillaMaterialResources.MOD_ID, "geo/dragon.geo.json");
    }

    @Override
    public Identifier getTextureResource(DragonEntity object) {
        return new Identifier(VanillaMaterialResources.MOD_ID, "textures/entity/dragon.png");
    }

    @Override
    public Identifier getAnimationResource(DragonEntity animatable) {
        return new Identifier(VanillaMaterialResources.MOD_ID, "animations/dragon.animation.geo");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(DragonEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }

}
