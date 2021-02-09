package org.djer.designPatterns.decorator.window;

/**
 * Décorateur concret ajoutant une barre horizontale de défilement.
 * 
 * @author djer13 && WikiBook
 */
public class HorizontalScrollBarDecorator extends WindowDecorator {
	public HorizontalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}

	public void draw() {
		drawHorizontalScrollBar();
		decoratedWindow.draw();
	}

	private void drawHorizontalScrollBar() {
		// afficher la barre horizontale de défilement
	}

	public String getDescription() {
		return decoratedWindow.getDescription() + ", avec une barre horizontale de défilement";
	}

}
