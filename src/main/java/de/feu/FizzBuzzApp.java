package de.feu;

// TODO: Auto-generated Javadoc
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
		for (int j = 1; j <= 5; j++) {
			room.enter(playerFactory(j));
		}
		room.playFizzBuzz(100);
	}

	/**
	 * Player factory.
	 *
	 * @param j
	 *            the j
	 * @return the fizz buzz player
	 */
	protected static FizzBuzzPlayer playerFactory(int j) {
		if (j % 2 == 0) {
			return new SmartKid("SmartKid_" + j);
		} else {
			return new DumbKid("DumbKid_" + j);
		}
	}
}
