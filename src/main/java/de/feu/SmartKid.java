package de.feu;

// TODO: Auto-generated Javadoc
/**
 * The Class SmartKid.
 */
public class SmartKid extends AbstractKid {

	/**
	 * Instantiates a new smart kid.
	 *
	 * @param name
	 *            the name
	 */
	public SmartKid(String name) {
		super(name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.feu.FizzBuzzPlayer#determineWord(int)
	 */
	@Override
	public String determineWord(int i) {
		String result = String.valueOf(i);

		if (i % 3 == 0) {
			result = Word.FIZZ.toString();
		}
		if (i % 5 == 0) {
			if (Word.FIZZ.toString().equals(result)) {
				result = result + Word.BUZZ.toString();
			} else {
				result = Word.BUZZ.toString();
			}
		}
		return result;
	}

}
