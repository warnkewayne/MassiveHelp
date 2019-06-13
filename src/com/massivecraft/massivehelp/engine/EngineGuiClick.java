package com.massivecraft.massivehelp.engine;

import com.massivecraft.massivecore.Engine;
import com.massivecraft.massivecore.util.IdUtil;
import com.massivecraft.massivehelp.FactionsMenu;
import com.massivecraft.massivehelp.MainMenu;
import com.massivecraft.massivehelp.util.Lang;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryClickEvent;

public class EngineGuiClick extends Engine
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static EngineGuiClick i = new EngineGuiClick();
	public static EngineGuiClick get() { return i; }
	
	
	// -------------------------------------------- //
	// NAVIGATE THE HELP MENUS
	// -------------------------------------------- //
	@EventHandler(priority = EventPriority.NORMAL)
	public void menuNavigation(final InventoryClickEvent event)
	{
		
		String invTitle = event.getInventory().getTitle();
		Player p = IdUtil.getPlayer(event.getWhoClicked());
		int slot = event.getSlot();
		
		// Main Help Menu
		if(invTitle.equals(Lang.mainMenuTitle))
		{
			event.setCancelled(true);
			
			// Factions is selected ...
			if(slot == 0)
			{
				FactionsMenu.openFactionsMenu(p);
				return;
			}
			
			//TODO: ADD ifs for the rest of the menus
			
		}
		
		// Factions Help Menu
		if(invTitle.equals(Lang.factionMenuTitle))
		{
			event.setCancelled(true);
			
			// Factions Perms is selected ...
			if(slot == 2) FactionsMenu.openFactionsPermMenu(p);
			
			// Factions Claims is selected
			if(slot == 4) FactionsMenu.openFactionsClaimMenu(p);
			
			// Factions Misc is selected
			if(slot == 6) FactionsMenu.openFactionsMiscMenu(p);
			
			// Back to Main Menu
			if(slot == 18) MainMenu.openMainMenu(p);
		}
		
		if(invTitle.equals(Lang.factionMenuPermTitle) || invTitle.equals(Lang.factionMenuClaimTitle))
		{
			event.setCancelled(true);
			
			// Back to Factions Menu
			if(slot == 45) FactionsMenu.openFactionsMenu(p);
		}
		
		if(invTitle.equals(Lang.factionMenuMiscTitle))
		{
			event.setCancelled(true);
			
			// Faction Rank List -- send as msg
			if(slot == 19)
			{
				p.closeInventory();
				IdUtil.getSender(p).sendMessage(Lang.factionRankList());
			}
			
			// Faction Relation List -- send as msg
			if(slot == 22)
			{
				p.closeInventory();
				IdUtil.getSender(p).sendMessage(Lang.factionRelationList());
			}
			
			// Faction Flag List -- send as msg
			if(slot == 25)
			{
				p.closeInventory();
				IdUtil.getSender(p).sendMessage(Lang.factionFlagList());
			}
			
			// Back to Factions Menu
			if(slot == 45) FactionsMenu.openFactionsMenu(p);
		}
		
		if(invTitle.equals(Lang.lockMenuTitle))
		{
			event.setCancelled(true);
			
			if(slot == 11)
			{
				p.closeInventory();
				IdUtil.getSender(p).sendMessage(Lang.lockModeList());
			}
			
			if(slot == 12)
			{
				p.closeInventory();
				IdUtil.getSender(p).sendMessage(Lang.shopLockCreationSteps());
			}
			
			if(slot == 18) MainMenu.openMainMenu(p);
		}
		
		return;
	}
}
