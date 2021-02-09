package org.djer.designPatterns.decorator.window;

/**
 * Classe décorative abstraite, implémente Window.
 * 
 * @author djer13 && WikiBook
 */
public abstract class WindowDecorator implements Window {

	protected Window decoratedWindow; // la fenêtre décorée

	public WindowDecorator(Window decoratedWindow) {
		this.decoratedWindow = decoratedWindow;
	}
}
