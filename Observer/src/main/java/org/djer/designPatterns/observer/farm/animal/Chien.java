package org.djer.designPatterns.observer.farm.animal;

/**
 * 
 * @author djer13
 */
public class Chien extends Animal {

	/**
	 * 
	 * @param aName animal name
	 */
	public Chien(String aName) {
		super(aName);
	}

	/**
	 * 
	 * @param message : EVENT
	 */
	@Override
	public void update(String message) {
		if (message.equals("Siffler")) {
			aboyer();
		}
	}

	public void aboyer() {
		System.out.println(super.name + " : ouaf !");
	}

	public void monterLaGarde() {
		System.out.println(super.name + " surveilel les environ");
	}

}
