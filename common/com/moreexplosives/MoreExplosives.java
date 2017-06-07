/*
 * Decompiled with CFR 0_118.
 * 
 * Could not load the following classes:
 *  abv
 *  aqw
 *  asm
 *  com.moreexplosives.MoreExplosivesBetterExplosion
 *  com.moreexplosives.MoreExplosivesCommonProxy
 *  com.moreexplosives.MoreExplosivesNames
 *  com.moreexplosives.MoreExplosivesPacketHandler
 *  com.moreexplosives.MoreExplosivesRecipes
 *  com.moreexplosives.MoreExplosivesSuperExplosion
 *  com.moreexplosives.MoreExplosivesTunnelExplosion
 *  com.moreexplosives.block.BlockAntiPersonnelMine
 *  com.moreexplosives.block.BlockBlastingCap
 *  com.moreexplosives.block.BlockBundledC4
 *  com.moreexplosives.block.BlockC4Exp
 *  com.moreexplosives.block.BlockDetCord
 *  com.moreexplosives.block.BlockFuse
 *  com.moreexplosives.block.BlockLandMine
 *  com.moreexplosives.block.BlockLavaBomb
 *  com.moreexplosives.block.BlockNuclearExplosive
 *  com.moreexplosives.block.BlockTimeBomb
 *  com.moreexplosives.block.BlockTunnelExplosive
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
 *  com.moreexplosives.item.ItemAntiBallisticMissile
 *  com.moreexplosives.item.ItemBazooka
 *  com.moreexplosives.item.ItemBomb
 *  com.moreexplosives.item.ItemDefuser
 *  com.moreexplosives.item.ItemDetonator
 *  com.moreexplosives.item.ItemFlare
 *  com.moreexplosives.item.ItemGuide
 *  com.moreexplosives.item.ItemMissile
 *  com.moreexplosives.item.ItemMolotovCoctail
 *  com.moreexplosives.item.ItemMoreExplosives
 *  com.moreexplosives.item.ItemRadar
 *  com.moreexplosives.item.ItemRocketFuel
 *  com.moreexplosives.item.ItemSmokeGrenade
 *  com.moreexplosives.item.ItemUranium
 *  com.moreexplosives.item.ItemWaterBomb
 *  com.moreexplosives.tileentity.TileEntityBlastingCap
 *  com.moreexplosives.tileentity.TileEntityFuse
 *  com.moreexplosives.tileentity.TileEntityTimeBomb
 *  cpw.mods.fml.common.Mod
 *  cpw.mods.fml.common.Mod$Init
 *  cpw.mods.fml.common.Mod$Instance
 *  cpw.mods.fml.common.SidedProxy
 *  cpw.mods.fml.common.event.FMLInitializationEvent
 *  cpw.mods.fml.common.network.IGuiHandler
 *  cpw.mods.fml.common.network.NetworkMod
 *  cpw.mods.fml.common.network.NetworkRegistry
 *  cpw.mods.fml.common.registry.EntityRegistry
 *  cpw.mods.fml.common.registry.GameRegistry
 *  ex
 *  ju
 *  jz
 *  nm
 *  ue
 *  wv
 *  yb
 */
package com.moreexplosives;

import com.moreexplosives.MoreExplosivesBetterExplosion;
import com.moreexplosives.MoreExplosivesCommonProxy;
import com.moreexplosives.MoreExplosivesNames;
import com.moreexplosives.MoreExplosivesPacketHandler;
import com.moreexplosives.MoreExplosivesRecipes;
import com.moreexplosives.MoreExplosivesSuperExplosion;
import com.moreexplosives.MoreExplosivesTunnelExplosion;
import com.moreexplosives.block.BlockAntiPersonnelMine;
import com.moreexplosives.block.BlockBlastingCap;
import com.moreexplosives.block.BlockBundledC4;
import com.moreexplosives.block.BlockC4Exp;
import com.moreexplosives.block.BlockDetCord;
import com.moreexplosives.block.BlockFuse;
import com.moreexplosives.block.BlockLandMine;
import com.moreexplosives.block.BlockLavaBomb;
import com.moreexplosives.block.BlockNuclearExplosive;
import com.moreexplosives.block.BlockTimeBomb;
import com.moreexplosives.block.BlockTunnelExplosive;
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
import com.moreexplosives.item.ItemAntiBallisticMissile;
import com.moreexplosives.item.ItemBazooka;
import com.moreexplosives.item.ItemBomb;
import com.moreexplosives.item.ItemDefuser;
import com.moreexplosives.item.ItemDetonator;
import com.moreexplosives.item.ItemFlare;
import com.moreexplosives.item.ItemGuide;
import com.moreexplosives.item.ItemMissile;
import com.moreexplosives.item.ItemMolotovCoctail;
import com.moreexplosives.item.ItemMoreExplosives;
import com.moreexplosives.item.ItemRadar;
import com.moreexplosives.item.ItemRocketFuel;
import com.moreexplosives.item.ItemSmokeGrenade;
import com.moreexplosives.item.ItemUranium;
import com.moreexplosives.item.ItemWaterBomb;
import com.moreexplosives.tileentity.TileEntityBlastingCap;
import com.moreexplosives.tileentity.TileEntityFuse;
import com.moreexplosives.tileentity.TileEntityTimeBomb;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import java.util.List;
import java.util.Random;

