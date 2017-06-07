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
 *  com.moreexplosives.tileentity.TileEntityBlastingCap
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  ex
 *  ju
 *  jz
 *  mr
 *  ms
 *  nm
 *  oe
 *  of
 *  ue
 *  wv
 *  yb
 *  yd
 */
package com.moreexplosives.block;

import com.moreexplosives.MoreExplosives;
import com.moreexplosives.MoreExplosivesPacketHandler;
import com.moreexplosives.item.ItemDefuser;
import com.moreexplosives.tileentity.TileEntityBlastingCap;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockBlastingCap
extends amt {
    private mr tex;

    public BlockBlastingCap(int i, int j) {
        super(i, ajz.f);
        this.a(0.125f, 0.125f, 0.125f, 0.875f, 0.875f, 0.875f);
        this.a(wv.g);
        this.a(wv.m);
        this.a(wv.d);
    }

    public BlockBlastingCap(int i, int j, ajz material) {
        super(i, material);
    }

    public void a(abv world, int i, int j, int k, abq e) {
        if (world.I) {
            return;
        }
        super.a(world, i, j, k, e);
        world.a(null, (double)i, (double)j, (double)k, 4.0f, true);
    }

    public boolean a(abv world, int i, int j, int k, ue entityplayer, int c, float f, float f2, float f3) {
        if (world.I || !(entityplayer instanceof ju)) {
            return true;
        }
        if (entityplayer.bx() != null && entityplayer.bx().d == MoreExplosives.itemDefuser.cv) {
            ItemDefuser.onItemUsed((yd)entityplayer.bx(), (oe)((of)entityplayer));
            this.c(world, i, j, k, 0, 0);
            world.c(i, j, k, 0);
            return true;
        }
        asm tileEntity = world.r(i, j, k);
        if (!(tileEntity instanceof TileEntityBlastingCap)) {
            return false;
        }
        ((ju)entityplayer).a.b((ex)MoreExplosivesPacketHandler.makePacket((int)2, (Object[])new Object[]{i, j, k, ((TileEntityBlastingCap)tileEntity).frequency}));
        entityplayer.openGui((Object)MoreExplosives.instance, 0, world, i, j, k);
        return true;
    }

    public boolean c() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public asm b(abv world) {
        return new TileEntityBlastingCap(world);
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