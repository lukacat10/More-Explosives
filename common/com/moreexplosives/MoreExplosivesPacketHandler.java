/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abq
 *  abv
 *  asm
 *  awb
 *  cl
 *  com.google.common.io.ByteArrayDataInput
 *  com.google.common.io.ByteStreams
 *  com.moreexplosives.MoreExplosives
 *  com.moreexplosives.MoreExplosivesSuperExplosion
 *  com.moreexplosives.entity.EntityMissile
 *  com.moreexplosives.gui.GuiMissile
 *  com.moreexplosives.tileentity.TileEntityBlastingCap
 *  com.moreexplosives.tileentity.TileEntityFuse
 *  com.moreexplosives.tileentity.TileEntityTimeBomb
 *  cpw.mods.fml.common.network.IPacketHandler
 *  cpw.mods.fml.common.network.PacketDispatcher
 *  cpw.mods.fml.common.network.Player
 *  dz
 *  ex
 *  ju
 *  jz
 *  nm
 *  ue
 */
package com.moreexplosives;

import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import com.moreexplosives.MoreExplosives;
import com.moreexplosives.MoreExplosivesGuiWrapper;
import com.moreexplosives.MoreExplosivesMinecraftHelper;
import com.moreexplosives.MoreExplosivesSuperExplosion;
import com.moreexplosives.entity.EntityMissile;
import com.moreexplosives.gui.GuiMissile;
import com.moreexplosives.tileentity.TileEntityBlastingCap;
import com.moreexplosives.tileentity.TileEntityFuse;
import com.moreexplosives.tileentity.TileEntityTimeBomb;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.List;

