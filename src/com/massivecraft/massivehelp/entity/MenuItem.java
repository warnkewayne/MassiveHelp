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

    public MenuItem(String id, String title, Material material, String description)
    {
        this.id = id;
        this.title = title;
        this.item = material;
        this.description = description;

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
    // DESCRIPTION METHODS
    // -------------------------------------------- //


    public void setDescription(String description)
    {
        if(MUtil.equals(this.description, description)) return;

        this.description = description;
        this.changed();
    }
}
