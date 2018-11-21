package fr.fuizziy.yac;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import fr.fuizziy.yac.events.PlayerJoin;

public class YAC extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getLogger().info("YAC loaded.");
		getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);
	}
	
	public void onDisable() {
		Bukkit.getLogger().info("YAC unloaded.");
	}
}