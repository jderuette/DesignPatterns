package org.djer.designPatterns.decorator.window;

/**
 * Décorateur concret ajoutant une barre verticale de défilement.
 * 
 * @author djer13 && WikiBook
 */
public class VerticalScrollBarDecorator extends WindowDecorator {

	public VerticalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}

	public void draw() {
		drawVerticalScrollBar();
		decoratedWindow.draw();
	}

	private void drawVerticalScrollBar() {
		// afficher la barre verticale de défilement
	}

	public String getDescription() {
		return decoratedWindow.getDescription() + ", avec une barre verticale de défilement";
	}

}
