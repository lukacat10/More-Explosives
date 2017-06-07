/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abq
 *  abv
 *  bed
 *  bx
 *  com.google.common.io.ByteArrayDataInput
 *  com.google.common.io.ByteArrayDataOutput
 *  com.moreexplosives.MoreExplosives
 *  com.moreexplosives.MoreExplosivesMinecraftHelper
 *  com.moreexplosives.entity.EntityMissile
 *  com.moreexplosives.entity.EntityMoreExplosivesSmokeFX
 *  com.moreexplosives.item.ItemDefuser
 *  cpw.mods.fml.common.registry.IEntityAdditionalSpawnData
 *  lr
 *  nm
 *  oe
 *  sr
 *  ub
 *  uc
 *  ue
 *  yb
 *  yd
 */
package com.moreexplosives.entity;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteArrayDataOutput;
import com.moreexplosives.MoreExplosives;
import com.moreexplosives.MoreExplosivesMinecraftHelper;
import com.moreexplosives.entity.EntityMissile;
import com.moreexplosives.entity.EntityMoreExplosivesSmokeFX;
import com.moreexplosives.item.ItemDefuser;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import java.util.List;
import java.util.Random;

public class EntityAntiBallisticMissile
extends nm
implements IEntityAdditionalSpawnData {
    public boolean flying;
    private ParticleHelper helper;
    private EntityMissile target;

    public EntityAntiBallisticMissile(abv world) {
        super(world);
        this.a(1.0f, 3.5f);
        this.l = 50.0;
        this.am = true;
        if (world.I) {
            this.helper = new ParticleHelper();
        }
    }

    public EntityAntiBallisticMissile(abv world, double x, double y, double z) {
        this(world);
        this.b(x, y, z);
        this.N = 0.0f;
        this.y = 5.0;
    }

    protected void a() {
    }

    public void l_() {
        super.l_();
        if (!this.flying || this.target == null) {
            for (nm entity : this.q.e) {
                double x;
                double z;
                double y;
                if (!(entity instanceof EntityMissile)) continue;
                EntityMissile missile = (EntityMissile)entity;
                if (!missile.flying || Math.sqrt((x = Math.abs(this.u - missile.u)) * x + (y = Math.abs(this.v - missile.v)) * y + (z = Math.abs(this.w - missile.w)) * z) >= 100.0) continue;
                this.target = missile;
                this.flying = true;
                break;
            }
        }
        if (!this.flying || this.target == null) {
            return;
        }
        if (this.target.M) {
            this.w();
        }
        if (!this.q.I) {
            double z;
            double y;
            double x = Math.abs(this.u - this.target.u);
            if (Math.sqrt(x * x + (y = Math.abs(this.v - this.target.v)) * y + (z = Math.abs(this.w - this.target.w)) * z) < 5.0) {
                this.w();
                this.target.w();
                this.q.a(null, this.u, this.v, this.w, 8.0f, true);
            } else {
                this.x = (- this.u - this.target.u) / 5.0;
                this.y = (- this.v - this.target.v) / 5.0;
                this.z = (- this.w - this.target.w) / 5.0;
            }
            if (this.D == 0.0f && this.C == 0.0f) {
                float f = lr.a((double)(this.x * this.x + this.z * this.z));
                this.C = this.A = (float)(Math.atan2(this.x, this.z) * 180.0 / 3.141592653589793);
                this.D = this.B = (float)(Math.atan2(this.y, f) * 180.0 / 3.141592653589793);
            }
            this.u += this.x;
            this.v += this.y;
            this.w += this.z;
            float f3 = lr.a((double)(this.x * this.x + this.z * this.z));
            this.A = (float)(Math.atan2(this.x, this.z) * 180.0 / 3.141592653589793);
            this.B = (float)(Math.atan2(this.y, f3) * 180.0 / 3.141592653589793);
            while (this.B - this.D < -180.0f) {
                this.D -= 360.0f;
            }
            this.B = this.D + (this.B - this.D) * 0.2f;
            this.A = this.C + (this.A - this.C) * 0.2f;
            float f4 = 0.99f;
            float f6 = 0.015f;
            this.x *= (double)f4;
            this.y *= (double)f4;
            this.z *= (double)f4;
            this.y -= (double)f6;
            this.b(this.u, this.v, this.w);
        } else {
            this.helper.spawn();
        }
    }

    public boolean c(ue entityplayer) {
        yd itemstack = entityplayer.bn.h();
        if (itemstack != null && itemstack.d == MoreExplosives.itemDefuser.cv && !this.q.I && !this.M) {
            ItemDefuser.onItemUsed((yd)itemstack, (oe)entityplayer);
            this.w();
            if (!entityplayer.bG.d) {
                this.b(MoreExplosives.itemABM.cv, 1);
            }
            return false;
        }
        return false;
    }

    public void b(bx nbttagcompound) {
        nbttagcompound.a("flying", this.flying);
        nbttagcompound.a("targetID", this.target == null ? -1 : this.target.k);
    }

    public void a(bx nbttagcompound) {
        this.flying = nbttagcompound.n("flying");
        try {
            int id = nbttagcompound.e("targetID");
            this.target = (EntityMissile)this.getEntityByID(id, this.q);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void writeSpawnData(ByteArrayDataOutput data) {
        data.writeBoolean(this.flying);
    }

    public void readSpawnData(ByteArrayDataInput data) {
        this.flying = data.readBoolean();
    }

    protected boolean e_() {
        return false;
    }

    public boolean K() {
        return !this.M;
    }

    protected boolean canDespawn() {
        return false;
    }

    public float R() {
        return 0.9f;
    }

    public nm getEntityByID(int ID, abv world) {
        List entities = world.e;
        for (nm entity : entities) {
            if (entity.k != ID) continue;
            return entity;
        }
        return null;
    }

    private class ParticleHelper {
        private ParticleHelper() {
        }

        public void spawn() {
            for (int iterator = 0; iterator < 50; ++iterator) {
                EntityMoreExplosivesSmokeFX fx = new EntityMoreExplosivesSmokeFX(EntityAntiBallisticMissile.this.q, EntityAntiBallisticMissile.this.u, EntityAntiBallisticMissile.this.v, EntityAntiBallisticMissile.this.w, (double)(((float)EntityAntiBallisticMissile.this.ab.nextInt(200) - 100.0f) / 600.0f), (double)(((float)EntityAntiBallisticMissile.this.ab.nextInt(200) - 100.0f) / 600.0f), (double)(((float)EntityAntiBallisticMissile.this.ab.nextInt(200) - 100.0f) / 600.0f), 10.0f);
                fx.setLife(120);
                fx.l = 8.0;
                fx.setAll((float)(Math.random() * 0.30000001192092896));
                MoreExplosivesMinecraftHelper.addEffect((bed)fx);
            }
        }
    }

}