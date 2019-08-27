package com.massivecraft.massivehelp.entity;

import com.massivecraft.massivecore.store.Coll;

public class MenuItemColl extends Coll<MenuItem>
{
    // -------------------------------------------- //
    // INSTANCE & CONSTRUCT
    // -------------------------------------------- //

    private static MenuItemColl i = new MenuItemColl();
    public static MenuItemColl get() { return i; }
    public MenuItemColl() { this.setCleanTaskEnabled(false); }

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
            //this.createItems();
            this.syncAll();
        }
    }

}
