/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abq
 *  abv
 *  ace
 *  ajz
 *  amt
 *  aof
 *  aqw
 *  ara
 *  asm
 *  com.moreexplosives.ICableBlock
 *  com.moreexplosives.MoreExplosives
 *  com.moreexplosives.tileentity.TileEntityFuse
 *  cpw.mods.fml.relauncher.Side
 *  cpw.mods.fml.relauncher.SideOnly
 *  mr
 *  ms
 *  wv
 */
package com.moreexplosives.block;

import com.moreexplosives.ICableBlock;
import com.moreexplosives.MoreExplosives;
import com.moreexplosives.tileentity.TileEntityFuse;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFuse
extends amt
implements ICableBlock {
    private mr tex;

    public BlockFuse(int i, int j) {
        super(i, ajz.u);
        this.a(n);
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
        if (ID == MoreExplosives.tunnelExpBlock.cF) {
            return true;
        }
        if (ID == MoreExplosives.detCordBlock.cF) {
            return true;
        }
        return false;
    }

    public void a(abv world, int i, int j, int k, abq e) {
        super.a(world, i, j, k, e);
        this.ignite(world, i, j, k);
    }

    public void a(abv world, int i, int j, int k) {
        super.a(world, i, j, k);
        if (world.C(i, j, k)) {
            this.ignite(world, i, j, k);
            return;
        }
        if (world.a(i + 1, j, k) == aqw.aw.cF) {
            this.ignite(world, i, j, k);
        }
        if (world.a(i - 1, j, k) == aqw.aw.cF) {
            this.ignite(world, i, j, k);
        }
        if (world.a(i, j + 1, k) == aqw.aw.cF) {
            this.ignite(world, i, j, k);
        }
        if (world.a(i, j - 1, k) == aqw.aw.cF) {
            this.ignite(world, i, j, k);
        }
        if (world.a(i, j, k + 1) == aqw.aw.cF) {
            this.ignite(world, i, j, k);
        }
        if (world.a(i, j, k - 1) == aqw.aw.cF) {
            this.ignite(world, i, j, k);
        }
    }

    public void a(abv world, int i, int j, int k, int l) {
        if (world.C(i, j, k)) {
            this.ignite(world, i, j, k);
        }
        if (world.a(i + 1, j, k) == aqw.aw.cF) {
            this.ignite(world, i, j, k);
        }
        if (world.a(i - 1, j, k) == aqw.aw.cF) {
            this.ignite(world, i, j, k);
        }
        if (world.a(i, j + 1, k) == aqw.aw.cF) {
            this.ignite(world, i, j, k);
        }
        if (world.a(i, j - 1, k) == aqw.aw.cF) {
            this.ignite(world, i, j, k);
        }
        if (world.a(i, j, k + 1) == aqw.aw.cF) {
            this.ignite(world, i, j, k);
        }
        if (world.a(i, j, k - 1) == aqw.aw.cF) {
            this.ignite(world, i, j, k);
        }
    }

    private void ignite(abv world, int posX, int posY, int posZ) {
        if (world.I) {
            return;
        }
        asm tileentity = world.r(posX, posY, posZ);
        if (tileentity != null && tileentity instanceof TileEntityFuse) {
            ((TileEntityFuse)tileentity).setBurning();
        } else {
            this.tryIgnite(world, posX, posY, posZ + 1);
            this.tryIgnite(world, posX, posY, posZ - 1);
            this.tryIgnite(world, posX, posY + 1, posZ);
            this.tryIgnite(world, posX, posY - 1, posZ);
            this.tryIgnite(world, posX + 1, posY, posZ);
            this.tryIgnite(world, posX - 1, posY, posZ);
        }
    }

    public void tryIgnite(abv world, int x, int y, int z) {
        if (!world.I) {
            return;
        }
        if (world.a(x, y, z) == MoreExplosives.fuseBlock.cF) {
            ((TileEntityFuse)world.r(x, y, z)).setBurning();
        }
    }

    public void preWorldRender() {
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

    public asm b(abv world) {
        return new TileEntityFuse(world);
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