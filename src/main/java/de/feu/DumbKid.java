package de.feu;

// TODO: Auto-generated Javadoc
/**
 * The Class DumbKid.
 */
public class DumbKid extends AbstractKid {

	/**
	 * Instantiates a new dumb kid.
	 *
	 * @param name
	 *            the name
	 */
	public DumbKid(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.feu.FizzBuzzPlayer#determineWord(int)
	 */
	@Override
	public String determineWord(int i) {
		return String.valueOf(i);
	}

}
