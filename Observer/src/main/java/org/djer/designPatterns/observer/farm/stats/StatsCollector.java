package org.djer.designPatterns.observer.farm.stats;

import org.djer.designPatterns.observer.farm.Observer;

/**
 * @author djer13
 *
 */
public class StatsCollector extends Observer {

	private static final StatsCollector INSTANCE = new StatsCollector();
	private int nbSignal = 0;

	/**
	 * Singleton
	 */
	private StatsCollector() {
		// hide default constructor
	}

	public static StatsCollector getInstance() {
		return INSTANCE;
	}

	@Override
	public void update(String event) {
		nbSignal++;
	}

	/**
	 * @return the nbSignal
	 */
	public int getNbSignal() {
		return nbSignal;
	}

}
