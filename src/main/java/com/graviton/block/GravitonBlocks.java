package com.graviton.block;

import com.graviton.Graviton;
import com.graviton.block.custom.AeroStalksBlock;
import com.graviton.item.GravitonItems;
import com.graviton.worldgen.tree.BlueSkyrootGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class GravitonBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Graviton.MOD_ID);

    public static final RegistryObject<Block> COARSE_AETHER_DIRT = registerBlock("coarse_aether_dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT).requiresCorrectToolForDrops().strength(0.5f)));
    public static final RegistryObject<Block> AERO_STALKS = registerBlock("aero_stalks", () -> new AeroStalksBlock());



    public static final RegistryObject<Block> BLUE_SKYROOT_LEAVES = registerBlock("blue_skyroot_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }
            });

    public static final RegistryObject<Block> BLUE_SKYROOT_SAPLING = registerBlock("blue_skyroot_sapling",
            () -> new SaplingBlock(new BlueSkyrootGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block)
                                                                             {
        return GravitonItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
