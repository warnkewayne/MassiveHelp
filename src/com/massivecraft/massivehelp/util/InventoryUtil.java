package com.massivecraft.massivehelp.util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;


public class InventoryUtil
{
	public static ItemStack createGuiItem(String name, ArrayList<String> desc, Material material)
	{
		ItemStack i = new ItemStack(material, 1);
		ItemMeta iMeta = i.getItemMeta();
		iMeta.setDisplayName(name);
		iMeta.setLore(desc);
		iMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		i.setItemMeta(iMeta);
		
		return i;
	}
	
	public static ItemStack createGuiItem(String name, Material material)
	{
		ItemStack i = new ItemStack(material, 1);
		ItemMeta iMeta = i.getItemMeta();
		iMeta.setDisplayName(name);
		iMeta.setLore(new ArrayList<String>());
		iMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		i.setItemMeta(iMeta);
		
		return i;
	}
}
