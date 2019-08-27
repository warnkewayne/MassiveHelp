package com.massivecraft.massivehelp.cmd.type;

import com.massivecraft.massivehelp.entity.Menu;
import com.massivecraft.massivehelp.entity.MenuColl;
import com.massivecraft.massivecore.command.type.store.TypeEntity;

public class TypeMenu extends TypeEntity<Menu>
{
    // -------------------------------------------- //
    // INSTANCE & CONSTRUCT
    // -------------------------------------------- //

    private static TypeMenu i = new TypeMenu();
    public static TypeMenu get() { return i; }

    public TypeMenu() { super(MenuColl.get()); }
}