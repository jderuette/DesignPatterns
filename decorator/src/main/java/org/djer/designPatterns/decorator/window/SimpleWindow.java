package org.djer.designPatterns.decorator.window;

/**
 * Implémentation d'une fenêtre simple, sans barre de défilement.
 * 
 * @author djer13 && WikiBook
 */
public class SimpleWindow implements Window {

	public void draw() {
		// dessiner la fenêtre
	}

	public String getDescription() {
		return "fenêtre simple";
	}
}
