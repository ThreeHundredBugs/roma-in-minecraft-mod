package studymod.tentoshka.materials;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import studymod.tentoshka.registry.ModItems;

public class GayArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {2, 3, 4, 1};


    @Override
    public int getDurability(EquipmentSlot slot)
    {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 10;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot)
    {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability()
    {
        return 6;
    }

    @Override
    public SoundEvent getEquipSound()
    {
        return SoundEvents.ITEM_ARMOR_EQUIP_LEATHER;
    }

    @Override
    public Ingredient getRepairIngredient()
    {
        return Ingredient.ofItems(ModItems.GAY_ESSENTIAL);
    }

    @Override
    public String getName()
    {
        return "gay";
    }

    @Override
    public float getToughness()
    {
        return 2.0F;
    }

    @Override
    public float getKnockbackResistance()
    {
        return 0.5F;
    }
}
