package net.haltocarrick.vanillamaterialresources.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;



public class ModLootTablesModder {
private static final Identifier ANCIENT_CITY_CHEST_ID
        = new Identifier("minecraft", "chests/ancient_city_chest");
private static final Identifier ANCIENT_CITY_ICE_BOX_CHEST_ID
        = new Identifier("minecraft", "chests/ancient_city_ice_box");
    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (ANCIENT_CITY_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0f)) // Impossible
                        .with(ItemEntry.builder(Items.ECHO_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0, 0)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            if (ANCIENT_CITY_ICE_BOX_CHEST_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0f)) // Impossible
                        .with(ItemEntry.builder(Items.ECHO_SHARD))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0, 0)).build());
                tableBuilder.pool(poolBuilder.build());
                    }
        });
    }
}