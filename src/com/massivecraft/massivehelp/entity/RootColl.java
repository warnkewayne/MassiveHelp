package com.massivecraft.massivehelp.entity;

import com.massivecraft.massivecore.collections.MassiveMap;
import com.massivecraft.massivecore.store.Coll;

public class RootColl extends Coll<Root>
{
    // -------------------------------------------- //
    // INSTANCE & CONSTRUCT
    // -------------------------------------------- //

    private static RootColl i = new RootColl();
    public static RootColl get() { return i; }
    public RootColl() { this.setCleanTaskEnabled(false); }

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
            createRoot();
            this.syncAll();
        }
    }

    // -------------------------------------------- //
    // CREATE ROOT
    // -------------------------------------------- //

    private void createRoot()
    {
        new Root("mainmenu", 0, new MassiveMap<MenuItem, Menu>());
    }
}
