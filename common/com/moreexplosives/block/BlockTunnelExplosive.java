/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abv
 *  ace
 *  ajz
 *  aqw
 *  com.moreexplosives.MoreExplosives
 *  com.moreexplosives.entity.EntityTunnelExplosivePrimed
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  lr
 *  mr
 *  ms
 *  nm
 *  oe
 *  ue
 *  wv
 *  yb
 *  yd
 */
package com.moreexplosives.block;

import com.moreexplosives.MoreExplosives;
import com.moreexplosives.entity.EntityTunnelExplosivePrimed;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTunnelExplosive
extends aqw {
    public mr side1Texture;
    public mr side2Texture;
    public mr side3Texture;
    public mr side4Texture;
    public mr backTexture;
    public mr frontTexture;

    public BlockTunnelExplosive(int i, int j) {
        super(i, ajz.u);
        this.a(wv.g);
        this.a(wv.m);
        this.a(wv.d);
    }

    public void a(abv world, int i, int j, int k, oe entityliving, yd ii) {
        super.a(world, i, j, k, entityliving, ii);
        int l = this.determineOrientation(world, i, j, k, (ue)entityliving);
        world.b(i, j, k, l, 3);
        if (world.C(i, j, k)) {
            this.explode(world, i, j, k);
        }
    }

    private int determineOrientation(abv world, int i, int j, int k, ue entityplayer) {
        int l;
        if (lr.e((float)((float)entityplayer.u - (float)i)) < 2.0f && lr.e((float)((float)entityplayer.w - (float)k)) < 2.0f) {
            double d = entityplayer.v + 1.82 - (double)entityplayer.N;
            if (d - (double)j > 2.0) {
                return 1;
            }
            if ((double)j - d > 0.0) {
                return 0;
            }
        }
        if ((l = lr.c((double)((double)(entityplayer.A * 4.0f / 360.0f) + 0.5)) & 3) == 0) {
            return 2;
        }
        if (l == 1) {
            return 5;
        }
        if (l == 2) {
            return 3;
        }
        return l != 3 ? 0 : 4;
    }

    public void a(abv world, int i, int j, int k, int l) {
        super.a(world, i, j, k, l);
        if (world.C(i, j, k)) {
            this.explode(world, i, j, k);
        }
    }

    public void explode(abv world, int i, int j, int k) {
        if (world.I) {
            return;
        }
        EntityTunnelExplosivePrimed entitytunnelexpprimed = new EntityTunnelExplosivePrimed(world, (double)((float)i + 0.5f), (double)((float)j + 0.5f), (double)((float)k + 0.5f), world.h(i, j, k));
        world.d((nm)entitytunnelexpprimed);
        world.a((nm)entitytunnelexpprimed, "random.fuse", 1.0f, 1.0f);
        world.c(i, j, k, 0);
    }

    public void explode(abv world, int i, int j, int k, int meta) {
        if (world.I) {
            return;
        }
        EntityTunnelExplosivePrimed entitytunnelexpprimed = new EntityTunnelExplosivePrimed(world, (double)((float)i + 0.5f), (double)((float)j + 0.5f), (double)((float)k + 0.5f), meta);
        world.d((nm)entitytunnelexpprimed);
        world.a((nm)entitytunnelexpprimed, "random.fuse", 1.0f, 1.0f);
        world.c(i, j, k, 0);
    }

    public boolean a(abv world, int par2, int par3, int par4, ue par5EntityPlayer, int i, float f, float f2, float f3) {
        if (par5EntityPlayer.bx() != null && par5EntityPlayer.bx().d == yb.k.cv) {
            this.explode(world, par2, par3, par4);
            world.c(par2, par3, par4, 0);
            return true;
        }
        return false;
    }

    public int d() {
        return MoreExplosives.renderID;
    }

    @SideOnly(value=Side.CLIENT)
    public void a(ms par1IconRegister) {
        this.backTexture = par1IconRegister.a(this.E() + "Back");
        this.frontTexture = par1IconRegister.a(this.E() + "Front");
        this.side1Texture = par1IconRegister.a(this.E() + "Side1");
        this.side2Texture = par1IconRegister.a(this.E() + "Side2");
        this.side3Texture = par1IconRegister.a(this.E() + "Side3");
        this.side4Texture = par1IconRegister.a(this.E() + "Side4");
    }

    public mr b_(ace par1IBlockAccess, int par2, int par3, int par4, int par5) {
        return this.a(par5, par1IBlockAccess.h(par2, par3, par4));
    }

    public mr a(int i, int j) {
        if (j == 0) {
            if (i == 0) {
                return this.backTexture;
            }
            if (i == 1) {
                return this.frontTexture;
            }
            if (i == 2) {
                return this.side3Texture;
            }
            if (i == 3) {
                return this.side3Texture;
            }
            if (i == 4) {
                return this.side3Texture;
            }
            if (i == 5) {
                return this.side3Texture;
            }
        }
        if (j == 1) {
            if (i == 0) {
                return this.frontTexture;
            }
            if (i == 1) {
                return this.backTexture;
            }
            if (i == 2) {
                return this.side1Texture;
            }
            if (i == 3) {
                return this.side1Texture;
            }
            if (i == 4) {
                return this.side1Texture;
            }
            if (i == 5) {
                return this.side1Texture;
            }
        }
        if (j == 2) {
            if (i == 0) {
                return this.side1Texture;
            }
            if (i == 1) {
                return this.side1Texture;
            }
            if (i == 2) {
                return this.backTexture;
            }
            if (i == 3) {
                return this.frontTexture;
            }
            if (i == 4) {
                return this.side4Texture;
            }
            if (i == 5) {
                return this.side2Texture;
            }
        }
        if (j == 3) {
            if (i == 0) {
                return this.side3Texture;
            }
            if (i == 1) {
                return this.side3Texture;
            }
            if (i == 2) {
                return this.frontTexture;
            }
            if (i == 3) {
                return this.backTexture;
            }
            if (i == 4) {
                return this.side2Texture;
            }
            if (i == 5) {
                return this.side4Texture;
            }
        }
        if (j == 4) {
            if (i == 0) {
                return this.side4Texture;
            }
            if (i == 1) {
                return this.side4Texture;
            }
            if (i == 2) {
                return this.side2Texture;
            }
            if (i == 3) {
                return this.side4Texture;
            }
            if (i == 4) {
                return this.backTexture;
            }
            if (i == 5) {
                return this.frontTexture;
            }
        }
        if (j == 5) {
            if (i == 0) {
                return this.side2Texture;
            }
            if (i == 1) {
                return this.side2Texture;
            }
            if (i == 5) {
                return this.backTexture;
            }
            if (i == 4) {
                return this.frontTexture;
            }
            if (i == 3) {
                return this.side2Texture;
            }
            if (i == 2) {
                return this.side4Texture;
            }
        }
        return this.frontTexture;
    }
}