package com.massivecraft.massivehelp.entity;

import com.massivecraft.massivecore.chestgui.ChestGui;
import com.massivecraft.massivecore.collections.MassiveList;
import com.massivecraft.massivecore.store.Entity;
import com.massivecraft.massivecore.util.MUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Menu extends Entity<Menu> {
    //TODO: Figure out how to tell what kind of text coloring
    //TODO: everything needs

    // -------------------------------------------- //
    // CONSTRUCT & META
    // -------------------------------------------- //

    public Menu()
    {

    }

    public Menu(String id, String menuName, String prevMenuId, String nextMenuId, int numMenuItems, MassiveList<MenuItem> listMenuItems) {
        this.id = id;
        this.menuName = menuName;
        this.prevMenuId = prevMenuId;
        this.nextMenuId = nextMenuId;
        this.numMenuItems = numMenuItems;
        this.listMenuItems = listMenuItems;

       //Todo: attach in calls, not func --- MenuColl.get().attach(this, id);
    }

    public static Menu get(Object oid) {
        return MenuColl.get().get(oid);
    }

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public Menu load(Menu that) {
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

    private ChestGui createGui()
    {
        Inventory i;
        i = Bukkit.createInventory(null, this.numMenuItems, this.menuName);

        //TODO: setItems(); ( USE PAGER CLASS )

        ChestGui gui = new ChestGui();

        gui.setInventory(i);
        gui.setAutoremoving(false); // we dont want the gui to go away ):
        gui.getMeta().put("menuId", this.id); // Utilize Meta Map to provide a way back to this Object

        return gui;
    }

    private void setItems(Inventory i)
    {
        // We use returnGuiItem() from MenuItem
        // and setAction() from ChestGui to help us
        //
        // We find optimal positioning for our items
        // We then create a ItemStack with returnGuiItem()
        // then use setAction() to do what we want
        // i.e.. open BookGui or link another menu

    }

    public void open(Player sender)
    {
        ChestGui gui = createGui();

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

    // -------------------------------------------- //
    // MENU NAME METHODS
    // -------------------------------------------- //

    public void setMenuName(String menuName) {
        if (MUtil.equals(this.menuName, menuName)) return;

        this.menuName = menuName;
        this.changed();
    }

    public String getMenuName() {
        return this.menuName;
    }

    // -------------------------------------------- //
    // PREVMENUID METHODS
    // -------------------------------------------- //

    private void setPrevMenuId(String prevMenuId) {
        if (MUtil.equals(this.prevMenuId, prevMenuId)) return;

        this.prevMenuId = prevMenuId;
        this.changed();
    }

    public void setPrevMenuId(String prevMenuId, boolean swap) {
        if (swap == false) {
            setPrevMenuId(prevMenuId);
            return;
        }

        MenuColl coll = MenuColl.get();

        //if prevMenu is Null, then we are creating a new Menu within Root
        if (prevMenuId == null) {
            Root ROOT = RootColl.get().get("mainmenu");

        }

        // if prevMenu isnt null, then get prevMenu's nextId
        // replace it with this.id and update this.nextId with that id.
        if (prevMenuId != null) {
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

    private void setNextMenuId(String nextMenuId) {
        if (MUtil.equals(this.nextMenuId, nextMenuId)) return;

        this.nextMenuId = nextMenuId;
        this.changed();
    }

    public String getNextMenuId() {
        return this.nextMenuId;
    }

    // -------------------------------------------- //
    // NUMMENUITEMS METHODS
    // -------------------------------------------- //

    public void setNumMenuItems(int num) {
        if (this.numMenuItems == num) return;

        this.numMenuItems = num;
        this.changed();
    }

    public void incrementNumMenuItems() {
        this.numMenuItems++;
        this.changed();
    }

    public void decrementNumMenuItems() {
        this.numMenuItems--;
        this.changed();
    }

    // -------------------------------------------- //
    // MENUITEMS METHODS
    // -------------------------------------------- //

    public void setListMenuItems(MassiveList<MenuItem> itemList)
    {
        if(MUtil.equals(this.listMenuItems, itemList)) return;

        this.listMenuItems = itemList;
        this.changed();
    }

    public MassiveList<MenuItem> getListMenuItems()
    {
        return this.listMenuItems;
    }

    public void addToListMenuItems(MenuItem menuItem)
    {
        if(this.listMenuItems.contains(menuItem)) return;

        this.listMenuItems.add(menuItem);
        this.changed();
    }

    public void removeFromListMenuItems(MenuItem menuItem)
    {
        if(! this.listMenuItems.contains(menuItem)) return;

        this.listMenuItems.remove(menuItem);
        this.changed();
    }
}