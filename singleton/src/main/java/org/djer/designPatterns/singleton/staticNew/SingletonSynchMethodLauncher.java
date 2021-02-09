package org.djer.designPatterns.singleton.staticNew;

/**
 * @author djer13
 *
 */
public class SingletonSynchMethodLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("==== Design Patter ===== Singleton : avec method synchronisée.");
		System.out.println("========================================================");
		
		System.out.println("=== Après initialisation d'une instance directement dans le Launcher.main()");
		AnOtherUnique yauLauncher = AnOtherUnique.getInstance();
		yauLauncher.setDescription("Toi aussi rien que pour moi ?");
		System.out.println("yauLauncher.display() : " + yauLauncher.display());
		
		System.out.println("=== Après initialisation avec une autre variable directement dans le Launcher.main()");
		AnOtherUnique yauLauncher2 = AnOtherUnique.getInstance();
		yauLauncher2.setDescription("un autre rien que pour moi ?");
		System.out.println("yauLauncher2.display() : " + yauLauncher2.display());
		System.out.println("dans le précédent yauLauncher.display() : " + yauLauncher.display());
	}

}
