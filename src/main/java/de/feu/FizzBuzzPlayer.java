package de.feu;

// TODO: Auto-generated Javadoc
/**
 * The Interface FizzBuzzPlayer.
 */
public interface FizzBuzzPlayer {

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
		System.out.println(getName() + ": " + determineWord(i));
	}

}
