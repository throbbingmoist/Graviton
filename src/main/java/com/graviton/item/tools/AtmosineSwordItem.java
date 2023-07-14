package com.graviton.item.tools;

import net.minecraft.world.item.SwordItem;
import com.graviton.item.GravitonItemTiers;
import com.graviton.procedures.AtmosineSwordHitProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

/** all atmosine tools code made by Sunsette */
public class AtmosineSwordItem extends SwordItem  {
    public AtmosineSwordItem() {
        super(GravitonItemTiers.ATMOSINE, 3, -2.4F, new Item.Properties());
    }
    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        AtmosineSwordHitProcedure.execute(entity);
        return retval;
    }
}
