package studymod.tentoshka;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import studymod.tentoshka.client.render.RomaGolemEntityRenderer;

import static studymod.tentoshka.registry.ModMobs.ROMA_GOLEM;

@Environment(EnvType.CLIENT)
public class ModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.INSTANCE.register(ROMA_GOLEM, (dispatcher, context) ->
                new RomaGolemEntityRenderer(dispatcher)
        );
    }
}
