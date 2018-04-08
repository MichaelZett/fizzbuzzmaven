package de.feu;

/**
 * The Class FizzBuzzApp.
 */
public class FizzBuzzApp {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		final FizzBuzzRoom room = new FizzBuzzRoom();
		for (int j = 1; j <= 3; j++) {
			room.enter(playerFactory(j));
		}
		room.playFizzBuzz(500);
	}

	/**
	 * Player factory.
	 *
	 * @param j
	 *            the j
	 * @return the fizz buzz player
	 */
	protected static FizzBuzzPlayer playerFactory(int j) {

		return new SmartKid("SmartKid_" + j);

	}
}
