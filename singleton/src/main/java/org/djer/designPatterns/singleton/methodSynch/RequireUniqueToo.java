package org.djer.designPatterns.singleton.methodSynch;

import java.security.InvalidParameterException;

/**
 * This class allow YouAreUnique instance definition. But will always be shared
 * in all application.
 * 
 * @author djer13
 */
public class RequireUniqueToo {
	YouAreUnique youAreUnique;

	public String display() {
		if (null == youAreUnique) {
			throw new InvalidParameterException(this.getClass() + " Need to be intialized !");
		}
		return "From RequireUniqueToo : " + youAreUnique.display();
	}

	/**
	 * @return the yau
	 */
	public YouAreUnique getYouAreUnique() {
		return youAreUnique;
	}

	/**
	 * @param yau the yau instance to set
	 */
	public void setYau(YouAreUnique yau) {
		this.youAreUnique = yau;
	}

}
