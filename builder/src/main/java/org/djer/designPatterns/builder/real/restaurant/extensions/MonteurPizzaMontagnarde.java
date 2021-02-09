package org.djer.designPatterns.builder.real.restaurant.extensions;

import org.djer.designPatterns.builder.real.restaurant.MonteurPizza;

/**
 * MonteurConcret.
 * 
 * @author djer13
 *
 */
public class MonteurPizzaMontagnarde extends MonteurPizza {
	public void monterPate() {
		pizza.setPate("épaisse");
	}

	public void monterSauce() {
		pizza.setSauce("légère");
	}

	public void monterGarniture() {
		pizza.setGarniture("jambon+fromage+pommes de terre");
	}
}
