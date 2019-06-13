package com.massivecraft.massivehelp.cmd;

import com.massivecraft.massivecore.command.MassiveCommandVersion;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivehelp.MassiveHelp;
import com.massivecraft.massivehelp.Perm;
import com.massivecraft.massivehelp.entity.MConf;

import java.util.List;

public class CmdHelpVersion extends MassiveCommandVersion
{
	// ----------------------------------------- //
	// CONSTRUCT
	// ----------------------------------------- //
	
	public CmdHelpVersion()
	{
		super(MassiveHelp.get());
		this.addRequirements(RequirementHasPerm.get(Perm.VERSION));
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public List<String> getAliases() { return MConf.get().aliasesHelpVersion; }
	
}
