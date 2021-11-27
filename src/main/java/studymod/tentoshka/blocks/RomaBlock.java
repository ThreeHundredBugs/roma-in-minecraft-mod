package studymod.tentoshka.blocks;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import studymod.tentoshka.api.GolemSpawningUtil;

import static studymod.tentoshka.registry.ModMobs.ROMA_GOLEM;

public class RomaBlock extends Block {
    public RomaBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        BlockPattern.Result common = GolemSpawningUtil.commonPattern.searchAround(world, pos);
        if (common != null) {
            Block block = null;
            int width = GolemSpawningUtil.commonPattern.getWidth();
            int height = GolemSpawningUtil.commonPattern.getHeight();
            for (int k = 0; k < width; ++k) {
                for (int l = 0; l < height; ++l) {
                    CachedBlockPosition cachedBlockPosition3 = common.translate(k, l, 0);
                    if (GolemSpawningUtil.IS_VALID_BLOCK.test(cachedBlockPosition3.getBlockState())) {
                        block = cachedBlockPosition3.getBlockState().getBlock();
                    }
                    world.setBlockState(cachedBlockPosition3.getBlockPos(), Blocks.AIR.getDefaultState(), 2);
                    world.syncWorldEvent(2001, cachedBlockPosition3.getBlockPos(), Block.getRawIdFromState(cachedBlockPosition3.getBlockState()));
                }
            }

            BlockPos blockPos2 = common.translate(1, 2, 0).getBlockPos();
            if (block != null) {
                IronGolemEntity golem = ROMA_GOLEM.create(world);
                if (golem != null) {
                    golem.setPlayerCreated(true);
                    golem.refreshPositionAndAngles((double) blockPos2.getX() + 0.5D, (double) blockPos2.getY() + 0.05D, (double) blockPos2.getZ() + 0.5D, 0.0F, 0.0F);
                    world.spawnEntity(golem);

                    for (ServerPlayerEntity serverPlayer : world.getNonSpectatingEntities(ServerPlayerEntity.class, golem.getBoundingBox().expand(5.0D))) {
                        Criteria.SUMMONED_ENTITY.trigger(serverPlayer, golem);
                    }

                    for (int m = 0; m < width; ++m) {
                        for (int n = 0; n < height; ++n) {
                            CachedBlockPosition cachedBlockPosition4 = common.translate(m, n, 0);
                            world.updateNeighbors(cachedBlockPosition4.getBlockPos(), Blocks.AIR);
                        }
                    }
                }

            }
        }
    }
}
