/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abq
 *  abv
 *  ace
 *  ajz
 *  aof
 *  aqw
 *  ara
 *  com.moreexplosives.ICableBlock
 *  com.moreexplosives.MoreExplosives
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  mr
 *  ms
 *  nm
 *  wv
 */
package com.moreexplosives.block;

import com.moreexplosives.ICableBlock;
import com.moreexplosives.MoreExplosives;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDetCord
extends aqw
implements ICableBlock {
    private mr tex;
    private mr tex1;
    private mr tex2;

    public BlockDetCord(int i, int j) {
        super(i, ajz.u);
        this.a(BlockDetCord.j);
        this.a(wv.g);
        this.a(wv.m);
        this.a(wv.d);
    }

    public boolean shouldConnectTo(ace iblockaccess, int i, int j, int k) {
        int ID = iblockaccess.a(i, j, k);
        if (ID == this.cF) {
            return true;
        }
        if (ID == aqw.ar.cF) {
            return true;
        }
        if (ID == MoreExplosives.c4Block.cF) {
            return true;
        }
        if (ID == MoreExplosives.nucExpBlock.cF) {
            return true;
        }
        if (ID == MoreExplosives.timeBombBlock.cF) {
            return true;
        }
        if (ID == MoreExplosives.bundledC4Block.cF) {
            return true;
        }
        if (ID == MoreExplosives.lavaBombBlock.cF) {
            return true;
        }
        if (ID == MoreExplosives.fuseBlock.cF) {
            return true;
        }
        return false;
    }

    public void a(abv world, int i, int j, int k, abq e) {
        super.a(world, i, j, k, e);
        this.explode(world, i, j, k);
    }

    public void a(abv world, int i, int j, int k) {
        super.a(world, i, j, k);
        if (world.C(i, j, k)) {
            this.explode(world, i, j, k);
            return;
        }
        if (world.a(i + 1, j, k) == aqw.aw.cF) {
            this.explode(world, i, j, k);
        }
        if (world.a(i - 1, j, k) == aqw.aw.cF) {
            this.explode(world, i, j, k);
        }
        if (world.a(i, j + 1, k) == aqw.aw.cF) {
            this.explode(world, i, j, k);
        }
        if (world.a(i, j - 1, k) == aqw.aw.cF) {
            this.explode(world, i, j, k);
        }
        if (world.a(i, j, k + 1) == aqw.aw.cF) {
            this.explode(world, i, j, k);
        }
        if (world.a(i, j, k - 1) == aqw.aw.cF) {
            this.explode(world, i, j, k);
        }
    }

    public void a(abv world, int i, int j, int k, int l) {
        if (world.C(i, j, k)) {
            this.explode(world, i, j, k);
        }
        if (world.a(i + 1, j, k) == aqw.aw.cF) {
            this.explode(world, i, j, k);
        }
        if (world.a(i - 1, j, k) == aqw.aw.cF) {
            this.explode(world, i, j, k);
        }
        if (world.a(i, j + 1, k) == aqw.aw.cF) {
            this.explode(world, i, j, k);
        }
        if (world.a(i, j - 1, k) == aqw.aw.cF) {
            this.explode(world, i, j, k);
        }
        if (world.a(i, j, k + 1) == aqw.aw.cF) {
            this.explode(world, i, j, k);
        }
        if (world.a(i, j, k - 1) == aqw.aw.cF) {
            this.explode(world, i, j, k);
        }
    }

    public void explode(abv world, int posX, int posY, int posZ) {
        if (world.I) {
            return;
        }
        world.c(posX, posY, posZ, 0);
        world.a(null, (double)posX, (double)posY, (double)posZ, 2.0f, true);
    }

    public void preWorldRender() {
        this.tex = this.tex1;
    }

    public void g() {
        this.tex = this.tex2;
    }

    public boolean c() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public int d() {
        return MoreExplosives.renderID;
    }

    @SideOnly(value=Side.CLIENT)
    public void a(ms par1IconRegister) {
        this.tex = this.tex1 = par1IconRegister.a(this.E());
        this.tex2 = par1IconRegister.a(this.E() + "Inv");
    }

    public mr a(int par1, int par2) {
        return this.tex;
    }
}