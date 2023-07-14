package com.graviton.item.abilities;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import com.graviton.item.GravitonItems;
import net.minecraft.world.entity.LivingEntity;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotResult;

/** code by Sunsette */
public class ABEquipmentUtil {

    public static boolean hasFullAtmosineSet(LivingEntity entity) {
        return hasArmorSet(entity, GravitonItems.ATMOSINE_HELMET.get(), GravitonItems.ATMOSINE_CHESTPLATE.get(), GravitonItems.ATMOSINE_LEGGINGS.get(), GravitonItems.ATMOSINE_BOOTS.get(), GravitonItems.ATMOSINE_GLOVES.get());
    }
    static boolean alreadyUsedDoubleJump = false;
    static int jumpHeldTimer = 0;
    static boolean canJump = true;
    static int timeSinceGround = 0;
    private static boolean hasArmorSet(LivingEntity entity, Item helmet, Item chestplate, Item leggings, Item boots, Item gloves) {
        return entity.getItemBySlot(EquipmentSlot.HEAD).is(helmet)
                && entity.getItemBySlot(EquipmentSlot.CHEST).is(chestplate)
                && entity.getItemBySlot(EquipmentSlot.LEGS).is(leggings)
                && entity.getItemBySlot(EquipmentSlot.FEET).is(boots)
                && CuriosApi.getCuriosHelper().findFirstCurio(entity, gloves).isPresent();
    }

}
