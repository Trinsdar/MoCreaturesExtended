package drzhark.mocreatures.client.model.legacy;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class MoCLegacyModelBigCat2 extends ModelBase {

    public boolean sitting;
    public boolean tamed;
    ModelRenderer snout;
    ModelRenderer tail;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer ears;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer leg3;
    ModelRenderer leg4;
    ModelRenderer collar;

    public MoCLegacyModelBigCat2() {
        this.ears = new ModelRenderer(this, 16, 25);
        this.ears.addBox(-4F, -7F, -3F, 8, 4, 1, 0.0F);
        this.ears.setRotationPoint(0.0F, 4F, -8F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-4F, -4F, -6F, 8, 8, 6, 0.0F);
        this.head.setRotationPoint(0.0F, 4F, -8F);
        this.snout = new ModelRenderer(this, 14, 14);
        this.snout.addBox(-2F, 0.0F, -9F, 4, 4, 6, 0.0F);
        this.snout.setRotationPoint(0.0F, 4F, -8F);
        this.collar = new ModelRenderer(this, 24, 0);
        this.collar.addBox(-2.5F, 4F, -3F, 5, 4, 1, 0.0F);
        this.collar.setRotationPoint(0.0F, 4F, -8F);
        this.body = new ModelRenderer(this, 28, 0);
        this.body.addBox(-5F, -10F, -7F, 10, 18, 8, 0.0F);
        this.body.setRotationPoint(0.0F, 5F, 2.0F);
        this.tail = new ModelRenderer(this, 26, 15);
        this.tail.addBox(-5F, -5F, -2F, 3, 3, 14, 0.0F);
        this.tail.setRotationPoint(3.5F, 9.3F, 9F);
        this.tail.rotateAngleX = -0.5235988F;
        this.leg1 = new ModelRenderer(this, 0, 16);
        this.leg1.addBox(-2F, 0.0F, -2F, 4, 12, 4, 0.0F);
        this.leg1.setRotationPoint(-3F, 12F, 7F);
        this.leg2 = new ModelRenderer(this, 0, 16);
        this.leg2.addBox(-2F, 0.0F, -2F, 4, 12, 4, 0.0F);
        this.leg2.setRotationPoint(3F, 12F, 7F);
        this.leg3 = new ModelRenderer(this, 0, 16);
        this.leg3.addBox(-2F, 0.0F, -2F, 4, 12, 4, 0.0F);
        this.leg3.setRotationPoint(-3F, 12F, -5F);
        this.leg4 = new ModelRenderer(this, 0, 16);
        this.leg4.addBox(-2F, 0.0F, -2F, 4, 12, 4, 0.0F);
        this.leg4.setRotationPoint(3F, 12F, -5F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5);
        this.snout.render(f5);
        this.tail.render(f5);
        this.ears.render(f5);
        this.head.render(f5);
        this.body.render(f5);
        this.leg1.render(f5);
        this.leg2.render(f5);
        this.leg3.render(f5);
        this.leg4.render(f5);
        if (this.tamed) {
            this.collar.render(f5);
        }
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
        this.head.rotateAngleX = f4 / 57.29578F;
        this.head.rotateAngleY = f3 / 57.29578F;
        this.leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.leg2.rotateAngleX = MathHelper.cos((f * 0.6662F) + 3.141593F) * 1.4F * f1;
        this.leg3.rotateAngleX = MathHelper.cos((f * 0.6662F) + 3.141593F) * 1.4F * f1;
        this.leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.snout.rotateAngleY = this.head.rotateAngleY;
        this.snout.rotateAngleX = this.head.rotateAngleX;
        this.ears.rotateAngleY = this.head.rotateAngleY;
        this.ears.rotateAngleX = this.head.rotateAngleX;
        this.collar.rotateAngleY = this.head.rotateAngleY;
        this.collar.rotateAngleX = this.head.rotateAngleX;
        if (!this.sitting) {
            this.body.rotationPointX = 0.0F;
            this.body.rotationPointY = 5F;
            this.body.rotationPointZ = 2.0F;
            this.body.rotateAngleX = 1.570796F;
            this.leg1.rotationPointX = -3F;
            this.leg1.rotationPointZ = 7F;
            this.leg2.rotationPointX = 3F;
            this.leg2.rotationPointZ = 7F;
            this.leg3.rotationPointX = -3F;
            this.leg3.rotationPointZ = -5F;
            this.leg4.rotationPointX = 3F;
            this.leg4.rotationPointZ = -5F;
            this.tail.rotationPointX = 3.5F;
            this.tail.rotationPointY = 9.3F;
            this.tail.rotationPointZ = 9F;
            this.tail.rotateAngleX = -0.5235988F;
            this.tail.rotateAngleY = MathHelper.cos(f * 0.6662F) * 0.7F * f1;
        } else {
            this.body.rotateAngleX = 0.8726646F;
            this.body.rotationPointX = 0.0F;
            this.body.rotationPointY = 12F;
            this.body.rotationPointZ = 1.0F;
            this.leg1.rotationPointX = -5F;
            this.leg1.rotationPointZ = 0.0F;
            this.leg2.rotationPointX = 5F;
            this.leg2.rotationPointZ = 0.0F;
            this.leg3.rotationPointX = -2F;
            this.leg3.rotationPointZ = -8F;
            this.leg4.rotationPointX = 2.0F;
            this.leg4.rotationPointZ = -8F;
            this.tail.rotationPointX = 3.5F;
            this.tail.rotationPointY = 22F;
            this.tail.rotationPointZ = 8F;
            this.tail.rotateAngleX = -0.1745329F;
        }
    }
}