/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  com.moreexplosives.tileentity.TileEntityTimeBomb
 *  ue
 *  ux
 */
package com.moreexplosives.container;

import com.moreexplosives.tileentity.TileEntityTimeBomb;

public class ContainerTimeBomb
extends ux {
    private TileEntityTimeBomb tileentitytimebomb;

    public ContainerTimeBomb(TileEntityTimeBomb tileEntity) {
        this.tileentitytimebomb = tileEntity;
    }

    public boolean a(ue entityplayer) {
        return this.tileentitytimebomb.isUseableByPlayer(entityplayer);
    }
}