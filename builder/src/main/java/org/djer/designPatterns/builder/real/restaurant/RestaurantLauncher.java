/**
 * 
 */
package org.djer.designPatterns.builder.real.restaurant;

import org.djer.designPatterns.builder.real.restaurant.extensions.MonteurPizzaMontagnarde;
import org.djer.designPatterns.builder.real.restaurant.extensions.MonteurPizzaQuatreFormage;

/**
 * @author djer1
 *
 */
public class RestaurantLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("==== Design Patter ===== Builder : un vrai Buuilder Gof, basé sur l'exemple du WikiBook");
		System.out.println("========================================================");
		
		Serveur serveur = new Serveur();
        MonteurPizza monteurPizzaHawaii  = new MonteurPizzaHawaii();
        MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();
        MonteurPizza monteurPizzaMontagnarde = new MonteurPizzaMontagnarde();
        MonteurPizza monteurPizzaQuatreFrom = new MonteurPizzaQuatreFormage();

        serveur.setMonteurPizza(monteurPizzaHawaii);
        serveur.construirePizza();
        Pizza pizza = serveur.getPizza();
        
        serveur.setMonteurPizza(monteurPizzaPiquante);
        serveur.construirePizza();
        Pizza pizza2 = serveur.getPizza();
        
        serveur.setMonteurPizza(monteurPizzaMontagnarde);
        serveur.construirePizza();
        Pizza pizzaPourDjer = serveur.getPizza();
        
        serveur.setMonteurPizza(monteurPizzaQuatreFrom);
        serveur.construirePizza();
        Pizza pizzaRemi = serveur.getPizza();
        
        System.out.println("Pour le premier client : la pizza suivante sera servie : " + pizza);
        System.out.println("Pour le dexième client : la pizza suivante sera servie : " + pizza2);
        System.out.println("Pour Djer : la pizza suivante sera servie : " + pizzaPourDjer);
        
        System.out.println("Pour Rémi : la pizza suivante sera servie : " + pizzaRemi);
        
	}
}
