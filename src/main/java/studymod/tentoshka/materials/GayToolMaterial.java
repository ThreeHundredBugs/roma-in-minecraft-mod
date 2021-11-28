package studymod.tentoshka.materials;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import studymod.tentoshka.registry.ModItems;

public class GayToolMaterial implements ToolMaterial {

    public static final GayToolMaterial INSTANCE = new GayToolMaterial();

    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0f;
    }

    @Override
    public float getAttackDamage() {
        return 3.0f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.GAY_ESSENTIAL);
    }
}
