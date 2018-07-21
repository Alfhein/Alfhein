package cc.alfhein.main;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Main instance;
	
	@Override
	public void onEnable() {
		PluginManager pm = Bukkit.getPluginManager();
		
		getLogger().info("Initalizing aCore v0.1");
		
		// Load Listeners
		
		// Load Commands
		
		getLogger().info("Enabled!");
		
		saveDefaultConfig();
	}
	
	@Override
	public void onDisable() {
		getLogger().info("Disabled!");
		
		saveConfig();
	}
	
	public static Main getInstance() {
		return instance;
	}
	
	public static String color(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}

}
