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
	// COMMAND ALIASES
	// -------------------------------------------- //
	
	public List<String> aliasesHelp = MUtil.list("massivehelp");
	public List<String> aliasesHelpUseInner = MUtil.list("use");
	public List<String> aliasesHelpUseOuter = MUtil.list("help");
	public List<String> aliasesHelpConfig = MUtil.list("config");
	public List<String> aliasesHelpVersion = MUtil.list("v", "version");
	
	
}
