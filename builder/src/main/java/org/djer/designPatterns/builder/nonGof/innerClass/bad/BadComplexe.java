package org.djer.designPatterns.builder.nonGof.innerClass.bad;

/**
 * @author djer13
 *
 */
public class BadComplexe {
	private int attribut1;
	private String attribut2; //Must exist (toUpperCase() called often !!)
	private String attribut3;
	
	public BadComplexe() {
		super();
	}
	
	public BadComplexe(int att1) {
		super();
		this.attribut1 = att1;
	}

	public static class Builder {
		private static final String EMPTY_STR = "";

		/**
		 * Avoid invalid <em>Complexe<em> object.
		 * 
		 * @return à pré-configured <em>Complexe<em> instance.
		 */
		public static BadComplexe create(int att1) {
			BadComplexe c = new BadComplexe(att1);
			c.setAttribut2(EMPTY_STR); //secure toUpperCase()
			return c;
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		return sb.append("attribut1=").append(this.attribut1).append(", attribut2=").append(this.attribut2.toUpperCase())
				.append(",attribut3=").append(this.attribut3).toString();
	}

	/**
	 * @return the attribut1
	 */
	public int getAttribut1() {
		return attribut1;
	}

	/**
	 * @param att1 the attribut1 to set
	 */
	public void setAttribut1(int att1) {
		this.attribut1 = att1;
	}

	/**
	 * @return the attribut2
	 */
	public String getAttribut2() {
		return attribut2;
	}

	/**
	 * @param att2 the attribut2 to set
	 */
	public void setAttribut2(String att2) {
		this.attribut2 = att2;
	}

	/**
	 * @return the attribut3
	 */
	public String getAttribut3() {
		return attribut3;
	}

	/**
	 * @param attribut3 the attribut3 to set
	 */
	public void setAttribut3(String att3) {
		this.attribut3 = att3;
	}

}
