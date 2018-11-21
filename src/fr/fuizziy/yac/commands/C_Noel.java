package fr.fuizziy.yac.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin; 

public class C_Noel implements CommandExecutor {

	private JavaPlugin plug; 
	
	public C_Noel(JavaPlugin plug)
	{
		this.plug = plug; 
	}
	
	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		// TODO Auto-generated method stub
		return false;
	}

}
