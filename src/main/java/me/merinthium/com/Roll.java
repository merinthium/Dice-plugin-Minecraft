package me.merinthium.com;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Roll implements CommandExecutor
{
	@SuppressWarnings("unused")
	private final Main plugin;
	 
	public Roll(Main plugin) 
	{
		this.plugin = plugin;
	}

@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("roll"))
		{
			Random dice = new Random();
			int number = 0;
			
			for(int counter=1; counter<=1;counter++)
			{
				number = 1+dice.nextInt(6);
			}
			Bukkit.broadcastMessage(ChatColor.DARK_BLUE +sender.getName() + ChatColor.WHITE+  " rolled " + ChatColor.BLUE + number );
			return true;
		}
		return false;
	}
}