package org.djer.designPatterns.factory.zoo;

/**
 * 
 * @author djer13
 */
public class Reptile extends Animal {

	@Override
	public void myName() {
		System.out.println("Ssssss ! " + super.name);		
	}

}
