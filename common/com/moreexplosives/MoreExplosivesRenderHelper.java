/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  ace
 *  aqw
 *  ats
 *  bfn
 *  bfo
 *  bij
 *  com.moreexplosives.MoreExplosives
 *  cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler
 *  mr
 *  org.lwjgl.opengl.GL11
 */
package com.moreexplosives;

import com.moreexplosives.ICableBlock;
import com.moreexplosives.IHideableBlock;
import com.moreexplosives.MoreExplosives;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import org.lwjgl.opengl.GL11;

public class MoreExplosivesRenderHelper
implements ISimpleBlockRenderingHandler {
    public void renderInventoryBlock(aqw block, int i, int modelID, bfo renderblocks) {
        if (modelID == MoreExplosives.renderID) {
            bij renderengine = ats.w().N;
            bfn tessellator = bfn.a;
            block.g();
            if (block instanceof ICableBlock) {
                renderblocks.a(0.125, 0.125, 0.125, 0.875, 0.875, 0.875);
            }
            GL11.glTranslatef((float)-0.5f, (float)-0.5f, (float)-0.5f);
            tessellator.b();
            tessellator.b(0.0f, -1.0f, 0.0f);
            renderblocks.a(block, 0.0, 0.0, 0.0, block.a(0, i));
            tessellator.a();
            tessellator.b();
            tessellator.b(0.0f, 1.0f, 0.0f);
            renderblocks.b(block, 0.0, 0.0, 0.0, block.a(1, i));
            tessellator.a();
            tessellator.b();
            tessellator.b(0.0f, 0.0f, -1.0f);
            renderblocks.c(block, 0.0, 0.0, 0.0, block.a(2, i));
            tessellator.a();
            tessellator.b();
            tessellator.b(0.0f, 0.0f, 1.0f);
            renderblocks.d(block, 0.0, 0.0, 0.0, block.a(3, i));
            tessellator.a();
            tessellator.b();
            tessellator.b(-1.0f, 0.0f, 0.0f);
            renderblocks.e(block, 0.0, 0.0, 0.0, block.a(4, i));
            tessellator.a();
            tessellator.b();
            tessellator.b(1.0f, 0.0f, 0.0f);
            renderblocks.f(block, 0.0, 0.0, 0.0, block.a(5, i));
            tessellator.a();
            GL11.glTranslatef((float)0.5f, (float)0.5f, (float)0.5f);
        }
    }

    public boolean renderWorldBlock(ace iblockaccess, int i, int j, int k, aqw block, int modelId, bfo renderblocks) {
        if (modelId != MoreExplosives.renderID) {
            return false;
        }
        if (block instanceof IHideableBlock && !((IHideableBlock)block).shouldRender(iblockaccess, i, j, k)) {
            return false;
        }
        bij renderengine = ats.w().N;
        bfn.a.a();
        bfn.a.b();
        if (block instanceof ICableBlock) {
            ICableBlock _block = (ICableBlock)block;
            _block.preWorldRender();
            renderblocks.a(0.25, 0.25, 0.25, 0.75, 0.75, 0.75);
            renderblocks.p(block, i, j, k);
            if (_block.shouldConnectTo(iblockaccess, i - 1, j, k)) {
                renderblocks.a(0.0, 0.25, 0.25, 0.25, 0.75, 0.75);
                renderblocks.p(block, i, j, k);
            }
            if (_block.shouldConnectTo(iblockaccess, i + 1, j, k)) {
                renderblocks.a(0.75, 0.25, 0.25, 1.0, 0.75, 0.75);
                renderblocks.p(block, i, j, k);
            }
            if (_block.shouldConnectTo(iblockaccess, i, j - 1, k)) {
                renderblocks.a(0.25, 0.0, 0.25, 0.75, 0.25, 0.75);
                renderblocks.p(block, i, j, k);
            }
            if (_block.shouldConnectTo(iblockaccess, i, j + 1, k)) {
                renderblocks.a(0.25, 0.75, 0.25, 0.75, 1.0, 0.75);
                renderblocks.p(block, i, j, k);
            }
            if (_block.shouldConnectTo(iblockaccess, i, j, k - 1)) {
                renderblocks.a(0.25, 0.25, 0.0, 0.75, 0.75, 0.25);
                renderblocks.p(block, i, j, k);
            }
            if (_block.shouldConnectTo(iblockaccess, i, j, k + 1)) {
                renderblocks.a(0.25, 0.25, 0.75, 0.75, 0.75, 1.0);
                renderblocks.p(block, i, j, k);
            }
            renderblocks.a(0.0, 0.0, 0.0, 1.0, 1.0, 1.0);
        } else {
            renderblocks.p(block, i, j, k);
        }
        bfn.a.a();
        bfn.a.b();
        return true;
    }

    public boolean shouldRender3DInInventory() {
        return true;
    }

    public int getRenderId() {
        return MoreExplosives.renderID;
    }
}