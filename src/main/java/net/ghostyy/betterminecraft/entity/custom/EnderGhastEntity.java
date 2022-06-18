package net.ghostyy.betterminecraft.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.GhastEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import org.spongepowered.asm.mixin.injection.selectors.ElementNode;

import java.util.EnumSet;

public class EnderGhastEntity extends GhastEntity {

    private int explosionStrength = 5;
    public EnderGhastEntity(EntityType<? extends GhastEntity> entityType, World world) {
        super(entityType, world);
        this.experiencePoints = 10;
        this.moveControl = new GhastMoveControl_EG(this);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.clear();
        this.goalSelector.add(5, new FlyRandomlyGoal_EG(this));
        this.goalSelector.add(7, new LookAtTargetGoal_EG(this));
        this.goalSelector.add(7, new ShootFireballGoal_EG(this));
        this.targetSelector.add(1, new ActiveTargetGoal<PlayerEntity>(this,
                PlayerEntity.class, 10, true, false, entity -> Math.abs(entity.getY() - this.getY()) <= 64.0));
    }

    @Override
    public int getLimitPerChunk() {
        return 5;
    }

    @Override
    public float getSoundPitch() {
        return 0.5f;
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 50.0D)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 150.0D);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putByte("ExplosionPower", (byte)this.explosionStrength);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        if (nbt.contains("ExplosionPower", NbtElement.NUMBER_TYPE)) {
            this.explosionStrength = nbt.getByte("ExplosionPower");
        }
    }

    @Override
    public int getFireballStrength() {
        return this.explosionStrength;
    }

    static class GhastMoveControl_EG
            extends MoveControl {
        private final EnderGhastEntity ghast;
        private int collisionCheckCooldown;

        public GhastMoveControl_EG(EnderGhastEntity ghast) {
            super(ghast);
            this.ghast = ghast;
        }

        @Override
        public void tick() {
            if (this.state != MoveControl.State.MOVE_TO) {
                return;
            }
            if (this.collisionCheckCooldown-- <= 0) {
                this.collisionCheckCooldown += this.ghast.getRandom().nextInt(5) + 2;
                Vec3d vec3d = new Vec3d(this.targetX - this.ghast.getX(), this.targetY - this.ghast.getY(), this.targetZ - this.ghast.getZ());
                double d = vec3d.length();
                if (this.willCollide(vec3d = vec3d.normalize(), MathHelper.ceil(d))) {
                    this.ghast.setVelocity(this.ghast.getVelocity().add(vec3d.multiply(0.1)));
                } else {
                    this.state = MoveControl.State.WAIT;
                }
            }
        }

        private boolean willCollide(Vec3d direction, int steps) {
            Box box = this.ghast.getBoundingBox();
            for (int i = 1; i < steps; ++i) {
                if (this.ghast.world.isSpaceEmpty(this.ghast, box = box.offset(direction))) continue;
                return false;
            }
            return true;
        }
    }

    static class FlyRandomlyGoal_EG
            extends Goal {
        private final EnderGhastEntity ghast;

        public FlyRandomlyGoal_EG(EnderGhastEntity ghast) {
            this.ghast = ghast;
            this.setControls(EnumSet.of(Goal.Control.MOVE));
        }

        @Override
        public boolean canStart() {
            double f;
            double e;
            MoveControl moveControl = this.ghast.getMoveControl();
            if (!moveControl.isMoving()) {
                return true;
            }
            double d = moveControl.getTargetX() - this.ghast.getX();
            double g = d * d + (e = moveControl.getTargetY() - this.ghast.getY()) * e + (f = moveControl.getTargetZ() - this.ghast.getZ()) * f;
            return g < 1.0 || g > 3600.0;
        }

        @Override
        public boolean shouldContinue() {
            return false;
        }

        @Override
        public void start() {
            Random random = this.ghast.getRandom();
            double d = this.ghast.getX() + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
            double e = this.ghast.getY() + (double)((random.nextFloat() * 2.0f - 1.0f) * 4.0f);
            double f = this.ghast.getZ() + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
            this.ghast.getMoveControl().moveTo(d, e, f, 2.0);
        }
    }

    static class LookAtTargetGoal_EG
            extends Goal {
        private final EnderGhastEntity ghast;

        public LookAtTargetGoal_EG(EnderGhastEntity ghast) {
            this.ghast = ghast;
            this.setControls(EnumSet.of(Goal.Control.LOOK));
        }

        @Override
        public boolean canStart() {
            return true;
        }

        @Override
        public boolean shouldRunEveryTick() {
            return true;
        }

        @Override
        public void tick() {
            if (this.ghast.getTarget() == null) {
                Vec3d vec3d = this.ghast.getVelocity();
                this.ghast.setYaw(-((float) MathHelper.atan2(vec3d.x, vec3d.z)) * 57.295776f);
                this.ghast.bodyYaw = this.ghast.getYaw();
            } else {
                LivingEntity livingEntity = this.ghast.getTarget();
                double d = 64.0;
                if (livingEntity.squaredDistanceTo(this.ghast) < 4096.0) {
                    double e = livingEntity.getX() - this.ghast.getX();
                    double f = livingEntity.getZ() - this.ghast.getZ();
                    this.ghast.setYaw(-((float)MathHelper.atan2(e, f)) * 57.295776f);
                    this.ghast.bodyYaw = this.ghast.getYaw();
                }
            }
        }
    }

    static class ShootFireballGoal_EG
            extends Goal {
        private final EnderGhastEntity ghast;
        public int cooldown;

        public ShootFireballGoal_EG(EnderGhastEntity ghast) {
            this.ghast = ghast;
        }

        @Override
        public boolean canStart() {
            return this.ghast.getTarget() != null;
        }

        @Override
        public void start() {
            this.cooldown = 0;
        }

        @Override
        public void stop() {
            this.ghast.setShooting(false);
        }

        @Override
        public boolean shouldRunEveryTick() {
            return true;
        }

        @Override
        public void tick() {
            LivingEntity livingEntity = this.ghast.getTarget();
            if (livingEntity == null) {
                return;
            }
            double d = 64.0;
            if (livingEntity.squaredDistanceTo(this.ghast) < 4096.0 && this.ghast.canSee(livingEntity)) {
                World world = this.ghast.world;
                ++this.cooldown;
                if (this.cooldown == 10 && !this.ghast.isSilent()) {
                    world.syncWorldEvent(null, WorldEvents.GHAST_WARNS, this.ghast.getBlockPos(), 0);
                }
                if (this.cooldown == 20) {
                    double e = 4.0;
                    Vec3d vec3d = this.ghast.getRotationVec(1.0f);
                    double f = (livingEntity.getX() - (this.ghast.getX() + vec3d.x * 4.0)) * e;
                    double g = (livingEntity.getBodyY(0.5) - (0.5 + this.ghast.getBodyY(0.5))) * e;
                    double h = (livingEntity.getZ() - (this.ghast.getZ() + vec3d.z * 4.0)) * e;
                    if (!this.ghast.isSilent()) {
                        world.syncWorldEvent(null, WorldEvents.GHAST_SHOOTS, this.ghast.getBlockPos(), 0);
                    }
                    EnderGhastFireballEntity fireballEntity = new EnderGhastFireballEntity(world, (LivingEntity)this.ghast, f, g, h, this.ghast.getFireballStrength());
                    fireballEntity.setPosition(this.ghast.getX() + vec3d.x * 4.0, this.ghast.getBodyY(0.5) + 0.5, fireballEntity.getZ() + vec3d.z * 4.0);
                    world.spawnEntity(fireballEntity);
                    this.cooldown = -160;
                }
            } else if (this.cooldown > 0) {
                --this.cooldown;
            }
            this.ghast.setShooting(this.cooldown > 10);
        }
    }
}
