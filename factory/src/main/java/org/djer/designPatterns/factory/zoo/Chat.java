package org.djer.designPatterns.factory.zoo;

/**
 * @author djer13 && WikiBook
 *
 */
public class Chat extends Animal {

	@Override
	public void myName() {
		System.out.println("Je suis un Chat et je m'appel : " + super.name);
	}

}
