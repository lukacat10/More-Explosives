/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abq
 *  abv
 *  ace
 *  ajz
 *  aqw
 *  asu
 *  com.moreexplosives.IHideableBlock
 *  com.moreexplosives.MoreExplosives
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  mr
 *  ms
 *  nm
 *  oe
 *  ue
 *  wv
 */
package com.moreexplosives.block;

import com.moreexplosives.IHideableBlock;
import com.moreexplosives.MoreExplosives;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;

public class BlockLandMine
extends aqw
implements IHideableBlock {
    public mr tex;

    public BlockLandMine(int i, int j) {
        super(i, ajz.e);
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
        this.a(wv.g);
        this.a(wv.m);
        this.a(wv.d);
    }

    public boolean shouldRender(ace iblockaccess, int i, int j, int k) {
        return iblockaccess.h(i, j, k) == 0;
    }

    public boolean a(abv world, int i, int j, int k, ue entityplayer, int c, float f, float f2, float f3) {
        world.b(i, j, k, 1 - world.h(i, j, k), 3);
        return true;
    }

    public void a(abv world, int i, int j, int k, nm entity) {
        if (world.a(oe.class, asu.a((double)i, (double)j, (double)k, (double)(i + 1), (double)((double)j + 0.25), (double)(k + 1))).size() <= 0) {
            return;
        }
        this.explode(world, i, j, k);
    }

    public void a(abv world, int i, int j, int k, abq e) {
        this.explode(world, i, j, k);
    }

    public void a(abv world, int i, int j, int k) {
        super.a(world, i, j, k);
        if (world.C(i, j, k)) {
            this.explode(world, i, j, k);
            return;
        }
    }

    public void a(abv world, int i, int j, int k, int l) {
        if (world.C(i, j, k)) {
            this.explode(world, i, j, k);
        }
    }

    private void explode(abv world, int i, int j, int k) {
        if (world.I) {
            return;
        }
        world.c(i, j, k, 0);
        world.a(null, (double)i, (double)j, (double)k, 4.0f, true);
        world.f(i, j, k, this.cF);
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public int d() {
        return MoreExplosives.renderID;
    }

    @SideOnly(value=Side.CLIENT)
    public void a(ms par1IconRegister) {
        this.tex = par1IconRegister.a(this.E());
    }

    public mr b_(ace par1IBlockAccess, int par2, int par3, int par4, int par5) {
        return this.tex;
    }

    public mr a(int par1, int par2) {
        return this.tex;
    }
}