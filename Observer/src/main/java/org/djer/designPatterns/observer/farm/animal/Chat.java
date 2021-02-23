package org.djer.designPatterns.observer.farm.animal;

/**
 * 
 * @author djer13
 */
public class Chat extends Animal {

	/**
	 * 
	 * @param aName animal name
	 */
	public Chat(String aName) {
		super(aName);
	}

	@Override
	public void update(String message) {
		if (message.equals("Agiter gamelle de croquettes")) {
			miauler();
		}
	}

	public void miauler() {
		System.out.println(super.name + " : miaou");
	}

	public void manger() {
		System.out.println(super.name + " mange");
	}

	public void dormire() {
		System.out.println(super.name + " broute");
	}

}
