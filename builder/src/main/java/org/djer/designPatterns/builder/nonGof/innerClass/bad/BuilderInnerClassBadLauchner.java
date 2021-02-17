package org.djer.designPatterns.builder.nonGof.innerClass.bad;

/**
 * @author djer13
 *
 */
public class BuilderInnerClassBadLauchner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("==== Design Patter ===== Builder : Un 'mauvais Builder'");
		System.out.println("========================================================");
				
		System.out.println("==== Mauvaise utilisation !!!! Avec le constrcuteur par défaut");
		BadComplexe cBad = new BadComplexe();
		try {
			System.out.println("cbad : " + cBad);
		} catch (NullPointerException npe) {
			//on ne devrait jamais catcher NPE !! 
			System.err.println("ERREUR : un NullPointerException c'est produit en essayant d'afficher cBad ! ");
		}
		
		System.out.println("==== Mauvaise utilisation !!!! Avec le constrcuteur attendant un paramètre");
		BadComplexe cBad2 = new BadComplexe(28);
		try {
		System.out.println("cbad2 : " + cBad2);
		} catch (NullPointerException npe) {
			//on ne devrait jamais catcher NPE !! 
			System.err.println("ERREUR : un NullPointerException c'est produit en essayant d'afficher cBad2 ! ");
		}
		
		System.out.println("==== Bonne utilisation, mais il faut être prudent (et bien savoir quoi mettre à jour en cas d'évolution !)");
		BadComplexe cBad3 = new BadComplexe(12);
		cBad3.setAttribut2("");
		
		System.out.println("cBad3 : " + cBad3);
		
		System.out.println("==== Avec une meilleur classe (Idéalement BacComplexe devrait être 'abstract')");
		BadComplexe c2 = BetterBadComplexe.Builder.create(28); //On construit toujours des **Bad**, mais mieux car plus de risques d'erreurs  !
		
		//BadComplexe c2 = new BetterBadComplexe(); //IMPOSSIBLE : constructeur devenue invisible !
		//BadComplexe c2 = new BetterBadComplexe(42); //IMPOSSIBLE : constructeur devenue invisible !
		
		
		System.out.println("c2 : " + c2);

	}

}
