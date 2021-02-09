package org.djer.designPatterns.singleton.methodSynch;

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
		YouAreUnique yauLauncher = YouAreUnique.getInstance();
		yauLauncher.setDescription("Rien que pour moi ?");
		System.out.println("yauLauncher.display() : " + yauLauncher.display());
		
		
		System.out.println("=== Via les classes ayant besoin d'un YouAreUnique");
		RequireUnique service1 = new RequireUnique();
		RequireUnique service2 = new RequireUnique();
		RequireUnique service3 = new RequireUnique();
		
		System.out.println("=== Après initialisation");
		
		System.out.println("service1.display() : " + service1.display());
		System.out.println("service2.display() : " + service2.display());
		System.out.println("service3.display() : " + service3.display());
		
		
		System.out.println("=== Après modification via yauLauncher.display()");
		yauLauncher.setDescription("Haha ! Je t'ai modifié rien que pour moi !");
		
		
		System.out.println("yauLauncher.display() : " + yauLauncher.display());
		System.out.println("service1.display() : " + service1.display());
		System.out.println("service2.display() : " + service2.display());
		System.out.println("service3.display() : " + service3.display());
		
		System.out.println("=== En utilisant RequireuniqueToo et en injectant un YouAreUnique");
		RequireUniqueToo serviceToo1 = new RequireUniqueToo();
		RequireUniqueToo serviceToo2 = new RequireUniqueToo();
		
		serviceToo1.setYau(YouAreUnique.getInstance());
		serviceToo2.setYau(YouAreUnique.getInstance());
		
		System.out.println("=== Après initialisation");
		System.out.println("serviceToo1.display() : " + serviceToo1.display());
		System.out.println("serviceToo2.display() : " + serviceToo2.display());
		
		System.out.println("dans le précédent service1.display() : " + service1.display());
		System.out.println("dans le précédent service2.display() : " + service2.display());
		System.out.println("dans le précédent service3.display() : " + service3.display());
		
		System.out.println("=== En modifiant directement via le getIsntance() ? ");
		YouAreUnique.getInstance().setDescription("Ca change pour tout le monde ? ");
		
		System.out.println("=== Après initialisation");
		System.out.println("dans le précédent serviceToo1.display() : " + serviceToo1.display());
		System.out.println("dans le précédent serviceToo2.display() : " + serviceToo2.display());
		System.out.println("dans le précédent yauLauncher.display() : " + yauLauncher.display());

	}

}
