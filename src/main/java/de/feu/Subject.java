package de.feu;

public interface Subject {
	void attach(FizzBuzzPlayer kid);

	void notifyObservers(String word);
}
