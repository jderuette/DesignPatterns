package org.djer.designPatterns.factory.zoo;

/**
 * @author djer13 && WikiBook
 *
 */
public class Chien extends Animal {

	@Override
	public void myName() {
		System.out.println("Je m'appel '" + super.name + "', je suis un Chien et je suis content !");
	}

}
