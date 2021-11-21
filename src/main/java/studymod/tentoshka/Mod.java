package studymod.tentoshka;

import net.fabricmc.api.ModInitializer;
import studymod.tentoshka.registry.ModBlocks;
import studymod.tentoshka.registry.ModItems;

public class Mod implements ModInitializer {

    public static String MOD_ID = "roma_in_minecraft";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
