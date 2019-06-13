package com.massivecraft.massivehelp;

import com.massivecraft.massivecore.chestgui.ChestGui;
import com.massivecraft.massivecore.util.Txt;
import com.massivecraft.massivehelp.util.InventoryUtil;
import com.massivecraft.massivehelp.util.Lang;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class LockMenu
{
	public static void openLocksMenu(Player sender)
	{
		Inventory lock;
		
		lock = Bukkit.createInventory(null, 27, Lang.lockMenuTitle);
		
		lock.setItem(0, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Lock Tool"), Lang.toList(Lang.lockToolCmd), Material.BOOK)));
		lock.setItem(1, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Lock Punch"), Lang.toList(Lang.lockPunchCmd), Material.BOOK)));
		lock.setItem(2, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Create Lock"), Lang.toList(Lang.lockCreateCmd), Material.BOOK)));
		lock.setItem(3, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Delete Lock"), Lang.toList(Lang.lockDeleteCmd), Material.BOOK)));
		lock.setItem(4, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Edit Lock Name"), Lang.toList(Lang.lockEditNameCmd), Material.BOOK)));
		lock.setItem(5, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Lock Autoclose"), Lang.toList(Lang.lockEditAutoCloseCmd), Material.BOOK)));
		lock.setItem(6, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Edit Mode Lock"), Lang.toList(Lang.lockEditModeCmd), Material.BOOK)));
		lock.setItem(7, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Show Lock Parts"), Lang.toList(Lang.lockEditPartsShowCmd), Material.BOOK)));
		lock.setItem(8, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Remove Lock Parts"), Lang.toList(Lang.lockEditPartsRemoveCmd), Material.BOOK)));
		lock.setItem(9, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Clear Lock Parts"), Lang.toList(Lang.lockEditPartsClearCmd), Material.BOOK)));
		lock.setItem(10, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Visualize Lock"), Lang.toList(Lang.lockVisualizeCmd), Material.BOOK)));
		lock.setItem(11, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Lock Mode List"), Lang.toList("Click for the list!"), Material.PAPER)));
		lock.setItem(12, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("How to Create Shop Locks"), Lang.toList("Click for the list!"), Material.PAPER)));
		
		lock.setItem(18, new ItemStack(InventoryUtil.createGuiItem(Txt.parse("Back"), Material.WHITE_WOOL)));
		
		
		ChestGui lockGui = new ChestGui();
		
		lockGui.setInventory(lock);
		lockGui.isAutoclosing();
		
		sender.openInventory(lockGui.getInventory());
	}
	
}
