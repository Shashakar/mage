package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class DuskmournHouseOfHorrorCommander extends ExpansionSet {

    private static final DuskmournHouseOfHorrorCommander instance = new DuskmournHouseOfHorrorCommander();

    public static DuskmournHouseOfHorrorCommander getInstance() {
        return instance;
    }

    private DuskmournHouseOfHorrorCommander() {
        super("Duskmourn: House of Horror Commander", "DSC", ExpansionSet.buildDate(2024, 9, 27), SetType.SUPPLEMENTAL);
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Adarkar Wastes", 258, Rarity.RARE, mage.cards.a.AdarkarWastes.class));
        cards.add(new SetCardInfo("Aesi, Tyrant of Gyre Strait", 210, Rarity.MYTHIC, mage.cards.a.AesiTyrantOfGyreStrait.class));
        cards.add(new SetCardInfo("Aether Gale", 109, Rarity.RARE, mage.cards.a.AetherGale.class));
        cards.add(new SetCardInfo("Aminatou's Augury", 71, Rarity.RARE, mage.cards.a.AminatousAugury.class));
        cards.add(new SetCardInfo("Arcane Denial", 110, Rarity.COMMON, mage.cards.a.ArcaneDenial.class));
        cards.add(new SetCardInfo("Arcane Sanctum", 259, Rarity.UNCOMMON, mage.cards.a.ArcaneSanctum.class));
        cards.add(new SetCardInfo("Arcane Signet", 92, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Archetype of Imagination", 111, Rarity.UNCOMMON, mage.cards.a.ArchetypeOfImagination.class));
        cards.add(new SetCardInfo("Archon of Cruelty", 371, Rarity.MYTHIC, mage.cards.a.ArchonOfCruelty.class));
        cards.add(new SetCardInfo("Arixmethes, Slumbering Isle", 211, Rarity.RARE, mage.cards.a.ArixmethesSlumberingIsle.class));
        cards.add(new SetCardInfo("Arvinox, the Mind Flail", 130, Rarity.MYTHIC, mage.cards.a.ArvinoxTheMindFlail.class));
        cards.add(new SetCardInfo("Ash Barrens", 260, Rarity.COMMON, mage.cards.a.AshBarrens.class));
        cards.add(new SetCardInfo("Ashaya, Soul of the Wild", 170, Rarity.MYTHIC, mage.cards.a.AshayaSoulOfTheWild.class));
        cards.add(new SetCardInfo("Athreos, Shroud-Veiled", 212, Rarity.MYTHIC, mage.cards.a.AthreosShroudVeiled.class));
        cards.add(new SetCardInfo("Augur of Autumn", 171, Rarity.RARE, mage.cards.a.AugurOfAutumn.class));
        cards.add(new SetCardInfo("Auramancer", 97, Rarity.COMMON, mage.cards.a.Auramancer.class));
        cards.add(new SetCardInfo("Azorius Chancery", 261, Rarity.UNCOMMON, mage.cards.a.AzoriusChancery.class));
        cards.add(new SetCardInfo("Azorius Signet", 240, Rarity.UNCOMMON, mage.cards.a.AzoriusSignet.class));
        cards.add(new SetCardInfo("Beanstalk Giant", 172, Rarity.UNCOMMON, mage.cards.b.BeanstalkGiant.class));
        cards.add(new SetCardInfo("Beast Within", 80, Rarity.UNCOMMON, mage.cards.b.BeastWithin.class));
        cards.add(new SetCardInfo("Bedevil", 84, Rarity.RARE, mage.cards.b.Bedevil.class));
        cards.add(new SetCardInfo("Biomass Mutation", 214, Rarity.RARE, mage.cards.b.BiomassMutation.class));
        cards.add(new SetCardInfo("Blood Pact", 76, Rarity.COMMON, mage.cards.b.BloodPact.class));
        cards.add(new SetCardInfo("Blood Seeker", 77, Rarity.COMMON, mage.cards.b.BloodSeeker.class));
        cards.add(new SetCardInfo("Body of Knowledge", 112, Rarity.RARE, mage.cards.b.BodyOfKnowledge.class));
        cards.add(new SetCardInfo("Bojuka Bog", 265, Rarity.COMMON, mage.cards.b.BojukaBog.class));
        cards.add(new SetCardInfo("Brainstone", 242, Rarity.UNCOMMON, mage.cards.b.Brainstone.class));
        cards.add(new SetCardInfo("Brainstorm", 113, Rarity.COMMON, mage.cards.b.Brainstorm.class));
        cards.add(new SetCardInfo("Burnished Hart", 243, Rarity.UNCOMMON, mage.cards.b.BurnishedHart.class));
        cards.add(new SetCardInfo("Cackling Counterpart", 72, Rarity.RARE, mage.cards.c.CacklingCounterpart.class));
        cards.add(new SetCardInfo("Cast Out", 98, Rarity.UNCOMMON, mage.cards.c.CastOut.class));
        cards.add(new SetCardInfo("Castle Vantress", 267, Rarity.RARE, mage.cards.c.CastleVantress.class));
        cards.add(new SetCardInfo("Caves of Koilos", 268, Rarity.RARE, mage.cards.c.CavesOfKoilos.class));
        cards.add(new SetCardInfo("Citanul Hierophants", 81, Rarity.RARE, mage.cards.c.CitanulHierophants.class));
        cards.add(new SetCardInfo("Command Tower", 96, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Sphere", 244, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Counterspell", 114, Rarity.COMMON, mage.cards.c.Counterspell.class));
        cards.add(new SetCardInfo("Crypt Ghast", 368, Rarity.MYTHIC, mage.cards.c.CryptGhast.class));
        cards.add(new SetCardInfo("Cultivate", 174, Rarity.COMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Damn", 369, Rarity.MYTHIC, mage.cards.d.Damn.class));
        cards.add(new SetCardInfo("Deathmist Raptor", 176, Rarity.MYTHIC, mage.cards.d.DeathmistRaptor.class));
        cards.add(new SetCardInfo("Deathreap Ritual", 86, Rarity.UNCOMMON, mage.cards.d.DeathreapRitual.class));
        cards.add(new SetCardInfo("Demon of Fate's Design", 137, Rarity.RARE, mage.cards.d.DemonOfFatesDesign.class));
        cards.add(new SetCardInfo("Diabolic Vision", 87, Rarity.UNCOMMON, mage.cards.d.DiabolicVision.class));
        cards.add(new SetCardInfo("Dig Through Time", 115, Rarity.RARE, mage.cards.d.DigThroughTime.class));
        cards.add(new SetCardInfo("Dimir Aqueduct", 270, Rarity.UNCOMMON, mage.cards.d.DimirAqueduct.class));
        cards.add(new SetCardInfo("Doomwake Giant", 138, Rarity.RARE, mage.cards.d.DoomwakeGiant.class));
        cards.add(new SetCardInfo("Dream Eater", 116, Rarity.MYTHIC, mage.cards.d.DreamEater.class));
        cards.add(new SetCardInfo("Drownyard Temple", 272, Rarity.RARE, mage.cards.d.DrownyardTemple.class));
        cards.add(new SetCardInfo("Entreat the Angels", 99, Rarity.MYTHIC, mage.cards.e.EntreatTheAngels.class));
        cards.add(new SetCardInfo("Eureka Moment", 216, Rarity.COMMON, mage.cards.e.EurekaMoment.class));
        cards.add(new SetCardInfo("Evolving Wilds", 274, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exhume", 370, Rarity.MYTHIC, mage.cards.e.Exhume.class));
        cards.add(new SetCardInfo("Explosive Vegetation", 177, Rarity.UNCOMMON, mage.cards.e.ExplosiveVegetation.class));
        cards.add(new SetCardInfo("Extravagant Replication", 117, Rarity.RARE, mage.cards.e.ExtravagantReplication.class));
        cards.add(new SetCardInfo("Ezuri's Predation", 178, Rarity.RARE, mage.cards.e.EzurisPredation.class));
        cards.add(new SetCardInfo("Feed the Swarm", 78, Rarity.COMMON, mage.cards.f.FeedTheSwarm.class));
        cards.add(new SetCardInfo("Flooded Grove", 276, Rarity.RARE, mage.cards.f.FloodedGrove.class));
        cards.add(new SetCardInfo("Goryo's Vengeance", 372, Rarity.MYTHIC, mage.cards.g.GoryosVengeance.class));
        cards.add(new SetCardInfo("Grapple with the Past", 82, Rarity.COMMON, mage.cards.g.GrappleWithThePast.class));
        cards.add(new SetCardInfo("Greater Tanuki", 181, Rarity.COMMON, mage.cards.g.GreaterTanuki.class));
        cards.add(new SetCardInfo("Growth Spiral", 88, Rarity.COMMON, mage.cards.g.GrowthSpiral.class));
        cards.add(new SetCardInfo("Halimar Depths", 282, Rarity.COMMON, mage.cards.h.HalimarDepths.class));
        cards.add(new SetCardInfo("Hall of Heliod's Generosity", 283, Rarity.RARE, mage.cards.h.HallOfHeliodsGenerosity.class));
        cards.add(new SetCardInfo("Hinterland Harbor", 284, Rarity.RARE, mage.cards.h.HinterlandHarbor.class));
        cards.add(new SetCardInfo("Hydra Omnivore", 185, Rarity.MYTHIC, mage.cards.h.HydraOmnivore.class));
        cards.add(new SetCardInfo("Inkshield", 221, Rarity.RARE, mage.cards.i.Inkshield.class));
        cards.add(new SetCardInfo("Kefnet the Mindful", 118, Rarity.MYTHIC, mage.cards.k.KefnetTheMindful.class));
        cards.add(new SetCardInfo("Kheru Spellsnatcher", 119, Rarity.RARE, mage.cards.k.KheruSpellsnatcher.class));
        cards.add(new SetCardInfo("Life Insurance", 224, Rarity.RARE, mage.cards.l.LifeInsurance.class));
        cards.add(new SetCardInfo("Lightning Greaves", 93, Rarity.UNCOMMON, mage.cards.l.LightningGreaves.class));
        cards.add(new SetCardInfo("Living Death", 373, Rarity.MYTHIC, mage.cards.l.LivingDeath.class));
        cards.add(new SetCardInfo("Mesa Enchantress", 68, Rarity.RARE, mage.cards.m.MesaEnchantress.class));
        cards.add(new SetCardInfo("Metamorphosis Fanatic", 21, Rarity.RARE, mage.cards.m.MetamorphosisFanatic.class));
        cards.add(new SetCardInfo("Mind Stone", 248, Rarity.UNCOMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Mirrormade", 120, Rarity.RARE, mage.cards.m.Mirrormade.class));
        cards.add(new SetCardInfo("Mogis, God of Slaughter", 89, Rarity.MYTHIC, mage.cards.m.MogisGodOfSlaughter.class));
        cards.add(new SetCardInfo("Moldgraf Monstrosity", 83, Rarity.RARE, mage.cards.m.MoldgrafMonstrosity.class));
        cards.add(new SetCardInfo("Monologue Tax", 100, Rarity.RARE, mage.cards.m.MonologueTax.class));
        cards.add(new SetCardInfo("Moon-Blessed Cleric", 69, Rarity.UNCOMMON, mage.cards.m.MoonBlessedCleric.class));
        cards.add(new SetCardInfo("Mosswort Bridge", 288, Rarity.RARE, mage.cards.m.MosswortBridge.class));
        cards.add(new SetCardInfo("Multani, Yavimaya's Avatar", 190, Rarity.MYTHIC, mage.cards.m.MultaniYavimayasAvatar.class));
        cards.add(new SetCardInfo("Myriad Landscape", 289, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Night's Whisper", 79, Rarity.COMMON, mage.cards.n.NightsWhisper.class));
        cards.add(new SetCardInfo("Nightmare Shepherd", 149, Rarity.RARE, mage.cards.n.NightmareShepherd.class));
        cards.add(new SetCardInfo("Obscura Storefront", 291, Rarity.COMMON, mage.cards.o.ObscuraStorefront.class));
        cards.add(new SetCardInfo("Ondu Spiritdancer", 101, Rarity.RARE, mage.cards.o.OnduSpiritdancer.class));
        cards.add(new SetCardInfo("One with the Multiverse", 121, Rarity.MYTHIC, mage.cards.o.OneWithTheMultiverse.class));
        cards.add(new SetCardInfo("Orzhov Basilica", 292, Rarity.UNCOMMON, mage.cards.o.OrzhovBasilica.class));
        cards.add(new SetCardInfo("Orzhov Signet", 249, Rarity.UNCOMMON, mage.cards.o.OrzhovSignet.class));
        cards.add(new SetCardInfo("Otherworldly Gaze", 122, Rarity.COMMON, mage.cards.o.OtherworldlyGaze.class));
        cards.add(new SetCardInfo("Overflowing Basin", 293, Rarity.RARE, mage.cards.o.OverflowingBasin.class));
        cards.add(new SetCardInfo("Oversimplify", 228, Rarity.RARE, mage.cards.o.Oversimplify.class));
        cards.add(new SetCardInfo("Overwhelming Stampede", 192, Rarity.RARE, mage.cards.o.OverwhelmingStampede.class));
        cards.add(new SetCardInfo("Ponder", 73, Rarity.COMMON, mage.cards.p.Ponder.class));
        cards.add(new SetCardInfo("Portent", 74, Rarity.COMMON, mage.cards.p.Portent.class));
        cards.add(new SetCardInfo("Primordial Mist", 123, Rarity.RARE, mage.cards.p.PrimordialMist.class));
        cards.add(new SetCardInfo("Prognostic Sphinx", 124, Rarity.RARE, mage.cards.p.PrognosticSphinx.class));
        cards.add(new SetCardInfo("Putrefy", 90, Rarity.UNCOMMON, mage.cards.p.Putrefy.class));
        cards.add(new SetCardInfo("Quandrix Campus", 294, Rarity.COMMON, mage.cards.q.QuandrixCampus.class));
        cards.add(new SetCardInfo("Rampant Growth", 193, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Rashmi, Eternities Crafter", 231, Rarity.MYTHIC, mage.cards.r.RashmiEternitiesCrafter.class));
        cards.add(new SetCardInfo("Read the Bones", 154, Rarity.COMMON, mage.cards.r.ReadTheBones.class));
        cards.add(new SetCardInfo("Reality Shift", 125, Rarity.UNCOMMON, mage.cards.r.RealityShift.class));
        cards.add(new SetCardInfo("Reliquary Tower", 295, Rarity.UNCOMMON, mage.cards.r.ReliquaryTower.class));
        cards.add(new SetCardInfo("Retreat to Coralhelm", 126, Rarity.UNCOMMON, mage.cards.r.RetreatToCoralhelm.class));
        cards.add(new SetCardInfo("Return to Dust", 102, Rarity.UNCOMMON, mage.cards.r.ReturnToDust.class));
        cards.add(new SetCardInfo("Sakura-Tribe Elder", 194, Rarity.COMMON, mage.cards.s.SakuraTribeElder.class));
        cards.add(new SetCardInfo("Sandwurm Convergence", 195, Rarity.RARE, mage.cards.s.SandwurmConvergence.class));
        cards.add(new SetCardInfo("Scroll of Fate", 251, Rarity.RARE, mage.cards.s.ScrollOfFate.class));
        cards.add(new SetCardInfo("Scute Swarm", 197, Rarity.RARE, mage.cards.s.ScuteSwarm.class));
        cards.add(new SetCardInfo("Shark Typhoon", 127, Rarity.RARE, mage.cards.s.SharkTyphoon.class));
        cards.add(new SetCardInfo("Shigeki, Jukai Visionary", 198, Rarity.RARE, mage.cards.s.ShigekiJukaiVisionary.class));
        cards.add(new SetCardInfo("Sigil of the Empty Throne", 103, Rarity.RARE, mage.cards.s.SigilOfTheEmptyThrone.class));
        cards.add(new SetCardInfo("Simic Growth Chamber", 298, Rarity.UNCOMMON, mage.cards.s.SimicGrowthChamber.class));
        cards.add(new SetCardInfo("Simic Signet", 252, Rarity.UNCOMMON, mage.cards.s.SimicSignet.class));
        cards.add(new SetCardInfo("Skaab Ruinator", 128, Rarity.MYTHIC, mage.cards.s.SkaabRuinator.class));
        cards.add(new SetCardInfo("Sol Ring", 94, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 253, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Sphere of Safety", 104, Rarity.UNCOMMON, mage.cards.s.SphereOfSafety.class));
        cards.add(new SetCardInfo("Spirit-Sister's Call", 232, Rarity.MYTHIC, mage.cards.s.SpiritSistersCall.class));
        cards.add(new SetCardInfo("Starfield Mystic", 105, Rarity.RARE, mage.cards.s.StarfieldMystic.class));
        cards.add(new SetCardInfo("Suspicious Bookcase", 95, Rarity.COMMON, mage.cards.s.SuspiciousBookcase.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 106, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Tainted Field", 302, Rarity.UNCOMMON, mage.cards.t.TaintedField.class));
        cards.add(new SetCardInfo("Tainted Isle", 303, Rarity.UNCOMMON, mage.cards.t.TaintedIsle.class));
        cards.add(new SetCardInfo("Tangled Islet", 306, Rarity.COMMON, mage.cards.t.TangledIslet.class));
        cards.add(new SetCardInfo("Tatyova, Benthic Druid", 235, Rarity.UNCOMMON, mage.cards.t.TatyovaBenthicDruid.class));
        cards.add(new SetCardInfo("Telling Time", 75, Rarity.UNCOMMON, mage.cards.t.TellingTime.class));
        cards.add(new SetCardInfo("Temple of Deceit", 307, Rarity.RARE, mage.cards.t.TempleOfDeceit.class));
        cards.add(new SetCardInfo("Temple of Enlightenment", 308, Rarity.RARE, mage.cards.t.TempleOfEnlightenment.class));
        cards.add(new SetCardInfo("Temple of Mystery", 311, Rarity.RARE, mage.cards.t.TempleOfMystery.class));
        cards.add(new SetCardInfo("Temple of Silence", 312, Rarity.RARE, mage.cards.t.TempleOfSilence.class));
        cards.add(new SetCardInfo("Temple of the False God", 313, Rarity.UNCOMMON, mage.cards.t.TempleOfTheFalseGod.class));
        cards.add(new SetCardInfo("Temur War Shaman", 200, Rarity.RARE, mage.cards.t.TemurWarShaman.class));
        cards.add(new SetCardInfo("Terminus", 70, Rarity.RARE, mage.cards.t.Terminus.class));
        cards.add(new SetCardInfo("The Eldest Reborn", 139, Rarity.UNCOMMON, mage.cards.t.TheEldestReborn.class));
        cards.add(new SetCardInfo("They Came from the Pipes", 14, Rarity.RARE, mage.cards.t.TheyCameFromThePipes.class));
        cards.add(new SetCardInfo("Thirst for Meaning", 129, Rarity.COMMON, mage.cards.t.ThirstForMeaning.class));
        cards.add(new SetCardInfo("Thornwood Falls", 314, Rarity.COMMON, mage.cards.t.ThornwoodFalls.class));
        cards.add(new SetCardInfo("Thriving Heath", 315, Rarity.COMMON, mage.cards.t.ThrivingHeath.class));
        cards.add(new SetCardInfo("Thriving Isle", 316, Rarity.COMMON, mage.cards.t.ThrivingIsle.class));
        cards.add(new SetCardInfo("Thriving Moor", 317, Rarity.COMMON, mage.cards.t.ThrivingMoor.class));
        cards.add(new SetCardInfo("Time Wipe", 237, Rarity.RARE, mage.cards.t.TimeWipe.class));
        cards.add(new SetCardInfo("Timely Ward", 107, Rarity.RARE, mage.cards.t.TimelyWard.class));
        cards.add(new SetCardInfo("Trail of Mystery", 203, Rarity.RARE, mage.cards.t.TrailOfMystery.class));
        cards.add(new SetCardInfo("Trygon Predator", 238, Rarity.UNCOMMON, mage.cards.t.TrygonPredator.class));
        cards.add(new SetCardInfo("Underground River", 321, Rarity.RARE, mage.cards.u.UndergroundRiver.class));
        cards.add(new SetCardInfo("Utter End", 91, Rarity.RARE, mage.cards.u.UtterEnd.class));
        cards.add(new SetCardInfo("Verge Rangers", 108, Rarity.RARE, mage.cards.v.VergeRangers.class));
        cards.add(new SetCardInfo("Vineglimmer Snarl", 323, Rarity.RARE, mage.cards.v.VineglimmerSnarl.class));
        cards.add(new SetCardInfo("Whisperwood Elemental", 204, Rarity.MYTHIC, mage.cards.w.WhisperwoodElemental.class));
        cards.add(new SetCardInfo("Wilderness Reclamation", 205, Rarity.UNCOMMON, mage.cards.w.WildernessReclamation.class));
        cards.add(new SetCardInfo("Worldspine Wurm", 206, Rarity.MYTHIC, mage.cards.w.WorldspineWurm.class));
        cards.add(new SetCardInfo("Yavimaya Coast", 327, Rarity.RARE, mage.cards.y.YavimayaCoast.class));
        cards.add(new SetCardInfo("Yavimaya Elder", 208, Rarity.COMMON, mage.cards.y.YavimayaElder.class));
        cards.add(new SetCardInfo("Yedora, Grave Gardener", 209, Rarity.UNCOMMON, mage.cards.y.YedoraGraveGardener.class));
    }
}
