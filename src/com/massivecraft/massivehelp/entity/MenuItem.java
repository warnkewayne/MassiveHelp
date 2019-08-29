package com.massivecraft.massivehelp.entity;

import com.massivecraft.massivecore.store.Entity;
import com.massivecraft.massivecore.util.MUtil;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuItem extends Entity<MenuItem>
{
    // -------------------------------------------- //
    // CONSTRUCT & META
    // -------------------------------------------- //

    public MenuItem() {}

    public MenuItem(String title, Material material, String menuId, String description)
    {
        this.title = title;
        this.item = material;
        this.menuId = menuId;
        this.description = description;

        MenuItemColl.get().attach(this, id);
    }

    public MenuItem(String title, Material material, String menuId)
    {
        this.title = title;
        this.item = material;
        this.menuId = menuId;

        MenuItemColl.get().attach(this, id);
    }

    public static MenuItem get(Object oid) { return MenuItemColl.get().get(oid); }

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public MenuItem load(MenuItem that)
    {
        return this;
    }

    // -------------------------------------------- //
    // FIELDS: RAW
    // -------------------------------------------- //

    // This is the title of
    // the item.
    // Default: ""

    private String title;

    // This is the material
    // of what is representing the title.
    // Default: null

    private Material item;

    // If the instance of MenuItem is linked to a menu
    // This field will hold that menu FK
    // Default: null

    private String menuId;

    // This is the description of
    // the item & title.
    // Default: ""

    private String description;

    // -------------------------------------------- //
    // CORE METHODS
    // -------------------------------------------- //

    public ItemStack returnGUIItem()
    {
        ItemStack i = new ItemStack(this.item, 1);
        ArrayList<String> desc = new ArrayList<>(Arrays.asList(this.description));

        ItemMeta iMeta = i.getItemMeta();
        iMeta.setDisplayName(this.title);
        iMeta.setLore(desc);
        iMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

        i.setItemMeta(iMeta);

        return i;
    }

    // -------------------------------------------- //
    // TITLE METHODS
    // -------------------------------------------- //

    public void setTitle(String title)
    {
        if(MUtil.equals(this.title, title)) return;

        this.title = title;
        this.changed();
    }

    public String getTitle()
    {
        return this.title;
    }

    // -------------------------------------------- //
    // ITEM METHODS
    // -------------------------------------------- //

    public void setItem(Material item)
    {
        if(this.item == item) return;

        this.item = item;
        this.changed();
    }

    public Material getItem()
    {
        return this.item;
    }

    // -------------------------------------------- //
    // MENUID METHODS
    // -------------------------------------------- //

    public void setMenuId(String menuId)
    {
        if(MUtil.equals(this.menuId, menuId)) return;
        this.menuId = menuId;
    }

    public String getMenuId()
    {
        return this.menuId;
    }

    // -------------------------------------------- //
    // DESCRIPTION METHODS
    // -------------------------------------------- //

    public void setDescription(String description)
    {
        if(MUtil.equals(this.description, description)) return;

        this.description = description;
        this.changed();
    }

    public String getDescription()
    {
        return this.description;
    }
}
