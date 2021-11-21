package studymod.tentoshka.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static studymod.tentoshka.Mod.MOD_ID;

public class ModBlocks {

    public static final Block ROMA_BLOCK = new Block(
            FabricBlockSettings.of(Material.WOOL)
                    .breakByHand(true)
                    .luminance(40)
                    .strength(5.0f, 6000f)
                    .sounds(BlockSoundGroup.WOOL));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "roma_block"), ROMA_BLOCK);
    }
}
