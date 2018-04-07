package de.feu;

import java.util.LinkedList;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class FizzBuzzRoom.
 */
public class FizzBuzzRoom {

	/** The players. */
	private final List<FizzBuzzPlayer> players = new LinkedList<>();

	/**
	 * Enter.
	 *
	 * @param kid
	 *            the kid
	 */
	void enter(FizzBuzzPlayer kid) {
		players.add(kid);
	}

	/**
	 * Play fizz buzz.
	 *
	 * @param max
	 *            the max
	 */
	void playFizzBuzz(int max) {
		for (int i = 1; i <= max; i++) {
			players.get(i % players.size()).sayWord(i);
		}
	}
}
