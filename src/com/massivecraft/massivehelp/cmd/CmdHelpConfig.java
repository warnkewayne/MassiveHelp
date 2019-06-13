package com.massivecraft.massivehelp.cmd;

import com.massivecraft.massivecore.command.editor.CommandEditSingleton;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivehelp.Perm;
import com.massivecraft.massivehelp.entity.MConf;

import java.util.List;

public class CmdHelpConfig extends CommandEditSingleton<MConf>
{
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public CmdHelpConfig()
	{
		super(MConf.get());
		
		this.addRequirements(RequirementHasPerm.get(Perm.CONFIG));
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public List<String> getAliases() { return MConf.get().aliasesHelpConfig; }
}
