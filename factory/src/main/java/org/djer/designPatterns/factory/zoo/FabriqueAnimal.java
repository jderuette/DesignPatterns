
package org.djer.designPatterns.factory.zoo;

/**
 * @author djer13 && WikiBook
 *
 */
public class FabriqueAnimal {

	private static FabriqueAnimal instance = new FabriqueAnimal();

	private FabriqueAnimal() {
	}

	public static FabriqueAnimal getFabriqueAnimalInstance() {
		return instance;
	}

	/**
	 * Avoid using "chien" deprecié in 2.5
	 * @param typeAnimal
	 * @return
	 * @throws ExceptionCreation
	 */
	public Animal createAnimal(String typeAnimal) throws ExceptionCreation {
		if (typeAnimal.equals("chat"))
			return new Chat();
		if (typeAnimal.equals("cat"))
			return new Chat();
		else if (typeAnimal.equals("chien"))
			return new Chien();
		else if (typeAnimal.equals("dog"))
			return new Chien();
		else if (typeAnimal.equals("reptile"))
			return new Reptile();
		else if (typeAnimal.equals("serpent"))
			return new Reptile();
		else
			throw new ExceptionCreation("Le type " + typeAnimal + " n'existe pas (ou plus)");
	}

}
