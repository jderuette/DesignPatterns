package org.djer.designPatterns.decorator.window;

/**
 * 
 * @author djer13
 */
public class ReduceIconeDecorator extends WindowDecorator {
	
	public ReduceIconeDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}

	public void draw() {
		decoratedWindow.draw();
		drawIcon();
	}
	
	private void drawIcon() {
		// dessine et place un icone
	}
	

	public String getDescription() {
		return decoratedWindow.getDescription() + " Avec un bouton de reduction";
	}

}
