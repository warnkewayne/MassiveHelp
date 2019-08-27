package com.massivecraft.massivehelp.cmd;

import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.command.MassiveCommand;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.mixin.MixinMessage;
import com.massivecraft.massivecore.mson.Mson;
import com.massivecraft.massivehelp.Perm;
import com.massivecraft.massivehelp.cmd.type.TypeMenu;
import com.massivecraft.massivehelp.entity.MConf;
import com.massivecraft.massivehelp.entity.Menu;
import com.massivecraft.massivehelp.entity.MenuColl;

import java.util.List;

public class CmdHelpDelete extends MassiveCommand
{

    // -------------------------------------------- //
    // CONSTRUCT
    // -------------------------------------------- //

    public CmdHelpDelete()
    {
        this.addParameter(TypeMenu.get(), "Menu-Name");
        this.addRequirements(RequirementHasPerm.get(Perm.DELETE));
    }

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    public void perform() throws MassiveException
    {
        String menuName = this.readArg();

        MixinMessage mixinMessage = MixinMessage.get();

        Menu menu = MenuColl.get().get(menuName);

        if(menu == null)
        {
            mixinMessage.messageOne(sender, Mson.parse("<b>%s does not exist. No menus were deleted."), menuName);
            return;
        }

        mixinMessage.messageOne(sender, Mson.parse("<i>Are you sure you wish to delete %s?"), menuName);

        // Delete Menu
        menu.delete();

        return;
    }


    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public List<String> getAliases() { return MConf.get().aliasesHelpDelete; }

}
