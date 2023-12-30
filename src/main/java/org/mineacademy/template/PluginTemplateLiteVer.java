package org.mineacademy.template;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.mineacademy.fo.plugin.SimplePlugin;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 * <p>
 * It uses Foundation for fast and efficient development process.
 */
public final class PluginTemplateLiteVer extends SimplePlugin {
	/**
	 * apple test
	 */
	int apple = 5;


	/**
	 * Automatically perform login ONCE when the plugin starts.
	 */

	@Override
	protected void onPluginStart() {


		String hello = "Hello! Whatever!" +
				"Hi!";

		double apples = 0.7;

		boolean isAlive = true;
		isAlive = false;

		hello = "HI";

		int firstNumber = 10;
		int secondNumber = -12;

		double resultNumber = firstNumber * secondNumber / 1.4;

		//If the plugin is loaded this message will print out (One-liner Comment)
		/*
		If the plugin is loaded,
		"Plugin loaded will print out
		(Multi-liner Comment)
		 */
		System.out.println(resultNumber);
	}


	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */


	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClick(PlayerInteractEntityEvent event) {


		event.getRightClicked().setFreezeTicks(10000);
		event.getRightClicked().setVisualFire(true);
		int apple = 5;


		if (event.getRightClicked().getType() == EntityType.COW)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 0);
	}
}