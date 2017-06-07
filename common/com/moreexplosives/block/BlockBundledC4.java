/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abq
 *  abv
 *  ace
 *  ajz
 *  aqw
 *  ara
 *  com.moreexplosives.MoreExplosives
 *  com.moreexplosives.entity.EntityBundledC4Primed
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  mr
 *  ms
 *  nm
 *  ue
 *  wv
 *  yb
 *  yd
 */
package com.moreexplosives.block;

import com.moreexplosives.MoreExplosives;
import com.moreexplosives.entity.EntityBundledC4Primed;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;

public class BlockBundledC4
extends aqw {
    public mr tex1;
    public mr tex2;
    public mr tex3;

    public BlockBundledC4(int i, int j) {
        super(i, ajz.u);
        this.a(BlockBundledC4.j);
        this.a(wv.g);
        this.a(wv.m);
        this.a(wv.d);
    }

    public void a(abv world, int i, int j, int k) {
        super.a(world, i, j, k);
        if (world.C(i, j, k)) {
            this.explode(world, i, j, k);
            world.c(i, j, k, 0);
        }
    }

    public void a(abv world, int i, int j, int k, int l) {
        if (world.C(i, j, k)) {
            this.explode(world, i, j, k);
            world.c(i, j, k, 0);
        }
    }

    public int a(Random random) {
        return 1;
    }

    public void a(abv world, int i, int j, int k, abq e) {
        this.explode(world, i, j, k);
    }

    public void g(abv world, int i, int j, int k, int l) {
        if ((l & 1) == 1 && !world.I) {
            this.explode(world, i, j, k);
        }
    }

    public boolean a(abv par1World, int par2, int par3, int par4, ue par5EntityPlayer, int c, float f, float f2, float f3) {
        if (par1World.I) {
            return true;
        }
        if (par5EntityPlayer.bx() != null && par5EntityPlayer.bx().d == yb.k.cv) {
            this.g(par1World, par2, par3, par4, 1);
            par1World.c(par2, par3, par4, 0);
            return true;
        }
        return false;
    }

    public void explode(abv world, int i, int j, int k) {
        if (world.I) {
            return;
        }
        EntityBundledC4Primed entitybundledc4primed = new EntityBundledC4Primed(world, (double)((float)i + 0.5f), (double)((float)j + 0.5f), (double)((float)k + 0.5f));
        world.d((nm)entitybundledc4primed);
        world.a((nm)entitybundledc4primed, "random.fuse", 1.0f, 1.0f);
    }

    public int d() {
        return MoreExplosives.renderID;
    }

    @SideOnly(value=Side.CLIENT)
    public void a(ms par1IconRegister) {
        this.tex1 = par1IconRegister.a(this.E() + "Top");
        this.tex2 = par1IconRegister.a(this.E() + "Side");
        this.tex3 = par1IconRegister.a(this.E() + "Bottom");
    }

    public mr b_(ace par1IBlockAccess, int par2, int par3, int par4, int par5) {
        return this.a(par5, 0);
    }

    public mr a(int i, int par2) {
        if (i == 0) {
            return this.tex3;
        }
        if (i == 1) {
            return this.tex1;
        }
        return this.tex2;
    }
}