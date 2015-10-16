package me.merinthium.com;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{

	@SuppressWarnings("unused")
	private static Plugin plugin;
	
	public void onEnable()
	{
		this.getCommand("roll").setExecutor(new Roll(this));
		this.getCommand("double").setExecutor(new DoubleRoll(this));
		getLogger().info("Dice has been Enabled");
	}
	
	public void onDisable()
	{
		getLogger().info("Dice has been Disabled");
		plugin = null;
	}	
}