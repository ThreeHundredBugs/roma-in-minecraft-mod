package studymod.tentoshka.registry;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import studymod.tentoshka.Mod;
import studymod.tentoshka.materials.GayArmorMaterial;


public class ModArmor {
    public static final ArmorMaterial GAY_ARMOR_MATERIAL = new GayArmorMaterial();

    public static final Item GAY_HELMET = new ArmorItem(GAY_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Mod.ITEM_GROUP));
    public static final Item GAY_CHESTPLATE = new ArmorItem(GAY_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Mod.ITEM_GROUP));
    public static final Item GAY_LEGGINGS = new ArmorItem(GAY_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Mod.ITEM_GROUP));
    public static final Item GAY_BOOTS = new ArmorItem(GAY_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Mod.ITEM_GROUP));

    public static void registerArmor() {
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "gay_helmet"), GAY_HELMET);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "gay_chestplate"), GAY_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "gay_leggings"), GAY_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "gay_boots"), GAY_BOOTS);
    }
}
