package org.djer.designPatterns.adaptor.request;

import org.djer.designPatterns.adaptor.request.unmodifiable.Adaptee;

/**
 * Adapte un Adaptee pour qu'il se comporte comme un Processor.
 * @author djer13
 */
public class ProcessorAdapter implements Processor {

	private Adaptee adaptee;

	public ProcessorAdapter(Adaptee adapt) {
		this.adaptee = adapt;
	}

	public void request() {
		adaptee.specificRequest();
	}

}
