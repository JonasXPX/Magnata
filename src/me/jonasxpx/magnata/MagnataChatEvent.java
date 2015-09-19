package me.jonasxpx.magnata;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import br.com.devpaulo.legendchat.api.events.ChatMessageEvent;

public class MagnataChatEvent implements Listener{

	/**
	 * 
	 * @param e Evento que recupera o nick do Magnata e adiciona sua tag.
	 */
	@EventHandler
	public void magnataChatEvent(ChatMessageEvent e){
		if(e.getSender().getName().equalsIgnoreCase(Magnata.mag)){
			e.setTagValue("magnata", "§2§o[Magnata]");
		}
	}
}
