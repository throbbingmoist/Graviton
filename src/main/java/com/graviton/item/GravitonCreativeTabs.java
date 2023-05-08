package com.graviton.item;

import com.graviton.Graviton;
import com.graviton.block.GravitonBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Graviton.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GravitonCreativeTabs {
    public static CreativeModeTab GRAVITON_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        GRAVITON_TAB = event.registerCreativeModeTab(new ResourceLocation(Graviton.MOD_ID, "graviton_tab"),
                builder -> builder.icon(() -> new ItemStack(GravitonBlocks.AERO_STALKS.get()))
                        .title(Component.translatable("creativemodetab.graviton_tab")));
    }
}
