package studymod.tentoshka.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import studymod.tentoshka.Mod;
import studymod.tentoshka.items.GayEssential;

import static studymod.tentoshka.Mod.MOD_ID;

public class ModItems {

    // Items
    public static final Item GAY_ESSENTIAL = new GayEssential(
            new Item.Settings()
                    .group(Mod.ITEM_GROUP));

    // BlockItems
    public static final BlockItem ROMA_BLOCK = new BlockItem(ModBlocks.ROMA_BLOCK, new Item.Settings().group(Mod.ITEM_GROUP));
    public static final BlockItem GAY_ORE = new BlockItem(ModBlocks.GAY_ORE, new Item.Settings().group(Mod.ITEM_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gay_essential"), GAY_ESSENTIAL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "roma_block"), ROMA_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gay_ore"), GAY_ORE);
    }
}
