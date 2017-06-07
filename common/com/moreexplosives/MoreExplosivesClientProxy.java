/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abv
 *  asm
 *  bgj
 *  com.moreexplosives.MoreExplosives
 *  com.moreexplosives.MoreExplosivesCommonProxy
 *  com.moreexplosives.MoreExplosivesMinecraftHelper
 *  com.moreexplosives.MoreExplosivesRenderHelper
 *  com.moreexplosives.entity.EntityAntiBallisticMissile
 *  com.moreexplosives.entity.EntityBomb
 *  com.moreexplosives.entity.EntityBundledC4Primed
 *  com.moreexplosives.entity.EntityC4ExplosivePrimed
 *  com.moreexplosives.entity.EntityFlare
 *  com.moreexplosives.entity.EntityLavaExplosivePrimed
 *  com.moreexplosives.entity.EntityMissile
 *  com.moreexplosives.entity.EntityNuclearExplosivePrimed
 *  com.moreexplosives.entity.EntitySmokeGrenade
 *  com.moreexplosives.entity.EntityTunnelExplosivePrimed
 *  com.moreexplosives.entity.EntityWaterBomb
 *  com.moreexplosives.gui.GuiBlastingCap
 *  com.moreexplosives.gui.GuiTimeBomb
 *  com.moreexplosives.render.RenderAntiBallisticMissile
 *  com.moreexplosives.render.RenderBomb
 *  com.moreexplosives.render.RenderBundledC4Primed
 *  com.moreexplosives.render.RenderC4Primed
 *  com.moreexplosives.render.RenderFlare
 *  com.moreexplosives.render.RenderLavaBombPrimed
 *  com.moreexplosives.render.RenderMissile
 *  com.moreexplosives.render.RenderNuclearExplosivePrimed
 *  com.moreexplosives.render.RenderSmokeGrenade
 *  com.moreexplosives.render.RenderTunnelExplosivePrimed
 *  com.moreexplosives.render.RenderWaterBomb
 *  com.moreexplosives.tileentity.TileEntityBlastingCap
 *  com.moreexplosives.tileentity.TileEntityTimeBomb
 *  cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler
 *  cpw.mods.fml.client.registry.RenderingRegistry
 *  cpw.mods.fml.common.ITickHandler
 *  cpw.mods.fml.common.TickType
 *  cpw.mods.fml.common.registry.TickRegistry
 *  cpw.mods.fml.relauncher.Side
 *  ue
 */
package com.moreexplosives;

import com.moreexplosives.MoreExplosives;
import com.moreexplosives.MoreExplosivesCommonProxy;
import com.moreexplosives.MoreExplosivesMinecraftHelper;
import com.moreexplosives.MoreExplosivesRenderHelper;
import com.moreexplosives.entity.EntityAntiBallisticMissile;
import com.moreexplosives.entity.EntityBomb;
import com.moreexplosives.entity.EntityBundledC4Primed;
import com.moreexplosives.entity.EntityC4ExplosivePrimed;
import com.moreexplosives.entity.EntityFlare;
import com.moreexplosives.entity.EntityLavaExplosivePrimed;
import com.moreexplosives.entity.EntityMissile;
import com.moreexplosives.entity.EntityNuclearExplosivePrimed;
import com.moreexplosives.entity.EntitySmokeGrenade;
import com.moreexplosives.entity.EntityTunnelExplosivePrimed;
import com.moreexplosives.entity.EntityWaterBomb;
import com.moreexplosives.gui.GuiBlastingCap;
import com.moreexplosives.gui.GuiTimeBomb;
import com.moreexplosives.render.RenderAntiBallisticMissile;
import com.moreexplosives.render.RenderBomb;
import com.moreexplosives.render.RenderBundledC4Primed;
import com.moreexplosives.render.RenderC4Primed;
import com.moreexplosives.render.RenderFlare;
import com.moreexplosives.render.RenderLavaBombPrimed;
import com.moreexplosives.render.RenderMissile;
import com.moreexplosives.render.RenderNuclearExplosivePrimed;
import com.moreexplosives.render.RenderSmokeGrenade;
import com.moreexplosives.render.RenderTunnelExplosivePrimed;
import com.moreexplosives.render.RenderWaterBomb;
import com.moreexplosives.tileentity.TileEntityBlastingCap;
import com.moreexplosives.tileentity.TileEntityTimeBomb;
import net.minecraftforge.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.ITickHandler;
import net.minecraftforge.fml.common.TickType;
import net.minecraftforge.fml.common.registry.TickRegistry;
import net.minecraftforge.fml.relauncher.Side;
import java.util.EnumSet;

public class MoreExplosivesClientProxy
extends MoreExplosivesCommonProxy
implements ITickHandler {
    public void registerRenderInformation() {
        TickRegistry.registerTickHandler((ITickHandler)this, (Side)Side.CLIENT);
        new MoreExplosivesMinecraftHelper();
        MoreExplosives.renderID = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)new MoreExplosivesRenderHelper());
        RenderingRegistry.registerEntityRenderingHandler(EntityC4ExplosivePrimed.class, (bgj)new RenderC4Primed());
        RenderingRegistry.registerEntityRenderingHandler(EntityNuclearExplosivePrimed.class, (bgj)new RenderNuclearExplosivePrimed());
        RenderingRegistry.registerEntityRenderingHandler(EntityLavaExplosivePrimed.class, (bgj)new RenderLavaBombPrimed());
        RenderingRegistry.registerEntityRenderingHandler(EntityBundledC4Primed.class, (bgj)new RenderBundledC4Primed());
        RenderingRegistry.registerEntityRenderingHandler(EntityTunnelExplosivePrimed.class, (bgj)new RenderTunnelExplosivePrimed());
        RenderingRegistry.registerEntityRenderingHandler(EntityBomb.class, (bgj)new RenderBomb());
        RenderingRegistry.registerEntityRenderingHandler(EntityWaterBomb.class, (bgj)new RenderWaterBomb());
        RenderingRegistry.registerEntityRenderingHandler(EntitySmokeGrenade.class, (bgj)new RenderSmokeGrenade());
        RenderingRegistry.registerEntityRenderingHandler(EntityFlare.class, (bgj)new RenderFlare());
        RenderingRegistry.registerEntityRenderingHandler(EntityMissile.class, (bgj)new RenderMissile());
        RenderingRegistry.registerEntityRenderingHandler(EntityAntiBallisticMissile.class, (bgj)new RenderAntiBallisticMissile());
    }

    public Object getClientGuiElement(int ID, ue player, abv world, int x, int y, int z) {
        asm tileEntity = world.r(x, y, z);
        if (tileEntity == null) {
            return null;
        }
        if (ID == 0) {
            return new GuiBlastingCap(player, (TileEntityBlastingCap)tileEntity);
        }
        if (ID == 1) {
            return new GuiTimeBomb(player, (TileEntityTimeBomb)tileEntity);
        }
        return null;
    }

    public /* varargs */ void tickStart(EnumSet<TickType> type, Object ... tickData) {
        MoreExplosives.instance.onTickInGame();
    }

    public /* varargs */ void tickEnd(EnumSet<TickType> type, Object ... tickData) {
    }

    public EnumSet<TickType> ticks() {
        return EnumSet.of(TickType.CLIENT);
    }

    public String getLabel() {
        return null;
    }
}