package org.djer.designPatterns.builder.nonGof.innerClass.perfect;

/**
 * @author djer13
 *
 */
public class BuilderInnerClassPerfectLauchner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("==== Design Patter ===== Builder : Un  'Builder parfait'");
		System.out.println("========================================================");
		
		System.out.println("==== Avec une classe parfaite (sauf que l'on peu toujours faire un 'new' !!!)");
		PerfectComplexe c2 = new PerfectComplexe().builder().setAttribut1(28).setAttribut3("jérémie").getComplexe(); 
		
		System.out.println("c2 : " + c2);
		
		System.out.println("==== Avec une classe parfaite (sauf que l'on peu toujours faire un 'new' !!!) et la manipulation du Builder");
		PerfectComplexe.Builder c3Builder = new PerfectComplexe().builder().setAttribut1(28);
		
		boolean aCondition = false;
		if(aCondition) {
			c3Builder.setAttribut3("Jérémie");
		}else {
			c3Builder.setAttribut3("Bob");
		}
	}
}
