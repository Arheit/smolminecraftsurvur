package de.arheit.plug;

import org.bukkit.plugin.java.JavaPlugin;
import de.arheit.plug.events.ConnectionEvent;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("Starting Arhplug");
		getServer().getPluginManager().registerEvents(new ConnectionEvent(), this);
	}

	@Override
	public void onDisable() {
		System.out.println("Stopping Arhplug");
	}
}
