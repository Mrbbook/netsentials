package net.mrbbook.netsentials;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


	public void onEnable(){

	getLogger().info("");


	}




	public void onDisable(){
	  
	  getLogger().info("");
	  
	}
	

	 public boolean onNetCommand(CommandSender sender, Command cmd, String label, String arg[]) {
	  
	  Player player = (Player) sender;
	  
	  if(!(sender instanceof Player)) {
	    
	  sender.sendMessage("Only player can perform this command");
	  
	  return true;  
	  }
	    if(cmd.getName().equalsIgnoreCase("help") && player.hasPermission("netsentials.help")) {
	        
	    	   
	        sender.sendMessage(ChatColor.AQUA + "=== NETSENTIALS SYSTEM ===");
	        sender.sendMessage(ChatColor.GOLD + "/spawn" + ChatColor.WHITE + "==" + ChatColor.RED + " Back to spawn immediately");
	        sender.sendMessage(ChatColor.GOLD + "/warp <warpname>" + ChatColor.WHITE + "==" + ChatColor.RED + "Warp to specify point");
	        sender.sendMessage(ChatColor.GOLD + "/joinevent" + ChatColor.WHITE + "==" + ChatColor.RED + " Join server event"); //need event API to instance
	        
	        
	        return true;
	      }
	    
	      if(cmd.getName().equalsIgnoreCase("spawn") && player.hasPermission("netsentials.help")){
	        
	        //will coding later ^_^
	    	  
	      }
		return true;
	 }
}
