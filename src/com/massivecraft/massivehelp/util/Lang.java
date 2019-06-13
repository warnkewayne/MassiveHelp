package com.massivecraft.massivehelp.util;

import com.massivecraft.massivecore.util.Txt;

import java.util.ArrayList;
import java.util.Arrays;

public class Lang
{
	// -------------------------------------------- //
	// METHODS
	// -------------------------------------------- //
	
	public static ArrayList<String> toList(String s)
	{
		return new ArrayList<String>(Arrays.asList(s));
	}
	
	
	// -------------------------------------------- //
	// MENU TITLES
	// -------------------------------------------- //
	
	public final static String mainMenuTitle = "Help";
	public final static String factionMenuTitle = mainMenuTitle + ": Factions";
	public final static String factionMenuPermTitle = factionMenuTitle + " - Perms";
	public final static String factionMenuClaimTitle = factionMenuTitle + " - Claims";
	public final static String factionMenuMiscTitle = factionMenuTitle + " - Misc";
	
	public final static String lockMenuTitle = mainMenuTitle + ": Lock";
	
	
	// -------------------------------------------- //
	// CONSTANTS
	// -------------------------------------------- //
	
	public static String chatList()
	{
		String title = Txt.parse("<k>Chat List");
		String one = Txt.parse("<i>Local (L:) <white>- Only heard by nearby players.");
		String two = Txt.parse("<i>Direct (D:) <white>- Direct chat with another player");
		String thr = Txt.parse("<i>General (G:) <white>- General Non-RP Chat");
		String four =Txt.parse("<i>PVP (P:) <white>- General PVP Chat");
		String five =Txt.parse("<i>Out Of Character (O:) <white>- General RP Chat heard by nearby players.");
		String six = Txt.parse("<i>Recruitment (R:) <white>- Recruit for your faction here.");
		String sev = Txt.parse("<i>Trade (T:) <white>- Buy & Sell here.");
		String eig = Txt.parse("<i>Help (H:) <white>- Get help & help others here.");
		String nine =Txt.parse("<i>Faction (F:) <white>- Faction members only chat.");
		String ten = Txt.parse("<i>Alliance (A:) <white>- Chat for all your allied factions.");
		
		return title + "/n" + one + "/n" + two + "/n" + thr + "/n" + four + "/n" + five + "/n" + six + "/n" + sev + "/n" + eig + "/n" + nine + "/n" + ten;
	}
	
	// -------------------------------------------- //
	// FACTIONS CONSTANTS
	// -------------------------------------------- //
	
	public static String factionFlagList()
	{
		String one = Txt.parse("<k>Faction Flag List");
		String two = Txt.parse("<i>Open <white>- Anyone can join. No invite needed.");
		String thr = Txt.parse("<i>Mobs <white>- Mobs can spawn in your faction.");
		String four = Txt.parse("<i>Animals <white>- Animals can spawn in your faction.");
		
		return one + "\n" + "\n" + two + "\n" + thr + "\n" + four;
	}
	
	public static String factionRelationList()
	{
		String title = Txt.parse("<k>Faction Relation List");
		String one = Txt.parse("<i>Ally <white>- These are your friends! They can use Ally Chat.");
		String two = Txt.parse("<i>Truce <white>- These factions are truced. They cannot attack you.");
		String thr = Txt.parse("<i>Neutral <white>- These factions have no relation.");
		String four =Txt.parse("<i>Enemy <white>- These are your enemies. They can attack you on sight.");
	
		return title + "\n" + one + "\n" + two + "\n" + thr + "\n" + four;
	}
	
	public static String factionRankList()
	{
		String title = Txt.parse("<k>Faction Ranking List");
		String one = Txt.parse("<i>Leader <white>- The ONE player with all permission access in a faction.");
		String two = Txt.parse("<i>Officer <white>- This role is directly below the leader and above the memebers.");
		String thr = Txt.parse("<i>Member <white>- This role mainly makes up the faction.");
		String four =Txt.parse("<i>Recruit <white>- The starting rank when a player joins.");
	
		return title + "\n" + one + "\n" + two + "\n" + thr + "\n" + four;
	}
	
	
	// misc faction commands
	
