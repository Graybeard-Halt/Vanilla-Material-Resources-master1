package net.haltocarrick.vanillamaterialresources.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.haltocarrick.vanillamaterialresources.entity.ModEntities;
import net.haltocarrick.vanillamaterialresources.entity.custom.DragonEntity;

public class ModRegistries {


    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.dragon, DragonEntity.setAttributes());
    }
}
