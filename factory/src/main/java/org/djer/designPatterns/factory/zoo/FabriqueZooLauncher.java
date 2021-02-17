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
		System.out.println("==== Design Pattern ===== Fabrique");
		System.out.println("========================================================");
		
		try {
			System.out.println("==== Après intialisation");
			Animal animal = fabrique.createAnimal("dog");
			//Code potentiellement non éxécuté !!!
			animal.setName("Rex");
			animal.myName();
			
			Animal anOtherAnimal = fabrique.createAnimal("chat");
			anOtherAnimal.myName();
			
			Animal anOtherDog = fabrique.createAnimal("chien");
			anOtherDog.setName("Médor");
			anOtherDog.myName();
			
			System.out.println("==== Après renomage de Rex");
			animal.setName("Super Rex");
			animal.myName();
			anOtherAnimal.myName();
			anOtherDog.myName();
			
			Animal uneBete = fabrique.createAnimal("reptile");
			uneBete.setName("snake");
			uneBete.myName();
			
			System.out.println("==== Avec un type d'annimal inconue");
			Animal bigFoot = fabrique.createAnimal("yeti"); //ExceptionCreation ici
			
			//Ce code ne sera JAMAIS éxécuté tant que la fabrique ne gère pas le type "yeti"
			bigFoot.setName("blue");
			bigFoot.myName();
			
			System.out.println("==== Création d'un 3ème chien");
			Animal aDog = fabrique.createAnimal("chien");
			aDog.setName("Invisible dog");
			aDog.myName();
			
		} catch (ExceptionCreation e) {
			System.err.println("ERROR : " + e.getMessage());
		}
		
		System.out.println("FIN DU PROGRAME");
	}

}
