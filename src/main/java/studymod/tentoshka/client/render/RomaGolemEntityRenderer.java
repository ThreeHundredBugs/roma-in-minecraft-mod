package studymod.tentoshka.client.render;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.IronGolemEntityModel;
import net.minecraft.util.Identifier;
import studymod.tentoshka.entities.roma_golem.RomaGolemEntity;

import static studymod.tentoshka.Mod.MOD_ID;

public class RomaGolemEntityRenderer extends MobEntityRenderer<RomaGolemEntity, IronGolemEntityModel<RomaGolemEntity>> {

    public RomaGolemEntityRenderer(EntityRenderDispatcher entityRenderDispatcher) {
        super(entityRenderDispatcher, new IronGolemEntityModel<>(), 0.5f);
    }

    @Override
    public Identifier getTexture(RomaGolemEntity entity) {
        return new Identifier(MOD_ID, "textures/entity/roma_golem/roma_golem.png");
    }
}