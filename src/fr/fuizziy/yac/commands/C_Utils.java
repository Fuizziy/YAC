package fr.fuizziy.yac.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.fuizziy.yac.Reference;
import fr.fuizziy.yac.Reference.EnabledCommands;
import fr.fuizziy.yac.Reference.Utils;

public class C_Utils {

	public static boolean command_pre_check(CommandSender sender, EnabledCommands cmd)
	{
		if (Reference.workInProgress)
			sender.sendMessage(Utils.WORK_IN_PROGRESS.getMessage());
		if (!cmd.isEnabled())
		{
			sender.sendMessage(Utils.DISABLED_COMMAND.getMessage());
			return false;
		}
		if (!(sender instanceof Player))
			sender.sendMessage(Utils.NOT_PLAYER.getMessage());
		return true;
	}
	
}
