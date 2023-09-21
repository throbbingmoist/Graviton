package com.graviton.item.armor;

import com.aetherteam.aether.item.accessories.gloves.GlovesItem;
import com.graviton.Graviton;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

/** code by sunsette */
public class GravitonGlovesItem extends GlovesItem {
    public GravitonGlovesItem(double punchDamage, String glovesName, Supplier<? extends SoundEvent> glovesSound, Properties properties) {
        super(GravitonArmorMaterials.ATMOSINE, punchDamage, glovesName, glovesSound, properties);
        this.setRenderTexture(Graviton.MOD_ID, glovesName);
    }
}
