package org.djer.designPatterns.observer.farm.animal;

import org.djer.designPatterns.observer.farm.Subject;

/**
 * 
 * @author djer13
 */
public class Chien extends Animal {
	
	public Chien(Subject sub, String aName) {
		super(sub, aName);
	}
	
	/**
	 * 
	 * @param aName animal name
	 */
	public Chien(String aName) {
		super(aName);
	}
	
	@Override
	public void update() {
		aboyer();
	}
	
	
	public void aboyer() {
		System.out.println(super.name + " : ouaf !");
	}
	
	public void monterLaGarde() {
		System.out.println(super.name + " surveilel les environ");
	}
	
}
