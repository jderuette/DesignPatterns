package org.djer.designPatterns.observer.farm;

import java.util.ArrayList;
import java.util.List;

import org.djer.designPatterns.observer.farm.animal.Animal;
import org.djer.designPatterns.observer.farm.animal.Chat;
import org.djer.designPatterns.observer.farm.animal.Cheval;
import org.djer.designPatterns.observer.farm.animal.Chien;
import org.djer.designPatterns.observer.farm.animal.Poule;
import org.djer.designPatterns.observer.farm.stats.StatsCollector;

/**
 * 
 * @author djer13
 */
public class ObserverFarmLaucnher {

	private final static List<Animal> animals = new ArrayList<Animal>();

	/**
	 * @param args une ou plusieurs chaine de texte séparé par des virgules parmis :
	 *             Siffler, Agiter gamelle de croquettes, Cocorico, Taper la
	 *             barrière.
	 */
	public static void main(String[] args) {

		// Dans une vrai application, serait fait indépendament, sans "controle"
		createAnimals();

		Fermier fermier = new Fermier();
		// Ce fermier peux appeler n'importe qu'elle animal
		for (Animal anAnimal : animals) {
			fermier.attach(anAnimal);
		}

		// Ajout du collecteur de statistics
		fermier.attach(StatsCollector.getInstance());

		// Traitement des données d'entrée du programe
		for (String action : args) {
			if (action.endsWith(",")) {
				action = action.substring(0, action.length() - 1);
			}

			System.out.println("=========== Le fermier va : " + action);
			fermier.call(action);
		}

		// Affichage des stats
		System.out
				.println("=== Nombre de signaux emis par le fermier : " + StatsCollector.getInstance().getNbSignal());
	}

	private static void createAnimals() {

		animals.add(new Chien("Médor"));
		animals.add(new Chien("Rex"));
		animals.add(new Chien("Balou"));
		animals.add(new Chien("Brutus"));
		animals.add(new Chien("Caly"));

		animals.add(new Chat("Felix"));
		animals.add(new Chat("Garfield"));
		animals.add(new Chat("Tigrou"));
		animals.add(new Chat("Simba"));
		animals.add(new Chat("Polochon"));
		animals.add(new Chat("Pikachu"));
		animals.add(new Chat("Azraël"));

		for (int i = 1; i <= 25; i++) {
			animals.add(new Poule("poule_" + i));
		}

		animals.add(new Cheval("Azufel"));
		animals.add(new Cheval("Arod"));
		animals.add(new Cheval("Tornado"));
	}

}
