/*
 * GNU GENERAL PUBLIC LICENSE Version 3
 */
package drzhark.mocreatures.entity.ambient;

import drzhark.mocreatures.MoCreatures;
import drzhark.mocreatures.entity.MoCEntityAmbient;
import drzhark.mocreatures.entity.ai.EntityAIWanderMoC2;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class MoCEntitySnail extends MoCEntityAmbient {

    private static final DataParameter<Boolean> IS_HIDING = EntityDataManager.createKey(MoCEntitySnail.class, DataSerializers.BOOLEAN);

    public MoCEntitySnail(World world) {
        super(world);
        setSize(0.4F, 0.3F);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(1, new EntityAIWanderMoC2(this, 0.8D));
    }

    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataManager.register(IS_HIDING, Boolean.FALSE);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.10D);
    }

    @Override
    public boolean isMovementCeased() {
        return (getIsHiding());
    }

    @Override
    public void selectType() {
        if (getType() == 0) {
            setType(this.rand.nextInt(6) + 1);
        }
    }

    @Override
    public ResourceLocation getTexture() {
        switch (getType()) {
            case 2:
                return MoCreatures.proxy.getTexture("snail_green.png");
            case 3:
                return MoCreatures.proxy.getTexture("snail_yellow.png");
            case 4:
                return MoCreatures.proxy.getTexture("snail_red.png");
            case 5:
                return MoCreatures.proxy.getTexture("slug_golden.png");
            case 6:
                return MoCreatures.proxy.getTexture("slug_black.png");
            default:
                return MoCreatures.proxy.getTexture("snail_brown.png");
        }
    }

    public boolean getIsHiding() {
        return this.dataManager.get(IS_HIDING);
    }

    public void setIsHiding(boolean flag) {
        this.dataManager.set(IS_HIDING, flag);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();

        if (!this.world.isRemote) {
            EntityLivingBase entityliving = getBoogey(3D);
            if ((entityliving != null) && entityliving.height > 0.5F && entityliving.width > 0.5F && canEntityBeSeen(entityliving)) {
                if (!getIsHiding()) {
                    setIsHiding(true);
                }
                this.getNavigator().clearPath();
            } else {
                setIsHiding(false);
            }
            // Slugs won't hide
            if (getIsHiding() && this.getType() > 4) {
                setIsHiding(false);
            }
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();

        if (getIsHiding()) {
            this.prevRenderYawOffset = this.renderYawOffset = this.rotationYaw = this.prevRotationYaw;
        }
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_SILVERFISH_STEP;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_SILVERFISH_STEP;
    }

    @Override
    public boolean isOnLadder() {
        return this.collidedHorizontally;
    }

    public boolean climbing() {
        return !this.onGround && isOnLadder();
    }

    @Override
    public void jump() {
    }
}
