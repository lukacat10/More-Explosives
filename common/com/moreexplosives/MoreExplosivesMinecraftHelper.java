/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abv
 *  ats
 *  bda
 *  bdf
 *  bed
 *  bee
 *  org.lwjgl.input.Keyboard
 *  ue
 */
package com.moreexplosives;

import org.lwjgl.input.Keyboard;

public class MoreExplosivesMinecraftHelper {
    public static abv getWorld() {
        return ats.w().f;
    }

    public static ue getPlayer() {
        return ats.w().h;
    }

    public static void addEffect(bed fx) {
        ats.w().k.a(fx);
    }

    public static boolean isKeyDown(int key) {
        return Keyboard.isKeyDown((int)key);
    }
}