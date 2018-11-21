package fr.fuizziy.yac;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class YAC extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getLogger().info("YAC loaded.");
	}
	
	public void onDisable() {
		Bukkit.getLogger().info("YAC unloaded.");
	}

}
