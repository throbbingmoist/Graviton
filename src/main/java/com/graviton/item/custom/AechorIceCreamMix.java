package com.graviton.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;

import com.aetherteam.aether.effect.AetherEffects;

public class AechorIceCreamMix extends Item {
    public AechorIceCreamMix(){
        super(new Item.Properties().stacksTo(1).food((new FoodProperties.Builder())
                .nutrition(2)
                .saturationMod(0.2F)
                .effect(() -> new MobEffectInstance(AetherEffects.INEBRIATION.get(), 300, 0),1.0F)
                .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 200, 0),0.8F)
                .build()));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.DRINK;
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
