package org.djer.designPatterns.builder.real.restaurant;

/**
 * MonteurConcret.
 * 
 * @author djer13 && WikiBook
 *
 */
class MonteurPizzaHawaii extends MonteurPizza {
	public void monterPate() {
		pizza.setPate("croisée");
	}

	public void monterSauce() {
		pizza.setSauce("douce");
	}

	public void monterGarniture() {
		pizza.setGarniture("jambon+ananas");
	}
}
