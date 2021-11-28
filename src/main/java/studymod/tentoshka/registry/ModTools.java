package studymod.tentoshka.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import studymod.tentoshka.Mod;
import studymod.tentoshka.materials.GayToolMaterial;
import studymod.tentoshka.tools.*;

public class ModTools {
    public static final ToolItem GAY_SWORD = new GaySword(GayToolMaterial.INSTANCE, 3, -2.5f, new Item.Settings().group(Mod.ITEM_GROUP));
    public static final ToolItem GAY_PICKAXE = new GayPickaxe(GayToolMaterial.INSTANCE, 1, -3f, new Item.Settings().group(Mod.ITEM_GROUP));
    public static final ToolItem GAY_AXE = new GayAxe(GayToolMaterial.INSTANCE, 5, -3.2f, new Item.Settings().group(Mod.ITEM_GROUP));
    public static final ToolItem GAY_SHOVEL = new GayShovel(GayToolMaterial.INSTANCE, 0, -3f, new Item.Settings().group(Mod.ITEM_GROUP));
    public static final ToolItem GAY_HOE = new GayHoe(GayToolMaterial.INSTANCE, 0, -3f, new Item.Settings().group(Mod.ITEM_GROUP));

    public static void registerTools() {
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "gay_sword"), GAY_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "gay_pickaxe"), GAY_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "gay_axe"), GAY_AXE);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "gay_shovel"), GAY_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Mod.MOD_ID, "gay_hoe"), GAY_HOE);
    }
}
