package com.massivecraft.massivehelp;

import com.massivecraft.massivecore.chestgui.ChestGui;
import com.massivecraft.massivecore.util.MaterialUtil;
import com.massivecraft.massivecore.util.Txt;
import com.massivecraft.massivehelp.util.InventoryUtil;
import com.massivecraft.massivehelp.util.Lang;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class FactionsMenu
{
	
	public static void openFactionsMenu(Player sender)
	{
		
		Inventory faction;
		
		faction = Bukkit.createInventory(null, 27, Lang.factionMenuTitle);
		
		faction.setItem(2, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Permission Commands"), Lang.toList(Lang.permMainDesc), Material.BOOK)));
		faction.setItem(4, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Claim Commands"), Lang.toList(Lang.claimMainDesc), Material.BOOK)));
		faction.setItem(6, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Other Faction Info"), Lang.toList(Lang.miscMainDesc), Material.BOOK)));
		faction.setItem(18, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Back"), Material.WHITE_WOOL)));
		
		
		ChestGui factionGUI = new ChestGui();
		
		factionGUI.setInventory(faction);
		factionGUI.isAutoclosing();
		
		sender.openInventory(factionGUI.getInventory());
	}
	
	
	public static void openFactionsPermMenu(Player sender)
	{
		Inventory factionPerms;
		
		factionPerms = Bukkit.createInventory(null, 54, Lang.factionMenuPermTitle);
		
		factionPerms.setItem(0, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Container Perms"), Lang.toList(Lang.permContainerCmd), Material.BOOK)));
		factionPerms.setItem(1, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Change Relations Perms"), Lang.toList(Lang.permChangeRelCmd), Material.BOOK)));
		factionPerms.setItem(2, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Button Perms"), Lang.toList(Lang.permButtonCmd), Material.BOOK)));
		factionPerms.setItem(3, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Access Perms"), Lang.toList(Lang.permAccessCmd), Material.BOOK)));
		factionPerms.setItem(4, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Title Perms"), Lang.toList(Lang.permTitleCmd), Material.BOOK)));
		factionPerms.setItem(5, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Flag Perms"), Lang.toList(Lang.permFlagCmd), Material.BOOK)));
		factionPerms.setItem(6, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Door Perms"), Lang.toList(Lang.permDoorCmd), Material.BOOK)));
		factionPerms.setItem(7, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Kick Perms"), Lang.toList(Lang.permKickCmd), Material.BOOK)));
		factionPerms.setItem(8, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Build Perms"), Lang.toList(Lang.permBuildCmd), Material.BOOK)));
		factionPerms.setItem(9, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Home Perms"), Lang.toList(Lang.permHomeCmd), Material.BOOK)));
		factionPerms.setItem(10, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Lever Perms"), Lang.toList(Lang.permLeverCmd), Material.BOOK)));
		factionPerms.setItem(11, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Message of the Day Perms"), Lang.toList(Lang.permMotdCmd), Material.BOOK)));
		factionPerms.setItem(12, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Disband Perms"), Lang.toList(Lang.permDisbandCmd), Material.BOOK)));
		factionPerms.setItem(13, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Claiming Near Perms"), Lang.toList(Lang.permClaimNearCmd), Material.BOOK)));
		factionPerms.setItem(14, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Name Faction Perms"), Lang.toList(Lang.permNameCmd), Material.BOOK)));
		factionPerms.setItem(15, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Invite Perms"), Lang.toList(Lang.permInviteCmd), Material.BOOK)));
		factionPerms.setItem(16, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Kick Perms"), Lang.toList(Lang.permKickCmd), Material.BOOK)));
		factionPerms.setItem(17, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Description Perms"), Lang.toList(Lang.permDescCmd), Material.BOOK)));
		factionPerms.setItem(18, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Withdraw Perms"), Lang.toList(Lang.permWithdrawCmd), Material.BOOK)));
		factionPerms.setItem(18, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Territory Perms"), Lang.toList(Lang.permTerritoryCmd), Material.BOOK)));
		
		factionPerms.setItem(45, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Back"), Material.WHITE_WOOL)));
		
		ChestGui factionPermGUI = new ChestGui();
		
		factionPermGUI.setInventory(factionPerms);
		factionPermGUI.isAutoclosing();
		
		sender.openInventory(factionPermGUI.getInventory());
	}
	
	public static void openFactionsClaimMenu(Player sender)
	{
		Inventory factionClaim;
		
		factionClaim = Bukkit.createInventory(null, 54, Lang.factionMenuClaimTitle);
		
		factionClaim.setItem(0, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Claim one chuck"), Lang.toList(Lang.claimOneCmd), Material.BOOK)));
		factionClaim.setItem(1, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Auto Claim"), Lang.toList(Lang.claimAutoCmd), Material.BOOK)));
		factionClaim.setItem(2, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Fill Claim"), Lang.toList(Lang.claimFillCmd), Material.BOOK)));
		factionClaim.setItem(3, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Claim Square"), Lang.toList(Lang.claimSquareCmd), Material.BOOK)));
		factionClaim.setItem(4, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Claim Circle"), Lang.toList(Lang.claimCircleCmd), Material.BOOK)));
		factionClaim.setItem(5, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Claim Access"), Lang.toList(Lang.claimAccessCmd), Material.BOOK)));

		factionClaim.setItem(45, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Back"), Material.WHITE_WOOL)));
		
		
		ChestGui factionClaimGUI = new ChestGui();
		
		factionClaimGUI.setInventory(factionClaim);
		factionClaimGUI.isAutoclosing();
		
		sender.openInventory(factionClaimGUI.getInventory());
	}
	
	public static void openFactionsMiscMenu(Player sender)
	{
		Inventory factionMisc;
		
		factionMisc = Bukkit.createInventory(null, 54, Lang.factionMenuMiscTitle);
		
		//factionClaim.setItem(0, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Claim one chuck"), Lang.toList(Lang.claimOneCmd), Material.BOOK)));
		factionMisc.setItem(0, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Promotion Command"), Lang.toList(Lang.promoteCmd), Material.BOOK)));
		factionMisc.setItem(1, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Demotion Command"), Lang.toList(Lang.promoteDemoteCmd), Material.BOOK)));
		factionMisc.setItem(2, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Make Leader Command"), Lang.toList(Lang.promoteToLeaderCmd), Material.BOOK)));
		
		factionMisc.setItem(3, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Player Status Command"), Lang.toList(Lang.showStatusCmd), Material.BOOK)));
		factionMisc.setItem(4, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Set /f home"), Lang.toList(Lang.setHomeCmd), Material.BOOK)));
		factionMisc.setItem(5, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Teleport to Ally Faction"), Lang.toList(Lang.allyTelCmd), Material.BOOK)));
		
		factionMisc.setItem(19, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Faction Rank List"), Lang.toList(Txt.parse("<i>Click for the list!")), Material.PAPER)));
		factionMisc.setItem(22, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Faction Relation List"), Lang.toList(Txt.parse("<i>Click for the list!")), Material.PAPER)));
		factionMisc.setItem(25, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Faction Flag List"), Lang.toList(Txt.parse("<i>Click for the list!")), Material.PAPER)));
		
		factionMisc.setItem(45, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Back"), Material.WHITE_WOOL)));
		
		
		ChestGui factionMiscGUI = new ChestGui();
		
		factionMiscGUI.setInventory(factionMisc);
		factionMiscGUI.isAutoclosing();
		
		sender.openInventory(factionMiscGUI.getInventory());
	}
}
