package org.djer.designPatterns.observer.farm.animal;

/**
 * 
 * @author djer13
 */
public class Cheval extends Animal {

	/**
	 * 
	 * @param aName animal name
	 */
	public Cheval(String aName) {
		super(aName);
	}

	@Override
	public void update(String message) {
		if (message.equals("Taper la barrière")) {
			hennir();
		}
	}

	public void hennir() {
		System.out.println(super.name + " : Hihaaa");
	}

	public void brouter() {
		System.out.println(super.name + "  broutte");
	}

}
