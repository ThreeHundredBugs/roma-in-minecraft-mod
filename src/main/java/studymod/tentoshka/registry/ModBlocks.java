package studymod.tentoshka.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static studymod.tentoshka.Mod.MOD_ID;

public class ModBlocks {

    public static final Block ROMA_BLOCK = new Block(
            FabricBlockSettings.of(Material.WOOL)
                    .breakByHand(true)
                    .breakByTool(FabricToolTags.PICKAXES, 0)
                    .breakByTool(FabricToolTags.AXES, 0)
                    .breakByTool(FabricToolTags.HOES, 0)
                    .breakByTool(FabricToolTags.SHEARS, 0)
                    .breakByTool(FabricToolTags.SHOVELS, 0)
                    .breakByTool(FabricToolTags.SWORDS, 0)
                    .luminance(400)
                    .strength(1.0f, 6000f)
                    .sounds(BlockSoundGroup.WOOL)
                    .requiresTool());

    public static final Block GAY_ORE = new Block(
            FabricBlockSettings.of(Material.METAL)
                    .breakByHand(false)
                    .breakByTool(FabricToolTags.PICKAXES, 2)
                    .strength(5.0f, 6000f)
                    .sounds(BlockSoundGroup.METAL)
                    .requiresTool());

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "roma_block"), ROMA_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "gay_ore"), GAY_ORE);
    }
}
