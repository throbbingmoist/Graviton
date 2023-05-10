package com.graviton.block;

import com.graviton.Graviton;
import com.graviton.block.custom.AeroStalksBlock;
import com.graviton.item.GravitonItems;
import com.graviton.worldgen.tree.RedSkyrootGrower;
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

    public static final RegistryObject<Block> COARSE_AETHER_DIRT = registerBlock("coarse_aether_dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)));
    public static final RegistryObject<Block> HOLY_GRAVEL = registerBlock("holygravel", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));
    public static final RegistryObject<Block> AERO_STALKS = registerBlock("aero_stalks", () -> new AeroStalksBlock());

    public static final RegistryObject<Block> KARTHUULIUM_BLOCK = registerBlock("karthuulium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> KARTHUULIUM_ORE = registerBlock("karthuulium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));

    public static final RegistryObject<Block> AETHER_SMITHING_TABLE = registerBlock("aether_smithing_table", () -> new SmithingTableBlock(BlockBehaviour.Properties.copy((Blocks.SMITHING_TABLE))));

    public static final RegistryObject<Block> HELIOSITE_ORE = registerBlock("heliosite_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> HELIOSITE_BLOCK = registerBlock("heliosite_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));
    public static final RegistryObject<Block> CHISELED_HELIOSITE_BLOCK = registerBlock("chiseled_heliosite_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK)));
    public static final RegistryObject<Block> HELIOSITE_BRICKS = registerBlock("heliosite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> HELIOSITE_PILLAR = registerBlock("heliosite_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR)));
    public static final RegistryObject<Block> HELIOSITE_SLAB = registerBlock("heliosite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB)));
    public static final RegistryObject<Block> HELIOSITE_STAIRS = registerBlock("heliosite_stairs", () -> new StairBlock(() -> GravitonBlocks.HELIOSITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS)));
    public static final RegistryObject<Block> HELIOSITE_WALL = registerBlock("heliosite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_HELIOSITE_BLOCK = registerBlock("smooth_heliosite_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ)));
    public static final RegistryObject<Block> SMOOTH_HELIOSITE_SLAB = registerBlock("smooth_heliosite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ_SLAB)));
    public static final RegistryObject<Block> SMOOTH_HELIOSITE_STAIRS = registerBlock("smooth_heliosite_stairs", () -> new StairBlock(() -> GravitonBlocks.SMOOTH_HELIOSITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ_STAIRS)));
    public static final RegistryObject<Block> SMOOTH_HELIOSITE_WALL = registerBlock("smooth_heliosite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> RED_SKYROOT_LEAVES = registerBlock("red_skyroot_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).requiresCorrectToolForDrops()) {
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

    public static final RegistryObject<Block> RED_SKYROOT_SAPLING = registerBlock("red_skyroot_sapling",
            () -> new SaplingBlock(new RedSkyrootGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

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
