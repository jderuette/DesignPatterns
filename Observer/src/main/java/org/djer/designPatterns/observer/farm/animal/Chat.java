package org.djer.designPatterns.observer.farm.animal;

import org.djer.designPatterns.observer.farm.Subject;

/**
 * 
 * @author djer13
 */
public class Chat extends Animal {
	
	public Chat(Subject sub, String aName) {
		super(sub, aName);
	}
	
	/**
	 * 
	 * @param aName animal name
	 */
	public Chat(String aName) {
		super(aName);
	}
	
	@Override
	public void update() {
		miauler();
	}
	
	public void miauler() {
		System.out.println(super.name + " : miaou");
	}

}
