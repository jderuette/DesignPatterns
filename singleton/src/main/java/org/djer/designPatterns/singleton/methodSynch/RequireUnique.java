package org.djer.designPatterns.singleton.methodSynch;

/**
 * This class manage is own YouAreUnique instance. Butt will be the same of
 * other class requiring one.
 * 
 * @author djer13
 */
public class RequireUnique {
	private YouAreUnique yau;

	public RequireUnique() {
		yau = YouAreUnique.getInstance();
	}

	public String display() {
		return "From RequireUnique : " + yau.getDescription();
	}

}
