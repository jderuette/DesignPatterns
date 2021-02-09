package org.djer.designPatterns.builder.nonGof.innerClass.better;

/**
 * @author djer13
 *
 */
public class BuilderInnerClassGoodLauchner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("==== Design Patter ===== Builder : Un 'Bon Builder'");
		System.out.println("========================================================");
		
		System.out.println("==== Avec une bonne classe");
		GoodComplexe c2 = GoodComplexe.Builder.create(28);
		
		//avec GoodComplexe on est **obligé** d'utiliser le Builder
		//BadComplexe c2 = new GoodComplexe(); // IMPOSSIBLE constructeur non visible !
		//BadComplexe c2 = new GoodComplexe(48); // IMPOSSIBLE constructeur non créé
		
		System.out.println("c2 : " + c2);

	}

}