	public static final String miscMainDesc = Txt.parse("<gold>Faction Flags, Ranks, & Relations List, Promote Cmds, Etc..");
	
	public static final String promoteCmd = Txt.parse("<k>/f promote <blue>[playername] <i>This will promote a player up one rank.");
	
	public static final String promoteDemoteCmd = Txt.parse("<k>/f demote <blue>[playername] <i>This will demote a player down one rank.");
	
	public static final String promoteToLeaderCmd = Txt.parse("<k>/f leader <blue>[playername] <i>This will give a player faction leadership.");
	
	public static final String showStatusCmd = Txt.parse("<k>/f player <blue>[playername] <i>Show faction member power & online activity.");
	
	public static final String setHomeCmd = Txt.parse("<k>/f set home <i> Set your faction spawn point.");
	
	public static final String allyTelCmd = Txt.parse("<k>/tp <blue>[Faction name] <i>Teleport to your ally's faction.");
	
	// faction claiming commands
	
	public static final String claimMainDesc = Txt.parse("<gold>What's a faction without land? Learn to claim land here!");
	
	public static final String claimOneCmd = Txt.parse("<k>/f claim one <i>This will claim a single chunk for your faction.");
	
	public static final String claimAutoCmd = Txt.parse("<k>/f claim auto <i> This will claim each chunk you walk over until turned off.");
	
	public static final String claimFillCmd = Txt.parse("<k>/f claim fill <i> This will claim any holes you have in your faction's claim.");
	
	public static final String claimSquareCmd = Txt.parse("<k>/f claim square <blue>[number] <i>This will claim a square of land, size depending on the number.");
	
	public static final String claimCircleCmd = Txt.parse("<k>/f claim circle <blue>[number] <i>This will claim a circle of land, size depending on the number.");
	
	public static final String claimAccessCmd = Txt.parse("<k>/f access p <blue>[playername] <i>This will give a player access to the chunk. (No matter faction or relation)");
	
	// faction perms commands
	
	public static final String permMainDesc = Txt.parse("<gold>Learn to set perms for your faction!");
	
	public static final String permContainerCmd = Txt.parse("<k>/f perm set container <blue>[relation] <yes/no> <i>Sets who can use containers.");
	
	public static final String permChangeRelCmd = Txt.parse("<k>/f perm set rel <blue>[relation] <yes/no> <i>Sets relation with other factions.");
	
	public static final String permButtonCmd = Txt.parse("<k>/f perm set button <blue>[relation] <yes/no> <i>Sets who can use buttons.");
	
	public static final String permAccessCmd = Txt.parse("<k>/f perm set access <blue>[relation] <yes/no> <i>Grants build access in a chunk.");
	
	public static final String permTitleCmd = Txt.parse("<k>/f perm set title <blue>[relation] <yes/no> <i>Sets who can change a player's title in a faction.");
	
	public static final String permFlagCmd = Txt.parse("<k>/f perm set flag <blue>[relation] <yes/no> <i>Manage Faction Flags");
	
	public static final String permDoorCmd = Txt.parse("<k>/f perm set door <blue>[relation] <yes/no> <i>Sets who can use doors.");
	
	public static final String permKickCmd = Txt.parse("<k>/f perm set kick <blue>[relation] <yes/no> <i>Sets who can kick lower ranked members.");
	
	public static final String permBuildCmd = Txt.parse("<k>/f perm set build <blue>[relation] <yes/no> <i>Sets who can edit terrain.");
	
	public static final String permHomeCmd = Txt.parse("<k>/f perm set home <blue>[relation] <yes/no> <i>Sets who can change faction spawn point.");
	
	public static final String permLeverCmd = Txt.parse("<k>/f perm set lever <blue>[relation] <yes/no> <i>Sets who can use levers.");
	
	public static final String permMotdCmd = Txt.parse("<k>/f perm set motd <blue>[relation] <yes/no> <i>Sets who can change Message Of The Day (MOTD)");
	
	public static final String permDisbandCmd = Txt.parse("<k>/f perm set disband <blue>[relation] <yes/no> <i>Sets who can disband the faction.");
	
	public static final String permClaimNearCmd = Txt.parse("<k>/f perm set claimnear <blue>[relation] <yes/no> <i>Sets who can claim near the faction.");
	
