package com.massivecraft.massivehelp;

import com.massivecraft.massivecore.MassivePlugin;
import com.massivecraft.massivehelp.cmd.CmdHelp;
import com.massivecraft.massivehelp.engine.EngineGuiClick;
import com.massivecraft.massivehelp.entity.MConfColl;

public class MassiveHelp extends MassivePlugin
{
	// -------------------------------------------- //
	// INSTANCE & CONSTRUCT
	// -------------------------------------------- //
	
	private static MassiveHelp i;
	public static MassiveHelp get() { return i; }
	public MassiveHelp() { MassiveHelp.i = this; }
	
	// -------------------------------------------- //
	// OVERRIDE
	// -------------------------------------------- //
	
	@Override
	public void onEnableInner()
	{
		//Activate
		this.activate(
			//Coll
			MConfColl.class,
			
			//Engine
			EngineGuiClick.class,
			
			//Command
			CmdHelp.class
		);
		
	}
	
}