@Mod(modid="MoreExplosives", name="More Explosives Mod", version="Release 3.7 for Minecraft 1.6.2")
@NetworkMod(channels={"MoreExplosives"}, clientSideRequired=1, serverSideRequired=0, packetHandler=MoreExplosivesPacketHandler.class)
public class MoreExplosives {
    public static final aqw detCordBlock = new BlockDetCord(2400, 0).c(0.0f).b(0.0f).c("detCordBlockMoreExplosives").d("MoreExplosives/textures/blocks/detCord");
    public static final aqw landMineBlock = new BlockLandMine(2401, 0).c(4.0f).b(0.0f).c("landMineBlockMoreExplosives").d("MoreExplosives/textures/blocks/landMine");
    public static final aqw c4Block = new BlockC4Exp(2402, 0).c(0.0f).b(0.0f).c("c4BlockMoreExplosives").d("MoreExplosives/textures/blocks/c4");
    public static final aqw nucExpBlock = new BlockNuclearExplosive(2403, 0).c(0.0f).b(0.0f).c("nucExpBlockMoreExplosives").d("MoreExplosives/textures/blocks/nuclearExplosive");
    public static final aqw timeBombBlock = new BlockTimeBomb(2405, 0).c(400.0f).b(100.0f).c("timeBombBlockMoreExplosives").d("MoreExplosives/textures/blocks/timeBomb");
    public static final aqw bundledC4Block = new BlockBundledC4(2406, 0).c(0.0f).b(0.0f).c("bundledC4BlockMoreExplosives").d("MoreExplosives/textures/blocks/c4Bundled");
    public static final aqw lavaBombBlock = new BlockLavaBomb(2407, 0).c(0.0f).b(0.0f).c("lavaBombBlockMoreExplosives").d("MoreExplosives/textures/blocks/lavaBomb");
    public static final aqw tunnelExpBlock = new BlockTunnelExplosive(2408, 0).c(1.0f).b(250.0f).c("tunnelExpBlockMoreExplosives").d("MoreExplosives/textures/blocks/tunnelExp");
    public static final aqw antiPersonnelMineBlock = new BlockAntiPersonnelMine(2409, 0).c(4.0f).b(0.0f).c("antiPersonnelMineBlockMoreExplosives").d("MoreExplosives/textures/blocks/landMine");
    public static final aqw fuseBlock = new BlockFuse(2410, 0).c(0.0f).b(0.0f).c("fuseBlockMoreExplosives").d("MoreExplosives/textures/blocks/fuse");
    public static final aqw blastingCapBlock = new BlockBlastingCap(2411, 0).c(4.0f).b(0.0f).c("blastingCapBlockMoreExplosives").d("MoreExplosives/textures/blocks/blastingCap");
    public static final aqw[] blocksList = new aqw[]{detCordBlock, landMineBlock, c4Block, nucExpBlock, timeBombBlock, bundledC4Block, lavaBombBlock, tunnelExpBlock, antiPersonnelMineBlock, fuseBlock, blastingCapBlock};
    public static final yb itemOil = new ItemMoreExplosives(2050).b("itemOilMoreExplosives").a(wv.l).d("MoreExplosives/textures/items/itemOil");
    public static final yb itemPlastic = new ItemMoreExplosives(2051).b("itemPlasticMoreExplosives").a(wv.l).d("MoreExplosives/textures/items/itemPlastic");
    public static final yb itemHeavyMatter = new ItemMoreExplosives(2052).b("itemHeavyMatter").a(wv.l).d("MoreExplosives/textures/items/itemHeavyMatter");
    public static final yb itemUranium = new ItemUranium(2053).a(yb.aO).b("itemUraniumMoreExplosives").d("MoreExplosives/textures/items/itemUranium");
    public static final yb itemRocketFuel = new ItemRocketFuel(2054).b("itemRocketFuelMoreExplosives").d("MoreExplosives/textures/items/itemFuel");
    public static final yb itemBomb = new ItemBomb(2055).b("itemBombMoreExplosives").d("MoreExplosives/textures/items/itemBomb");
    public static final yb itemWaterBomb = new ItemWaterBomb(2056).b("itemWaterBombMoreExplosives").d("MoreExplosives/textures/items/itemWaterBomb");
    public static final yb itemWhiteSmokeGrenade = new ItemSmokeGrenade(2057, 0).b("itemWhiteSmokeGrenadeMoreExplosives").d("MoreExplosives/textures/items/itemWhiteSmokeGrenade");
    public static final yb itemBlueSmokeGrenade = new ItemSmokeGrenade(2058, 1).b("itemBlueSmokeGrenadeMoreExplosives").d("MoreExplosives/textures/items/itemBlueSmokeGrenade");
    public static final yb itemGreenSmokeGrenade = new ItemSmokeGrenade(2059, 2).b("itemGreenSmokeGrenadeMoreExplosives").d("MoreExplosives/textures/items/itemGreenSmokeGrenade");
    public static final yb itemRedSmokeGrenade = new ItemSmokeGrenade(2060, 3).b("itemRedSmokeGrenadeMoreExplosives").d("MoreExplosives/textures/items/itemRedSmokeGrenade");
    public static final yb itemYellowSmokeGrenade = new ItemSmokeGrenade(2061, 4).b("itemYellowSmokeGrenadeMoreExplosives").d("MoreExplosives/textures/items/itemYellowSmokeGrenade");
    public static final yb itemBlackSmokeGrenade = new ItemSmokeGrenade(2062, 5).b("itemBlackSmokeGrenadeMoreExplosives").d("MoreExplosives/textures/items/itemBlackSmokeGrenade");
    public static final yb itemFlare = new ItemFlare(2063).b("itemFlareMoreExplosives").d("MoreExplosives/textures/items/itemFlare");
    public static final yb itemDefuser = new ItemDefuser(2065).b("itemDefuserMoreExplosives").d("MoreExplosives/textures/items/itemDefuser");
    public static final yb itemExplosivesRemote = new ItemDetonator(2066).b("itemExplosivesRemoteMoreExplosives").d("MoreExplosives/textures/items/itemExplosivesRemote");
    public static final yb itemBazooka = new ItemBazooka(2067).b("itemBazookaMoreExplosives").d("MoreExplosives/textures/items/itemBazooka");
    public static final yb itemInstructions = new ItemGuide(2070).b("itemInstructionsMoreExplosives").d("MoreExplosives/textures/items/itemInstructionsBook");
    public static final yb itemTNTMissile = new ItemMissile(2073).setMissileType(0).b("itemTNTMissileMoreExplosives").d("MoreExplosives/textures/items/itemTNTMissile");
    public static final yb itemLavaMissile = new ItemMissile(2074).setMissileType(1).b("itemLavaMissileMoreExplosives").d("MoreExplosives/textures/items/itemLavaMissile");
    public static final yb itemNucExpMissile = new ItemMissile(2075).setMissileType(2).b("itemNucExpMissileMoreExplosives").d("MoreExplosives/textures/items/itemNuclearMissile");
    public static final yb itemFragMissile = new ItemMissile(2076).setMissileType(3).b("itemFragMissileMoreExplosives").d("MoreExplosives/textures/items/itemFragMissile");
    public static final yb itemABM = new ItemAntiBallisticMissile(2077).b("itemABMMoreExplosives").d("MoreExplosives/textures/items/itemAntiBallistic");
    public static final yb itemRadar = new ItemRadar(2078).b("itemRadarMoreExplosives").d("MoreExplosives/textures/items/itemRadar");
    public static final yb itemMCoctail = new ItemMolotovCoctail(2079).b("itemMCoctailMoreExplosives").d("MoreExplosives/textures/items/itemMCoctail");
    public static int renderID;
    public static int ticks;
    @Mod.Instance
    public static MoreExplosives instance;
    @SidedProxy(clientSide="com.moreexplosives.MoreExplosivesClientProxy", serverSide="com.moreexplosives.MoreExplosivesCommonProxy")
    public static MoreExplosivesCommonProxy proxy;

