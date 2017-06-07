/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abq
 *  abv
 *  ace
 *  ajz
 *  amt
 *  aqw
 *  asm
 *  com.moreexplosives.MoreExplosives
 *  com.moreexplosives.MoreExplosivesPacketHandler
 *  com.moreexplosives.item.ItemDefuser
 *  com.moreexplosives.tileentity.TileEntityTimeBomb
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  ex
 *  ju
 *  jz
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
import com.moreexplosives.MoreExplosivesPacketHandler;
import com.moreexplosives.item.ItemDefuser;
import com.moreexplosives.tileentity.TileEntityTimeBomb;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTimeBomb
extends amt {
    public mr tex1;
    public mr tex2;
    public mr tex3;

    public BlockTimeBomb(int i, int j) {
        super(i, ajz.e);
        this.a(wv.g);
        this.a(wv.m);
        this.a(wv.d);
    }

    public boolean a(abv world, int i, int j, int k, ue entityplayer, int ix, float f, float f1, float f2) {
        if (world.I || !(entityplayer instanceof ue)) {
            return true;
        }
        if (entityplayer.bx() != null && entityplayer.bx().d == MoreExplosives.itemDefuser.cv) {
            ItemDefuser.onItemUsed((yd)entityplayer.bx(), (oe)entityplayer);
            this.c(world, i, j, k, 0, 0);
            world.c(i, j, k, 0);
            return true;
        }
        asm tileEntity = world.r(i, j, k);
        if (!(tileEntity instanceof TileEntityTimeBomb)) {
            return false;
        }
        ((ju)entityplayer).a.b((ex)MoreExplosivesPacketHandler.makePacket((int)4, (Object[])new Object[]{i, j, k, ((TileEntityTimeBomb)tileEntity).delay, ((TileEntityTimeBomb)tileEntity).fuse, ((TileEntityTimeBomb)tileEntity).timing}));
        entityplayer.openGui((Object)MoreExplosives.instance, 1, world, i, j, k);
        return true;
    }

    public void a(abv world, int i, int j, int k, abq e) {
        super.a(world, i, j, k, e);
        if (!world.I) {
            MoreExplosives.createSuperExplosion((abv)world, (nm)null, (int)i, (int)j, (int)k, (float)15.0f);
        }
    }

    public asm b(abv var1) {
        return new TileEntityTimeBomb();
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