package org.djer.designPatterns.decorator.window;

/**
 * Interface des fenêtres.
 * 
 * @author djer13 && WikiBook
 */
public interface Window {
	public void draw(); // dessine la fenêtre
    public String getDescription(); // retourne une description de la fenêtre
}
