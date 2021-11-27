package studymod.tentoshka.api;

import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.block.pattern.BlockPatternBuilder;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.util.function.MaterialPredicate;
import studymod.tentoshka.registry.ModBlocks;

import java.util.function.Predicate;

public class GolemSpawningUtil {
    public static final Predicate<BlockState> IS_HEAD = (blockState) ->
            blockState != null && blockState.isOf(ModBlocks.ROMA_BLOCK);

    public static final Predicate<BlockState> IS_VALID_BLOCK = (blockState) ->
            blockState != null && blockState.isOf(ModBlocks.GAY_ORE);

    public static final BlockPattern commonPattern = getSingleBlockPattern(IS_VALID_BLOCK);

    public static BlockPattern getSingleBlockPattern(Predicate<BlockState> pattern) {
        return BlockPatternBuilder.start().aisle("~^~", "###", "~#~")
                .where('^', CachedBlockPosition.matchesBlockState(IS_HEAD))
                .where('#', CachedBlockPosition.matchesBlockState(pattern))
                .where('~', CachedBlockPosition.matchesBlockState(MaterialPredicate.create(Material.AIR)))
                .build();
    }
}