    public MoreExplosives() {
        instance = this;
    }

    @Mod.Init
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderInformation();
        NetworkRegistry.instance().registerGuiHandler((Object)this, (IGuiHandler)proxy);
        new MoreExplosivesRecipes().load();
        new MoreExplosivesNames().load();
        for (aqw block : blocksList) {
            GameRegistry.registerBlock((aqw)block);
        }
        EntityRegistry.registerModEntity(EntityC4ExplosivePrimed.class, (String)"MoreExplosivesEntityC4Primed", (int)201, (Object)this, (int)256, (int)1, (boolean)true);
        EntityRegistry.registerModEntity(EntityNuclearExplosivePrimed.class, (String)"MoreExplosivesEntityNucExpPrimed", (int)202, (Object)this, (int)256, (int)1, (boolean)true);
        EntityRegistry.registerModEntity(EntityLavaExplosivePrimed.class, (String)"MoreExplosivesEntityLavaBombPrimed", (int)203, (Object)this, (int)256, (int)1, (boolean)true);
        EntityRegistry.registerModEntity(EntityBundledC4Primed.class, (String)"MoreExplosivesEntityBundledC4Primed", (int)204, (Object)this, (int)256, (int)1, (boolean)true);
        EntityRegistry.registerModEntity(EntityTunnelExplosivePrimed.class, (String)"MoreExplosivesEntityTunnelExpPrimed", (int)205, (Object)this, (int)256, (int)1, (boolean)true);
        EntityRegistry.registerModEntity(EntityBomb.class, (String)"MoreExplosivesEntityBomb", (int)206, (Object)this, (int)256, (int)1, (boolean)true);
        EntityRegistry.registerModEntity(EntityWaterBomb.class, (String)"MoreExplosivesEntityWaterBomb", (int)207, (Object)this, (int)256, (int)1, (boolean)true);
        EntityRegistry.registerModEntity(EntitySmokeGrenade.class, (String)"MoreExplosivesEntitySmokeGrenade", (int)208, (Object)this, (int)256, (int)1, (boolean)true);
        EntityRegistry.registerModEntity(EntityFlare.class, (String)"MoreExplosivesEntityFlare", (int)209, (Object)this, (int)256, (int)1, (boolean)true);
        EntityRegistry.registerModEntity(EntityMissile.class, (String)"MoreExplosivesMissile", (int)211, (Object)this, (int)256, (int)1, (boolean)true);
        EntityRegistry.registerModEntity(EntityAntiBallisticMissile.class, (String)"MoreExplosivesABM", (int)212, (Object)this, (int)256, (int)1, (boolean)true);
        EntityRegistry.registerGlobalEntityID(EntityC4ExplosivePrimed.class, (String)"MoreExplosivesEntityC4Primed", (int)201);
        EntityRegistry.registerGlobalEntityID(EntityNuclearExplosivePrimed.class, (String)"MoreExplosivesEntityNucExpPrimed", (int)202);
        EntityRegistry.registerGlobalEntityID(EntityLavaExplosivePrimed.class, (String)"MoreExplosivesEntityLavaBombPrimed", (int)203);
        EntityRegistry.registerGlobalEntityID(EntityBundledC4Primed.class, (String)"MoreExplosivesEntityBundledC4Primed", (int)204);
        EntityRegistry.registerGlobalEntityID(EntityTunnelExplosivePrimed.class, (String)"MoreExplosivesEntityTunnelExpPrimed", (int)205);
        EntityRegistry.registerGlobalEntityID(EntityBomb.class, (String)"MoreExplosivesEntityBomb", (int)206);
        EntityRegistry.registerGlobalEntityID(EntityWaterBomb.class, (String)"MoreExplosivesEntityWaterBomb", (int)207);
        EntityRegistry.registerGlobalEntityID(EntitySmokeGrenade.class, (String)"MoreExplosivesEntitySmokeGrenade", (int)208);
        EntityRegistry.registerGlobalEntityID(EntityFlare.class, (String)"MoreExplosivesEntityFlare", (int)209);
        EntityRegistry.registerGlobalEntityID(EntityMissile.class, (String)"MoreExplosivesMissile", (int)211);
        EntityRegistry.registerGlobalEntityID(EntityAntiBallisticMissile.class, (String)"MoreExplosivesAMB", (int)212);
        GameRegistry.registerTileEntity(TileEntityTimeBomb.class, (String)"MoreExplosivesTimeBomb");
        GameRegistry.registerTileEntity(TileEntityFuse.class, (String)"MoreExplosivesFuse");
        GameRegistry.registerTileEntity(TileEntityBlastingCap.class, (String)"MoreExplosivesBlastingCap");
    }

    public void onTickInGame() {
        ticks += 10;
        ticks %= 3000;
    }

    public static MoreExplosives getInstance() {
        return instance;
    }

    public static void createBetterExplosion(abv worldObj, nm entity, double x, double y, double z, float size, boolean isFlaming, boolean enableDrops) {
        MoreExplosivesBetterExplosion betterexplosion = new MoreExplosivesBetterExplosion(worldObj, entity, x, y, z, size, enableDrops, 0);
        betterexplosion.a = isFlaming;
        betterexplosion.a();
        betterexplosion.a(true);
        MoreExplosives.sendClientFXPacket(worldObj, x, y, z);
    }

    public static void createBetterExplosionWithLava(abv worldObj, nm entity, double x, double y, double z, float size, boolean isFlaming, boolean enableDrops) {
        MoreExplosivesBetterExplosion betterexplosion = new MoreExplosivesBetterExplosion(worldObj, entity, x, y, z, size, enableDrops, 10);
        betterexplosion.a = isFlaming;
        betterexplosion.a();
        betterexplosion.a(true);
        MoreExplosives.sendClientFXPacket(worldObj, x, y, z);
    }

    public static void createBetterExplosionWithWater(abv worldObj, nm entity, double x, double y, double z, float size, boolean isFlaming, boolean enableDrops) {
        MoreExplosivesBetterExplosion betterexplosion = new MoreExplosivesBetterExplosion(worldObj, entity, x, y, z, size, enableDrops, 8);
        betterexplosion.a = isFlaming;
        betterexplosion.a();
        betterexplosion.a(true);
        MoreExplosives.sendClientFXPacket(worldObj, x, y, z);
    }

    public static void createSuperExplosion(abv worldObj, nm entity, int x, int y, int z, float size) {
        long seed = new Random().nextLong();
        MoreExplosives.sendSuperClientFXPacket(worldObj, x, y, z, seed, size);
        new MoreExplosivesSuperExplosion().explode(worldObj, (double)size, (double)size, (double)size, x, y, z, seed);
    }

    public static void createTunnelExplosion(abv worldObj, nm entity, double x, double y, double z, int direction) {
        MoreExplosivesTunnelExplosion tunnelexplosion = new MoreExplosivesTunnelExplosion(worldObj, entity, x, y, z, direction);
        tunnelexplosion.a();
        tunnelexplosion.a(true);
        MoreExplosives.sendClientFXPacket(worldObj, x, y, z);
    }

    private static void sendClientFXPacket(abv world, double x, double y, double z) {
        for (ue player : world.h) {
            if (player.e(x, y, z) >= 4096.0) continue;
            ((ju)player).a.b((ex)MoreExplosivesPacketHandler.makePacket((int)7, (Object[])new Object[]{(int)x, (int)y, (int)z}));
        }
    }

    private static void sendSuperClientFXPacket(abv world, double x, double y, double z, long seed, float size) {
        for (ue player : world.h) {
            if (player.e(x, y, z) >= 4096.0) continue;
            ((ju)player).a.b((ex)MoreExplosivesPacketHandler.makePacket((int)8, (Object[])new Object[]{(int)x, (int)y, (int)z, seed, Float.valueOf(size)}));
        }
    }

    public static void detonateAllBlastingCaps(abv world, int frequency) {
        if (world.I) {
            return;
        }
        for (asm entity : world.g) {
            if (!(entity instanceof TileEntityBlastingCap) || ((TileEntityBlastingCap)entity).frequency != frequency && frequency != -1) continue;
            ((TileEntityBlastingCap)entity).explode();
        }
    }
}