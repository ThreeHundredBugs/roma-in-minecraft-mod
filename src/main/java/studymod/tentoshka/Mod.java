package studymod.tentoshka;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import studymod.tentoshka.registry.*;

public class Mod implements ModInitializer {

    public static final String MOD_ID = "roma_in_minecraft";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"),
            () -> new ItemStack(ModItems.GAY_ESSENTIAL));

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
        ModFeatures.registryFeatures();
        ModMobs.registerMobs();
        ModArmor.registerArmor();
    }
}
