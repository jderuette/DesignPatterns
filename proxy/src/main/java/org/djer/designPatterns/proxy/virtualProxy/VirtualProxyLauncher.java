package org.djer.designPatterns.proxy.virtualProxy;

/**
 * 
 * @author djer13 & WikiBook
 */
public class VirtualProxyLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Image image1 = new ProxyImage("HiRes_10MB_Photo1");
		Image image2 = new ProxyImage("HiRes_10MB_Photo2");
		Image image3 = new ProxyImage("HiRes_10MB_Photo3");

		image1.displayImage(); // chargement nécessaire
		image2.displayImage(); // chargement nécessaire
		image1.displayImage(); // pas de chargement nécessaire, déjà fait
		// la troisième image ne sera jamais chargée : pas de temps gaspillé
	}

}
