/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abv
 *  asm
 *  com.moreexplosives.container.ContainerBlastingCap
 *  com.moreexplosives.container.ContainerTimeBomb
 *  com.moreexplosives.tileentity.TileEntityBlastingCap
 *  com.moreexplosives.tileentity.TileEntityTimeBomb
 *  cpw.mods.fml.common.network.IGuiHandler
 *  ue
 */
package com.moreexplosives;

import com.moreexplosives.container.ContainerBlastingCap;
import com.moreexplosives.container.ContainerTimeBomb;
import com.moreexplosives.tileentity.TileEntityBlastingCap;
import com.moreexplosives.tileentity.TileEntityTimeBomb;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class MoreExplosivesCommonProxy
implements net.minecraftforge.fml.common.network.IGuiHandler {
    public void registerRenderInformation() {
    }

    public Object getClientGuiElement(int ID, ue player, abv world, int x, int y, int z) {
        return null;
    }

    public Object getServerGuiElement(int ID, ue player, abv world, int x, int y, int z) {
        asm tileEntity = world.r(x, y, z);
        if (tileEntity == null) {
            return null;
        }
        if (ID == 0 && tileEntity instanceof TileEntityBlastingCap) {
            return new ContainerBlastingCap((TileEntityBlastingCap)tileEntity);
        }
        if (ID == 1 && tileEntity instanceof TileEntityTimeBomb) {
            return new ContainerTimeBomb((TileEntityTimeBomb)tileEntity);
        }
        return null;
    }

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}
}