package org.djer.designPatterns.observer.farm;

import java.util.List;

/**
 * 
 * @author djer13
 */
public class Fermier extends Subject {
	
	List<Observer> observers;
	
	public void call(String message) {
		super.publish();
	}

}
