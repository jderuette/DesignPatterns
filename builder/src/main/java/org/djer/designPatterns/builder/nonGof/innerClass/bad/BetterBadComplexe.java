package org.djer.designPatterns.builder.nonGof.innerClass.bad;

/**
 * a More secure BadComplexe
 * @author djer1
 *
 */
public class BetterBadComplexe extends BadComplexe {
	
	/** Not visible ==> too dangerous !! */
	private BetterBadComplexe() {
		super();
	}
	
	/** Not visible ==> too dangerous !! */
	private BetterBadComplexe(int att1) {
		super(att1);
	}

}