	public static final String permNameCmd = Txt.parse("<k>/f perm set name <blue>[relation] <yes/no> <i>Set who can change the name of the faction.");
	
	public static final String permInviteCmd = Txt.parse("<k>/f perm set invite <blue>[relation] <yes/no> <i>Sets who can invite players to the faction.");
	
	public static final String permDescCmd = Txt.parse("<k>/f perm set invite <blue>[relation] <yes/no> <i>Sets who can set faction description.");
	
	public static final String permWithdrawCmd = Txt.parse("<k>/f perm set withdraw <blue>[relation] <yes/no> <i>Sets who can withdraw money from the faction bank.");
	
	public static final String permTerritoryCmd = Txt.parse("<k>/f perm set claim <blue>[relation] <yes/no> <i>Sets who can claim faction land.");
	
	
	// -------------------------------------------- //
	// LOCK CONSTANTS
	// -------------------------------------------- //
	
	public static String lockModeList()
	{
		String title = Txt.parse("<k>Lock Mode List");
		String one = Txt.parse("<i>Private <white>- Default lock mode. This lock is only for you.");
		String two = Txt.parse("<i>Donation <white>- Allow other players to place in the chest, but not remove from it.");
		String thr = Txt.parse("<i>Shop <white>- This mode will allow to buy and sell items.");
		String four = Txt.parse("<i>Public <white>- Anyone can take and remove items from the chest.");
		
		return title + "\n" + one + "\n" + two + "\n" + thr + "\n" + four;
	}
	
	public static String shopLockCreationSteps()
	{
		String title = Txt.parse("<k>Shop Creation Steps");
		String one = Txt.parse("<i>/lock edit create <blue>[lockname]");
		String two = Txt.parse("<i>/lock tool <white>OR <i>/lock punch <blue><on/off> <white> Left-Click the chest");
		String thr = Txt.parse("<i>/lock edit mode <blue>shop");
		String four = Txt.parse("<white>Hold item in hand. <i>/lock edit shopprices add b{number} s{number} q{number}");
		String five = Txt.parse("<white>Example- b5 (buy for 5) s2 (sell for 2) q1 (quantity 1)");
		String six = Txt.parse("<white>Shift right-click on chest with empty hand & place the item in you added to the chest.");
		String sev = Txt.parse("<white>Escape out the chest & right-click the chest to see your item you are buying or selling.");
		String eig = Txt.parse("<white>If a mistake has been made, do /lock edit shopprices show & /lock edit shopprices removeindex [number] to remove.");
		
		return title + "\n" + one + "\n" + two + "\n" + thr + "\n" + four + "\n" + five + "\n" + six + "\n" + sev + "\n" + eig;
	}
	
	// lock tools
	
	public static final String lockToolCmd = Txt.parse("<k>/lock tool <i>Left-Click locks, Right-Click removes lock.");
	
	public static final String lockPunchCmd = Txt.parse("<k>/lock punch <i>Left-Click locks, Right-Click removes lock.");

	// lock commands
	
	public static final String lockCreateCmd = Txt.parse("<k>/lock create <blue>[name] <i>Hit the object with the tool to lock.");
	
	public static final String lockDeleteCmd = Txt.parse("<k>/lock delete <blue>[name] <i>Hit the object and run this command.");
	
	public static final String lockEditNameCmd = Txt.parse("<k>/lock edit name <blue>[name] <i>Changes the lock name to the name provided.");
	
	public static final String lockEditAutoCloseCmd = Txt.parse("<k>/lock edit autoclose <blue>[timeamount] <i>Will make a door close after the time amount provided.");
	
	public static final String lockEditModeCmd = Txt.parse("<k>/lock edit mode <blue>[mode] <i> Changes the mode of the lock.");
	
	public static final String lockEditPartsShowCmd = Txt.parse("<k>/lock edit parts show <i>Show every part you have locked with a particular lock.");
	
	public static final String lockEditPartsRemoveCmd = Txt.parse("<k>/lock edit parts removeindex <blue>[number] <i>Use lock show to sell index numbers, This will remove the part from the index of the lock.");
	
	public static final String lockEditPartsClearCmd = Txt.parse("<k>/lock edit parts clear <i>Clear all parts from associated lock. ");
	