public class MoreExplosivesPacketHandler
implements IPacketHandler {
    public void onPacketData(cl manager, dz packet, Player player) {
        try {
            ByteArrayDataInput data = ByteStreams.newDataInput((byte[])packet.c);
            byte ID = data.readByte();
            if (ID == 0) {
                int frequency = data.readInt();
                MoreExplosives.detonateAllBlastingCaps((abv)((ju)player).q, (int)frequency);
            } else if (ID == 1) {
                int x = data.readInt();
                int y = data.readInt();
                int z = data.readInt();
                int frequency = Math.max(Math.min(data.readInt(), 9999999), 0);
                asm tileEntity = ((ju)player).q.r(x, y, z);
                if (!(tileEntity instanceof TileEntityBlastingCap)) {
                    return;
                }
                ((TileEntityBlastingCap)tileEntity).frequency = frequency;
                PacketDispatcher.sendPacketToAllAround((double)x, (double)y, (double)z, (double)10.0, (int)((ju)player).ar, (ex)MoreExplosivesPacketHandler.makePacket(2, x, y, z, ((TileEntityBlastingCap)tileEntity).frequency));
            } else if (ID == 2) {
                int x = data.readInt();
                int y = data.readInt();
                int z = data.readInt();
                int frequency = Math.max(Math.min(data.readInt(), 9999999), 0);
                asm tileEntity = MoreExplosivesMinecraftHelper.getWorld().r(x, y, z);
                if (!(tileEntity instanceof TileEntityBlastingCap)) {
                    return;
                }
                ((TileEntityBlastingCap)tileEntity).frequency = frequency;
            } else if (ID == 3) {
                int x = data.readInt();
                int y = data.readInt();
                int z = data.readInt();
                double delay = data.readDouble();
                asm tileEntity = ((ju)player).q.r(x, y, z);
                if (!(tileEntity instanceof TileEntityTimeBomb)) {
                    return;
                }
                TileEntityTimeBomb tileEntityTimeBomb = (TileEntityTimeBomb)tileEntity;
                if (tileEntityTimeBomb.timing || delay < 0.0 || delay > 30.0) {
                    return;
                }
                tileEntityTimeBomb.setIsTiming(delay);
                PacketDispatcher.sendPacketToAllAround((double)x, (double)y, (double)z, (double)10.0, (int)((ju)player).ar, (ex)MoreExplosivesPacketHandler.makePacket(4, x, y, z, ((TileEntityTimeBomb)tileEntity).delay, ((TileEntityTimeBomb)tileEntity).fuse, ((TileEntityTimeBomb)tileEntity).timing));
            } else if (ID == 4) {
                int x = data.readInt();
                int y = data.readInt();
                int z = data.readInt();
                int delay = data.readInt();
                int fuse = data.readInt();
                boolean timing = data.readBoolean();
                asm tileEntity = MoreExplosivesMinecraftHelper.getWorld().r(x, y, z);
                if (!(tileEntity instanceof TileEntityTimeBomb)) {
                    return;
                }
                TileEntityTimeBomb tileEntityTimeBomb = (TileEntityTimeBomb)tileEntity;
                tileEntityTimeBomb.fuse = fuse;
                tileEntityTimeBomb.delay = delay;
                tileEntityTimeBomb.timing = timing;
            } else if (ID == 5) {
                int entityID = data.readInt();
                int x = data.readInt();
                int z = data.readInt();
                nm entity = this.getEntityByID(entityID, ((ju)player).q);
                if (entity == null || !(entity instanceof EntityMissile)) {
                    return;
                }
                EntityMissile missile = (EntityMissile)entity;
                if (missile.flying) {
                    return;
                }
                missile.launch(x, z);
                for (ju aPlayer : ((ju)player).q.h) {
                    aPlayer.a.b((ex)MoreExplosivesPacketHandler.makePacket(6, entityID));
                }
            } else if (ID == 6) {
                int entityID = data.readInt();
                nm entity = this.getEntityByID(entityID, MoreExplosivesMinecraftHelper.getWorld());
                if (entity == null) {
                    return;
                }
                ((EntityMissile)entity).flying = true;
                if (!new MoreExplosivesGuiWrapper().isGuiOpen(GuiMissile.class)) {
                    return;
                }
                if (((GuiMissile)new MoreExplosivesGuiWrapper().getCurrentGui()).missile.k == entityID) {
                    new MoreExplosivesGuiWrapper().closeGui();
                }
            } else if (ID == 7) {
                int x = data.readInt();
                int y = data.readInt();
                int z = data.readInt();
                abq explosion = new abq(MoreExplosivesMinecraftHelper.getWorld(), null, (double)x, (double)y, (double)z, 0.0f);
                explosion.a(true);
            } else if (ID == 8) {
                int x = data.readInt();
                int y = data.readInt();
                int z = data.readInt();
                long seed = data.readLong();
                float size = data.readFloat();
                abv world = MoreExplosivesMinecraftHelper.getWorld();
                abq explosion = new abq(world, null, (double)x, (double)y, (double)z, 0.0f);
                explosion.a(true);
                new MoreExplosivesSuperExplosion().explode(world, (double)size, (double)size, (double)size, x, y, z, seed);
            } else if (ID == 9) {
                int x = data.readInt();
                int y = data.readInt();
                int z = data.readInt();
                ((TileEntityFuse)MoreExplosivesMinecraftHelper.getWorld().r((int)x, (int)y, (int)z)).isBurning = true;
            } else if (ID == 10) {
                int guiID = data.readInt();
                new MoreExplosivesGuiWrapper().displayGuiByID((ue)player, guiID);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public nm getEntityByID(int ID, abv world) {
        List entities = world.e;
        for (nm entity : entities) {
            if (entity.k != ID) continue;
            return entity;
        }
        return null;
    }

    public static /* varargs */ dz makePacket(int ID, Object ... data) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);
            dos.writeByte(ID);
            for (Object obj : data) {
                if (obj instanceof Integer) {
                    dos.writeInt((Integer)obj);
                    continue;
                }
                if (obj instanceof Float) {
                    dos.writeFloat(((Float)obj).floatValue());
                    continue;
                }
                if (obj instanceof Double) {
                    dos.writeDouble((Double)obj);
                    continue;
                }
                if (obj instanceof Byte) {
                    dos.writeByte(((Byte)obj).byteValue());
                    continue;
                }
                if (obj instanceof String) {
                    dos.writeUTF((String)obj);
                    continue;
                }
                if (obj instanceof Boolean) {
                    dos.writeBoolean((Boolean)obj);
                    continue;
                }
                if (!(obj instanceof Long)) continue;
                dos.writeLong((Long)obj);
            }
            return new dz("MoreExplosives", baos.toByteArray());
        }
        catch (Exception exception) {
            return null;
        }
    }
}