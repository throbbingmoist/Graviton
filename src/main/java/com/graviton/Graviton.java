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
            event.accept(GravitonBlocks.COARSE_AETHER_DIRT);
            event.accept(GravitonBlocks.RED_SKYROOT_LEAVES);
            event.accept(GravitonBlocks.RED_SKYROOT_SAPLING);
            event.accept(GravitonBlocks.AETHER_SMITHING_TABLE);
            event.accept(GravitonBlocks.AERO_STALKS);
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
            event.accept(GravitonItems.RAW_GRAVITITE);
            event.accept(GravitonItems.RAW_KARTHUULIUM);
            event.accept(GravitonItems.KARTHUULIUM_INGOT);
            event.accept(GravitonBlocks.KARTHUULIUM_ORE);
            event.accept(GravitonBlocks.KARTHUULIUM_BLOCK);
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