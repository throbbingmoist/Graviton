package com.graviton.item;

import com.graviton.Graviton;
import com.graviton.block.GravitonBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Graviton.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class GravitonCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Graviton.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GRAVITON_TAB = CREATIVE_TABS.register("graviton_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(GravitonBlocks.RED_SKYROOT_SAPLING.get().asItem()))
                    .title(Component.translatable("creativemodetab.graviton_tab"))
                    .displayItems((pParams,pOutput) -> {
                        pOutput.accept(GravitonBlocks.CRYSTALLINE_AETHER_GRASS_BLOCK.get().asItem());
                        pOutput.accept(GravitonBlocks.COARSE_AETHER_DIRT.get().asItem());
                        pOutput.accept(GravitonBlocks.RED_SKYROOT_LEAVES.get().asItem());
                        pOutput.accept(GravitonBlocks.DARK_RED_SKYROOT_LEAVES.get().asItem());
                        pOutput.accept(GravitonBlocks.DARK_RED_GLOWING_LEAVES.get().asItem());
                        pOutput.accept(GravitonBlocks.RED_SKYROOT_SAPLING.get().asItem());
                        pOutput.accept(GravitonBlocks.AETHER_SMITHING_TABLE.get().asItem());
                        pOutput.accept(GravitonBlocks.AERO_STALKS.get().asItem());
                        pOutput.accept(GravitonBlocks.AUTUMNGOURD.get().asItem());
                        pOutput.accept(GravitonBlocks.AUTUMN_LANTERN.get().asItem());
                        pOutput.accept(GravitonBlocks.HOLYGRIT.get().asItem());

                        pOutput.accept(GravitonItems.HELIOSITE.get());
                        pOutput.accept(GravitonBlocks.HELIOSITE_ORE.get().asItem());
                        pOutput.accept(GravitonBlocks.HELIOSITE_BLOCK.get().asItem());
                        pOutput.accept(GravitonBlocks.HELIOSITE_STAIRS.get().asItem());
                        pOutput.accept(GravitonBlocks.HELIOSITE_SLAB.get().asItem());
                        pOutput.accept(GravitonBlocks.HELIOSITE_WALL.get().asItem());

                        pOutput.accept(GravitonBlocks.SMOOTH_HELIOSITE_BLOCK.get().asItem());
                        pOutput.accept(GravitonBlocks.SMOOTH_HELIOSITE_STAIRS.get().asItem());
                        pOutput.accept(GravitonBlocks.SMOOTH_HELIOSITE_SLAB.get().asItem());
                        pOutput.accept(GravitonBlocks.SMOOTH_HELIOSITE_WALL.get().asItem());

                        pOutput.accept(GravitonBlocks.HELIOSITE_BRICKS.get().asItem());
                        pOutput.accept(GravitonBlocks.HELIOSITE_PILLAR.get().asItem());
                        pOutput.accept(GravitonBlocks.CHISELED_HELIOSITE_BLOCK.get().asItem());

                        pOutput.accept(GravitonBlocks.BLUE_SWET_BLOCK.get().asItem());
                        pOutput.accept(GravitonBlocks.BLUE_CHILLED_SWET_BLOCK.get().asItem());
                        pOutput.accept(GravitonBlocks.GOLDEN_SWET_BLOCK.get().asItem());
                        pOutput.accept(GravitonBlocks.GOLDEN_CHILLED_SWET_BLOCK.get().asItem());
                        pOutput.accept(GravitonBlocks.DARK_SWET_BLOCK.get().asItem());
                        pOutput.accept(GravitonBlocks.DARK_CHILLED_SWET_BLOCK.get().asItem());

                        pOutput.accept(GravitonItems.BLOOD_HUSK.get());
                        pOutput.accept(GravitonItems.RAW_GRAVITITE.get());
                        pOutput.accept(GravitonItems.GRAVITITE_PLATE.get());
                        pOutput.accept(GravitonBlocks.AETHER_IRON_ORE.get().asItem());

                        pOutput.accept(GravitonItems.ATMOSINE_SHARD.get());
                        pOutput.accept(GravitonBlocks.ATMOSINE_BLOCK.get().asItem());
                        pOutput.accept(GravitonBlocks.BUDDING_ATMOSINE.get().asItem());
                        pOutput.accept(GravitonBlocks.ATMOSINE_BUD_SMALL.get().asItem());
                        pOutput.accept(GravitonBlocks.ATMOSINE_BUD_MEDIUM.get().asItem());
                        pOutput.accept(GravitonBlocks.ATMOSINE_BUD_LARGE.get().asItem());
                        pOutput.accept(GravitonBlocks.ATMOSINE_CLUSTER.get().asItem());

                        pOutput.accept(GravitonItems.ATMOSINE_SWORD.get());
                        pOutput.accept(GravitonItems.ATMOSINE_PICKAXE.get());
                        pOutput.accept(GravitonItems.ATMOSINE_SHOVEL.get());
                        pOutput.accept(GravitonItems.ATMOSINE_AXE.get());
                        pOutput.accept(GravitonItems.ATMOSINE_HOE.get());
                        pOutput.accept(GravitonItems.ATMOSINE_HELMET.get());
                        pOutput.accept(GravitonItems.ATMOSINE_CHESTPLATE.get());
                        pOutput.accept(GravitonItems.ATMOSINE_LEGGINGS.get());
                        pOutput.accept(GravitonItems.ATMOSINE_BOOTS.get());
                        pOutput.accept(GravitonItems.ATMOSINE_GLOVES.get());

                        pOutput.accept(GravitonItems.MUSIC_DISC_WELCOMING_SKIES.get());

                        pOutput.accept(GravitonItems.BLOOD_ORANGE.get());
                        pOutput.accept(GravitonItems.SKYROOT_BERRY_JAM_BUCKET.get());
                        pOutput.accept(GravitonItems.SKYROOT_ORANGE_JAM_BUCKET.get());
                        pOutput.accept(GravitonItems.BERRY_JAM_BREAD.get());
                        pOutput.accept(GravitonItems.ORANGE_JAM_BREAD.get());
                        pOutput.accept(GravitonItems.ETHERIC_SOUP.get());
                        pOutput.accept(GravitonItems.ETHERIC_STEW.get());
                        pOutput.accept(GravitonItems.AUTUMNGOURD_CHUNK.get());
                        pOutput.accept(GravitonItems.AUTUMN_PIE.get());
                        pOutput.accept(GravitonItems.FRIED_MOA_EGG.get());
                        pOutput.accept(GravitonItems.RAW_COCKATRICE.get());
                        pOutput.accept(GravitonItems.COOKED_COCKATRICE.get());
                        pOutput.accept(GravitonItems.SKYROOT_NECTAR_BUCKET.get());

                        pOutput.accept(GravitonItems.WYNDBERRY_LOLLIPOP.get());
                        pOutput.accept(GravitonItems.WHITE_APPLE_LOLLIPOP.get());
                        pOutput.accept(GravitonItems.CHOCOLATE_LOLLIPOP.get());
                        pOutput.accept(GravitonItems.CREAM_SODA_LOLLIPOP.get());
                        pOutput.accept(GravitonItems.ORANGE_CREAM_LOLLIPOP.get());
                        pOutput.accept(GravitonItems.AMBROSIAL_LOLLIPOP.get());
                        pOutput.accept(GravitonItems.ENCHANTED_LOLLIPOP.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }
}
