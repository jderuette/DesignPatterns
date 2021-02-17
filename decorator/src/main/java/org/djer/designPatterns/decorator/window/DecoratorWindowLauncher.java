package org.djer.designPatterns.decorator.window;

/**
 * 
 * @author djer13 && WikiBook
 */
public class DecoratorWindowLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("==== Design Patter ===== Decorator");
		System.out.println("========================================================");
		System.out.println("=== Une fenetre avec barres de défillement horizontal et vertical");
		Window decoratedWindow = new HorizontalScrollBarDecorator(new VerticalScrollBarDecorator(new SimpleWindow()));

		// afficher la description
		System.out.println("Descirption de decoratedWindow : " + decoratedWindow.getDescription());
		
		System.out.println("=== Une fenetre sans déco");
		Window standardWindow = new SimpleWindow();
		System.out.println("Descirption de standardWindow : " + standardWindow.getDescription());
		
		//Only horizontal Scroll Bar
		System.out.println("=== Seulement la bar Horizontal 'greffé' sur une fentre existante");
		Window uneFenetreSimple = new SimpleWindow();
		System.out.println("Une fentre simple avant décoration : " + uneFenetreSimple.getDescription());
		Window fenetreQuonVeut = new HorizontalScrollBarDecorator(uneFenetreSimple);
		
		System.out.println("Après décoration Horizontal : " + fenetreQuonVeut.getDescription());
		
		System.out.println("=== Et si on ajoute maintenant un icone pour 'réduire' la fenetre");
		fenetreQuonVeut = new ReduceIconeDecorator(fenetreQuonVeut);
		System.out.println("Apres ajout de l'icone de reduction sur fenetreQuonVeut : " + fenetreQuonVeut.getDescription());

	}
}
