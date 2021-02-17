package org.djer.designPatterns.observer.farm;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author djer13
 */
public abstract class Subject {
	
	List<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer obs) {
		observers.add(obs);
	}
	
	public void detach(Observer obs) {
		observers.remove(obs);
	}
	
	public void publish() {
		for (Observer obs : observers) {
			obs.update();
		}
	}
}
