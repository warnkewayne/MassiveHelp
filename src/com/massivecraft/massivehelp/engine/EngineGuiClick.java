package com.massivecraft.massivehelp.engine;

import com.massivecraft.massivecore.Engine;
import com.massivecraft.massivecore.util.IdUtil;
import com.massivecraft.massivehelp.entity.MenuColl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

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
        Inventory inventory = event.getInventory(); // inventory that is opened
        MenuColl mc = MenuColl.get();


        // Check if Inventory is apart of the menus
        if(! mc.isMenu(inventory.getTitle())) return;

        Player player = IdUtil.getPlayer(event.getWhoClicked()); // player that is using that inventory
        int slot = event.getSlot(); // the slot that is clicked on
        ItemStack itemStack = inventory.getItem(slot); // the item that is in slot

        // If the slot clicked is empty... dont do anything
        if(itemStack == null) return;

        // If the slot is not empty...
        ItemMeta iMeta = itemStack.getItemMeta();
        String localizedName = iMeta.getLocalizedName();

//        // this menuItem leads to a menu ...
//        if(localizedName != null)
//        {
//            mc.get(localizedName).open(player);
//        }
//        else // this menuItem just has a description
//        {
//
//        }
    }
}
