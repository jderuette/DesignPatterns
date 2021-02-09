package org.djer.designPatterns.builder.real.restaurant;

/**
 * Directeur.
 * 
 * @author djer13 && WikiBook
 *
 */
class Serveur {
	private MonteurPizza monteurPizza;

	public void setMonteurPizza(MonteurPizza mp) {
		monteurPizza = mp;
	}

	public Pizza getPizza() {
		return monteurPizza.getPizza();
	}

	public void construirePizza() {
		monteurPizza.creerNouvellePizza();
		monteurPizza.monterPate();
		monteurPizza.monterSauce();
		monteurPizza.monterGarniture();
	}
}
