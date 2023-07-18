/*
 * GNU GENERAL PUBLIC LICENSE Version 3
 */
package drzhark.mocreatures.client.model.legacy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MoCLegacyModelScorpion extends ModelBase {
    public boolean attacking;
    public boolean isSwinging;
    public float swingProgress;
    ModelRenderer Head;
    ModelRenderer RearEnd;
    ModelRenderer Leg8;
    ModelRenderer Leg6;
    ModelRenderer Leg4;
    ModelRenderer Leg2;
    ModelRenderer Leg7;
    ModelRenderer Leg5;
    ModelRenderer Leg3;
    ModelRenderer Leg1;
    ModelRenderer Tail1;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Tail4;
    ModelRenderer Tail7;
    ModelRenderer RArm;
    ModelRenderer LArm;
    ModelRenderer RHand;
    ModelRenderer LHand;
    ModelRenderer RHandB;
    ModelRenderer LHandB;
    ModelRenderer Tail5;

    public MoCLegacyModelScorpion() {
        (this.Head = new ModelRenderer(this, 38, 19)).addBox(-4.0f, -3.0f, -6.0f, 8, 4, 5);
        this.Head.setRotationPoint(0.0f, 20.0f, -5.0f);
        this.Head.rotateAngleX = 0.0f;
        this.Head.rotateAngleY = 0.0f;
        this.Head.rotateAngleZ = 0.0f;
        this.Head.mirror = false;
        (this.RearEnd = new ModelRenderer(this, 0, 11)).addBox(-5.0f, -3.0f, -3.0f, 10, 4, 17);
        this.RearEnd.setRotationPoint(0.0f, 20.0f, -3.0f);
        this.RearEnd.rotateAngleX = 0.13963f;
        this.RearEnd.rotateAngleY = 0.0f;
        this.RearEnd.rotateAngleZ = 0.0f;
        this.RearEnd.mirror = false;
        (this.Leg8 = new ModelRenderer(this, 20, 6)).addBox(-1.0f, -1.0f, 1.0f, 14, 2, 2);
        this.Leg8.setRotationPoint(4.0f, 20.0f, -2.0f);
        this.Leg8.rotateAngleX = 0.0f;
        this.Leg8.rotateAngleY = 0.57596f;
        this.Leg8.rotateAngleZ = 0.19199f;
        this.Leg8.mirror = true;
        (this.Leg6 = new ModelRenderer(this, 20, 6)).addBox(-1.0f, -1.0f, 1.0f, 14, 2, 2);
        this.Leg6.setRotationPoint(4.0f, 20.0f, 1.0f);
        this.Leg6.rotateAngleX = 0.0f;
        this.Leg6.rotateAngleY = 0.27925f;
        this.Leg6.rotateAngleZ = 0.19199f;
        this.Leg6.mirror = true;
        (this.Leg4 = new ModelRenderer(this, 20, 6)).addBox(-1.0f, -1.0f, 1.0f, 14, 2, 2);
        this.Leg4.setRotationPoint(4.0f, 20.0f, 3.0f);
        this.Leg4.rotateAngleX = 0.0f;
        this.Leg4.rotateAngleY = -0.27925f;
        this.Leg4.rotateAngleZ = 0.19199f;
        this.Leg4.mirror = true;
        (this.Leg2 = new ModelRenderer(this, 20, 6)).addBox(-1.0f, -1.0f, 1.0f, 14, 2, 2);
        this.Leg2.setRotationPoint(4.0f, 20.0f, 6.0f);
        this.Leg2.rotateAngleX = 0.0f;
        this.Leg2.rotateAngleY = -0.57596f;
        this.Leg2.rotateAngleZ = 0.19199f;
        this.Leg2.mirror = true;
        (this.Leg7 = new ModelRenderer(this, 20, 6)).addBox(-13.0f, -1.0f, 1.0f, 14, 2, 2);
        this.Leg7.setRotationPoint(-4.0f, 20.0f, -2.0f);
        this.Leg7.rotateAngleX = 0.0f;
        this.Leg7.rotateAngleY = -0.57596f;
        this.Leg7.rotateAngleZ = -0.19199f;
        this.Leg7.mirror = false;
        (this.Leg5 = new ModelRenderer(this, 20, 6)).addBox(-13.0f, -1.0f, 1.0f, 14, 2, 2);
        this.Leg5.setRotationPoint(-4.0f, 20.0f, 1.0f);
        this.Leg5.rotateAngleX = 0.0f;
        this.Leg5.rotateAngleY = -0.27925f;
        this.Leg5.rotateAngleZ = -0.19199f;
        this.Leg5.mirror = false;
        (this.Leg3 = new ModelRenderer(this, 20, 6)).addBox(-13.0f, -1.0f, 1.0f, 14, 2, 2);
        this.Leg3.setRotationPoint(-4.0f, 20.0f, 3.0f);
        this.Leg3.rotateAngleX = 0.0f;
        this.Leg3.rotateAngleY = 0.27925f;
        this.Leg3.rotateAngleZ = -0.19199f;
        this.Leg3.mirror = false;
        (this.Leg1 = new ModelRenderer(this, 20, 6)).addBox(-13.0f, -1.0f, 1.0f, 14, 2, 2);
        this.Leg1.setRotationPoint(-4.0f, 20.0f, 6.0f);
        this.Leg1.rotateAngleX = 0.0f;
        this.Leg1.rotateAngleY = 0.57596f;
        this.Leg1.rotateAngleZ = -0.19199f;
        this.Leg1.mirror = false;
        (this.Tail1 = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -8.0f, 8.0f, 6, 4, 4);
        this.Tail1.setRotationPoint(0.0f, 20.0f, 0.0f);
        (this.Tail2 = new ModelRenderer(this, 0, 0)).addBox(-3.0f, -12.0f, 10.0f, 6, 4, 4);
        this.Tail2.setRotationPoint(0.0f, 20.0f, 0.0f);
        (this.Tail3 = new ModelRenderer(this, 0, 8)).addBox(-2.0f, -14.0f, 8.0f, 4, 4, 4);
        this.Tail3.setRotationPoint(0.0f, 20.0f, 0.0f);
        (this.Tail4 = new ModelRenderer(this, 0, 8)).addBox(-2.0f, -17.0f, 6.0f, 4, 4, 4);
        this.Tail4.setRotationPoint(0.0f, 20.0f, 0.0f);
        (this.Tail5 = new ModelRenderer(this, 0, 8)).addBox(-2.0f, -19.0f, 3.0f, 4, 4, 4);
        this.Tail5.setRotationPoint(0.0f, 20.0f, 0.0f);
        (this.Tail7 = new ModelRenderer(this, 0, 20)).addBox(-1.0f, -18.0f, 0.0f, 2, 4, 4);
        this.Tail7.setRotationPoint(0.0f, 20.0f, 0.0f);
        (this.RArm = new ModelRenderer(this, 32, 0)).addBox(-11.0f, -1.0f, -1.0f, 11, 2, 4);
        this.RArm.setRotationPoint(-4.0f, 20.0f, -9.0f);
        this.RArm.rotateAngleX = 0.0f;
        this.RArm.rotateAngleY = -0.27925f;
        this.RArm.rotateAngleZ = 0.0f;
        this.RArm.mirror = false;
        (this.LArm = new ModelRenderer(this, 32, 0)).addBox(-1.0f, -1.0f, -1.0f, 12, 2, 4);
        this.LArm.setRotationPoint(4.0f, 20.0f, -9.0f);
        this.LArm.rotateAngleX = 0.0f;
        this.LArm.rotateAngleY = 0.27925f;
        this.LArm.rotateAngleZ = 0.0f;
        this.LArm.mirror = true;
        (this.RHand = new ModelRenderer(this, 44, 9)).addBox(-11.0f, -1.0f, -9.0f, 2, 2, 8);
        this.RHand.setRotationPoint(-4.0f, 20.0f, -9.0f);
        this.RHand.rotateAngleX = 0.0f;
        this.RHand.rotateAngleY = -0.27925f;
        this.RHand.rotateAngleZ = 0.0f;
        this.RHand.mirror = false;
        (this.LHand = new ModelRenderer(this, 44, 9)).addBox(9.0f, -1.0f, -9.0f, 2, 2, 8);
        this.LHand.setRotationPoint(4.0f, 20.0f, -9.0f);
        this.LHand.rotateAngleX = 0.0f;
        this.LHand.rotateAngleY = 0.27925f;
        this.LHand.rotateAngleZ = 0.0f;
        this.LHand.mirror = false;
        (this.RHandB = new ModelRenderer(this, 44, 9)).addBox(-8.0f, -1.0f, -9.0f, 2, 2, 8);
        this.RHandB.setRotationPoint(-4.0f, 20.0f, -9.0f);
        this.RHandB.rotateAngleX = 0.0f;
        this.RHandB.rotateAngleY = -0.27925f;
        this.RHandB.rotateAngleZ = 0.0f;
        this.RHandB.mirror = false;
        (this.LHandB = new ModelRenderer(this, 44, 9)).addBox(6.0f, -1.0f, -9.0f, 2, 2, 8);
        this.LHandB.setRotationPoint(4.0f, 20.0f, -9.0f);
        this.LHandB.rotateAngleX = 0.0f;
        this.LHandB.rotateAngleY = 0.27925f;
        this.LHandB.rotateAngleZ = 0.0f;
        this.LHandB.mirror = false;
    }

    @Override
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5);
        this.Head.render(f5);
        this.RearEnd.render(f5);
        this.Leg8.render(f5);
        this.Leg6.render(f5);
        this.Leg4.render(f5);
        this.Leg2.render(f5);
        this.Leg7.render(f5);
        this.Leg5.render(f5);
        this.Leg3.render(f5);
        this.Leg1.render(f5);
        this.Tail1.render(f5);
        this.Tail2.render(f5);
        this.Tail3.render(f5);
        this.Tail4.render(f5);
        this.Tail7.render(f5);
        this.RArm.render(f5);
        this.LArm.render(f5);
        this.RHand.render(f5);
        this.LHand.render(f5);
        this.RHandB.render(f5);
        this.LHandB.render(f5);
        this.Tail5.render(f5);
    }

    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        final float f6 = 0.7853982f;
        this.Leg1.rotateAngleZ = -f6;
        this.Leg2.rotateAngleZ = f6;
        this.Leg3.rotateAngleZ = -f6 * 0.74f;
        this.Leg4.rotateAngleZ = f6 * 0.74f;
        this.Leg5.rotateAngleZ = -f6 * 0.74f;
        this.Leg6.rotateAngleZ = f6 * 0.74f;
        this.Leg7.rotateAngleZ = -f6;
        this.Leg8.rotateAngleZ = f6;
        final float f7 = -0.0f;
        final float f8 = 0.3926991f;
        this.Leg1.rotateAngleY = f8 * 2.0f + f7;
        this.Leg2.rotateAngleY = -f8 * 2.0f - f7;
        this.Leg3.rotateAngleY = f8 + f7;
        this.Leg4.rotateAngleY = -f8 - f7;
        this.Leg5.rotateAngleY = -f8 + f7;
        this.Leg6.rotateAngleY = f8 - f7;
        this.Leg7.rotateAngleY = -f8 * 2.0f + f7;
        this.Leg8.rotateAngleY = f8 * 2.0f - f7;
        final float f9 = -(MathHelper.cos(f * 0.6662f * 2.0f + 0.0f) * 0.4f) * f1;
        final float f10 = -(MathHelper.cos(f * 0.6662f * 2.0f + 3.141593f) * 0.4f) * f1;
        final float f11 = -(MathHelper.cos(f * 0.6662f * 2.0f + 1.570796f) * 0.4f) * f1;
        final float f12 = -(MathHelper.cos(f * 0.6662f * 2.0f + 4.712389f) * 0.4f) * f1;
        final float f13 = Math.abs(MathHelper.sin(f * 0.6662f + 0.0f) * 0.4f) * f1;
        final float f14 = Math.abs(MathHelper.sin(f * 0.6662f + 3.141593f) * 0.4f) * f1;
        final float f15 = Math.abs(MathHelper.sin(f * 0.6662f + 1.570796f) * 0.4f) * f1;
        final float f16 = Math.abs(MathHelper.sin(f * 0.6662f + 4.712389f) * 0.4f) * f1;
        final ModelRenderer leg1 = this.Leg1;
        leg1.rotateAngleY += f9;
        final ModelRenderer leg2 = this.Leg2;
        leg2.rotateAngleY -= f9;
        final ModelRenderer leg3 = this.Leg3;
        leg3.rotateAngleY += f10;
        final ModelRenderer leg4 = this.Leg4;
        leg4.rotateAngleY -= f10;
        final ModelRenderer leg5 = this.Leg5;
        leg5.rotateAngleY += f11;
        final ModelRenderer leg6 = this.Leg6;
        leg6.rotateAngleY -= f11;
        final ModelRenderer leg7 = this.Leg7;
        leg7.rotateAngleY += f12;
        final ModelRenderer leg8 = this.Leg8;
        leg8.rotateAngleY -= f12;
        final ModelRenderer leg9 = this.Leg1;
        leg9.rotateAngleZ += f13;
        final ModelRenderer leg10 = this.Leg2;
        leg10.rotateAngleZ -= f13;
        final ModelRenderer leg11 = this.Leg3;
        leg11.rotateAngleZ += f14;
        final ModelRenderer leg12 = this.Leg4;
        leg12.rotateAngleZ -= f14;
        final ModelRenderer leg13 = this.Leg5;
        leg13.rotateAngleZ += f15;
        final ModelRenderer leg14 = this.Leg6;
        leg14.rotateAngleZ -= f15;
        final ModelRenderer leg15 = this.Leg7;
        leg15.rotateAngleZ += f16;
        final ModelRenderer leg16 = this.Leg8;
        leg16.rotateAngleZ -= f16;
        if (this.attacking) {
            this.RearEnd.rotateAngleX = 0.19199f;
            this.Tail1.rotationPointY = 20.0f;
            this.Tail1.rotationPointZ = -2.0f;
            this.Tail2.rotationPointY = 20.0f;
            this.Tail2.rotationPointZ = -6.0f;
            this.Tail3.rotationPointY = 20.0f;
            this.Tail3.rotationPointZ = -8.0f;
            this.Tail4.rotationPointY = 21.0f;
            this.Tail4.rotationPointZ = -10.0f;
            this.Tail5.rotationPointY = 24.0f;
            this.Tail5.rotationPointZ = -11.0f;
            this.Tail7.rotationPointY = 25.0f;
            this.Tail7.rotationPointZ = -12.0f;
        } else {
            this.RearEnd.rotateAngleX = 0.13963f;
            this.Tail1.rotationPointY = 20.0f;
            this.Tail1.rotationPointZ = 0.0f;
            this.Tail2.rotationPointY = 20.0f;
            this.Tail2.rotationPointZ = 0.0f;
            this.Tail3.rotationPointY = 20.0f;
            this.Tail3.rotationPointZ = 0.0f;
            this.Tail4.rotationPointY = 20.0f;
            this.Tail4.rotationPointZ = 0.0f;
            this.Tail5.rotationPointY = 20.0f;
            this.Tail5.rotationPointZ = 0.0f;
            this.Tail7.rotationPointY = 20.0f;
            this.Tail7.rotationPointZ = 0.0f;
        }
        if (this.isSwinging) {
            this.RArm.rotateAngleZ = 0.0f;
            this.LArm.rotateAngleZ = 0.0f;
            this.RHand.rotateAngleZ = 0.0f;
            this.LHand.rotateAngleZ = 0.0f;
            this.RHandB.rotateAngleZ = 0.0f;
            this.LHandB.rotateAngleZ = 0.0f;
            float f18;
            final float f17 = f18 = this.swingProgress;
            if (f17 >= 0.6f) {
                f18 = 0.6f - (f17 - 0.6f);
            }
            this.RArm.rotateAngleY = -0.27925f - f18;
            this.RHand.rotateAngleY = -0.27925f - f18;
            this.RHandB.rotateAngleY = -0.27925f - f18;
            this.LArm.rotateAngleY = 0.27925f + f18;
            this.LHand.rotateAngleY = 0.27925f + f18;
            this.LHandB.rotateAngleY = 0.27925f + f18;
        } else {
            final float mov = MathHelper.cos(f * 0.4f) * 0.3f * f1;
            this.Tail1.rotateAngleX = mov * 0.8f;
            this.Tail2.rotateAngleX = mov;
            this.Tail3.rotateAngleX = mov;
            this.Tail4.rotateAngleX = mov;
            this.Tail7.rotateAngleX = mov;
            this.Tail5.rotateAngleX = mov;
            this.RArm.rotateAngleY = -0.27925f;
            this.LArm.rotateAngleY = 0.27925f;
            this.RHand.rotateAngleY = -0.27925f;
            this.LHand.rotateAngleY = 0.27925f;
            this.RHandB.rotateAngleY = -0.27925f;
            this.LHandB.rotateAngleY = 0.27925f;
            this.RArm.rotateAngleZ = mov;
            this.RHandB.rotateAngleZ = mov;
            this.RHand.rotateAngleZ = mov;
            this.LHand.rotateAngleZ = -mov;
            this.LArm.rotateAngleZ = -mov;
            this.LHandB.rotateAngleZ = -mov;
        }
    }
}