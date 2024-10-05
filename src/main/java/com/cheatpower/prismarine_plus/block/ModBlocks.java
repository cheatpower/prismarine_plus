package com.cheatpower.prismarine_plus.block;

import com.cheatpower.prismarine_plus.PrismarinePlus;
import com.cheatpower.prismarine_plus.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(PrismarinePlus.MOD_ID);


    public static final DeferredBlock<Block> WHITE_PRISMARINE_BRICKS = registerBlock("white_prismarine_bricks",
    () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.PRISMARINE_BRICKS)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
    ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),new Item.Properties()));
}


    public static void register (IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
