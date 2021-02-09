package org.djer.designPatterns.factory.zoo;

/**
 * @author djer13 && WikiBook
 *
 */
public class FabriqueZooLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FabriqueAnimal fabrique = FabriqueAnimal.getFabriqueAnimalInstance();
		System.out.println("==== Design Patter ===== Fabrique");
		System.out.println("========================================================");
		
		try {
			System.out.println("==== Après intialisation");
			Animal animal = fabrique.getAnimal("chien");
			animal.setName("Rex");
			animal.myName();
			
			Animal anOtherAnimal = fabrique.getAnimal("chat");
			anOtherAnimal.myName();
			
			Animal anOtherDog = fabrique.getAnimal("chien");
			anOtherDog.setName("Médor");
			anOtherDog.myName();
			
			System.out.println("==== Après renomage de Rex");
			animal.setName("Super Rex");
			animal.myName();
			anOtherAnimal.myName();
			anOtherDog.myName();
			
			System.out.println("==== Avec un type d'annimal inconue");
			Animal bigFoot = fabrique.getAnimal("yeti"); //ExceptionCreation ici
			bigFoot.setName("blue");
			bigFoot.myName();
			
		} catch (ExceptionCreation e) {
			System.err.println("ERROR : " + e.getMessage());
		}
	}

}
