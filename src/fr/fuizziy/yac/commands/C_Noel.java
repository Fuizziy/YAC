package fr.fuizziy.yac.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import fr.fuizziy.yac.Reference;
import fr.fuizziy.yac.Reference.Utils; 

//TODO remove SuppressWarnings
@SuppressWarnings("unused")
public class C_Noel implements CommandExecutor {


	private JavaPlugin plug; 
	
	public C_Noel(JavaPlugin plug)
	{
		this.plug = plug; 
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (Reference.workInProgress)
			sender.sendMessage(Utils.WORK_IN_PROGRESS.getMessage());
		if (!(sender instanceof Player))
			sender.sendMessage(Utils.NOT_PLAYER.getMessage());
		sender.sendMessage(Utils.ALREADY_OPENED.getMessage());
		return false;
	}

}
