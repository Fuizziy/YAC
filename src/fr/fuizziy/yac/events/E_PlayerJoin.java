package fr.fuizziy.yac.events;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

//TODO remove SuppressWarnings
@SuppressWarnings("unused")
public class E_PlayerJoin implements Listener {

	private JavaPlugin plug;
	
	public E_PlayerJoin(JavaPlugin plug)
	{
		this.plug = plug; 
	}
}
