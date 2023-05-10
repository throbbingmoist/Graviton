package com.graviton.datagen;

import com.graviton.Graviton;
import com.graviton.item.GravitonItems;
import com.graviton.block.GravitonBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class GravitonItemModelProvider extends ItemModelProvider {
    public GravitonItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Graviton.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(GravitonItems.RAW_GRAVITITE);
        simpleItem(GravitonItems.RAW_KARTHUULIUM);
        simpleItem(GravitonItems.HELIOSITE);
        simpleItem(GravitonItems.KARTHUULIUM_INGOT);
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Graviton.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Graviton.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Graviton.MOD_ID,"item/" + item.getId().getPath()));
    }
}
