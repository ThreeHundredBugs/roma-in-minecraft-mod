package studymod.tentoshka.entities.roma_golem;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.world.World;

public class RomaGolemEntity extends IronGolemEntity {

    public RomaGolemEntity(EntityType<? extends IronGolemEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 150;
    }

    public static DefaultAttributeContainer.Builder createRomaGolemAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 100)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 18)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 6)
                .add(EntityAttributes.GENERIC_ARMOR, 20)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 1);
    }
}
