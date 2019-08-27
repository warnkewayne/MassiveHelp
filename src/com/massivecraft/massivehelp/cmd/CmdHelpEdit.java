package com.massivecraft.massivehelp.cmd;

import com.massivecraft.massivecore.command.MassiveCommand;
import com.massivecraft.massivecore.MassiveException;
import com.massivecraft.massivecore.mixin.MixinMessage;
import com.massivecraft.massivecore.mson.Mson;
import com.massivecraft.massivehelp.Perm;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivehelp.cmd.type.TypeMenu;
import com.massivecraft.massivehelp.entity.MConf;
import com.massivecraft.massivehelp.entity.MenuColl;

import java.util.List;

public class CmdHelpEdit extends MassiveCommand
{
    // -------------------------------------------- //
    // CONSTRUCT
    // -------------------------------------------- //

    public CmdHelpEdit()
    {
        this.addParameter(TypeMenu.get(), "Menu-Name");
        this.addRequirements(RequirementHasPerm.get(Perm.EDIT));
    }

    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    public void perform() throws MassiveException
    {
        // This command pulls up a separate GUI menu,
        // allows the sender to edit the contents of the help menu
        // with a GUI instead of config ...

        // TODO:
        // Open a chest GUI with same contents of the entered Menu
        // When a menu item is clicked,
        // Chat will prompt "What you want to edit"
        //
        // Command sender will type in what they want
        // On enter, save.

        String menuName = this.readArg();

        MixinMessage mixinMessage = MixinMessage.get();

        if(MenuColl.get().get(menuName) == null)
        {
            mixinMessage.messageOne(sender, Mson.parse("<b>%s does not exist."), menuName);
            return;
        }
    }


    // -------------------------------------------- //
    // OVERRIDE
    // -------------------------------------------- //

    @Override
    public List<String> getAliases() { return MConf.get().aliasesHelpEdit; }
}