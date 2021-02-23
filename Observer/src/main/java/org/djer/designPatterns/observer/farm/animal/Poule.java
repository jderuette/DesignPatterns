package org.djer.designPatterns.observer.farm.animal;

/**
 * 
 * @author djer13
 */
public class Poule extends Animal {

	/**
	 * 
	 * @param aName animal name
	 */
	public Poule(String aName) {
		super(aName);
	}

	@Override
	public void update(String message) {
		if (message.equals("Cocorico")) {
			chanter();
		}
	}

	public void chanter() {
		System.out.println(super.name + " : CotCot !");
	}

	public void gratterLeSol() {
		System.out.println(super.name + " cherche un vers");
	}

	public void pondre() {
		System.out.println(super.name + " pond un oeuf");
		chanter();
	}

}
