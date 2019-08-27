package com.massivecraft.massivehelp.entity;

import com.massivecraft.massivecore.collections.MassiveList;
import com.massivecraft.massivecore.collections.MassiveMap;
import com.massivecraft.massivecore.store.Coll;
import org.bukkit.Material;

public class MenuColl extends Coll<Menu>
{
    // -------------------------------------------- //
    // INSTANCE & CONSTRUCT
    // -------------------------------------------- //

    private static MenuColl i = new MenuColl();
    public static MenuColl get() { return i; }
    public MenuColl() { this.setCleanTaskEnabled(false); }

    // -------------------------------------------- //
    // STACK TRACEABILITY
    // -------------------------------------------- //

    @Override
    public void onTick()
    {
        super.onTick();
    }

    // -------------------------------------------- //
    // OVERRIDE: COLL
    // -------------------------------------------- //

    @Override
    public void setActive(boolean active)
    {
        super.setActive(active);

        if(!active) return;

        if (this.getAll().isEmpty())
        {
            //this.createMenus();
            this.syncAll();
        }
    }

    // -------------------------------------------- //
    // MENU CREATION
    // -------------------------------------------- //

    public void createNewMenu(String menuName, String prevMenu)
    {
        Menu m = new Menu();
        m.setMenuName(menuName);
        m.setPrevMenuId(prevMenu);

        this.get().attach(m, id);
    }

    private void createMenus()
    {
        //TODO: update this when menus are more "set in stone"
    }

}