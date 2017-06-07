/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abq
 *  abv
 *  acn
 *  aqw
 *  lr
 *  nm
 */
package com.moreexplosives;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MoreExplosivesTunnelExplosion
extends abq {
    private abv k;
    public double c;
    public double d;
    public double e;
    public int direction;
    public nm f;
    public Set destroyedBlockPositions = new HashSet();

    public MoreExplosivesTunnelExplosion(abv world, nm entity, double i, double j, double k, int direction2) {
        super(world, entity, i, j, k, 0.0f);
        this.k = world;
        this.f = entity;
        this.c = i;
        this.d = j;
        this.e = k;
        this.direction = direction2;
    }

    public void a() {
        int k;
        int j;
        int i;
        int explosionX2 = lr.c((double)this.c);
        int explosionY2 = lr.c((double)this.d);
        int explosionZ2 = lr.c((double)this.e);
        if (this.direction == 0) {
            for (i = explosionX2 - 1; i <= explosionX2 + 1; ++i) {
                for (j = explosionY2 - 0; j <= explosionY2 + 20; ++j) {
                    for (k = explosionZ2 - 1; k <= explosionZ2 + 1; ++k) {
                        this.addPosition(i, j, k);
                    }
                }
            }
        }
        if (this.direction == 1) {
            for (i = explosionX2 - 1; i <= explosionX2 + 1; ++i) {
                for (j = explosionY2 - 20; j <= explosionY2 + 0; ++j) {
                    for (k = explosionZ2 - 1; k <= explosionZ2 + 1; ++k) {
                        this.addPosition(i, j, k);
                    }
                }
            }
        }
        if (this.direction == 2) {
            for (i = explosionX2 - 1; i <= explosionX2 + 1; ++i) {
                for (j = explosionY2 - 1; j <= explosionY2 + 1; ++j) {
                    for (k = explosionZ2 - 0; k <= explosionZ2 + 20; ++k) {
                        this.addPosition(i, j, k);
                    }
                }
            }
        }
        if (this.direction == 3) {
            for (i = explosionX2 - 1; i <= explosionX2 + 1; ++i) {
                for (j = explosionY2 - 1; j <= explosionY2 + 1; ++j) {
                    for (k = explosionZ2 - 20; k <= explosionZ2 + 0; ++k) {
                        this.addPosition(i, j, k);
                    }
                }
            }
        }
        if (this.direction == 4) {
            for (i = explosionX2 - 0; i <= explosionX2 + 20; ++i) {
                for (j = explosionY2 - 1; j <= explosionY2 + 1; ++j) {
                    for (k = explosionZ2 - 1; k <= explosionZ2 + 1; ++k) {
                        this.addPosition(i, j, k);
                    }
                }
            }
        }
        if (this.direction == 5) {
            for (i = explosionX2 - 20; i <= explosionX2 + 0; ++i) {
                for (j = explosionY2 - 1; j <= explosionY2 + 1; ++j) {
                    for (k = explosionZ2 - 1; k <= explosionZ2 + 1; ++k) {
                        this.addPosition(i, j, k);
                    }
                }
            }
        }
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(this.destroyedBlockPositions);
    }

    private void addPosition(int i, int j, int k) {
        float f1 = 20.0f;
        int k3 = this.k.a(i, j, k);
        if (k3 > 0) {
            f1 -= (aqw.s[k3].a(this.f) + 0.3f) * 0.3f;
        }
        if (f1 > 0.0f) {
            this.destroyedBlockPositions.add(new acn(i, j, k));
        }
    }

    public void a(boolean flag) {
        this.k.a(this.c, this.d, this.e, "random.explode", 4.0f, (1.0f + (this.k.s.nextFloat() - this.k.s.nextFloat()) * 0.2f) * 0.7f);
        this.k.a("hugeexplosion", this.c, this.d, this.e, 0.0, 0.0, 0.0);
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(this.destroyedBlockPositions);
        for (int i = arraylist.size() - 1; i >= 0; --i) {
            acn chunkposition = (acn)arraylist.get(i);
            int k = chunkposition.a;
            int i1 = chunkposition.b;
            int k1 = chunkposition.c;
            int i2 = this.k.a(k, i1, k1);
            if (flag) {
                double d = (float)k + this.k.s.nextFloat();
                double d1 = (float)i1 + this.k.s.nextFloat();
                double d2 = (float)k1 + this.k.s.nextFloat();
                double d3 = d - this.c;
                double d4 = d1 - this.d;
                double d5 = d2 - this.e;
                double d6 = lr.a((double)(d3 * d3 + d4 * d4 + d5 * d5));
                d3 /= d6;
                d4 /= d6;
                d5 /= d6;
                double d7 = 0.5 / (d6 / 5.1);
                this.k.a("explode", (d + this.c * 1.0) / 2.0, (d1 + this.d * 1.0) / 2.0, (d2 + this.e * 1.0) / 2.0, d3 *= (d7 *= (double)(this.k.s.nextFloat() * this.k.s.nextFloat() + 0.3f)), d4 *= d7, d5 *= d7);
                this.k.a("smoke", d, d1, d2, d3, d4, d5);
            }
            if (i2 <= 0) continue;
            aqw.s[i2].c(this.k, k, i1, k1, this.k.h(k, i1, k1), 0);
            this.k.c(k, i1, k1, 0);
            aqw.s[i2].a(this.k, k, i1, k1, (abq)this);
        }
    }
}