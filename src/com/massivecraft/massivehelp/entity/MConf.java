package com.massivecraft.massivehelp.entity;


import com.massivecraft.massivecore.command.editor.annotation.EditorName;
import com.massivecraft.massivecore.store.Entity;
import com.massivecraft.massivecore.util.MUtil;

import java.util.List;

@EditorName("config")
public class MConf extends Entity<MConf>
{
	// -------------------------------------------- //
	// META
	// -------------------------------------------- //
	
	protected static transient MConf i;
	public static MConf get() { return i; }
	
	// -------------------------------------------- //
	// HELP BOOKS
	// -------------------------------------------- //
	// IF TRUE, this boolean determines whether MassiveHelp
	// prints it's FAQ answers on in-game books
	// and places them in inventory.
	// OTHERWISE, MassiveHelp prints in chatbox.
	// Default: False

	public boolean printBooks = false;

	// -------------------------------------------- //
	// COMMAND ALIASES
	// -------------------------------------------- //
	
	public List<String> aliasesHelp = MUtil.list("massivehelp");
	public List<String> aliasesHelpUseInner = MUtil.list("use");
	public List<String> aliasesHelpCreate = MUtil.list("create");
	public List<String> aliasesHelpEdit = MUtil.list("edit");
	public List<String> aliasesHelpDelete = MUtil.list("delete");
	public List<String> aliasesHelpUseOuter = MUtil.list("help");
	public List<String> aliasesHelpConfig = MUtil.list("config");
	public List<String> aliasesHelpVersion = MUtil.list("v", "version");
	
	
}
