package com.graviton;

import com.aetherteam.aether.AetherTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

/** Atmosine repairing code by Sunsette */
public class GravitonTags extends AetherTags {
    public static class Items {
        public static final TagKey<Item> ATMOSINE_REPAIRING = tag("atmosine_repairing");
        private static TagKey<Item> tag(String name) {
            return TagKey.create(Registries.ITEM, new ResourceLocation(Graviton.MOD_ID, name));
        }
    }
}
