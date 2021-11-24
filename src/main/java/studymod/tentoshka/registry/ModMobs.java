package studymod.tentoshka.registry;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import studymod.tentoshka.entities.roma_golem.RomaGolemEntity;

import static studymod.tentoshka.Mod.MOD_ID;

public class ModMobs {
    public static final EntityType<RomaGolemEntity> ROMA_GOLEM = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MOD_ID, "roma_golem"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, RomaGolemEntity::new).dimensions(EntityDimensions.fixed(1.1f, 2.7f)).build()
    );

    public static void registerMobs() {
        FabricDefaultAttributeRegistry.register(ROMA_GOLEM, RomaGolemEntity.createRomaGolemAttributes());
    }
}
