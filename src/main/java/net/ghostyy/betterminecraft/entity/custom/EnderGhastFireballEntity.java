package net.ghostyy.betterminecraft.entity.custom;

import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.AbstractFireballEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;
import net.minecraft.world.explosion.Explosion;

import java.util.List;

public class EnderGhastFireballEntity extends AbstractFireballEntity {

    private int explosionPower = 1;

    public EnderGhastFireballEntity(World world, LivingEntity owner, double velocityX, double velocityY, double velocityZ, int explosionPower) {
        super(EntityType.FIREBALL, owner, velocityX, velocityY, velocityZ, world);
        this.explosionPower = explosionPower;
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.world.isClient) {
            boolean bl = this.world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING);
            this.world.createExplosion(null, this.getX(), this.getY(), this.getZ(), this.explosionPower, bl, bl ? Explosion.DestructionType.DESTROY : Explosion.DestructionType.NONE);
            this.discard();
        }

        //Spawns aoe cloud
        if (!this.world.isClient) {
            List<LivingEntity> list = this.world.getNonSpectatingEntities(LivingEntity.class, this.getBoundingBox().expand(4.0, 2.0, 4.0));
            AreaEffectCloudEntity areaEffectCloudEntity = new AreaEffectCloudEntity(this.world, this.getX(), this.getY(), this.getZ());
            Entity entity = this.getOwner();
            if (entity instanceof LivingEntity) {
                areaEffectCloudEntity.setOwner((LivingEntity)entity);
            }
            areaEffectCloudEntity.setParticleType(ParticleTypes.SCULK_CHARGE_POP);
            areaEffectCloudEntity.setRadius(9.0f);
            areaEffectCloudEntity.setDuration(300);
            areaEffectCloudEntity.setRadiusGrowth((0.1f - areaEffectCloudEntity.getRadius()) / (float)areaEffectCloudEntity.getDuration());
            areaEffectCloudEntity.addEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 1));
            areaEffectCloudEntity.addEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 20, 5));
            if (!list.isEmpty()) {
                for (LivingEntity livingEntity : list) {
                    double d = this.squaredDistanceTo(livingEntity);
                    if (!(d < 16.0)) continue;
                    areaEffectCloudEntity.setPosition(livingEntity.getX(), livingEntity.getY(), livingEntity.getZ());
                    break;
                }
            }
            this.world.syncWorldEvent(WorldEvents.DRAGON_BREATH_CLOUD_SPAWNS, this.getBlockPos(), this.isSilent() ? -1 : 1);
            this.world.spawnEntity(areaEffectCloudEntity);
            this.discard();
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        if (this.world.isClient) {
            return;
        }
        Entity entity = entityHitResult.getEntity();
        Entity entity2 = this.getOwner();
        entity.damage(DamageSource.fireball(this, entity2), 6.0f);
        if (entity2 instanceof LivingEntity) {
            this.applyDamageEffects((LivingEntity)entity2, entity);
        }
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putByte("ExplosionPower", (byte)this.explosionPower);
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        if (nbt.contains("ExplosionPower", NbtElement.NUMBER_TYPE)) {
            this.explosionPower = nbt.getByte("ExplosionPower");
        }
    }

    @Override
    protected ParticleEffect getParticleType() {
        return ParticleTypes.SCULK_CHARGE_POP;
    }
}
