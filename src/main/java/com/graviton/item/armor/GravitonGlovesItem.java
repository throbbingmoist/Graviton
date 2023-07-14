package com.graviton.item.armor;

import com.aetherteam.aether.item.accessories.gloves.GlovesItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

/** code by sunsette */
public class GravitonGlovesItem extends GlovesItem {
    public GravitonGlovesItem(double punchDamage, String glovesName, Supplier<? extends SoundEvent> glovesSound, Properties properties) {
        super(punchDamage, glovesName, glovesSound, properties);
    }
    @Override
    public void setRenderTexture(String modId, String registryName) {
        this.GLOVES_TEXTURE = new ResourceLocation("aether/textures/models/accessory/gloves/atmosine_gloves_accessory.png");
    }
}
