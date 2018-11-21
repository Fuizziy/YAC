package fr.fuizziy.yac.events;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class PlayerJoin implements Listener {

	private JavaPlugin plug;
	
	public PlayerJoin(JavaPlugin plug)
	{
		this.plug = plug;
	}
}
