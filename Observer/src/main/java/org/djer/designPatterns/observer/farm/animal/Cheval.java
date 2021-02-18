package org.djer.designPatterns.observer.farm.animal;

import org.djer.designPatterns.observer.farm.Subject;

/**
 * 
 * @author djer13
 */
public class Cheval extends Animal {

	public Cheval(Subject sub, String aName) {
		super(sub, aName);
	}

	/**
	 * 
	 * @param aName animal name
	 */
	public Cheval(String aName) {
		super(aName);
	}

	@Override
	public void update() {
		hennir();
	}

	public void hennir() {
		System.out.println(super.name + " : Hihaaa");
	}

	public void brouter() {
		System.out.println(super.name + "  broutte");
	}

}
