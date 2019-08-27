package com.massivecraft.massivehelp.entity;

import com.massivecraft.massivecore.collections.MassiveMap;
import com.massivecraft.massivecore.store.Entity;
import com.massivecraft.massivecore.util.MUtil;

public class Root extends Entity<Root>
{

    // -------------------------------------------- //
    // META & CONSTRUCT
    // -------------------------------------------- //

    public Root() {}

    public Root(String id, int totalMenus, MassiveMap<MenuItem, Menu> materialMenuMap)
    {
        this.id = id;
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
        return this;
    }

    // -------------------------------------------- //
    // FIELDS: RAW
    // -------------------------------------------- //

    private int totalMenus = 0;

    private MassiveMap<MenuItem, Menu> materialMenuMap;

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
