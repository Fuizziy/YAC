package fr.fuizziy.yac;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import fr.fuizziy.yac.commands.C_Noel;
import fr.fuizziy.yac.events.E_PlayerJoin;

public class YAC extends JavaPlugin {
	
	public void onEnable() {
		Bukkit.getLogger().info("YAC loaded.");
		getServer().getPluginManager().registerEvents(new E_PlayerJoin(this), this);
		getServer().getPluginCommand("noel").setExecutor(new C_Noel(this));
	}
	
	public void onDisable() {
		Bukkit.getLogger().info("YAC unloaded.");
	}
}