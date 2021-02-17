package org.djer.designPatterns.observer.farm;

import org.djer.designPatterns.observer.farm.animal.Chat;
import org.djer.designPatterns.observer.farm.animal.Chien;

/**
 * 
 * @author djer13
 */
public class ObserverFarmLaucnher {

	/**
	 * @param args une ou plusieurs chaine de texte séparé par des virgules parmis : 
	 *     Siffler, Agiter gamelle de croquettes, Cocorico, Taper la barrière.
	 */
	public static void main(String[] args) {
		
		//String action = "sifler";
		
		Fermier fermier = new Fermier();
		Chien unChien = new Chien(fermier, "Médor");
		Chien chien1 = new Chien(fermier, "Rex");
		Chien chien2 = new Chien(fermier, "Balou");
		Chien chien3 = new Chien(fermier, "Brutus");
		Chien chien4 = new Chien(fermier, "Caly");
		
		Chat unChat = new Chat(fermier, "Felix");

		
		System.out.println("=========== Le fermier va : ");
		for (String action : args) {
			if(action.endsWith(",")) {
				action = action.substring(0, action.length()-1);
			}
			
			System.out.println("== " + action);
			fermier.call(action);	
		}

	}

}
