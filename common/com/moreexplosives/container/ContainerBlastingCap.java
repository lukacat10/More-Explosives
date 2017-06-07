/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  com.moreexplosives.tileentity.TileEntityBlastingCap
 *  ue
 *  ux
 */
package com.moreexplosives.container;

import com.moreexplosives.tileentity.TileEntityBlastingCap;

public class ContainerBlastingCap
extends ux {
    public TileEntityBlastingCap tileentityblastingcap;

    public ContainerBlastingCap(TileEntityBlastingCap tileentityblastingcap) {
        this.tileentityblastingcap = tileentityblastingcap;
    }

    public boolean a(ue entityplayer) {
        return this.tileentityblastingcap.isUseableByPlayer(entityplayer);
    }
}