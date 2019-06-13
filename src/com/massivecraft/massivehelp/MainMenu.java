package com.massivecraft.massivehelp;

import com.massivecraft.massivecore.chestgui.ChestGui;
import com.massivecraft.massivecore.util.IdUtil;
import com.massivecraft.massivecore.util.Txt;
import com.massivecraft.massivehelp.entity.MConf;
import com.massivecraft.massivehelp.util.InventoryUtil;
import com.massivecraft.massivehelp.util.Lang;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MainMenu
{
	public static void openMainMenu(Player sender)
	{
		
		Inventory main;
		
		main = Bukkit.createInventory(null, 27, Lang.mainMenuTitle);
		
		main.setItem(0, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Factions"), Material.RED_BED)));
		main.setItem(2, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>PVP"), Material.DIAMOND_SWORD)));
		main.setItem(4, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Quests"), Material.BOOK)));
		main.setItem(6, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Roleplay"), Material.CHAINMAIL_HELMET)));
		main.setItem(8, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Help Chat"), Material.EMERALD)));
		main.setItem(12, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>MCMMO"), Lang.toList(Lang.mcmmoMainDesc), Material.DIAMOND_ORE)));
		main.setItem(14, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Map"), Material.MAP)));
		main.setItem(18, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Merchanting"), Lang.toList(Lang.merchantMainDesc), Material.GOLD_BLOCK)));
		main.setItem(20, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Traits"), Material.IRON_PICKAXE)));
		main.setItem(24, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>MassiveLock"), Material.CHEST)));
		main.setItem(26, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("<k>Tickets"), Lang.toList(Lang.ticketMainDesc), Material.PAPER)));
		
		
		
		ChestGui mainGUI = new ChestGui();
		mainGUI.setInventory(main);
		
		mainGUI.isAutoclosing();
		
		
		sender.openInventory(mainGUI.getInventory());
	}
	
}
