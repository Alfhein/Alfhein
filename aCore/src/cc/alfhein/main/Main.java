package cc.alfhein.main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getServer().getConsoleSender().sendMessage("aCore Started");
	}
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("aCore Disabled");
	}

}
