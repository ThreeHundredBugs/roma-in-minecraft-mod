package studymod.tentoshka.registry;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static studymod.tentoshka.Mod.MOD_ID;

public class ModItems {

    // Items
    public static final Item GAY_ESSENTIAL = new Item(
            new Item.Settings()
                    .group(ItemGroup.MATERIALS));

    // BlockItems
    public static final BlockItem ROMA_BLOCK = new BlockItem(ModBlocks.ROMA_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "gay_essential"), GAY_ESSENTIAL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "roma_block"), ROMA_BLOCK);
    }
}
