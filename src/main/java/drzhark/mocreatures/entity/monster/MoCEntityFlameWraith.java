package drzhark.mocreatures.entity.monster;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.IMob;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class MoCEntityFlameWraith extends MoCEntityWraith implements IMob {

    protected int burningTime;
    private float moveSpeed;

    public MoCEntityFlameWraith(World world) {
        super(world);
        this.texture = "flamewraith.png";
        setSize(1.5F, 1.5F);
        this.isImmuneToFire = true;
        this.burningTime = 30;

    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(15.0D);
    }

    /*@Override
    protected void attackEntity(Entity entity, float f) {
        if (attackTime <= 0 && (f < 2.5D) && (entity.getEntityBoundingBox().maxY > getEntityBoundingBox().minY)
                && (entity.getEntityBoundingBox().minY < getEntityBoundingBox().maxY)) {
            attackTime = 20;
            entity.attackEntityFrom(DamageSource.causeMobDamage(this), 2);

            if (MoCreatures.isServer() && !this.worldObj.provider.doesWaterVaporize()) {
                ((EntityLivingBase) entity).setFire(this.burningTime);
            }
        }
    }*/

    @Override
    protected Item getDropItem() {
        return Items.redstone;
    }

    @Override
    public void onLivingUpdate() {
        if (!this.worldObj.isRemote) {
            if (this.rand.nextInt(40) == 0) {
                this.setFire(2);
            }
            if (this.worldObj.isDaytime()) {
                float f = getBrightness(1.0F);
                if ((f > 0.5F)
                        && this.worldObj.canBlockSeeSky(new BlockPos(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY),
                                MathHelper.floor_double(this.posZ))) && ((this.rand.nextFloat() * 30F) < ((f - 0.4F) * 2.0F))) {
                    this.setHealth(getHealth() - 2);
                }
            }
        }
        super.onLivingUpdate();
    }

    @Override
    public float getMoveSpeed() {
        return 1.1F;
    }
}