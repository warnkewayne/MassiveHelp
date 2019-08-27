package com.massivecraft.massivehelp.cmd;

import com.massivecraft.massivecore.Button;
import com.massivecraft.massivecore.mixin.MixinMessage;
import com.massivecraft.massivecore.mson.Mson;
import com.massivecraft.massivecore.util.IdUtil;
import com.massivecraft.massivecore.command.MassiveCommand;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivecore.command.requirement.RequirementIsPlayer;
import com.massivecraft.massivehelp.Perm;
import com.massivecraft.massivehelp.entity.MConf;

import java.util.List;

public class CmdHelpUse extends MassiveCommand
{
	// -------------------------------------------- //
	// INSTANCE
	// -------------------------------------------- //
	
	private static CmdHelpUse i = new CmdHelpUse() { @Override public List<String> getAliases() { return MConf.get().aliasesHelpUseOuter; }};
	public static CmdHelpUse get() { return i; }
	
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public CmdHelpUse()
	{
		// Requirements
		this.addRequirements(RequirementIsPlayer.get());
		this.addRequirements(RequirementHasPerm.get(Perm.USE));
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public void perform()
	{


	}
	
	@Override
	public List<String> getAliases() { return MConf.get().aliasesHelpUseInner; }
	
}
