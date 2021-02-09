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
	}
}
