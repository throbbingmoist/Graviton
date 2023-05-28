package com.graviton;

import com.graviton.block.GravitonBlocks;
import com.graviton.item.GravitonCreativeTabs;
import com.graviton.item.GravitonItems;
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
    private static final Logger LOGGER = LogUtils.getLogger();

    public Graviton() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        GravitonItems.register(modEventBus);
        GravitonBlocks.register(modEventBus);

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
            event.accept(GravitonBlocks.HOLY_GRAVEL);

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

            event.accept(GravitonItems.BLOOD_HUSK);
            event.accept(GravitonItems.RAW_GRAVITITE);
            event.accept(GravitonItems.GRAVITITE_PLATE);
            event.accept(GravitonItems.RAW_KARTHUULIUM);
            event.accept(GravitonItems.KARTHUULIUM_INGOT);
            event.accept(GravitonBlocks.KARTHUULIUM_ORE);
            event.accept(GravitonBlocks.KARTHUULIUM_BLOCK);

            event.accept(GravitonItems.BLOOD_ORANGE);
            event.accept(GravitonItems.BERRY_PRESERVES);
            event.accept(GravitonItems.ORANGE_MARMALADE);
            event.accept(GravitonItems.BERRY_JAM_BREAD);
            event.accept(GravitonItems.ORANGE_JAM_BREAD);
            event.accept(GravitonItems.RAINBOW_CAKE_SLICE);
            event.accept(GravitonItems.ETHERIC_STEW);
            event.accept(GravitonItems.ETHERIC_RAMEN);
            event.accept(GravitonItems.AUTUMNGOURD_CHUNK);
            event.accept(GravitonItems.AUTUMN_PIE);
            event.accept(GravitonItems.FRIED_MOA_EGG);
            event.accept(GravitonItems.RAW_COCKATRICE);
            event.accept(GravitonItems.COOKED_COCKATRICE);
            event.accept(GravitonItems.AECHOR_ICE_CREAM_MIX);
            event.accept(GravitonItems.AECHOR_ICE_CREAM);
            event.accept(GravitonItems.ENCHANTED_ICE_CREAM);
            event.accept(GravitonItems.COCKATRICE_COCKTAIL);
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