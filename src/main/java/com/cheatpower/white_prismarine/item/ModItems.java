package com.cheatpower.white_prismarine.item;

import com.cheatpower.white_prismarine.WhitePrismarine;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(WhitePrismarine.MOD_ID);

    public static final DeferredItem<Item> WHITE_PRISMARINE_SHARD = ITEMS.register("white_prismarine_shard",
            () -> new Item(new Item.Properties().rarity(Rarity.COMMON)));


    public static final DeferredItem<Item> WHITE_PRISMARINE_CLUSTER = ITEMS.register("white_prismarine_cluster",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static final DeferredItem<Item> WHITE_PRISMARINE_SMALL_CLUSTER = ITEMS.register("white_prismarine_cluster_small",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));













    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
