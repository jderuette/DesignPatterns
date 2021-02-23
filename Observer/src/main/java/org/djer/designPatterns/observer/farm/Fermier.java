package org.djer.designPatterns.observer.farm;

/**
 * 
 * @author djer13
 */
public class Fermier extends Subject {

	public void call(String message) {
		System.out.println("Le fermier : " + message);
		super.publish(message);
	}

}
