package org.djer.designPatterns.observer.farm.animal;

import org.djer.designPatterns.observer.farm.Subject;

/**
 * 
 * @author djer13
 */
public class Poule extends Animal {
	
	public Poule(Subject sub, String aName) {
		super(sub, aName);
	}
	
	/**
	 * 
	 * @param aName animal name
	 */
	public Poule(String aName) {
		super(aName);
	}

	@Override
	public void update() {
		chanter();
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
