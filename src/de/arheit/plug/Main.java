package de.arheit.plug;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("Starting");
	}
	
	
	@Override
	public void onDisable() {
		System.out.println("Stopping");
	}
}
