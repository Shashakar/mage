package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.Arrays;
import java.util.List;

/**
 * @author TheElk801
 */
public final class Warhammer40000 extends ExpansionSet {

    private static final List<String> unfinished = Arrays.asList("Arco-Flagellant", "Sicarian Infiltrator", "Space Marine Devastator", "Ultramarines Honour Guard", "Vanguard Suppressor", "Zephyrim");

    private static final Warhammer40000 instance = new Warhammer40000();

    public static Warhammer40000 getInstance() {
        return instance;
    }

    private Warhammer40000() {
        super("Warhammer 40,000", "40K", ExpansionSet.buildDate(2022, 4, 29), SetType.SUPPLEMENTAL);
        this.hasBasicLands = true;
        this.hasBoosters = false;

        cards.add(new SetCardInfo("Abaddon the Despoiler", 2, Rarity.MYTHIC, mage.cards.a.AbaddonTheDespoiler.class));
        cards.add(new SetCardInfo("Aberrant", 86, Rarity.UNCOMMON, mage.cards.a.Aberrant.class));
        cards.add(new SetCardInfo("Abundance", 210, Rarity.RARE, mage.cards.a.Abundance.class));
        cards.add(new SetCardInfo("Acolyte Hybrid", 70, Rarity.UNCOMMON, mage.cards.a.AcolyteHybrid.class));
        cards.add(new SetCardInfo("Aetherize", 191, Rarity.UNCOMMON, mage.cards.a.Aetherize.class));
        cards.add(new SetCardInfo("And They Shall Know No Fear", 9, Rarity.UNCOMMON, mage.cards.a.AndTheyShallKnowNoFear.class));
        cards.add(new SetCardInfo("Arcane Sanctum", 264, Rarity.UNCOMMON, mage.cards.a.ArcaneSanctum.class));
        cards.add(new SetCardInfo("Arcane Signet", 227, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Arco-Flagellant", 29, Rarity.RARE, mage.cards.a.ArcoFlagellant.class));
        cards.add(new SetCardInfo("Ash Barrens", 265, Rarity.UNCOMMON, mage.cards.a.AshBarrens.class));
        cards.add(new SetCardInfo("Assault Intercessor", 104, Rarity.RARE, mage.cards.a.AssaultIntercessor.class));
        cards.add(new SetCardInfo("Assault Suit", 230, Rarity.UNCOMMON, mage.cards.a.AssaultSuit.class));
        cards.add(new SetCardInfo("Atalan Jackal", 105, Rarity.RARE, mage.cards.a.AtalanJackal.class));
        cards.add(new SetCardInfo("Barren Moor", 266, Rarity.UNCOMMON, mage.cards.b.BarrenMoor.class));
        cards.add(new SetCardInfo("Bastion Protector", 182, Rarity.RARE, mage.cards.b.BastionProtector.class));
        cards.add(new SetCardInfo("Be'lakor, the Dark Master", 6, Rarity.MYTHIC, mage.cards.b.BelakorTheDarkMaster.class));
        cards.add(new SetCardInfo("Beacon of Unrest", 194, Rarity.RARE, mage.cards.b.BeaconOfUnrest.class));
        cards.add(new SetCardInfo("Bile Blight", 195, Rarity.UNCOMMON, mage.cards.b.BileBlight.class));
        cards.add(new SetCardInfo("Biotransference", 30, Rarity.RARE, mage.cards.b.Biotransference.class));
        cards.add(new SetCardInfo("Birth of the Imperium", 107, Rarity.RARE, mage.cards.b.BirthOfTheImperium.class));
        cards.add(new SetCardInfo("Bituminous Blast", 221, Rarity.UNCOMMON, mage.cards.b.BituminousBlast.class));
        cards.add(new SetCardInfo("Blasphemous Act", 204, Rarity.RARE, mage.cards.b.BlasphemousAct.class));
        cards.add(new SetCardInfo("Blight Grenade", 31, Rarity.RARE, mage.cards.b.BlightGrenade.class));
        cards.add(new SetCardInfo("Blood for the Blood God!", 108, Rarity.RARE, mage.cards.b.BloodForTheBloodGod.class));
        cards.add(new SetCardInfo("Bloodcrusher of Khorne", 72, Rarity.UNCOMMON, mage.cards.b.BloodcrusherOfKhorne.class));
        cards.add(new SetCardInfo("Bone Sabres", 88, Rarity.RARE, mage.cards.b.BoneSabres.class));
        cards.add(new SetCardInfo("Brainstorm", 192, Rarity.COMMON, mage.cards.b.Brainstorm.class));
        cards.add(new SetCardInfo("Bred for the Hunt", 222, Rarity.UNCOMMON, mage.cards.b.BredForTheHunt.class));
        cards.add(new SetCardInfo("Broodlord", 89, Rarity.RARE, mage.cards.b.Broodlord.class));
        cards.add(new SetCardInfo("Caged Sun", 231, Rarity.RARE, mage.cards.c.CagedSun.class));
        cards.add(new SetCardInfo("Callidus Assassin", 109, Rarity.RARE, mage.cards.c.CallidusAssassin.class));
        cards.add(new SetCardInfo("Canoptek Scarab Swarm", 150, Rarity.RARE, mage.cards.c.CanoptekScarabSwarm.class));
        cards.add(new SetCardInfo("Canoptek Spyder", 151, Rarity.RARE, mage.cards.c.CanoptekSpyder.class));
        cards.add(new SetCardInfo("Canoptek Tomb Sentinel", 152, Rarity.RARE, mage.cards.c.CanoptekTombSentinel.class));
        cards.add(new SetCardInfo("Canoptek Wraith", 153, Rarity.RARE, mage.cards.c.CanoptekWraith.class));
        cards.add(new SetCardInfo("Cave of Temptation", 267, Rarity.COMMON, mage.cards.c.CaveOfTemptation.class));
        cards.add(new SetCardInfo("Celestine, the Living Saint", 10, Rarity.RARE, mage.cards.c.CelestineTheLivingSaint.class));
        cards.add(new SetCardInfo("Chaos Defiler", 110, Rarity.RARE, mage.cards.c.ChaosDefiler.class));
        cards.add(new SetCardInfo("Chaos Terminator Lord", 74, Rarity.UNCOMMON, mage.cards.c.ChaosTerminatorLord.class));
        cards.add(new SetCardInfo("Chaos Warp", 205, Rarity.RARE, mage.cards.c.ChaosWarp.class));
        cards.add(new SetCardInfo("Choked Estuary", 268, Rarity.RARE, mage.cards.c.ChokedEstuary.class));
        cards.add(new SetCardInfo("Chromatic Lantern", 232, Rarity.RARE, mage.cards.c.ChromaticLantern.class));
        cards.add(new SetCardInfo("Chronomancer", 32, Rarity.RARE, mage.cards.c.Chronomancer.class));
        cards.add(new SetCardInfo("Cinder Glade", 269, Rarity.RARE, mage.cards.c.CinderGlade.class));
        cards.add(new SetCardInfo("Clamavus", 90, Rarity.RARE, mage.cards.c.Clamavus.class));
        cards.add(new SetCardInfo("Collective Effort", 183, Rarity.RARE, mage.cards.c.CollectiveEffort.class));
        cards.add(new SetCardInfo("Command Tower", 270, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Sphere", 233, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Commissar Severina Raine", 112, Rarity.RARE, mage.cards.c.CommissarSeverinaRaine.class));
        cards.add(new SetCardInfo("Company Commander", 113, Rarity.RARE, mage.cards.c.CompanyCommander.class));
        cards.add(new SetCardInfo("Cranial Plating", 236, Rarity.UNCOMMON, mage.cards.c.CranialPlating.class));
        cards.add(new SetCardInfo("Crumbling Necropolis", 273, Rarity.UNCOMMON, mage.cards.c.CrumblingNecropolis.class));
        cards.add(new SetCardInfo("Cryptothrall", 155, Rarity.RARE, mage.cards.c.Cryptothrall.class));
        cards.add(new SetCardInfo("Cultivate", 211, Rarity.COMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Dark Ritual", 196, Rarity.COMMON, mage.cards.d.DarkRitual.class));
        cards.add(new SetCardInfo("Darkness", 197, Rarity.COMMON, mage.cards.d.Darkness.class));
        cards.add(new SetCardInfo("Darkwater Catacombs", 274, Rarity.RARE, mage.cards.d.DarkwaterCatacombs.class));
        cards.add(new SetCardInfo("Death's Presence", 212, Rarity.RARE, mage.cards.d.DeathsPresence.class));
        cards.add(new SetCardInfo("Deathleaper, Terror Weapon", 115, Rarity.RARE, mage.cards.d.DeathleaperTerrorWeapon.class));
        cards.add(new SetCardInfo("Decree of Pain", 198, Rarity.RARE, mage.cards.d.DecreeOfPain.class));
        cards.add(new SetCardInfo("Defenders of Humanity", 11, Rarity.RARE, mage.cards.d.DefendersOfHumanity.class));
        cards.add(new SetCardInfo("Defile", 199, Rarity.UNCOMMON, mage.cards.d.Defile.class));
        cards.add(new SetCardInfo("Deny Reality", 223, Rarity.COMMON, mage.cards.d.DenyReality.class));
        cards.add(new SetCardInfo("Deny the Witch", 116, Rarity.UNCOMMON, mage.cards.d.DenyTheWitch.class));
        cards.add(new SetCardInfo("Deploy to the Front", 184, Rarity.RARE, mage.cards.d.DeployToTheFront.class));
        cards.add(new SetCardInfo("Desert of the Glorified", 275, Rarity.COMMON, mage.cards.d.DesertOfTheGlorified.class));
        cards.add(new SetCardInfo("Dismal Backwater", 276, Rarity.COMMON, mage.cards.d.DismalBackwater.class));
        cards.add(new SetCardInfo("Drach'Nyen", 117, Rarity.RARE, mage.cards.d.DrachNyen.class));
        cards.add(new SetCardInfo("Dread Return", 200, Rarity.UNCOMMON, mage.cards.d.DreadReturn.class));
        cards.add(new SetCardInfo("Endless Atlas", 237, Rarity.RARE, mage.cards.e.EndlessAtlas.class));
        cards.add(new SetCardInfo("Entrapment Maneuver", 185, Rarity.RARE, mage.cards.e.EntrapmentManeuver.class));
        cards.add(new SetCardInfo("Epistolary Librarian", 118, Rarity.RARE, mage.cards.e.EpistolaryLibrarian.class));
        cards.add(new SetCardInfo("Everflowing Chalice", 238, Rarity.RARE, mage.cards.e.EverflowingChalice.class));
        cards.add(new SetCardInfo("Evolving Wilds", 277, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exalted Flamer of Tzeentch", 119, Rarity.RARE, mage.cards.e.ExaltedFlamerOfTzeentch.class));
        cards.add(new SetCardInfo("Exocrine", 76, Rarity.RARE, mage.cards.e.Exocrine.class));
        cards.add(new SetCardInfo("Exotic Orchard", 278, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Explore", 213, Rarity.COMMON, mage.cards.e.Explore.class));
        cards.add(new SetCardInfo("Exterminatus", 120, Rarity.RARE, mage.cards.e.Exterminatus.class));
        cards.add(new SetCardInfo("Fabricate", 181, Rarity.RARE, mage.cards.f.Fabricate.class));
        cards.add(new SetCardInfo("Farseek", 214, Rarity.COMMON, mage.cards.f.Farseek.class));
        cards.add(new SetCardInfo("Fell the Mighty", 186, Rarity.RARE, mage.cards.f.FellTheMighty.class));
        cards.add(new SetCardInfo("Flayed One", 34, Rarity.UNCOMMON, mage.cards.f.FlayedOne.class));
        cards.add(new SetCardInfo("For the Emperor!", 12, Rarity.RARE, mage.cards.f.ForTheEmperor.class));
        cards.add(new SetCardInfo("Foreboding Ruins", 279, Rarity.RARE, mage.cards.f.ForebodingRuins.class));
        cards.add(new SetCardInfo("Forest", 317, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forgotten Cave", 280, Rarity.COMMON, mage.cards.f.ForgottenCave.class));
        cards.add(new SetCardInfo("Frontier Bivouac", 281, Rarity.UNCOMMON, mage.cards.f.FrontierBivouac.class));
        cards.add(new SetCardInfo("Game Trail", 282, Rarity.RARE, mage.cards.g.GameTrail.class));
        cards.add(new SetCardInfo("Gargoyle Flock", 123, Rarity.RARE, mage.cards.g.GargoyleFlock.class));
        cards.add(new SetCardInfo("Ghost Ark", 156, Rarity.RARE, mage.cards.g.GhostArk.class));
        cards.add(new SetCardInfo("Gilded Lotus", 239, Rarity.RARE, mage.cards.g.GildedLotus.class));
        cards.add(new SetCardInfo("Go for the Throat", 201, Rarity.COMMON, mage.cards.g.GoForTheThroat.class));
        cards.add(new SetCardInfo("Goliath Truck", 158, Rarity.UNCOMMON, mage.cards.g.GoliathTruck.class));
        cards.add(new SetCardInfo("Great Unclean One", 35, Rarity.RARE, mage.cards.g.GreatUncleanOne.class));
        cards.add(new SetCardInfo("Grey Knight Paragon", 13, Rarity.UNCOMMON, mage.cards.g.GreyKnightParagon.class));
        cards.add(new SetCardInfo("Hardened Scales", 215, Rarity.RARE, mage.cards.h.HardenedScales.class));
        cards.add(new SetCardInfo("Harrow", 216, Rarity.COMMON, mage.cards.h.Harrow.class));
        cards.add(new SetCardInfo("Haruspex", 91, Rarity.RARE, mage.cards.h.Haruspex.class));
        cards.add(new SetCardInfo("Hedron Archive", 240, Rarity.UNCOMMON, mage.cards.h.HedronArchive.class));
        cards.add(new SetCardInfo("Herald of Slaanesh", 77, Rarity.UNCOMMON, mage.cards.h.HeraldOfSlaanesh.class));
        cards.add(new SetCardInfo("Herald's Horn", 241, Rarity.UNCOMMON, mage.cards.h.HeraldsHorn.class));
        cards.add(new SetCardInfo("Heralds of Tzeentch", 23, Rarity.UNCOMMON, mage.cards.h.HeraldsOfTzeentch.class));
        cards.add(new SetCardInfo("Hexmark Destroyer", 36, Rarity.UNCOMMON, mage.cards.h.HexmarkDestroyer.class));
        cards.add(new SetCardInfo("Hormagaunt Horde", 93, Rarity.RARE, mage.cards.h.HormagauntHorde.class));
        cards.add(new SetCardInfo("Hour of Reckoning", 187, Rarity.RARE, mage.cards.h.HourOfReckoning.class));
        cards.add(new SetCardInfo("Hull Breach", 224, Rarity.UNCOMMON, mage.cards.h.HullBreach.class));
        cards.add(new SetCardInfo("Icon of Ancestry", 242, Rarity.RARE, mage.cards.i.IconOfAncestry.class));
        cards.add(new SetCardInfo("Imotekh the Stormlord", 5, Rarity.MYTHIC, mage.cards.i.ImotekhTheStormlord.class));
        cards.add(new SetCardInfo("Inquisitor Greyfax", 3, Rarity.MYTHIC, mage.cards.i.InquisitorGreyfax.class));
        cards.add(new SetCardInfo("Inquisitorial Rosette", 159, Rarity.RARE, mage.cards.i.InquisitorialRosette.class));
        cards.add(new SetCardInfo("Inspiring Call", 217, Rarity.UNCOMMON, mage.cards.i.InspiringCall.class));
        cards.add(new SetCardInfo("Island", 307, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Keeper of Secrets", 78, Rarity.RARE, mage.cards.k.KeeperOfSecrets.class));
        cards.add(new SetCardInfo("Kill! Maim! Burn!", 128, Rarity.RARE, mage.cards.k.KillMaimBurn.class));
        cards.add(new SetCardInfo("Knight Paladin", 160, Rarity.RARE, mage.cards.k.KnightPaladin.class));
        cards.add(new SetCardInfo("Launch the Fleet", 188, Rarity.RARE, mage.cards.l.LaunchTheFleet.class));
        cards.add(new SetCardInfo("Let the Galaxy Burn", 81, Rarity.RARE, mage.cards.l.LetTheGalaxyBurn.class));
        cards.add(new SetCardInfo("Lictor", 94, Rarity.RARE, mage.cards.l.Lictor.class));
        cards.add(new SetCardInfo("Living Death", 202, Rarity.RARE, mage.cards.l.LivingDeath.class));
        cards.add(new SetCardInfo("Lokhust Heavy Destroyer", 38, Rarity.RARE, mage.cards.l.LokhustHeavyDestroyer.class));
        cards.add(new SetCardInfo("Lord of Change", 24, Rarity.RARE, mage.cards.l.LordOfChange.class));
        cards.add(new SetCardInfo("Lychguard", 39, Rarity.RARE, mage.cards.l.Lychguard.class));
        cards.add(new SetCardInfo("Malanthrope", 132, Rarity.RARE, mage.cards.m.Malanthrope.class));
        cards.add(new SetCardInfo("Mandate of Abaddon", 40, Rarity.RARE, mage.cards.m.MandateOfAbaddon.class));
        cards.add(new SetCardInfo("Martial Coup", 189, Rarity.RARE, mage.cards.m.MartialCoup.class));
        cards.add(new SetCardInfo("Mask of Memory", 243, Rarity.UNCOMMON, mage.cards.m.MaskOfMemory.class));
        cards.add(new SetCardInfo("Mawloc", 133, Rarity.RARE, mage.cards.m.Mawloc.class));
        cards.add(new SetCardInfo("Memorial to Glory", 283, Rarity.UNCOMMON, mage.cards.m.MemorialToGlory.class));
        cards.add(new SetCardInfo("Mind Stone", 244, Rarity.UNCOMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Molten Slagheap", 284, Rarity.UNCOMMON, mage.cards.m.MoltenSlagheap.class));
        cards.add(new SetCardInfo("Mortify", 225, Rarity.UNCOMMON, mage.cards.m.Mortify.class));
        cards.add(new SetCardInfo("Mountain", 315, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mutalith Vortex Beast", 134, Rarity.RARE, mage.cards.m.MutalithVortexBeast.class));
        cards.add(new SetCardInfo("Mutilate", 203, Rarity.RARE, mage.cards.m.Mutilate.class));
        cards.add(new SetCardInfo("Myriad Landscape", 285, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Mystic Forge", 246, Rarity.RARE, mage.cards.m.MysticForge.class));
        cards.add(new SetCardInfo("Necron Deathmark", 42, Rarity.RARE, mage.cards.n.NecronDeathmark.class));
        cards.add(new SetCardInfo("Necron Monolith", 161, Rarity.RARE, mage.cards.n.NecronMonolith.class));
        cards.add(new SetCardInfo("New Horizons", 218, Rarity.COMMON, mage.cards.n.NewHorizons.class));
        cards.add(new SetCardInfo("Night Scythe", 162, Rarity.UNCOMMON, mage.cards.n.NightScythe.class));
        cards.add(new SetCardInfo("Noise Marine", 82, Rarity.UNCOMMON, mage.cards.n.NoiseMarine.class));
        cards.add(new SetCardInfo("Old One Eye", 96, Rarity.RARE, mage.cards.o.OldOneEye.class));
        cards.add(new SetCardInfo("Opal Palace", 286, Rarity.COMMON, mage.cards.o.OpalPalace.class));
        cards.add(new SetCardInfo("Overgrowth", 219, Rarity.COMMON, mage.cards.o.Overgrowth.class));
        cards.add(new SetCardInfo("Past in Flames", 206, Rarity.MYTHIC, mage.cards.p.PastInFlames.class));
        cards.add(new SetCardInfo("Path of Ancestry", 287, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Plains", 306, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plasmancer", 48, Rarity.UNCOMMON, mage.cards.p.Plasmancer.class));
        cards.add(new SetCardInfo("Polluted Mire", 288, Rarity.COMMON, mage.cards.p.PollutedMire.class));
        cards.add(new SetCardInfo("Port Town", 289, Rarity.RARE, mage.cards.p.PortTown.class));
        cards.add(new SetCardInfo("Prairie Stream", 290, Rarity.RARE, mage.cards.p.PrairieStream.class));
        cards.add(new SetCardInfo("Primaris Chaplain", 137, Rarity.UNCOMMON, mage.cards.p.PrimarisChaplain.class));
        cards.add(new SetCardInfo("Primaris Eliminator", 50, Rarity.RARE, mage.cards.p.PrimarisEliminator.class));
        cards.add(new SetCardInfo("Purestrain Genestealer", 97, Rarity.UNCOMMON, mage.cards.p.PurestrainGenestealer.class));
        cards.add(new SetCardInfo("Rampant Growth", 220, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Ravener", 138, Rarity.RARE, mage.cards.r.Ravener.class));
        cards.add(new SetCardInfo("Reconnaissance Mission", 193, Rarity.UNCOMMON, mage.cards.r.ReconnaissanceMission.class));
        cards.add(new SetCardInfo("Reliquary Tower", 291, Rarity.UNCOMMON, mage.cards.r.ReliquaryTower.class));
        cards.add(new SetCardInfo("Reverberate", 207, Rarity.RARE, mage.cards.r.Reverberate.class));
        cards.add(new SetCardInfo("Royal Warden", 52, Rarity.RARE, mage.cards.r.RoyalWarden.class));
        cards.add(new SetCardInfo("Rugged Highlands", 292, Rarity.COMMON, mage.cards.r.RuggedHighlands.class));
        cards.add(new SetCardInfo("Sanguinary Priest", 53, Rarity.UNCOMMON, mage.cards.s.SanguinaryPriest.class));
        cards.add(new SetCardInfo("Sautekh Immortal", 54, Rarity.UNCOMMON, mage.cards.s.SautekhImmortal.class));
        cards.add(new SetCardInfo("Sceptre of Eternal Glory", 166, Rarity.RARE, mage.cards.s.SceptreOfEternalGlory.class));
        cards.add(new SetCardInfo("Scoured Barrens", 293, Rarity.COMMON, mage.cards.s.ScouredBarrens.class));
        cards.add(new SetCardInfo("Screamer-Killer", 84, Rarity.RARE, mage.cards.s.ScreamerKiller.class));
        cards.add(new SetCardInfo("Sculpting Steel", 247, Rarity.RARE, mage.cards.s.SculptingSteel.class));
        cards.add(new SetCardInfo("Sicarian Infiltrator", 25, Rarity.UNCOMMON, mage.cards.s.SicarianInfiltrator.class));
        cards.add(new SetCardInfo("Sister Repentia", 142, Rarity.RARE, mage.cards.s.SisterRepentia.class));
        cards.add(new SetCardInfo("Sister of Silence", 26, Rarity.RARE, mage.cards.s.SisterOfSilence.class));
        cards.add(new SetCardInfo("Skorpekh Destroyer", 57, Rarity.UNCOMMON, mage.cards.s.SkorpekhDestroyer.class));
        cards.add(new SetCardInfo("Skorpekh Lord", 58, Rarity.RARE, mage.cards.s.SkorpekhLord.class));
        cards.add(new SetCardInfo("Skullclamp", 248, Rarity.UNCOMMON, mage.cards.s.Skullclamp.class));
        cards.add(new SetCardInfo("Skycloud Expanse", 294, Rarity.RARE, mage.cards.s.SkycloudExpanse.class));
        cards.add(new SetCardInfo("Sol Ring", 249, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Space Marine Devastator", 14, Rarity.RARE, mage.cards.s.SpaceMarineDevastator.class));
        cards.add(new SetCardInfo("Space Marine Scout", 15, Rarity.UNCOMMON, mage.cards.s.SpaceMarineScout.class));
        cards.add(new SetCardInfo("Sporocyst", 98, Rarity.RARE, mage.cards.s.Sporocyst.class));
        cards.add(new SetCardInfo("Starstorm", 208, Rarity.RARE, mage.cards.s.Starstorm.class));
        cards.add(new SetCardInfo("Sunken Hollow", 295, Rarity.RARE, mage.cards.s.SunkenHollow.class));
        cards.add(new SetCardInfo("Swamp", 310, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swiftwater Cliffs", 296, Rarity.COMMON, mage.cards.s.SwiftwaterCliffs.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 190, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Szarekh, the Silent King", 1, Rarity.MYTHIC, mage.cards.s.SzarekhTheSilentKing.class));
        cards.add(new SetCardInfo("Talisman of Creativity", 253, Rarity.UNCOMMON, mage.cards.t.TalismanOfCreativity.class));
        cards.add(new SetCardInfo("Talisman of Dominance", 254, Rarity.UNCOMMON, mage.cards.t.TalismanOfDominance.class));
        cards.add(new SetCardInfo("Talisman of Hierarchy", 256, Rarity.UNCOMMON, mage.cards.t.TalismanOfHierarchy.class));
        cards.add(new SetCardInfo("Talisman of Indulgence", 257, Rarity.UNCOMMON, mage.cards.t.TalismanOfIndulgence.class));
        cards.add(new SetCardInfo("Talisman of Progress", 258, Rarity.UNCOMMON, mage.cards.t.TalismanOfProgress.class));
        cards.add(new SetCardInfo("Tallyman of Nurgle", 60, Rarity.RARE, mage.cards.t.TallymanOfNurgle.class));
        cards.add(new SetCardInfo("Temple of Abandon", 297, Rarity.RARE, mage.cards.t.TempleOfAbandon.class));
        cards.add(new SetCardInfo("Temple of Epiphany", 298, Rarity.RARE, mage.cards.t.TempleOfEpiphany.class));
        cards.add(new SetCardInfo("Temple of Mystery", 299, Rarity.RARE, mage.cards.t.TempleOfMystery.class));
        cards.add(new SetCardInfo("Temple of the False God", 300, Rarity.UNCOMMON, mage.cards.t.TempleOfTheFalseGod.class));
        cards.add(new SetCardInfo("Termagant Swarm", 99, Rarity.RARE, mage.cards.t.TermagantSwarm.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 301, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Tervigon", 100, Rarity.RARE, mage.cards.t.Tervigon.class));
        cards.add(new SetCardInfo("The Swarmlord", 4, Rarity.MYTHIC, mage.cards.t.TheSwarmlord.class));
        cards.add(new SetCardInfo("Their Name Is Death", 62, Rarity.RARE, mage.cards.t.TheirNameIsDeath.class));
        cards.add(new SetCardInfo("Their Number Is Legion", 63, Rarity.RARE, mage.cards.t.TheirNumberIsLegion.class));
        cards.add(new SetCardInfo("Thornwood Falls", 302, Rarity.COMMON, mage.cards.t.ThornwoodFalls.class));
        cards.add(new SetCardInfo("Thought Vessel", 259, Rarity.COMMON, mage.cards.t.ThoughtVessel.class));
        cards.add(new SetCardInfo("Thunderhawk Gunship", 167, Rarity.RARE, mage.cards.t.ThunderhawkGunship.class));
        cards.add(new SetCardInfo("Thunderwolf Cavalry", 16, Rarity.UNCOMMON, mage.cards.t.ThunderwolfCavalry.class));
        cards.add(new SetCardInfo("Tomb Fortress", 168, Rarity.RARE, mage.cards.t.TombFortress.class));
        cards.add(new SetCardInfo("Tranquil Cove", 303, Rarity.COMMON, mage.cards.t.TranquilCove.class));
        cards.add(new SetCardInfo("Triarch Praetorian", 66, Rarity.UNCOMMON, mage.cards.t.TriarchPraetorian.class));
        cards.add(new SetCardInfo("Trygon Prime", 143, Rarity.UNCOMMON, mage.cards.t.TrygonPrime.class));
        cards.add(new SetCardInfo("Tyranid Invasion", 102, Rarity.UNCOMMON, mage.cards.t.TyranidInvasion.class));
        cards.add(new SetCardInfo("Tyranid Prime", 145, Rarity.RARE, mage.cards.t.TyranidPrime.class));
        cards.add(new SetCardInfo("Tyrant Guard", 103, Rarity.RARE, mage.cards.t.TyrantGuard.class));
        cards.add(new SetCardInfo("Ultramarines Honour Guard", 18, Rarity.RARE, mage.cards.u.UltramarinesHonourGuard.class));
        cards.add(new SetCardInfo("Unclaimed Territory", 304, Rarity.UNCOMMON, mage.cards.u.UnclaimedTerritory.class));
        cards.add(new SetCardInfo("Unstable Obelisk", 260, Rarity.COMMON, mage.cards.u.UnstableObelisk.class));
        cards.add(new SetCardInfo("Utter End", 226, Rarity.RARE, mage.cards.u.UtterEnd.class));
        cards.add(new SetCardInfo("Vanguard Suppressor", 27, Rarity.RARE, mage.cards.v.VanguardSuppressor.class));
        cards.add(new SetCardInfo("Vault of Whispers", 305, Rarity.COMMON, mage.cards.v.VaultOfWhispers.class));
        cards.add(new SetCardInfo("Venomcrawler", 68, Rarity.RARE, mage.cards.v.Venomcrawler.class));
        cards.add(new SetCardInfo("Venomthrope", 147, Rarity.UNCOMMON, mage.cards.v.Venomthrope.class));
        cards.add(new SetCardInfo("Vexilus Praetor", 19, Rarity.RARE, mage.cards.v.VexilusPraetor.class));
        cards.add(new SetCardInfo("Warstorm Surge", 209, Rarity.RARE, mage.cards.w.WarstormSurge.class));
        cards.add(new SetCardInfo("Wayfarer's Bauble", 261, Rarity.COMMON, mage.cards.w.WayfarersBauble.class));
        cards.add(new SetCardInfo("Winged Hive Tyrant", 148, Rarity.RARE, mage.cards.w.WingedHiveTyrant.class));
        cards.add(new SetCardInfo("Worn Powerstone", 263, Rarity.UNCOMMON, mage.cards.w.WornPowerstone.class));
        cards.add(new SetCardInfo("Zephyrim", 20, Rarity.RARE, mage.cards.z.Zephyrim.class));
        cards.add(new SetCardInfo("Zoanthrope", 149, Rarity.RARE, mage.cards.z.Zoanthrope.class));

        cards.removeIf(setCardInfo -> unfinished.contains(setCardInfo.getName())); // remove when mechanic is implemented
    }
}
