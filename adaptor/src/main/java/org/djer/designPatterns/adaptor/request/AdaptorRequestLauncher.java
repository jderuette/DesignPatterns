package org.djer.designPatterns.adaptor.request;

import java.util.ArrayList;
import java.util.List;

import org.djer.designPatterns.adaptor.request.unmodifiable.Adaptee;

/**
 * @author djer13
 *
 */
public class AdaptorRequestLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("==== Design Patter ===== Adapter : Traitement de requetes chacune contenue dans un Objet");
		System.out.println("========================================================");
		// prepare objects
		Processor stdClass = new StandardClass();
		Processor anOtherStdClass = new AnOtherStandardClass();
		Adaptee adaptee = new Adaptee();
		Processor adapteeAsProcessor = new ProcessorAdapter(adaptee);
		
		//for demo add all classes in a list
		List<Processor> toProcess = new ArrayList<Processor>();
		
		toProcess.add(stdClass);
		toProcess.add(anOtherStdClass);
		toProcess.add(adapteeAsProcessor);
		
		System.out.println("=== Affichage du traitement de tous les objets, y compris l'adapté");
		for(Processor processor : toProcess) {
			processor.request();
		}
		
		System.out.println("=== Affichage de l'adapté, sans passer par son adapter");
		adaptee.specificRequest();

	}
}
