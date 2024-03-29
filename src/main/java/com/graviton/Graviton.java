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
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
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
        GravitonCreativeTabs.register(modEventBus);
        GravitonSounds.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }


        // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}