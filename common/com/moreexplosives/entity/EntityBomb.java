/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abq
 *  abv
 *  asx
 *  com.moreexplosives.MoreExplosives
 *  nm
 *  oe
 *  up
 */
package com.moreexplosives.entity;

import com.moreexplosives.MoreExplosives;

public class EntityBomb
extends up {
    public boolean coctail;

    public EntityBomb(abv world) {
        super(world);
        this.coctail = false;
    }

    public EntityBomb(abv world, oe entityliving) {
        super(world, entityliving);
    }

    public EntityBomb(abv world, double d, double d1, double d2) {
        super(world, d, d1, d2);
    }

    protected void a(asx movingobjectposition) {
        if (!this.q.I) {
            if (!this.coctail) {
                MoreExplosives.createBetterExplosion((abv)this.q, (nm)null, (double)this.u, (double)this.v, (double)this.w, (float)5.0f, (boolean)false, (boolean)false);
            } else {
                this.q.a(null, this.u, this.v, this.w, 5.0f, true, false);
            }
            this.w();
        }
    }
}