package me.jonasxpx.magnata;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class MagnataLoginEvent implements Listener{

	@EventHandler
	public void magnataLoginEvent(final PlayerJoinEvent e){
		new Thread(new Runnable() {
			@Override
			public void run() {
				if(e.getPlayer().getName().equalsIgnoreCase(Magnata.getMoneyTop())){
					Bukkit.broadcastMessage(
							  "§2|§2§m-----------------------------------------\n"
							+ "§2|\n"
							+ "§2|§2§l[Magnata] §2"+Bukkit.getPlayer(Magnata.getMoneyTop()).getName() + " §dLogou no servidor!.\n"
							+ "§2|\n"
							+ "§2|§2§m-----------------------------------------\n");
					Magnata.mag = e.getPlayer().getName();
				}
				
			}
		}).start();
	}
	
}
