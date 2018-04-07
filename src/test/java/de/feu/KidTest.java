package de.feu;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class KidTest {
	SmartKid testee = new SmartKid("testee");

	@Test
	public void shouldDetermineFizz() {
		assertTrue(testee.determineWord(3).equals("Fizz"));
	}

}
