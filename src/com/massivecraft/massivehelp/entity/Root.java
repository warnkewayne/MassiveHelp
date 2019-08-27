package com.massivecraft.massivehelp.entity;

import com.massivecraft.massivecore.collections.MassiveList;
import com.massivecraft.massivecore.collections.MassiveMap;
import com.massivecraft.massivecore.store.EntityInternal;
import javafx.scene.paint.Material;

public class Root extends EntityInternal<Root>
{

    // -------------------------------------------- //
    // META
    // -------------------------------------------- //

    public Root get() { return this; }

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

    private MassiveList<Menu> linkedMenus;

    private MassiveMap<Material, Menu> materialMenuMap;

}
