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
 *  com.moreexplosives.entity.EntityC4ExplosivePrimed
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
import com.moreexplosives.entity.EntityC4ExplosivePrimed;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;

public class BlockC4Exp
extends aqw {
    public mr tex1;
    public mr tex2;
    public mr tex3;

    public BlockC4Exp(int i, int j) {
        super(i, ajz.u);
        this.a(BlockC4Exp.j);
        this.a(wv.g);
        this.a(wv.m);
        this.a(wv.d);
    }

    public void a(abv world, int i, int j, int k) {
        super.a(world, i, j, k);
        if (world.C(i, j, k)) {
            this.g(world, i, j, k, 1);
            world.c(i, j, k, 0);
        }
    }

    public void a(abv world, int i, int j, int k, int l) {
        if (world.C(i, j, k)) {
            this.g(world, i, j, k, 1);
            world.c(i, j, k, 0);
        }
    }

    public int a(Random random) {
        return 1;
    }

    public void a(abv world, int i, int j, int k, abq e) {
        if (world.I) {
            return;
        }
        EntityC4ExplosivePrimed EntityC4ExpPrimed = new EntityC4ExplosivePrimed(world, (double)((float)i + 0.5f), (double)((float)j + 0.5f), (double)((float)k + 0.5f));
        EntityC4ExpPrimed.fuse = world.s.nextInt(EntityC4ExpPrimed.fuse / 4) + EntityC4ExpPrimed.fuse / 8;
        world.d((nm)EntityC4ExpPrimed);
    }

    public void g(abv world, int i, int j, int k, int l) {
        if ((l & 1) == 1 && !world.I) {
            EntityC4ExplosivePrimed EntityC4ExpPrimed = new EntityC4ExplosivePrimed(world, (double)((float)i + 0.5f), (double)((float)j + 0.5f), (double)((float)k + 0.5f));
            world.d((nm)EntityC4ExpPrimed);
            world.a((nm)EntityC4ExpPrimed, "random.fuse", 1.0f, 1.0f);
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