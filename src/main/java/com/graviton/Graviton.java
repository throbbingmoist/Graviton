package com.graviton;

import com.graviton.block.GravitonBlocks;
import com.graviton.item.GravitonCreativeTabs;
import com.graviton.item.GravitonItems;
import com.graviton.sound.GravitonSounds;
import com.graviton.worldgen.GravitonConfiguredFeatures;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Graviton.MOD_ID)
public class Graviton
{
    public static final String MOD_ID = "graviton";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Graviton() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GravitonItems.register(modEventBus);
        GravitonBlocks.register(modEventBus);
        GravitonSounds.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == GravitonCreativeTabs.GRAVITON_TAB) {
            event.accept(GravitonBlocks.CRYSTALLINE_AETHER_GRASS_BLOCK);
            event.accept(GravitonBlocks.COARSE_AETHER_DIRT);
            event.accept(GravitonBlocks.RED_SKYROOT_LEAVES);
            event.accept(GravitonBlocks.DARK_RED_SKYROOT_LEAVES);
            event.accept(GravitonBlocks.DARK_RED_GLOWING_LEAVES);
            event.accept(GravitonBlocks.RED_SKYROOT_SAPLING);
            event.accept(GravitonBlocks.AETHER_SMITHING_TABLE);
            event.accept(GravitonBlocks.AERO_STALKS);
            event.accept(GravitonBlocks.AUTUMNGOURD);
            event.accept(GravitonBlocks.AUTUMN_LANTERN);
            event.accept(GravitonBlocks.HOLYGRIT);

            event.accept(GravitonItems.HELIOSITE);
            event.accept(GravitonBlocks.HELIOSITE_ORE);
            event.accept(GravitonBlocks.HELIOSITE_BLOCK);
            event.accept(GravitonBlocks.HELIOSITE_STAIRS);
            event.accept(GravitonBlocks.HELIOSITE_SLAB);
            event.accept(GravitonBlocks.HELIOSITE_WALL);

            event.accept(GravitonBlocks.SMOOTH_HELIOSITE_BLOCK);
            event.accept(GravitonBlocks.SMOOTH_HELIOSITE_STAIRS);
            event.accept(GravitonBlocks.SMOOTH_HELIOSITE_SLAB);
            event.accept(GravitonBlocks.SMOOTH_HELIOSITE_WALL);

            event.accept(GravitonBlocks.HELIOSITE_BRICKS);
            event.accept(GravitonBlocks.HELIOSITE_PILLAR);
            event.accept(GravitonBlocks.CHISELED_HELIOSITE_BLOCK);

            event.accept(GravitonBlocks.BLUE_SWET_BLOCK);
            event.accept(GravitonBlocks.BLUE_CHILLED_SWET_BLOCK);
            event.accept(GravitonBlocks.GOLDEN_SWET_BLOCK);
            event.accept(GravitonBlocks.GOLDEN_CHILLED_SWET_BLOCK);
            event.accept(GravitonBlocks.DARK_SWET_BLOCK);
            event.accept(GravitonBlocks.DARK_CHILLED_SWET_BLOCK);

            event.accept(GravitonItems.BLOOD_HUSK);
            event.accept(GravitonItems.RAW_GRAVITITE);
            event.accept(GravitonItems.GRAVITITE_PLATE);
            event.accept(GravitonBlocks.AETHER_IRON_ORE);

            event.accept(GravitonItems.ATMOSINE_SHARD);
            event.accept(GravitonBlocks.ATMOSINE_BLOCK);
            event.accept(GravitonBlocks.BUDDING_ATMOSINE);
            event.accept(GravitonBlocks.ATMOSINE_BUD_SMALL);
            event.accept(GravitonBlocks.ATMOSINE_BUD_MEDIUM);
            event.accept(GravitonBlocks.ATMOSINE_BUD_LARGE);
            event.accept(GravitonBlocks.ATMOSINE_CLUSTER);

            event.accept(GravitonItems.ATMOSINE_SWORD);
            event.accept(GravitonItems.ATMOSINE_PICKAXE);
            event.accept(GravitonItems.ATMOSINE_SHOVEL);
            event.accept(GravitonItems.ATMOSINE_AXE);
            event.accept(GravitonItems.ATMOSINE_HOE);
            event.accept(GravitonItems.ATMOSINE_HELMET);
            event.accept(GravitonItems.ATMOSINE_CHESTPLATE);
            event.accept(GravitonItems.ATMOSINE_LEGGINGS);
            event.accept(GravitonItems.ATMOSINE_BOOTS);
            event.accept(GravitonItems.ATMOSINE_GLOVES);

            event.accept(GravitonItems.MUSIC_DISC_WELCOMING_SKIES);

            event.accept(GravitonItems.BLOOD_ORANGE);
            event.accept(GravitonItems.SKYROOT_BERRY_JAM_BUCKET);
            event.accept(GravitonItems.SKYROOT_ORANGE_JAM_BUCKET);
            event.accept(GravitonItems.BERRY_JAM_BREAD);
            event.accept(GravitonItems.ORANGE_JAM_BREAD);
            event.accept(GravitonItems.ETHERIC_SOUP);
            event.accept(GravitonItems.ETHERIC_STEW);
            event.accept(GravitonItems.AUTUMNGOURD_CHUNK);
            event.accept(GravitonItems.AUTUMN_PIE);
            event.accept(GravitonItems.FRIED_MOA_EGG);
            event.accept(GravitonItems.RAW_COCKATRICE);
            event.accept(GravitonItems.COOKED_COCKATRICE);
            event.accept(GravitonItems.SKYROOT_NECTAR_BUCKET);

            event.accept(GravitonItems.WYNDBERRY_LOLLIPOP);
            event.accept(GravitonItems.WHITE_APPLE_LOLLIPOP);
            event.accept(GravitonItems.CHOCOLATE_LOLLIPOP);
            event.accept(GravitonItems.CREAM_SODA_LOLLIPOP);
            event.accept(GravitonItems.ORANGE_CREAM_LOLLIPOP);
            event.accept(GravitonItems.AMBROSIAL_LOLLIPOP);
            event.accept(GravitonItems.ENCHANTED_LOLLIPOP);
        }
    }

        // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}