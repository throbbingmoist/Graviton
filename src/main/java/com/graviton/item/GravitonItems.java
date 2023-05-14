package com.graviton.item;

import com.graviton.Graviton;
import com.graviton.item.custom.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.food.FoodProperties;

import com.aetherteam.aether.effect.AetherEffects;

public class GravitonItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Graviton.MOD_ID);

    public static final RegistryObject<Item> HELIOSITE = ITEMS.register("heliosite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KARTHUULIUM_INGOT = ITEMS.register("karthuulium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_GRAVITITE = ITEMS.register("raw_gravitite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GRAVITITE_PLATE = ITEMS.register("gravitite_plate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_KARTHUULIUM = ITEMS.register("raw_karthuulium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLOOD_ORANGE = ITEMS.register("blood_orange",
            () -> new Item(new Item.Properties().food(Foods.BLOOD_ORANGE)));

    public static final RegistryObject<Item> AECHOR_ICE_CREAM = ITEMS.register("aechor_ice_cream",
            () -> new AechorIceCream());

    public static final RegistryObject<Item> AECHOR_ICE_CREAM_MIX = ITEMS.register("aechor_ice_cream_mix",
            () -> new AechorIceCreamMix());

    public static final RegistryObject<Item> ENCHANTED_ICE_CREAM = ITEMS.register("enchanted_ice_cream",
            () -> new EnchantedIceCream());

    public static final RegistryObject<Item> BERRY_PRESERVES = ITEMS.register("berry_preserves",
            () -> new BerryPreserves());

    public static final RegistryObject<Item> ORANGE_MARMALADE = ITEMS.register("orange_marmalade",
            () -> new OrangeMarmalade());

    public static final RegistryObject<Item> BERRY_JAM_BREAD = ITEMS.register("berry_jam_bread",
            () -> new Item(new Item.Properties().food(Foods.BERRY_JAM_BREAD)));

    public static final RegistryObject<Item> ORANGE_JAM_BREAD = ITEMS.register("orange_jam_bread",
            () -> new Item(new Item.Properties().food(Foods.ORANGE_JAM_BREAD)));

    public static final RegistryObject<Item> ETHERIC_STEW = ITEMS.register("etheric_stew",
            () -> new EthericStew());

    public static final RegistryObject<Item> ETHERIC_RAMEN = ITEMS.register("etheric_ramen",
            () -> new EthericRamen());

    public static final RegistryObject<Item> COCKATRICE_COCKTAIL = ITEMS.register("cockatrice_cocktail",
            () -> new CockatriceCocktail());

    public static final RegistryObject<Item> SKYROOT_NECTAR_BUCKET = ITEMS.register("skyroot_nectar_bucket",
            () -> new SkyrootNectarBucket());

    public static final RegistryObject<Item> RAW_COCKATRICE = ITEMS.register("raw_cockatrice",
            () -> new Item(new Item.Properties().food(Foods.RAW_COCKATRICE)));

    public static final RegistryObject<Item> COOKED_COCKATRICE = ITEMS.register("cooked_cockatrice",
            () -> new Item(new Item.Properties().food(Foods.COOKED_COCKATRICE)));

    public static final RegistryObject<Item> AUTUMNROOT_CHUNK = ITEMS.register("autumnroot_chunk",
            () -> new Item(new Item.Properties().food(Foods.AUTUMNROOT_CHUNK)));

    public static final RegistryObject<Item> AUTUMNROOT_PIE = ITEMS.register("autumnroot_pie",
            () -> new Item(new Item.Properties().food(Foods.AUTUMNROOT_PIE)));

    public static final RegistryObject<Item> WYNDBERRY_LOLLIPOP = ITEMS.register("wyndberry_lollipop",
            () -> new Item(new Item.Properties().food(Foods.WYNDBERRY_LOLLIPOP)));

    public static final RegistryObject<Item> WHITE_APPLE_LOLLIPOP = ITEMS.register("white_apple_lollipop",
            () -> new Item(new Item.Properties().food(Foods.WHITE_APPLE_LOLLIPOP)));

    public static final RegistryObject<Item> CHOCOLATE_LOLLIPOP = ITEMS.register("chocolate_lollipop",
            () -> new Item(new Item.Properties().food(Foods.CHOCOLATE_LOLLIPOP)));

    public static final RegistryObject<Item> CREAM_SODA_LOLLIPOP = ITEMS.register("cream_soda_lollipop",
            () -> new Item(new Item.Properties().food(Foods.CREAM_SODA_LOLLIPOP)));

    public static final RegistryObject<Item> ORANGE_CREAM_LOLLIPOP = ITEMS.register("orange_cream_lollipop",
            () -> new Item(new Item.Properties().food(Foods.ORANGE_CREAM_LOLLIPOP)));

    public static final RegistryObject<Item> AMBROSIAL_LOLLIPOP = ITEMS.register("ambrosial_lollipop",
            () -> new Item(new Item.Properties().food(Foods.AMBROSIAL_LOLLIPOP)));

    public static final RegistryObject<Item> ENCHANTED_LOLLIPOP = ITEMS.register("enchanted_lollipop",
            () -> new Item(new Item.Properties().food(Foods.ENCHANTED_LOLLIPOP)));

    public static final RegistryObject<Item> FRIED_MOA_EGG = ITEMS.register("fried_moa_egg",
            () -> new Item(new Item.Properties().food(Foods.FRIED_MOA_EGG)));

    public static final RegistryObject<Item> RAINBOW_CAKE_SLICE = ITEMS.register("rainbow_cake_slice",
            () -> new Item(new Item.Properties().food(Foods.RAINBOW_CAKE_SLICE)));

    public static class Foods {
        public static final FoodProperties BLOOD_ORANGE = new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(0.4F)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 40, 0),0.2F)
                .build();

        public static final FoodProperties BERRY_JAM_BREAD = new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(0.6F)
                .build();

        public static final FoodProperties ORANGE_JAM_BREAD = new FoodProperties.Builder()
                .nutrition(8)
                .saturationMod(0.3F)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 40, 0),0.5F)
                .build();

        public static final FoodProperties AUTUMNROOT_CHUNK = new FoodProperties.Builder()
                .nutrition(5)
                .saturationMod(0.3F)
                .build();

        public static final FoodProperties AUTUMNROOT_PIE = new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(0.5F)
                .build();

        public static final FoodProperties WYNDBERRY_LOLLIPOP = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.5F)
                .fast()
                .build();

        public static final FoodProperties WHITE_APPLE_LOLLIPOP = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.5F)
                .fast()
                .build();

        public static final FoodProperties CHOCOLATE_LOLLIPOP = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.5F)
                .fast()
                .build();

        public static final FoodProperties CREAM_SODA_LOLLIPOP = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.5F)
                .fast()
                .build();

        public static final FoodProperties ORANGE_CREAM_LOLLIPOP = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.6F)
                .fast()
                .build();

        public static final FoodProperties AMBROSIAL_LOLLIPOP = new FoodProperties.Builder()
                .nutrition(0)
                .saturationMod(0.0F)
                .alwaysEat()
                .fast()
                .effect(() -> new MobEffectInstance(MobEffects.HEAL),1.0F)
                .build();

        public static final FoodProperties ENCHANTED_LOLLIPOP = new FoodProperties.Builder()
                .nutrition(8)
                .saturationMod(0.4F)
                .fast()
                .build();

        public static final FoodProperties FRIED_MOA_EGG = new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(0.6F)
                .meat()
                .build();

        public static final FoodProperties RAINBOW_CAKE_SLICE = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.4F)
                .fast()
                .build();

        public static final FoodProperties RAW_COCKATRICE = new FoodProperties.Builder()
                .nutrition(4)
                .saturationMod(0.3F)
                .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0),0.8F)
                .effect(() -> new MobEffectInstance(AetherEffects.INEBRIATION.get(), 600, 0),1.0F)
                .build();

        public static final FoodProperties COOKED_COCKATRICE = new FoodProperties.Builder()
                .nutrition(6)
                .saturationMod(0.6F)
                .meat()
                .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0),0.5F)
                .build();

    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
