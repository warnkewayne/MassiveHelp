package com.massivecraft.massivehelp.cmd;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.command.MassiveCommand;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.command.type.primitive.TypeString;
import com.massivecraft.massivecore.mixin.MixinMessage;
import com.massivecraft.massivecore.mson.Mson;
import com.massivecraft.massivehelp.Perm;
import com.massivecraft.massivehelp.cmd.type.TypeMenu;
import com.massivecraft.massivehelp.entity.MConf;
import com.massivecraft.massivehelp.entity.MenuColl;

import java.util.List;

public class CmdHelpCreate extends MassiveCommand
{
    // -------------------------------------------- //
    // CONSTRUCT
    // -------------------------------------------- //

    public CmdHelpCreate()
    {
        this.addParameter(TypeString.get(), "Menu-Name");
        this.addParameter(TypeMenu.get(), "Previous-Menu-Name", "");

        this.addRequirements(RequirementHasPerm.get(Perm.CREATE));
    }

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    public void perform() throws MassiveException
    {
        String menuName = this.readArg();
        String prevMenu = this.readArg(); // if null, within main menu

        MenuColl mc = MenuColl.get();
        MixinMessage mixinMessage = MixinMessage.get();

        String prevId = mc.get(prevMenu).getId();

        if( mc.get(menuName) != null ) mixinMessage.messageOne(sender, Mson.parse("<b>%s already exists. It was not created."), menuName);

        mc.createNewMenu(menuName, prevId);

        mixinMessage.messageOne(sender, Mson.parse("<i>%s has been created!"), menuName);
    }


    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public List<String> getAliases() { return MConf.get().aliasesHelpCreate; }
}
