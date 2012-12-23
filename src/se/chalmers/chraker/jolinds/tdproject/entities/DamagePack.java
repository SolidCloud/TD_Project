package se.chalmers.chraker.jolinds.tdproject.entities;


/** 
 * Immutable class for representing different kinds of damage.
 * @author Johan
 *
 */
public class DamagePack {
	private int ballistic;
	private int kinetic;
	private int energy;

	/**
	 * Constructor that accepts a value for each type of damage.
	 * 
	 * @param ballistic the amount of ballistic damage.
	 * @param kinetic the amount of kinetic damage.
	 * @param energy the amount of energy damage.
	 */
	public DamagePack(int ballistic, int kinetic, int energy) {
		this.ballistic = ballistic;
		this.kinetic = kinetic;
		this.energy = energy;
	}

	/**
	 * Returns the amount of ballistic damage that is in this pack.
	 * @return value representing the amount of ballistic damage
	 */
	public int getBallistic() {
		return ballistic;
	}
	/**
	 * Returns the amount of kinetic damage that is in this pack.
	 * @return value representing the amount of kinetic damage
	 */
	public int getKinetic() {
		return kinetic;
	}
	/**
	 * Returns the amount of energy damage that is in this pack.
	 * @return value representing the amount of energy damage
	 */
	public int getEnergy() {
		return energy;
	}

}
