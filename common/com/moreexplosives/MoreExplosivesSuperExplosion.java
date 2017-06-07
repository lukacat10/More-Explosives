/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abq
 *  abv
 *  aqw
 *  asu
 *  na
 *  nm
 */
package com.moreexplosives;

import java.util.List;
import java.util.Random;

public class MoreExplosivesSuperExplosion
extends abq {
    private abv world;
    private int xPos;
    private int yPos;
    private int zPos;
    private Random random;

    public MoreExplosivesSuperExplosion() {
        super(null, null, 0.0, 0.0, 0.0, 0.0f);
    }

    public void explode(abv world, double radiusX, double radiusY, double radiusZ, int xPos, int yPos, int zPos, long randomSeed) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;
        this.world = world;
        this.random = new Random(randomSeed);
        world.a((double)xPos, (double)yPos, (double)zPos, "random.old_explode", 4.0f, (1.0f + (world.s.nextFloat() - world.s.nextFloat()) * 0.2f) * 0.7f);
        double invRadiusX = 1.0 / (radiusX += 0.5);
        double invRadiusY = 1.0 / (radiusY += 0.5);
        double invRadiusZ = 1.0 / (radiusZ += 0.5);
        int ceilRadiusX = (int)Math.ceil(radiusX);
        int ceilRadiusY = (int)Math.ceil(radiusY);
        int ceilRadiusZ = (int)Math.ceil(radiusZ);
        double nextXn = 0.0;
        block0 : for (int x = 0; x <= ceilRadiusX; ++x) {
            double xn = nextXn;
            nextXn = (double)(x + 1) * invRadiusX;
            double nextYn = 0.0;
            block1 : for (int y = 0; y <= ceilRadiusY; ++y) {
                double yn = nextYn;
                nextYn = (double)(y + 1) * invRadiusY;
                double nextZn = 0.0;
                for (int z = 0; z <= ceilRadiusZ; ++z) {
                    double zn = nextZn;
                    nextZn = (double)(z + 1) * invRadiusZ;
                    double distanceSq = this.lengthSq(xn, yn, zn);
                    if (distanceSq > 1.0) {
                        if (z != 0) continue block1;
                        if (y != 0) continue block0;
                        break block0;
                    }
                    if ((this.lengthSq(nextXn, yn, zn) > 1.0 || this.lengthSq(xn, nextYn, zn) > 1.0 || this.lengthSq(xn, yn, nextZn) > 1.0) && this.random.nextBoolean()) continue;
                    this.setBlock(x, y, z);
                    this.setBlock(- x, y, z);
                    this.setBlock(x, - y, z);
                    this.setBlock(x, y, - z);
                    this.setBlock(- x, - y, z);
                    this.setBlock(x, - y, - z);
                    this.setBlock(- x, y, - z);
                    this.setBlock(- x, - y, - z);
                }
            }
        }
        List list = world.a(nm.class, asu.a((double)((double)xPos - radiusX), (double)((double)yPos - radiusY), (double)((double)zPos - radiusY), (double)((double)xPos + radiusX), (double)((double)yPos + radiusY), (double)((double)zPos + radiusY)));
        for (int index = 0; index < list.size(); ++index) {
            ((nm)list.get(index)).a(na.a((abq)this), 100.0f);
        }
    }

    private final double lengthSq(double x, double y, double z) {
        return x * x + y * y + z * z;
    }

    private final void setBlock(double x, double y, double z) {
        int id = this.world.a((int)x + this.xPos, (int)y + this.yPos, (int)z + this.zPos);
        if (id != 0 && id != aqw.E.cF) {
            this.world.c((int)x + this.xPos, (int)y + this.yPos, (int)z + this.zPos, 0);
            aqw.s[id].a(this.world, (int)x, (int)y, (int)z, (abq)this);
        }
    }

    protected int getHeightAtXZ(abv world, int x, int z) {
        for (int y = 256; y >= 0; --y) {
            if (world.a(x, y, z) == 0 || !aqw.s[world.a(x, y, z)].b() || !aqw.s[world.a(x, y, z)].c() || world.a(x, y - 1, z) == 0 || !aqw.s[world.a(x, y - 1, z)].b() || !aqw.s[world.a(x, y - 1, z)].c()) continue;
            return y + 1;
        }
        return 0;
    }
}