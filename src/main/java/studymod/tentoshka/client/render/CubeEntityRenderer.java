package studymod.tentoshka.client.render;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import studymod.tentoshka.client.model.CubeEntityModel;
import studymod.tentoshka.entities.roma_golem.CubeEntity;

import static studymod.tentoshka.Mod.MOD_ID;

public class CubeEntityRenderer extends MobEntityRenderer<CubeEntity, CubeEntityModel> {

    public CubeEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new CubeEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(CubeEntity entity) {
        return new Identifier(MOD_ID, "textures/entity/cube/cube.png");
    }
}