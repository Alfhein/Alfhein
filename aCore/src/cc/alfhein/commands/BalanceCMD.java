package cc.alfhein.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import cc.alfhein.main.Main;

public class BalanceCMD implements CommandExecutor {

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("balance")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Only players can use this command.");
				return true;
			}
			
			Player p = (Player) sender;
			
			if (args.length == 0) {
				p.sendMessage(Main.color("&6Gold: &a" + Main.getInstance().getConfig().getInt(".balances." + p.getName())));
				return true;
			} else if (args.length == 1) {
				Player target = Bukkit.getPlayerExact(args[0]);
				
				if (target == null) {
					p.sendMessage(Main.color("&a'" + args[0] + "' was not found!"));
					return true;
				} else if (target != null) {
					p.sendMessage(Main.color("&6Gold: &a" + Main.getInstance().getConfig().getInt(".balances." + target.getName())));
				}
			} else {
				p.sendMessage(Main.color("&6Gold: &a" + Main.getInstance().getConfig().getInt(".balances." + p.getName())));
			}
		}
		
		return false;
	}

}
