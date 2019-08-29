package com.massivecraft.massivehelp.entity;

import com.massivecraft.massivecore.chestgui.ChestGui;
import com.massivecraft.massivecore.collections.MassiveMap;
import com.massivecraft.massivecore.store.Entity;
import com.massivecraft.massivecore.util.MUtil;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class Root extends Entity<Root>
{

    // -------------------------------------------- //
    // META & CONSTRUCT
    // -------------------------------------------- //

    public Root() {}

    public Root(String id, String rootName, int totalMenus, MassiveMap<MenuItem, Menu> materialMenuMap)
    {
        this.id = id;
        this.rootName = rootName;
        this.totalMenus = totalMenus;
        this.materialMenuMap = materialMenuMap;

        RootColl.get().attach(this, id);
    }

    public static Root get(Object oid) { return RootColl.get().get(oid); }

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public Root load(Root that)
    {
        this.rootName = that.rootName;
        this.totalMenus = that.totalMenus;
        this.materialMenuMap = that.materialMenuMap;
        return this;
    }

    // -------------------------------------------- //
    // FIELDS: RAW
    // -------------------------------------------- //

    private String rootName;

    private int totalMenus = 0;

    private MassiveMap<MenuItem, Menu> materialMenuMap;

    // -------------------------------------------- //
    // CORE METHODS
    // -------------------------------------------- //

    private void createGui()
    {
        Inventory i;
        i = Bukkit.createInventory(null, 0, this.rootName);

        //TODO: setItems();

        ChestGui gui = new ChestGui();

        gui.setInventory(i);
        gui.setAutoremoving(false); // we dont want the gui to go away ):
        gui.getMeta().put("rootId", this.id); // Utilize Meta Map to provide a way back to this Object

    }

    private void setItems()
    {
        // We use returnGuiItem() from MenuItem
        // and setAction() from ChestGui to help us
        //
        // We find optimal positioning for our items
        // We then create a ItemStack with returnGuiItem()
        // then use setAction() to link another menu


    }
    // -------------------------------------------- //
    // TOTAL MENUS METHODS
    // -------------------------------------------- //

    public void setTotalMenus(int totalMenus)
    {
        if(this.totalMenus == totalMenus) return;

        this.totalMenus = totalMenus;
        this.changed();
    }

    public int getTotalMenus()
    {
        return totalMenus;
    }


    // -------------------------------------------- //
    // MATERIAL TO MENU MAP METHODS
    // -------------------------------------------- //

    public void setMaterialMenuMap(MassiveMap<MenuItem, Menu> materialMenuMap)
    {
        if(MUtil.equals(this.materialMenuMap, materialMenuMap)) return;

        this.materialMenuMap = materialMenuMap;
        this.changed();
    }

    public MassiveMap<MenuItem, Menu> getMaterialMenuMap()
    {
        return this.materialMenuMap;
    }

    public void addToMaterialMenuMap(MenuItem item, Menu menu)
    {
        if(this.materialMenuMap.containsValue(menu) || this.materialMenuMap.containsKey(item)) return;

        this.materialMenuMap.put(item, menu);
        this.changed();
    }

    public void removeMaterialMenumap(MenuItem item, Menu menu)
    {
        if(! this.materialMenuMap.containsValue(menu) || ! this.materialMenuMap.containsKey(item)) return;

        this.materialMenuMap.remove(item);
    }
}
