package com.topicarp.spenk.apocalypse;

import net.canarymod.Canary;
import net.canarymod.commandsys.CommandDependencyException;
import net.canarymod.plugin.Plugin;

public class Apocalypse extends Plugin{
	
	@Override
	public void disable() {
	}

	@Override
	public boolean enable() {
		ApocalypseCommand commands = new ApocalypseCommand();
		try {
			Canary.commands().registerCommands(new ApocalypseCommandList(commands), this, false);
		} catch (CommandDependencyException e) {
			e.printStackTrace();
		}
		return true;
	}

}