	// TODO: public static final String lockEditRolesCmd = Txt.parse("<k>/lock ");
	
	//TODO: public static final String lockEditPassCmd = Txt.parse("<k>/lock ");
	
	public static final String lockVisualizeCmd = Txt.parse("<k>/lock visualize <blue><on/off> <i>Defaulted on. Can see all the locks on chests, doors, etc locked by all players.");
	
	// -------------------------------------------- //
	// REGALS CONSTANTS
	// -------------------------------------------- //
	
	public static final String moneyShowCmd = Txt.parse("<k>/money show <blue>[playername] <i>Check how many regals you have.");
	
	public static final String moneyFactionShowCmd = Txt.parse("<k>/f f <blue>[factionname]");
	
	// -------------------------------------------- //
	// MCMMO CONSTANTS
	// -------------------------------------------- //
	
	public static final String mcmmoMainDesc = Txt.parse("<gold>Adds perks, skills, and more to Vanilla Minecraft.");
	
	public static final String traitsList = Txt.parse("<k>/trait list <i>Shows a large list of available traits & their corresponding point cost.");
	
	public static final String traitsInspect = Txt.parse("<k>/trait inspect <i>Shows you what traits you currently have & many points you have to spare");
	
	public static final String traitsCost = Txt.parse("<i>By default, you will have 150 trait points & 10 trait slots. Green traits cost points while red traits give you" +
														  "negative effects but increase your points.");
	
	public static final String traitsAdd = Txt.parse("<k>/trait add <blue>[trait name] <i>Will add a trait. You have to stand still for 30 seconds without taking damage.");
	
	public static final String traitsDisable = Txt.parse("<k>/trait use <i>will toggle it on & off without having to remove it or standing still for 30 seconds.");
	
	public static final String traitsShow = Txt.parse("<k>/trait show <blue>[trait name] <i>will give you description of what the trait does & how many points it costs.");
	
	// ---------------- //
	// GATHERING SKILLS
	// ---------------- //
	
	public static final String mcmmoGatheringSkills = Txt.parse("<i>These are skills which will help gather materials.");
	
	public static final String mcmmoGatherExcavation = Txt.parse("<i>Gives you a higher chance to finding treasures during your dig!");
	
	public static final String mcmmoGatherExcavationActive = Txt.parse("<green>Giga Drill Breaker - <i>Give you a burst in speed when digging at the expense of shovel durability.");
	
	public static final String mcmmoGatherExcavationPassive = Txt.parse("<green>Treasure Hunt - <i>Drop different items per block at a random chance.");
	
		// fishing
	public static final String mcmmoGatherFish = Txt.parse("<i>Enhances vanilla fishing in minecraft. At level 150+, you'll be able to hook items off mobs!");
	
	public static final String mcmmoGatherFishAngler = Txt.parse("<i>Unlocks at level 125. Improves the chance of catching fish while in an ocean biome or in a boat.");
	
	public static final String mcmmoGatherFishIce = Txt.parse("<i>At level 50, allows you to fish in icy biomes. Cast your rod on ice and a water hole will appear.");
	
	public static final String mcmmoGatherFishTreasure = Txt.parse("<i>Chance to reel in random items in addition to the fish. Increases with leveling up.");
	
	public static final String mcmmoGatherFishShake = Txt.parse("<i>At level 150+, you will be able to shake items loose from mobs. Hook them with a fishing rod.");
	
		// herbalism
	public static final String mcmmoGatherHerbal = Txt.parse("<i>Provides benefits which ties to food items like improved healing, extra effects on seeds, & improved harvesting.");

	public static final String mcmmoGatherHerbalGreenTerra = Txt.parse("<green>Green Terra - <i>You can get 3x drops from harvesting plants & have 100% chance to convert Cobblestone " +
																		   "to Mossy Cobblestone, Stone Brick to Mossy Stone Brick, & Dirt to Grass (If you have seeds in your inventory)");
	
	public static final String mcmmoGatherHerbalGreenThumb = Txt.parse("<green>Green Thumb - <i>Turns blocks into their plant counterparts. Right-Click the blocks while holding seeds and get a chance to change Cobblestone" +
																		   "to Mossy Cobblestone, Stone Brick to Mossy Stone Brick, & Dirt to Grass");
	
