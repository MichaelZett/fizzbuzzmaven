package de.feu;

/**
 * The Interface FizzBuzzPlayer.
 */
public interface FizzBuzzPlayer extends Observer, Subject {

	/**
	 * Determine word.
	 *
	 * @param i
	 *            the i
	 * @return the string
	 */
	String determineWord(int i);

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	String getName();

	/**
	 * Say word.
	 *
	 * @param i
	 *            the i
	 */
	default void sayWord(int i) {
		final String word = determineWord(i);
		System.out.println(getName() + ": " + word);
		notifyObservers(word);
	}

	void setPredecessor(FizzBuzzPlayer predecessor);

	void updateCount();

}
