package org.djer.designPatterns.singleton.staticNew;

/**
 * @author djer13
 */
public class AnOtherUnique {
	private static AnOtherUnique INSTANCE = new AnOtherUnique();
	
	/**
	 * Avoid as much as possible "state" in Singleton !! This is useful for testing
	 * purpose. this attribute can have different values in different thread in some
	 * race conditions !
	 */
	private String description;

	
	/** Private constructor disable default constructor. */
	private AnOtherUnique() {
	}

	public static AnOtherUnique getInstance() {
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