	public static final String mcmmoGatherHerbalShroomThumb = Txt.parse("<green>Shroom Thumb - <i>Turns dirt & grass into mycelium. Right-click the blocks while holding a mushroom. The mushrooms will be consumed if fails.");
	
	public static final String mcmmoGatherHerbalInstaWheat = Txt.parse("<green>Instant Wheat Regrowth - <i>When harvesting fully grown wheat, have a chance to instantly re-plant the wheat.");
	
	public static final String mcmmoGatherHerbalFarmerDiet = Txt.parse("<green>Farmer's Diet - <i>As you increase level, it will increase the amount of hunger food will restore.");
	
	public static final String mcmmoGatherHerbalHylianLuck = Txt.parse("<green>Hylian Luck - <i>Gives you a chance to gain treasure when breaking grass, saplings, dead bushes, flowers, and plant pots.");
	
		// mining
	public static final String mcmmoGatherMining = Txt.parse("<i>A potential perk of the skill is the higher yield from each other, increased when using an active skill.");
	
	public static final String mcmmoGatherMiningSuper = Txt.parse("<green>Super Breaker  - <i>Speed & Triple Drop chance activates by right-clicking with a pickaxe.");
	
	public static final String mcmmoGatherMiningDblDrop = Txt.parse("<green>Double Drops - <i>Doubles normal loot. This is a passive skill that allows players to gain two items when mining any natural spawned block." +
																		"This increases with each level. Does not stack with fortune enchantment, but does with silk touch.");
	
		// woodcutting
	public static final String mcmmoGatherWoodcutting = Txt.parse("<i>A skill that is based on chopping trees with an axe. The skill gives you increased chances of getting extra wood from trees as well as extra duration" +
																	  "on the Tree Feller ability. ");
	
	public static final String mcmmoGatherWoodcutFeller = Txt.parse("<green>Tree Feller - <i>Active skill that allows to chop down entire trees by breaking on block. Right-click while holding an axe & chop a block of wood or mushroom to activate." +
																		"This will cost your axe extra durability.");
	
	public static final String mcmmoGatherWoodcutLeafBlow = Txt.parse("<green>Leaf Blower - <i>Passive skill unlocked after Woodcutting 100. This will blow away leaves by left-clicking a leaf block with an axe. Efficient for gathering saplings.");
	
	public static final String mcmmoGatherWoodcutDblDrops = Txt.parse("<green>Double Drops - <i>Passive skill which doubles normal loot when chopping any tree or mushroom block naturally spawned.");
	
	// ---------------- //
	// COMBAT SKILLS
	// ---------------- //
	
	public static final String mcmmoCombatSkills = Txt.parse("<i>These are skills which will give you the upper hand in combat. The higher the skill, the better chance you will" +
																 "proc a passive skill or turn the tides on your opponents by using an active skill on them.");
	
	public static final String mcmmoCombatArchery = Txt.parse("<green>Archery - <i>A combat skill which includes passive abilities and can deal more damage than vanilla Minecraft.");
	
	public static final String mcmmoCombatDaze = Txt.parse("<green>Daze - <i>Gives you a chance to give your enemy nausea and deal extra damage. Forces the enemy to look upwards giving yourself a big advantage in PVP.");
	
	public static final String mcmmoCombatArrowRet = Txt.parse("<green>Arrow Retrieval - <i>Passive ability allowd you to pick up arrows fired at mobs or enemies in PVP.");
	
		// animal skills
	public static final String mcmmoCombatTaming = Txt.parse("<green>Taming - <i>Allows you to summon, examine, and use pets as effective support in combat. Right-click on ocelots/wolves with an empty hand to make it stand or sit.");
	
	public static final String mcmmoCombatCallWild = Txt.parse("<green>Call of the Wild - <i>Summons an animal to your side. To use it hold, 10 bones for a wolf or 10 fish for a ocelot & hold shift while left-clicking. " +
																   "Animals spawned with this skill will have a custom name.");
	
	public static final String mcmmoCombatBeastLore = Txt.parse("<green>Beast Lore - <i>Left-click with bone to use. This shows the pet owner name & it's health left over.");
	
	public static final String mcmmoCombatGore = Txt.parse("<green>Gore - <i>Passive Skill whenever a tamed wolf attacks a target, there is a chance they will inflict a critical strike that also applies a bleed on them.");
	
