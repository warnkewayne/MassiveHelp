package com.massivecraft.massivehelp.cmd;

import com.massivecraft.massivecore.command.MassiveCommand;
import com.massivecraft.massivecore.command.requirement.RequirementHasPerm;
import com.massivecraft.massivehelp.Perm;
import com.massivecraft.massivehelp.entity.MConf;

import java.util.List;

public class CmdHelp extends MassiveCommand
{
	private static CmdHelp i = new CmdHelp();
	public static CmdHelp get() { return i; }
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	public CmdHelpUse cmdHelpUse = new CmdHelpUse();
	public CmdHelpCreate cmdHelpCreate = new CmdHelpCreate();
	public CmdHelpEdit cmdHelpEdit = new CmdHelpEdit();
	public CmdHelpDelete cmdHelpDelete = new CmdHelpDelete();
	public CmdHelpConfig cmdHelpConfig = new CmdHelpConfig();
	public CmdHelpVersion cmdHelpVersion = new CmdHelpVersion();
	
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	public CmdHelp()
	{
		//Children
		this.addChild(this.cmdHelpUse);
		this.addChild(this.cmdHelpCreate);
		this.addChild(this.cmdHelpEdit);
		this.addChild(this.cmdHelpDelete);
		this.addChild(this.cmdHelpConfig);
		this.addChild(this.cmdHelpVersion);
		
		this.addRequirements(RequirementHasPerm.get(Perm.BASECOMMAND));
	}
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	@Override
	public List<String> getAliases() { return MConf.get().aliasesHelp; }
	
}
