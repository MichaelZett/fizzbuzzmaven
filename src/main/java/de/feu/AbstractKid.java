package de.feu;

import java.util.LinkedList;
import java.util.List;

/**
 * The Class AbstractKid.
 */
public abstract class AbstractKid implements FizzBuzzPlayer {

	/** The players. */
	private final List<FizzBuzzPlayer> players = new LinkedList<>();

	private FizzBuzzPlayer predecessor;

	/** The name. */
	private final String name;

	private int count = 1;

	/**
	 * Instantiates a new abstract kid.
	 *
	 * @param name
	 *            the name
	 */
	public AbstractKid(String name) {
		super();
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.feu.FizzBuzzPlayer#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setPredecessor(FizzBuzzPlayer predecessor) {
		this.predecessor = predecessor;
	}

	@Override
	public boolean update(FizzBuzzPlayer handler) {
		if (count == 500) {
			System.out.println("Danke, Schluss!");
			System.exit(0);
		}
		if (predecessor.equals(handler)) {
			sayWord(count);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void updateCount() {
		count++;
	}

	@Override
	public void attach(FizzBuzzPlayer kid) {
		players.add(kid);
	}

	@Override
	public void notifyObservers(String word) {
		players.forEach(p -> {
			p.updateCount();
		});
		for (final FizzBuzzPlayer fizzBuzzPlayer : players) {
			if (fizzBuzzPlayer.update(this)) {
				break;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (name == null ? 0 : name.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final AbstractKid other = (AbstractKid) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

}
