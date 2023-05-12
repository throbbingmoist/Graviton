package com.graviton.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class AechorIceCream extends Item {
    public AechorIceCream(){
        super(new Item.Properties().stacksTo(1).food((new FoodProperties.Builder())
                .nutrition(7)
                .saturationMod(0.3F)
                .effect(() -> new MobEffectInstance(MobEffects.POISON, 200, 0),0.3F)
                .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 100, 0),0.8F)
                .build()));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = new ItemStack(Items.BOWL);
        super.finishUsingItem(itemstack, world, entity);
        if (itemstack.isEmpty()) {
            return retval;
        } else {
            if (entity instanceof Player player && !player.getAbilities().instabuild) {
                if (!player.getInventory().add(retval))
                    player.drop(retval, false);
            }
            return itemstack;
        }
    }
}
