package org.djer.designPatterns.singleton.methodSynch;

/**
 * A classic Singleton with Synchronized Method to avoid potential multiple
 * instance in multi-thread environment (default in Java).
 * 
 * @author djer13
 *
 */
public class YouAreUnique {
	private static YouAreUnique INSTANCE = null;

	/**
	 * Avoid as much as possible "state" in Singleton !! This is useful for testing
	 * purpose. this attribute can have different values in different thread in some
	 * race conditions !
	 */
	private String description;

	/** Private constructor disable default constructor. */
	private YouAreUnique() {
	}

	/**  Synchronized to avoid "race condition". */
	public static synchronized YouAreUnique getInstance() {
		if (null == INSTANCE) {
			INSTANCE = new YouAreUnique();
		}
		return INSTANCE;
	}

	public String display() {
		return "No matter what you try, I'm the only one : " + description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param desc the description to set
	 */
	public void setDescription(String desc) {
		this.description = desc;
	}

}
