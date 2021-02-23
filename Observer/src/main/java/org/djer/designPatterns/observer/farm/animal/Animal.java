package org.djer.designPatterns.observer.farm.animal;

import org.djer.designPatterns.observer.farm.Observer;

/**
 * 
 * @author djer13
 */
public abstract class Animal extends Observer {
	protected String name;

	public Animal(String aName) {
		this.name = aName;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param aName the name to set
	 */
	public void setName(String aName) {
		this.name = aName;
	}

}
