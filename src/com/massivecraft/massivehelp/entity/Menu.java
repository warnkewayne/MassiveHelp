package com.massivecraft.massivehelp.entity;

import com.massivecraft.massivecore.chestgui.ChestGui;
import com.massivecraft.massivecore.collections.MassiveList;
import com.massivecraft.massivecore.store.Entity;
import com.massivecraft.massivecore.util.MUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Menu extends Entity<Menu>
{
    //TODO: Figure out how to tell what kind of coloring
    //TODO: everything needs

    // -------------------------------------------- //
    // CONSTRUCT & META
    // -------------------------------------------- //

    public Menu() {}

    public Menu(String id, String menuName, String prevMenuId, String nextMenuId, int numMenuItems, MassiveList<MenuItem> listMenuItems)
    {
        this.id = id;
        this.menuName = menuName;
        this.prevMenuId = prevMenuId;
        this.nextMenuId = nextMenuId;
        this.numMenuItems = numMenuItems;
        this.listMenuItems = listMenuItems;

        MenuColl.get().attach(this, id);
    }

    public static Menu get(Object oid) { return MenuColl.get().get(oid); }

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public Menu load(Menu that)
    {
        this.menuName = that.menuName;
        this.prevMenuId = that.prevMenuId;
        this.nextMenuId = that.nextMenuId;
        this.numMenuItems = that.numMenuItems;
        this.listMenuItems = that.listMenuItems;

        return this;
    }

    // -------------------------------------------- //
    // FIELDS: RAW
    // -------------------------------------------- //

    // This is the name of the Menu
    // Default: ""

    private String menuName;

    // This is the id of the previous menu
    // if any.
    // FK
    // Default: ""

    private String prevMenuId;

    // This is the id of the next menu
    // if any.
    // FK
    // Default: ""

    private String nextMenuId;

    // This is the number of Menu Items
    // Default: 0

    private int numMenuItems = 0;

    // This is a map of the menu items names
    // linked to actual material they represent
    // Default: empty

    private MassiveList<MenuItem> listMenuItems;


    // -------------------------------------------- //
    // CORE METHODS
    // -------------------------------------------- //

    public void open(Player sender)
    {
        Inventory i;
        i = Bukkit.createInventory(null, 0, this.menuName);

        //TODO: setItems();
        // find a way for optimal positioning

        ChestGui gui = new ChestGui();

        gui.setInventory(i);
        gui.isAutoclosing();

        sender.openInventory(gui.getInventory());
    }

    public void delete()
    {
        MenuColl coll = MenuColl.get();

        Menu prev = coll.get(prevMenuId);
        Menu next = coll.get(nextMenuId);

        prev.setNextMenuId(this.nextMenuId);
        next.setPrevMenuId(this.prevMenuId, false);

        this.detach();
    }

    private int calcInventorySize()
    {
        //TODO: way too simple probably a better way

       //if(this.numMenuItems <= 14) return 27;

        //if(this.numMenuItems > 14) return 54;

        return 0;
    }

    // -------------------------------------------- //
    // MENU NAME METHODS
    // -------------------------------------------- //

    public void setMenuName(String menuName)
    {
        if(MUtil.equals(this.menuName, menuName)) return;

        this.menuName = menuName;
        this.changed();
    }

    public String getMenuName()
    {
        return this.menuName;
    }

    // -------------------------------------------- //
    // PREVMENUID METHODS
    // -------------------------------------------- //

    public void setPrevMenuId(String prevMenuId)
    {
        if(MUtil.equals(this.prevMenuId, prevMenuId)) return;

        this.prevMenuId = prevMenuId;
        this.changed();
    }

    public void setPrevMenuId(String prevMenuId, boolean swap)
    {
        if(swap == false) { setPrevMenuId(prevMenuId); return; }

        MenuColl coll = MenuColl.get();

        //if prevMenu is Null, then we are creating the Main Menu
        if(prevMenuId == null)
        {
            Menu ROOT = coll.get("root");
            String oldNext = ROOT.nextMenuId;

            ROOT.setNextMenuId(this.id);
            this.prevMenuId = null;
            this.nextMenuId = oldNext;
        }

        // if prevMenu isnt null, then get prevMenu's nextId
        // replace it with this.id and update this.nextId with that id.
        if(prevMenuId != null)
        {
            Menu prevMenu = coll.get(prevMenuId);
            String oldNext = prevMenu.nextMenuId;

            prevMenu.setNextMenuId(this.id);
            this.prevMenuId = prevMenuId;
            this.nextMenuId = oldNext;
        }

        this.changed();
    }

    // -------------------------------------------- //
    // NEXTMENUID METHODS
    // -------------------------------------------- //

    private void setNextMenuId(String nextMenuId)
    {
        if(MUtil.equals(this.nextMenuId, nextMenuId)) return;

        this.nextMenuId = nextMenuId;
        this.changed();
    }

    public String getNextMenuId() { return this.nextMenuId; }

    // -------------------------------------------- //
    // NUMMENUITEMS METHODS
    // -------------------------------------------- //

    public void setNumMenuItems(int num)
    {
        if(this.numMenuItems == num) return;

        this.numMenuItems = num;
        this.changed();
    }

    public void incrementNumMenuItems()
    {
        this.numMenuItems++;
        this.changed();
    }

    public void decrementNumMenuItems()
    {
        this.numMenuItems--;
        this.changed();
    }

    // -------------------------------------------- //
    // MENUITEMS METHODS
    // -------------------------------------------- //

}