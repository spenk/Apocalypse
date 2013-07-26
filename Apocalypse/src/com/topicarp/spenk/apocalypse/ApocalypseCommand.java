package com.topicarp.spenk.apocalypse;

import java.util.ArrayList;
import java.util.Collection;

import net.canarymod.Canary;
import net.canarymod.api.entity.EntityItem;
import net.canarymod.api.entity.living.animal.EntityAnimal;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.entity.living.monster.EntityMob;
import net.canarymod.api.world.World;
import net.canarymod.chat.MessageReceiver;

public class ApocalypseCommand {

	ArrayList<String> worlds = new ArrayList<String>();
	
	public ApocalypseCommand(){
		convertWorldList(Canary.getServer().getWorldManager().getAllWorlds());
	}
	
	public void doomMobs(MessageReceiver sender, String[] split) {
		if (!worlds.contains(split[1])) {
			sender.message("§3[Apocalypse] §cThis world does not exist or is not loaded!");
			return;
		}
		World w = Canary.getServer().getWorld(split[1]);
		ArrayList<EntityMob> mobList = w.getMobList();
		for (EntityMob mob : mobList) {
			mob.setHealth(-1);
		}
		sender.message("§3[Apocalypse] §2All mobs were killed!");
		Canary.getServer().message("§3[Apocalypse] §2All mobs from world §4"+split[1]+"§2 were killed!");
	}

	public void doomItems(MessageReceiver sender, String[] split) {
		if (!worlds.contains(split[1])) {
			sender.message("§3[Apocalypse] §cThis world does not exist or is not loaded!");
			return;
		}
		World w = Canary.getServer().getWorld(split[1]);
		ArrayList<EntityItem> itemList = w.getItemList();
		for (EntityItem item : itemList) {
			item.destroy();
		}
		sender.message("§3[Apocalypse] §2All items were destroyed!");
		Canary.getServer().message("§3[Apocalypse] §2All items from world §4"+split[1]+"§2 were destroyed!");
	}

	public void doomAnimals(MessageReceiver sender, String[] split) {
		if (!worlds.contains(split[1])) {
			sender.message("§3[Apocalypse] §cThis world does not exist or is not loaded!");
			return;
		}
		World w = Canary.getServer().getWorld(split[1]);
		ArrayList<EntityAnimal> animalList = w.getAnimalList();
		for (EntityAnimal animal : animalList) {
			animal.setHealth(-1);
		}
		sender.message("§3[Apocalypse] §2All animals were killed!");
		Canary.getServer().message("§3[Apocalypse] §2All animals from world §4"+split[1]+"§2 were killed!");
	}

	public void doomPlayers(MessageReceiver sender, String[] split) {
		if (!worlds.contains(split[1])) {
			sender.message("§3[Apocalypse] §cThis world does not exist or is not loaded!");
			return;
		}
		World w = Canary.getServer().getWorld(split[1]);
		ArrayList<Player> playerList = w.getPlayerList();
		for (Player player : playerList) {
			player.setHealth(-1);
		}
		sender.message("§3[Apocalypse] §2All players were killed!");
		Canary.getServer().message("§3[Apocalypse] §2All players from world §4"+split[1]+"§2 were killed!");
	}

	public void doomAll(MessageReceiver sender, String[] split) {
		if (!worlds.contains(split[1])) {
			sender.message("§3[Apocalypse] §cThis world does not exist or is not loaded!");
			return;
		}
		World w = Canary.getServer().getWorld(split[1]);
		ArrayList<Player> playerList = w.getPlayerList();
		for (Player player : playerList) {
			player.setHealth(-1);
		}
		ArrayList<EntityAnimal> animalList = w.getAnimalList();
		for (EntityAnimal animal : animalList) {
			animal.setHealth(-1);
		}
		ArrayList<EntityItem> itemList = w.getItemList();
		for (EntityItem item : itemList) {
			item.destroy();
		}
		ArrayList<EntityMob> mobList = w.getMobList();
		for (EntityMob mob : mobList) {
			mob.setHealth(-1);
		}
		sender.message("§3[Apocalypse] §2All entity's were killed!");
		Canary.getServer().message("§3[Apocalypse] §2All entity's from world §4"+split[1]+"§2 were killed!");
	}
	
	private void convertWorldList(Collection<World> world){
		for (World w : world){
			worlds.add(w.getName());
		}
	}
	
}
