package com.cheatpower.prismarine_plus.item;

import com.cheatpower.prismarine_plus.PrismarinePlus;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PrismarinePlus.MOD_ID);

    public static final DeferredItem<Item> WHITE_PRISMARINE_SHARD = ITEMS.register("white_prismarine_shard",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));











    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
