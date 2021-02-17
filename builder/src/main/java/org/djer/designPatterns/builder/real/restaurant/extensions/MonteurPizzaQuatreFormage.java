package org.djer.designPatterns.builder.real.restaurant.extensions;

import org.djer.designPatterns.builder.real.restaurant.MonteurPizza;

/**
 * 
 * @author djer13
 */
public class MonteurPizzaQuatreFormage extends MonteurPizza {

	@Override
	public void monterPate() {
		pizza.setPate("basique");
	}

	@Override
	public void monterSauce() {
		pizza.setSauce("douce");
	}

	@Override
	public void monterGarniture() {
		pizza.setGarniture("emmental+moza+bleu+tome de Savoie");
	}
}
