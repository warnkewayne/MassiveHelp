package com.massivecraft.massivehelp.cmd;

import com.massivecraft.massivecore.util.IdUtil;
import com.massivecraft.massivehelp.MainMenu;
import com.massivecraft.massivecore.command.MassiveCommand;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.command.requirement.RequirementIsPlayer;
import com.massivecraft.massivehelp.Perm;
import com.massivecraft.massivehelp.entity.MConf;

import java.util.List;

public class CmdHelpUse extends MassiveCommand
{
	// -------------------------------------------- //
	// INSTANCE
	// -------------------------------------------- //
	
	private static CmdHelpUse i = new CmdHelpUse() { @Override public List<String> getAliases() { return MConf.get().aliasesHelpUseOuter; }};
	public static CmdHelpUse get() { return i; }
	
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public CmdHelpUse()
	{
		// Requirements
		this.addRequirements(RequirementIsPlayer.get());
		this.addRequirements(RequirementHasPerm.get(Perm.USE));
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public void perform()
	{
		/*
		Inventory main;
		
		main = Bukkit.createInventory(null, 27, "Help");
		
		main.setItem(0, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Factions"), Material.BED)));
		main.setItem(2, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>PVP"), Material.DIAMOND_SWORD)));
		main.setItem(4, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Quests"), Material.BOOK)));
		main.setItem(6, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Roleplay"), Material.CHAINMAIL_HELMET)));
		main.setItem(8, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Help Chat"), Material.EMERALD)));
		main.setItem(12, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>MCMMO"), Lang.toList(Lang.mcmmoMainDesc), Material.DIAMOND_ORE)));
		main.setItem(14, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Map"), Material.EMPTY_MAP)));
		main.setItem(18, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Merchanting"), Lang.toList(Lang.merchantMainDesc), Material.GOLD_BLOCK)));
		main.setItem(20, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Traits"), Material.IRON_PICKAXE)));
		main.setItem(24, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>MassiveLock"), Material.CHEST)));
		main.setItem(26, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Tickets"), Lang.toList(Lang.ticketMainDesc), Material.PAPER)));
		
		
		ChestGui mainGUI = ChestGui.get(main);
		
		IdUtil.getPlayer(sender).openInventory(mainGUI.getInventory());*/
		
		MainMenu.openMainMenu(IdUtil.getPlayer(sender));
		
		
	}
	
	@Override
	public List<String> getAliases() { return MConf.get().aliasesHelpUseInner; }
	
}
