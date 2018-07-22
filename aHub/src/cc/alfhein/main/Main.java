package cc.alfhein.main;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import cc.alfhein.main.events.EventListener;

public class Main extends JavaPlugin {
	
	public List<String> worlds = new ArrayList<String>();
	public double multiplier;
	public double height;
	public boolean fd;
	
	public void onEnable() {
		getLogger().info("Initalizing aHub v0.1");
		
		getLogger().info("Enabled!");
		
		saveDefaultConfig();
		getServer().getPluginManager().registerEvents(new EventListener(this), this);
		
		worlds = getConfig().getStringList("Worlds");
		multiplier = getConfig().getDouble("Multiplier", 1.5);
		height = getConfig().getDouble("Height", 1.0);
		fd = getConfig().getBoolean("TakeFallDamage", false);
	}
	
	public void onDisable() {
		getLogger().info("Disabled!");
	}
	
	public static String color(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}

}
