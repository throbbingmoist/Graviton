package com.graviton.block;

import com.aetherteam.aether.block.AetherBlocks;
import com.graviton.Graviton;
import com.graviton.block.custom.*;
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
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.AMETHYST_CLUSTER;

public class GravitonBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Graviton.MOD_ID);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientSideHandler {
        @SubscribeEvent
        public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
            CrystallineAetherGrassBlock.blockColorLoad(event);
        }

        @SubscribeEvent
        public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
            CrystallineAetherGrassBlock.itemColorLoad(event);
        }//Crystalline Aether
    }
    public static final RegistryObject<Block> CRYSTALLINE_AETHER_GRASS_BLOCK = registerBlock("crystalline_aether_grass_block", () -> new CrystallineAetherGrassBlock(Block.Properties.copy(Blocks.GRASS_BLOCK).randomTicks().strength(0.2F).mapColor(MapColor.WARPED_WART_BLOCK).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> DEBUG_CRYSTALLINE_INVENTORY = registerBlock("debug_crystalline_inventory", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)));
    public static final RegistryObject<Block> COARSE_AETHER_DIRT = registerBlock("coarse_aether_dirt", () -> new Block(BlockBehaviour.Properties.copy(Blocks.COARSE_DIRT)));
    public static final RegistryObject<Block> HOLYGRIT = registerBlock("holygrit", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GRAVEL)));
    public static final RegistryObject<Block> AERO_STALKS = registerBlock("aero_stalks", () -> new AeroStalksBlock());
    public static final RegistryObject<Block> AUTUMNGOURD = registerBlock("autumngourd", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PUMPKIN)));
    public static final RegistryObject<Block> AUTUMN_LANTERN = registerBlock("autumn_lantern", () -> new AutumnLantern());

    public static final RegistryObject<Block> BLUE_SWET_BLOCK = registerBlock("blue_swet_block", () -> new BlueSwetBlock());
    public static final RegistryObject<Block> BLUE_CHILLED_SWET_BLOCK = registerBlock("blue_chilled_swet_block", () -> new BlueChilledSwetBlock());
    public static final RegistryObject<Block> GOLDEN_SWET_BLOCK = registerBlock("golden_swet_block", () -> new GoldenSwetBlock());
    public static final RegistryObject<Block> GOLDEN_CHILLED_SWET_BLOCK = registerBlock("golden_chilled_swet_block", () -> new GoldenChilledSwetBlock());
    public static final RegistryObject<Block> DARK_SWET_BLOCK = registerBlock("dark_swet_block", () -> new DarkSwetBlock());
    public static final RegistryObject<Block> DARK_CHILLED_SWET_BLOCK = registerBlock("dark_chilled_swet_block", () -> new DarkChilledSwetBlock());

    public static final RegistryObject<Block> ATMOSINE_BLOCK = registerBlock("atmosine_block", () -> new AmethystBlock(Block.Properties.copy(Blocks.AMETHYST_BLOCK)));
    public static final RegistryObject<Block> BUDDING_ATMOSINE = registerBlock("budding_atmosine", () -> new BuddingAtmosineBlock(Block.Properties.copy(Blocks.BUDDING_AMETHYST)));

    public static final RegistryObject<Block> ATMOSINE_CLUSTER = registerBlock("atmosine_cluster", () -> new AmethystClusterBlock(7, 3, BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK).noOcclusion().randomTicks().sound(SoundType.AMETHYST_CLUSTER).strength(1.5F).lightLevel((p_152632_) -> {
        return 5;
    })));
    public static final RegistryObject<Block> ATMOSINE_BUD_LARGE = registerBlock("atmosine_bud_large", () -> new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152629_) -> {
        return 4;
    })));
    public static final RegistryObject<Block> ATMOSINE_BUD_MEDIUM = registerBlock("atmosine_bud_medium", () -> new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_152617_) -> {
        return 2;
    })));
    public static final RegistryObject<Block> ATMOSINE_BUD_SMALL = registerBlock("atmosine_bud_small", () -> new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel((p_187409_) -> {
        return 1;
    })));
    public static final RegistryObject<Block> KARTHUULIUM_BLOCK = registerBlock("karthuulium_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)));
    public static final RegistryObject<Block> KARTHUULIUM_ORE = registerBlock("karthuulium_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));
    public static final RegistryObject<Block> AETHER_IRON_ORE = registerBlock("aether_iron_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.GOLD_ORE)));

    public static final RegistryObject<Block> AETHER_SMITHING_TABLE = registerBlock("aether_smithing_table", () -> new AetherSmithingTable(Block.Properties.copy(Blocks.SMITHING_TABLE)));

    public static final RegistryObject<Block> HELIOSITE_ORE = registerBlock("heliosite_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)));
    public static final RegistryObject<Block> HELIOSITE_BLOCK = registerBlock("heliosite_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BLOCK)));
    public static final RegistryObject<Block> CHISELED_HELIOSITE_BLOCK = registerBlock("chiseled_heliosite_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_QUARTZ_BLOCK)));
    public static final RegistryObject<Block> HELIOSITE_BRICKS = registerBlock("heliosite_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS)));
    public static final RegistryObject<Block> HELIOSITE_PILLAR = registerBlock("heliosite_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR)));
    public static final RegistryObject<Block> HELIOSITE_SLAB = registerBlock("heliosite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB)));
    public static final RegistryObject<Block> HELIOSITE_STAIRS = registerBlock("heliosite_stairs", () -> new StairBlock(() -> GravitonBlocks.HELIOSITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS)));
    public static final RegistryObject<Block> HELIOSITE_WALL = registerBlock("heliosite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.8f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SMOOTH_HELIOSITE_BLOCK = registerBlock("smooth_heliosite_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ)));
    public static final RegistryObject<Block> SMOOTH_HELIOSITE_SLAB = registerBlock("smooth_heliosite_slab", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ_SLAB)));
    public static final RegistryObject<Block> SMOOTH_HELIOSITE_STAIRS = registerBlock("smooth_heliosite_stairs", () -> new StairBlock(() -> GravitonBlocks.SMOOTH_HELIOSITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SMOOTH_QUARTZ_STAIRS)));
    public static final RegistryObject<Block> SMOOTH_HELIOSITE_WALL = registerBlock("smooth_heliosite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.8f).requiresCorrectToolForDrops()));



    public static final RegistryObject<Block> RED_SKYROOT_LEAVES = registerBlock("red_skyroot_leaves",
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

    public static final RegistryObject<Block> DARK_RED_SKYROOT_LEAVES = registerBlock("dark_red_skyroot_leaves",
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

    public static final RegistryObject<Block> DARK_RED_GLOWING_LEAVES = registerBlock("dark_red_glowing_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).lightLevel(s -> 7)) {

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
