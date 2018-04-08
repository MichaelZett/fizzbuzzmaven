package de.feu;

import java.util.LinkedList;
import java.util.List;

/**
 * The Class FizzBuzzRoom.
 */
public class FizzBuzzRoom implements Observer {

	/** The players. */
	private final List<FizzBuzzPlayer> players = new LinkedList<>();
	private int count;
	private int max;

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
		this.max = max;
		for (final FizzBuzzPlayer gets : players) {
			for (final FizzBuzzPlayer toSet : players) {
				gets.attach(toSet);
			}
		}
		for (int i = 0; i < players.size(); i++) {
			FizzBuzzPlayer toSet;
			if (i == 0) {
				toSet = players.get(players.size() - 1);

			} else {
				toSet = players.get(i - 1);
			}
			players.get(i).setPredecessor(toSet);
		}
		players.get(0).sayWord(1);
	}

	@Override
	public boolean update(FizzBuzzPlayer handler) {
		count++;
		if (count == max) {
			System.out.println("Danke, Schluss!");
			System.exit(0);
		}
		return false;
	}
}
