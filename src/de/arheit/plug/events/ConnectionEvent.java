package de.arheit.plug.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ConnectionEvent implements Listener {
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		e.setJoinMessage("Welcome, " + e.getPlayer().getName());
	}
}
