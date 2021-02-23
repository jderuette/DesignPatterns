package org.djer.designPatterns.observer.farm;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author djer13
 */
public abstract class Subject {

	Set<Observer> observers = new HashSet<Observer>();

	public void attach(Observer obs) {
		observers.add(obs);
	}

	public void detach(Observer obs) {
		observers.remove(obs);
	}

	public void publish(String message) {
		for (Observer obs : observers) {
			obs.update(message);
		}
	}
}
