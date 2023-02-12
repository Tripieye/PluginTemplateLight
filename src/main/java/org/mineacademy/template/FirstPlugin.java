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
public final class FirstPlugin extends SimplePlugin {

	/**
	 * This a test
	 */
	int apple = 5;

	public int something() {
		return -1;
	}

	@Override
	protected void onPluginStart() {

		int firstNumber = 5;
		int secondNumber = 10;

		double result = (firstNumber - secondNumber) / 3.56;

		/*
		 * Testing
		 */

		System.out.println(1);
		System.out.println("knock, knock! " + (1 + 1) + " testing");


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

		int apple = 5;

		if (event.getRightClicked().getType() == EntityType.CHICKEN)
			event.getRightClicked().getWorld().createExplosion(event.getRightClicked().getLocation(), 5);
	}

	int multiplyAndMultiplyByTwo(int firstNumber, int secondNumber) {
		int result = firstNumber * secondNumber;

		result = result * 2;

		return result;

	}
}
