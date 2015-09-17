package me.jonasxpx.magnata;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

import com.iCo6.system.Account;
import com.iCo6.system.Accounts;

/**
 *  @since 17/09/2015
 *  @author JonasXPX
 *  
 *  Plugin funcional apenas no EndCraft
 *  Este código é apenas um esboço para exemplo.
 *  Para ver em funcionamento entre no servidor[1.5.2] jogar.endcraft.com.br
 */
public class Magnata extends JavaPlugin{

	
	public static String mag;
	private static Accounts acc;
	@Override
	public void onEnable() {
		if(getServer().getPluginManager().getPlugin("iConomy") == null){
			getLogger().log(Level.SEVERE, "iConomy not found! plugin Disabled");
			getServer().getPluginManager().disablePlugin(this);
			return;
		}
		if(getServer().getPluginManager().getPlugin("Legendchat") != null){
			getServer().getPluginManager().registerEvents(new MagnataChatEvent(), this);
		}
		acc = new Accounts();
		getServer().getPluginManager().registerEvents(new MagnataLoginEvent(), this);
	}
	
	public static String getMoneyTop(){
		Account acc1 = acc.getTopAccounts(1).get(0);
		return acc1.name;
	}
}