	public static final String mcmmoCombatFastFood = Txt.parse("<green>Fast food service - <i>Unlocks at level 50 taming, this gives the wolf a chance to heal on attack.");
	
	public static final String mcmmoCombatEnvAware = Txt.parse("<green>Enviromentally Aware - <i>Unlocks at level 100, gives the pet phobia to lava/cactus, and makes it immune to fall damage.");
	
	public static final String mcmmoCombatThickFur = Txt.parse("<green>Thick Fur -<i>Reduces the damage to the pet & gives it fire resistant. This unlocks at level 250.");
	
	public static final String mcmmoCombatHolyHound = Txt.parse("<green>Holy Hound -<i>This ability unlocks at level 375. Wolf regain health when damaged by magic or poison.");
	
	public static final String mcmmoCombatShockProof = Txt.parse("<green>Shock Proof -<i>This unlocks at level 500 taming. This reduces the explosive damage done to the pet.");
	
	public static final String mcmmoCombatSharpClaws = Txt.parse("<green>Sharpened Claws -<i>This unlocks at level 750 taming. This adds damage bonus to the pets attack.");
	
		// axe skills
	public static final String mcmmoCombatAxes = Txt.parse("<i>Axes is used by fighting with an axe as a weapon against mobs or other players. Axes are useful in" +
															   "PVP to break armour & deal critical strikes depending on your level.");
	
	public static final String mcmmoCombatSkullSplit = Txt.parse("<green>Skull Splitter - <i>Axe in hand, right-click a block making your ability ready to use. Left-click on a mob or player to activate the ability." +
																	 "This skill allows you to do an Area of Effect(AoE) hit damage everyone within a half block radius from your main target (dealing half damage to main target).");
	
		// sword skills
	public static final String mcmmoCombatSwords = Txt.parse("<green>This adds the abilities bleed effects to your attacks & counter the enemies hits.");
	
	public static final String mcmmoCombatSerrateStrikes = Txt.parse("<green>Serrated Strikes - <i>Right-click & start attacking a player or mob to cause the bleed effect. The time of this effect is based on the swords level.");
	
	public static final String mcmmoCombatBleed = Txt.parse("<green>Bleed -<i>Passive skill that causes mobs or players to take damage every two seconds. They will bleed until effect wears off or death. The duration of the bleed is increased by your sword skill.");
	
	public static final String mcmmoCombatCtrAttack = Txt.parse("<green>Counter Attack - <i>Takes the damage done to you & returns half to the attacking person/mob. This passive skill won't work" +
																	"if you have half a heart remaining. The chance increases with sword level.");
	
		// unarmed skills
	public static final String mcmmoCombatUnarmed = Txt.parse("<i>Unarmed is a combat skill which uses the player's empty hand to fight your opponents with.");
	
	public static final String mcmmoCombatBerserker = Txt.parse("<green>Berserker -<i>Activate by right-clicking a block & hit a mob/player/weak block. This skill will be active for a limited time and increases when you level up.");
	
		// manufacturing & misc skills
	
	public static final String mcmmoMiscSalvage = Txt.parse("<green>Salvage - <i>Leveled by both repair & fishing. It lets you destroy armour, weapons, & tools using a gold block and gives back some materials used to make them.");
	
	public static final String mcmmoMiscSmelting = Txt.parse("<green>Smelting - <i>Leveled by both repair & mining. It increases fuel efficiency, doubles resources gained, increases XP whiling smelting, & flux mining chance for ores to be instantly smelted when mined.");
	
	public static final String mcmmoMiscAlchemy = Txt.parse("<green>Alchemy - <i>Leveled by brewing potions using brewing stands & has some bonus effects. Catalysis increases potion brewing speed & concoctions brew potions with more ingredients.");
	
	public static final String mcmmoMiscRepair = Txt.parse("<green>Repair - <i>Leveled through repairing armour, weapons, & tools on an iron block when you have the required materials. " +
															   "<green>Diamond Repair(50+) <i>able to repair diamond items. <green>Arcane Forging <i>allows you to repair magical items although this has a chance to fail below level 1000.");
	
