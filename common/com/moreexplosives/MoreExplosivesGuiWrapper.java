/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abv
 *  asx
 *  ats
 *  awb
 *  com.moreexplosives.MoreExplosivesMinecraftHelper
 *  com.moreexplosives.gui.GuiDetonator
 *  com.moreexplosives.gui.GuiGuide
 *  com.moreexplosives.gui.GuiRadar
 *  cpw.mods.fml.client.FMLClientHandler
 *  ue
 */
package com.moreexplosives;

import com.moreexplosives.MoreExplosivesMinecraftHelper;
import com.moreexplosives.gui.GuiDetonator;
import com.moreexplosives.gui.GuiGuide;
import com.moreexplosives.gui.GuiRadar;
import cpw.mods.fml.client.FMLClientHandler;

public class MoreExplosivesGuiWrapper {
    public void displayGui(ue player, Object gui) {
        FMLClientHandler.instance().displayGuiScreen(player, (awb)gui);
    }

    public void displayGuiByID(ue player, int ID) {
        GuiDetonator gui = null;
        if (ID == 0) {
            gui = new GuiDetonator(player.q, ats.w(), player);
        }
        if (ID == 1) {
            gui = new GuiGuide(ats.w());
        }
        if (ID == 2) {
            if (MoreExplosivesMinecraftHelper.isKeyDown((int)42) || MoreExplosivesMinecraftHelper.isKeyDown((int)54)) {
                asx pos = player.a(100000.0, 1.0f);
                if (pos == null) {
                    player.a("Target out of range!");
                } else {
                    player.a("X: " + pos.b + " Z: " + pos.d);
                }
            } else {
                gui = new GuiRadar(ats.w());
            }
        }
        if (gui != null) {
            this.displayGui(player, (Object)gui);
        }
    }

    public boolean isGuiOpen(Class<? extends awb> guiClass) {
        if (ats.w().n == null) {
            return false;
        }
        return ats.w().n.getClass().equals(guiClass);
    }

    public awb getCurrentGui() {
        return ats.w().n;
    }

    public void closeGui() {
        ats.w().a(null);
        ats.w().g();
    }
}