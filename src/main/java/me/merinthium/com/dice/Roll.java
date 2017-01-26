package me.merinthium.com.dice;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

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
		Player p = (Player) sender;
		ItemStack diamond = new ItemStack(Material.DIAMOND);
		if(cmd.getName().equalsIgnoreCase("roll"))
		{
			Random dice = new Random();
			int number = 0;
			
			for(int counter=6; counter<=6;counter++)
			{
				number = 1+dice.nextInt(6);
			}
			Bukkit.broadcastMessage(ChatColor.DARK_BLUE +sender.getName() + ChatColor.WHITE+  " rolled " + ChatColor.BLUE + number );
			if(number == 1 || number == 3){
				p.getInventory().addItem(diamond);
			}else{
				p.sendMessage("Sorry no luck this time");
			}
			return true;
		}
		return false;
	}
}