	public static final String mcmmoMiscAcrobatics = Txt.parse("<green>Acrobatics - <i>Leveled through taking fall damage and getting roll or graceful landing procs which have an increased chance with higher levels. " +
																   "<green>Roll <i>reduces or negates fall damage. <green>Graceful Roll <i>Shift while falling from higher places you can't roll from. <green>Dodge <i>reduces attack damage by half.");
	
	// -------------------------------------------- //
	// DYNMAP CONSTANTS
	// -------------------------------------------- //
	
	public static final String dynmap = Txt.parse("<i>View the dynmap to Massivecraft by typing <k>/map <i>in-game!");
	
	public static final String dynmapHide = Txt.parse("<i>Dynmap is useful & dangerous! If you don't use <k>/dynmap hide <i>Everyone will know where you are & might come kill you. Type <k>/dynmap show <i>to re-appear.");
	
	//TODO:
	// -------------------------------------------- //
	// ROLEPLAY CONSTANTS
	// -------------------------------------------- //
	
	
	// -------------------------------------------- //
	// QUEST CONSTANTS
	// -------------------------------------------- //
	
	public static final String questDesc = Txt.parse("<i>Quests are objectives given to you by clicking on specific NPCs in specific areas.");
	
	public static final String questHub = Txt.parse("<i>The main quest hub on MassiveCraft is in a world called Silverwind. You can get there by typing" +
														"<k>/tp Silverwind <i>, once there look around for NPCs to start your questing adventure!");
	
	public static final String questRewards = Txt.parse("<i>The rewards you get from quests are either regals or lesser quality lore items such as iron swords" +
															", iron tools & armour, other misc lore items.");
	
	// -------------------------------------------- //
	// HELP CONSTANTS
	// -------------------------------------------- //
	
	public static final String helpChat = Txt.parse("<i>Access help chat by typing <k>/ch join help <i>! Then type h: and asking your question. Other players or moderators will" +
														"answer your question shortly.");
	
	public static final String helpForums = Txt.parse("<i>To get started on the forums, <k>https://forums.massivecraft.com/ <i>You will have to create an account." +
														  "Use your in-game name & email. You will be able to view everything with the exception of staff related forums.");
	
	public static final String helpWiki = Txt.parse("<k>https://wiki.massivecraft.com/Main_Page <i>is the best place to learn about the server. Whether wanting to learn about MassiveCraft's expansive lore or to get started in" +
														"factions & survival.");
	
	// TODO: public static final String helpPVP = Txt.parse("");
	
	// -------------------------------------------- //
	// MERCHANTING CONSTANTS
	// -------------------------------------------- //
	
	public static final String merchantMainDesc = Txt.parse("<gold>Want to be rich? Merchanting is one way to earn a lot of regals over a short time.");
	
	public static final String merchantAuction = Txt.parse("<i>Access the auction house by typing <k>/ah <i>& it will bring you to an interface with all types of items," +
															   "to sell items on this auction house type <k>/ah sell <blue>[price] [amount of items] <i>while holding the item(s) you want to sell.");
	
	//TODO: public static final String merchantRegals = Txt.parse("");
	
	//TODO: public static final String merchantMassiveShop = Txt.parse("");
	
	//TODO: public static final String merchantMarket = Txt.parse("");
	
	// -------------------------------------------- //
	// TICKET SYSTEM CONSTANTS
	// -------------------------------------------- //
	
	public static final String ticketMainDesc = Txt.parse("Have a question too complicated to ask in Help Chat? Best way to get help is the Massive Ticket System!");
	
	public static final String ticketSystem = Txt.parse("<k>/ti create <blue>[ticket topic] <i>You will be put on a list of open tickets ready for staff members to pick." +
															"Once they picked it, they will answer your question or ask you to go into further detail & will answer the question.");
	
	// -------------------------------------------- //
	// MISC CONSTANTS
	// -------------------------------------------- //
	
	public static final String disguiseDesc = Txt.parse("<i>This feature is only to available to premium & supremium users. Use <k>/disguise <i> This feature allows you to disguise as most mobs" +
															"in Minecraft, also allows you to disguise as creature's babies such as zombies or sheep. <k>/disguise <blue>[creature] <k>baby");
	
	
	
	
	
	
	
	
	
	
	
	
}
