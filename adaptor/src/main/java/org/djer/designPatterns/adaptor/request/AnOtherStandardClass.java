package org.djer.designPatterns.adaptor.request;

/**
 * @author djer13
 *
 */
public class AnOtherStandardClass implements Processor {

	public void request() {
		System.out.println("J'effectue une requete standard, mais autrement");
	}

}
