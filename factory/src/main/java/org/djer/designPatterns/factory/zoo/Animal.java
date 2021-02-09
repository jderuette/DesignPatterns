package org.djer.designPatterns.factory.zoo;

/**
 * @author djer13 && WikiBook
 */
public abstract class Animal {
	protected String name = "inconue";
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public abstract void myName();
}
