package com.graviton.item;

import com.graviton.Graviton;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.food.FoodProperties;

public class GravitonItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Graviton.MOD_ID);

    public static final RegistryObject<Item> HELIOSITE = ITEMS.register("heliosite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KARTHUULIUM_INGOT = ITEMS.register("karthuulium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_GRAVITITE = ITEMS.register("raw_gravitite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_KARTHUULIUM = ITEMS.register("raw_karthuulium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLOOD_ORANGE = ITEMS.register("blood_orange",
            () -> new Item(new Item.Properties().food((new FoodProperties.Builder()).nutrition(7).saturationMod(0.5F).build())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
