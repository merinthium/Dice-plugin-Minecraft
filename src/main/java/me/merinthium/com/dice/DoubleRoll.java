package me.merinthium.com.dice;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DoubleRoll implements CommandExecutor
{
	@SuppressWarnings("unused")
	private final Main plugin;
	 
	public DoubleRoll(Main plugin) 
	{
		this.plugin = plugin;
	}

@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("double"))
		{
			Random dice = new Random();
			int number = 0;
			int number1 = 0;
			int number2 = 0;
			
			
			for(int counter=6; counter<=6;counter++)
			{
				number1 = 1+dice.nextInt(6);
				number2 = 1+dice.nextInt(6);
				
				number = number1 + number2;
				
			}
			Bukkit.broadcastMessage(ChatColor.DARK_BLUE +sender.getName() + ChatColor.WHITE+  " rolled " + ChatColor.BLUE + number );
			return true;
		}
		return false;
	}
}