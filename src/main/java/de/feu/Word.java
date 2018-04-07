package de.feu;

// TODO: Auto-generated Javadoc
/**
 * The Enum Word.
 */
public enum Word {
	
	/** The buzz. */
	BUZZ("Buzz"), 
 /** The fizz. */
 FIZZ("Fizz");

	/** The representation. */
	private String representation;

	/**
	 * Instantiates a new word.
	 *
	 * @param representation the representation
	 */
	private Word(String representation) {
		this.representation = representation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		return representation;
	}
}
