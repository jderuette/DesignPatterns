package org.djer.designPatterns.builder.real.restaurant;

/**
 * Produit.
 * 
 * @author djer13 && WikiBook
 *
 */
public class Pizza {
	private String pate = "";
	private String sauce = "";
	private String garniture = "";

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pizza [pate=").append(pate).append(", sauce=").append(sauce).append(", garniture=")
				.append(garniture).append("]");
		return builder.toString();
	}

	public void setPate(String pate) {
		this.pate = pate;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void setGarniture(String garniture) {
		this.garniture = garniture;
	}
}
