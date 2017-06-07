/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abq
 *  abv
 *  acn
 *  aof
 *  aqw
 *  asu
 *  asz
 *  ata
 *  lr
 *  na
 *  nm
 */
package com.moreexplosives;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MoreExplosivesBetterExplosion
extends abq {
    public boolean a = false;
    public boolean isSuper;
    public int id;
    public boolean enableDrops;
    private Random ExplosionRNG;
    private abv k;
    public double c;
    public double d;
    public double e;
    public nm f;
    public float g;
    public Set destroyedBlockPositions;

    public MoreExplosivesBetterExplosion(abv world, nm entity, double d, double d1, double d2, float f, boolean enableDrops2, int _id) {
        super(world, entity, d, d1, d2, f);
        this.id = _id;
        this.enableDrops = enableDrops2;
        this.ExplosionRNG = new Random();
        this.destroyedBlockPositions = new HashSet();
        this.k = world;
        this.f = entity;
        this.g = f;
        this.c = d;
        this.d = d1;
        this.e = d2;
    }

    public void a() {
        float f = this.g;
        int i = 16;
        for (int j = 0; j < i; ++j) {
            for (int l = 0; l < i; ++l) {
                for (int j1 = 0; j1 < i; ++j1) {
                    if (j != 0 && j != i - 1 && l != 0 && l != i - 1 && j1 != 0 && j1 != i - 1) continue;
                    double d = (float)j / ((float)i - 1.0f) * 2.0f - 1.0f;
                    double d1 = (float)l / ((float)i - 1.0f) * 2.0f - 1.0f;
                    double d2 = (float)j1 / ((float)i - 1.0f) * 2.0f - 1.0f;
                    double d3 = Math.sqrt(d * d + d1 * d1 + d2 * d2);
                    d /= d3;
                    d1 /= d3;
                    d2 /= d3;
                    double d5 = this.c;
                    double d7 = this.d;
                    double d9 = this.e;
                    float f2 = 0.3f;
                    for (float f1 = this.g * (0.7f + this.k.s.nextFloat() * 0.6f); f1 > 0.0f; f1 -= f2 * 0.75f) {
                        int i3;
                        int j3;
                        int l2 = lr.c((double)d5);
                        int k3 = this.k.a(l2, i3 = lr.c((double)d7), j3 = lr.c((double)d9));
                        if (k3 > 0) {
                            f1 -= (aqw.s[k3].a(this.f) + 0.3f) * f2;
                        }
                        if (f1 > 0.0f || k3 != aqw.E.cF && this.isSuper) {
                            this.destroyedBlockPositions.add(new acn(l2, i3, j3));
                        }
                        d5 += d * (double)f2;
                        d7 += d1 * (double)f2;
                        d9 += d2 * (double)f2;
                    }
                }
            }
        }
        this.g *= 2.0f;
        int k = lr.c((double)(this.c - (double)this.g - 1.0));
        int i1 = lr.c((double)(this.c + (double)this.g + 1.0));
        int k1 = lr.c((double)(this.d - (double)this.g - 1.0));
        int l1 = lr.c((double)(this.d + (double)this.g + 1.0));
        int i2 = lr.c((double)(this.e - (double)this.g - 1.0));
        int j2 = lr.c((double)(this.e + (double)this.g + 1.0));
        List list = this.k.b(this.f, asu.a((double)k, (double)k1, (double)i2, (double)i1, (double)l1, (double)j2));
        asz vec3d = this.k.V().a(this.c, this.d, this.e);
        for (int k2 = 0; k2 < list.size(); ++k2) {
            nm entity = (nm)list.get(k2);
            double d4 = entity.f(this.c, this.d, this.e) / (double)this.g;
            if (d4 > 1.0) continue;
            double d6 = entity.u - this.c;
            double d8 = entity.v - this.d;
            double d10 = entity.w - this.e;
            double d11 = lr.a((double)(d6 * d6 + d8 * d8 + d10 * d10));
            double d12 = this.k.a(vec3d, entity.E);
            double d13 = (1.0 - d4) * d12;
            entity.a(na.a((abq)this), (float)((int)((d13 * d13 + d13) / 2.0 * 8.0 * (double)this.g + 1.0)));
            double d14 = d13;
            entity.x += (d6 /= d11) * d14;
            entity.y += (d8 /= d11) * d14;
            entity.z += (d10 /= d11) * d14;
        }
        this.g = f;
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(this.destroyedBlockPositions);
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
                double d7 = 0.5 / (d6 / (double)this.g + 0.1);
                this.k.a("explode", (d + this.c * 1.0) / 2.0, (d1 + this.d * 1.0) / 2.0, (d2 + this.e * 1.0) / 2.0, d3 *= (d7 *= (double)(this.k.s.nextFloat() * this.k.s.nextFloat() + 0.3f)), d4 *= d7, d5 *= d7);
                this.k.a("smoke", d, d1, d2, d3, d4, d5);
            }
            if (this.id == 10) {
                if (i2 == 10) continue;
                if (this.enableDrops) {
                    aqw.s[i2].a(this.k, k, i1, k1, this.k.h(k, i1, k1), 0.3f, 0);
                }
                if (i2 == aqw.J.cF) {
                    this.k.c(k, i1, k1, aqw.R.cF);
                } else if (i2 == aqw.bb.cF) {
                    this.k.c(k, i1, k1, aqw.aq.cF);
                } else if (i2 == aqw.B.cF) {
                    this.k.c(k, i1, k1, aqw.y.cF);
                } else if (i2 != aqw.y.cF) {
                    this.k.c(k, i1, k1, 10);
                }
                if (i2 == 0) continue;
                aqw.s[i2].a(this.k, k, i1, k1, (abq)this);
                continue;
            }
            if (i2 == this.id) continue;
            if (this.enableDrops) {
                aqw.s[i2].a(this.k, k, i1, k1, this.k.h(k, i1, k1), 0.3f, 0);
            }
            this.k.c(k, i1, k1, this.id);
            if (i2 == 0) continue;
            aqw.s[i2].a(this.k, k, i1, k1, (abq)this);
        }
        if (this.a) {
            for (int j = arraylist.size() - 1; j >= 0; --j) {
                acn chunkposition1 = (acn)arraylist.get(j);
                int l = chunkposition1.a;
                int j1 = chunkposition1.b;
                int l1 = chunkposition1.c;
                int j2 = this.k.a(l, j1, l1);
                int k2 = this.k.a(l, j1 - 1, l1);
                if (j2 != 0 || !aqw.t[k2] || this.ExplosionRNG.nextInt(3) != 0) continue;
                this.k.c(l, j1, l1, aqw.aw.cF);
            }
        }
    }
}