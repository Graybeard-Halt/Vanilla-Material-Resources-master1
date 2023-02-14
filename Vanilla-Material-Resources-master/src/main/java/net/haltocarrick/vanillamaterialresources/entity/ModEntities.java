package net.haltocarrick.vanillamaterialresources.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.haltocarrick.vanillamaterialresources.entity.custom.DragonEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<DragonEntity> dragon = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(VanillaMaterialResources.MOD_ID, "dragon"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, DragonEntity::new)
                    .dimensions(EntityDimensions.fixed(21, 31)).build());
}
