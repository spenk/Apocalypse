package com.topicarp.spenk.apocalypse;

import net.canarymod.Canary;
import net.canarymod.chat.MessageReceiver;
import net.canarymod.commandsys.Command;
import net.canarymod.commandsys.CommandListener;

public class ApocalypseCommandList implements CommandListener{

	ApocalypseCommand commands;
	
	public ApocalypseCommandList(ApocalypseCommand commands) {
		this.commands = commands;
	}

	@Command(aliases = { "doom" }, description = "Use this command to kill entity's in a specified world", permissions = { "apocalypse.doom" }, toolTip = "/doom [mobs, players, animals, items] <world>")
	public void runMsgCommand(MessageReceiver sender, String[] split){
		Canary.help().getHelp(sender, "doom");
	}

	@Command(aliases = { "mobs", "mob", "m" }, parent = "doom", description = "Kill all mobs in a specified world", permissions = { "apocalypse.doom.mobs" }, toolTip = "/doom [mobs, mob, m] <world>", min = 2)
	public void doomMobs(MessageReceiver sender, String[] split) {
		commands.doomMobs(sender,split);
	}

	@Command(aliases = { "items", "item", "i" }, parent = "doom", description = "Kill all mobs in a specified world", permissions = { "apocalypse.doom.items" }, toolTip = "/doom [items, item, i] <world>", min = 2)
	public void doomItems(MessageReceiver sender, String[] split) {
		commands.doomItems(sender,split);
	}
	
	@Command(aliases = { "animals", "animal", "a" }, parent = "doom", description = "Kill all mobs in a specified world", permissions = { "apocalypse.doom.animals" }, toolTip = "/doom [animals, animal, a] <world>", min = 2)
	public void doomAnimals(MessageReceiver sender, String[] split) {
		commands.doomAnimals(sender,split);
	}
	
	@Command(aliases = { "players", "player", "p" }, parent = "doom", description = "Kill all mobs in a specified world", permissions = { "apocalypse.doom.players" }, toolTip = "/doom [players, player, p] <world>", min = 2)
	public void doomPlayers(MessageReceiver sender, String[] split) {
		commands.doomPlayers(sender,split);
	}
	
	@Command(aliases = { "all", "a" }, parent = "doom", description = "Kill all entity's in a specified world", permissions = { "apocalypse.doom.all" }, toolTip = "/doom [all, a] <world>", min = 2)
	public void doomAll(MessageReceiver sender, String[] split) {
		commands.doomAll(sender,split);
	}




}
