/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  aqw
 *  com.moreexplosives.MoreExplosives
 *  cpw.mods.fml.common.registry.GameRegistry
 *  yb
 *  yd
 */
package com.moreexplosives;

import com.moreexplosives.MoreExplosives;
import cpw.mods.fml.common.registry.GameRegistry;

public class MoreExplosivesRecipes {
    public void load() {
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.detCordBlock, 64), (Object[])new Object[]{"PPP", "TTT", "PPP", Character.valueOf('P'), MoreExplosives.itemPlastic, Character.valueOf('T'), aqw.ar});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.landMineBlock, 6), (Object[])new Object[]{"PPP", "TTT", Character.valueOf('P'), aqw.aP, Character.valueOf('T'), aqw.ar});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.c4Block, 1), (Object[])new Object[]{" P ", "PTP", " P ", Character.valueOf('P'), MoreExplosives.itemPlastic, Character.valueOf('T'), aqw.ar});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.nucExpBlock, 1), (Object[])new Object[]{"UTU", "TUT", "UTU", Character.valueOf('T'), aqw.ar, Character.valueOf('U'), MoreExplosives.itemUranium});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.timeBombBlock, 1), (Object[])new Object[]{"RCR", "CCC", "RCR", Character.valueOf('R'), yb.bd, Character.valueOf('C'), MoreExplosives.c4Block});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.bundledC4Block, 1), (Object[])new Object[]{"CCC", "CSC", "CCC", Character.valueOf('C'), MoreExplosives.c4Block, Character.valueOf('S'), yb.M});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.lavaBombBlock, 1), (Object[])new Object[]{"CNC", "NCN", "CNC", Character.valueOf('C'), MoreExplosives.c4Block, Character.valueOf('N'), aqw.bg});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.tunnelExpBlock, 1), (Object[])new Object[]{"CCC", "SCS", "SSS", Character.valueOf('S'), aqw.y, Character.valueOf('C'), MoreExplosives.c4Block});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.antiPersonnelMineBlock, 1), (Object[])new Object[]{"AAA", "AMA", Character.valueOf('A'), yb.n, Character.valueOf('M'), MoreExplosives.landMineBlock});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.fuseBlock, 32), (Object[])new Object[]{"SSS", "GGG", "SSS", Character.valueOf('S'), yb.M, Character.valueOf('G'), yb.O});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.blastingCapBlock, 4), (Object[])new Object[]{"RIR", "ICI", "RIR", Character.valueOf('R'), yb.aE, Character.valueOf('I'), yb.q, Character.valueOf('C'), MoreExplosives.c4Block});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemOil, 5), (Object[])new Object[]{" C ", "CCC", " C ", Character.valueOf('C'), yb.o});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemPlastic, 8), (Object[])new Object[]{"OSO", "SOS", "OSO", Character.valueOf('O'), MoreExplosives.itemOil, Character.valueOf('S'), yb.aO});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemPlastic, 4), (Object[])new Object[]{"OOO", "OSO", "OOO", Character.valueOf('O'), MoreExplosives.itemOil, Character.valueOf('S'), yb.ba});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemHeavyMatter, 6), (Object[])new Object[]{"OOO", "OOO", "OOO", Character.valueOf('O'), aqw.au});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemRocketFuel, 6), (Object[])new Object[]{"PGP", "GPG", "PGP", Character.valueOf('G'), yb.O, Character.valueOf('P'), MoreExplosives.itemPlastic});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemBomb, 6), (Object[])new Object[]{"III", "ITI", "III", Character.valueOf('I'), yb.q, Character.valueOf('T'), aqw.ar});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemWaterBomb, 6), (Object[])new Object[]{"PPP", "PWP", "PPP", Character.valueOf('P'), yb.aM, Character.valueOf('W'), yb.az});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemWhiteSmokeGrenade, 6), (Object[])new Object[]{"GSG", "SDS", "GSG", Character.valueOf('G'), yb.O, Character.valueOf('S'), yb.ba, Character.valueOf('D'), new yd(yb.aY, 1, 15)});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemBlueSmokeGrenade, 6), (Object[])new Object[]{"GSG", "SDS", "GSG", Character.valueOf('G'), yb.O, Character.valueOf('S'), yb.ba, Character.valueOf('D'), new yd(yb.aY, 1, 4)});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemGreenSmokeGrenade, 6), (Object[])new Object[]{"GSG", "SDS", "GSG", Character.valueOf('G'), yb.O, Character.valueOf('S'), yb.ba, Character.valueOf('D'), new yd(yb.aY, 1, 2)});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemRedSmokeGrenade, 6), (Object[])new Object[]{"GSG", "SDS", "GSG", Character.valueOf('G'), yb.O, Character.valueOf('S'), yb.ba, Character.valueOf('D'), new yd(yb.aY, 1, 1)});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemYellowSmokeGrenade, 6), (Object[])new Object[]{"GSG", "SDS", "GSG", Character.valueOf('G'), yb.O, Character.valueOf('S'), yb.ba, Character.valueOf('D'), new yd(yb.aY, 1, 11)});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemBlackSmokeGrenade, 6), (Object[])new Object[]{"GSG", "SDS", "GSG", Character.valueOf('G'), yb.O, Character.valueOf('S'), yb.ba, Character.valueOf('D'), new yd(yb.aY, 1, 0)});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemFlare, 6), (Object[])new Object[]{"GSG", "SGS", "GSG", Character.valueOf('G'), yb.O, Character.valueOf('S'), yb.aV});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemDefuser, 1), (Object[])new Object[]{"R", "I", "I", Character.valueOf('R'), yb.aE, Character.valueOf('I'), yb.q});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemExplosivesRemote, 1), (Object[])new Object[]{"D", "B", Character.valueOf('D'), MoreExplosives.itemDefuser, Character.valueOf('B'), aqw.aW});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemBazooka, 1), (Object[])new Object[]{"I I", "I I", "IGI", Character.valueOf('I'), yb.q, Character.valueOf('G'), yb.O});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemInstructions, 1), (Object[])new Object[]{" I ", "DBD", " I ", Character.valueOf('I'), new yd(yb.aY, 1, 0), Character.valueOf('D'), new yd(yb.aY, 1, 4), Character.valueOf('B'), yb.aN});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemTNTMissile, 1), (Object[])new Object[]{"ITI", "IRI", "IRI", Character.valueOf('I'), yb.q, Character.valueOf('T'), aqw.ar, Character.valueOf('R'), MoreExplosives.itemRocketFuel});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemLavaMissile, 1), (Object[])new Object[]{"ILI", "IRI", "IRI", Character.valueOf('I'), yb.q, Character.valueOf('L'), MoreExplosives.lavaBombBlock, Character.valueOf('R'), MoreExplosives.itemRocketFuel});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemNucExpMissile, 1), (Object[])new Object[]{"INI", "IRI", "IRI", Character.valueOf('I'), yb.q, Character.valueOf('N'), MoreExplosives.nucExpBlock, Character.valueOf('R'), MoreExplosives.itemRocketFuel});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemFragMissile, 1), (Object[])new Object[]{"ICI", "IRI", "IRI", Character.valueOf('I'), yb.q, Character.valueOf('C'), MoreExplosives.bundledC4Block, Character.valueOf('R'), MoreExplosives.itemRocketFuel});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemRadar, 1), (Object[])new Object[]{"IRI", "RDR", "IRI", Character.valueOf('I'), yb.q, Character.valueOf('R'), yb.aE, Character.valueOf('D'), MoreExplosives.itemExplosivesRemote});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemABM, 1), (Object[])new Object[]{"ITI", "ISI", "IRI", Character.valueOf('I'), yb.q, Character.valueOf('T'), aqw.ar, Character.valueOf('R'), MoreExplosives.itemRocketFuel, Character.valueOf('S'), MoreExplosives.itemRadar});
        GameRegistry.addRecipe((yd)new yd(MoreExplosives.itemMCoctail, 4), (Object[])new Object[]{"OPO", "OGO", "OOO", Character.valueOf('G'), yb.bv, Character.valueOf('O'), MoreExplosives.itemOil, Character.valueOf('P'), yb.aM});
        GameRegistry.addSmelting((int)MoreExplosives.itemHeavyMatter.cv, (yd)new yd(MoreExplosives.itemUranium, 1), (float)0.7f);
    }
}