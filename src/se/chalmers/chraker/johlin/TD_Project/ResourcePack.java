package se.chalmers.chraker.johlin.TD_Project;

/** 
 * Immutable class for representing different kinds of resources.
 * @author Johan
 *
 */
public class ResourcePack {
	private int research;
	private int mass;
	private int power;
	
	/**
	 * Constructor that accepts a value for each type of resource.
	 * 
	 * @param research the amount of research resource.
	 * @param mass the amount of mass resource.
	 * @param power the amount of power resource.
	 */
	public ResourcePack(int research, int mass, int power) {
		this.research = research;
		this.mass = mass;
		this.power = power;
	}

	/**
	 * Returns the amount of research resource that is in this pack.
	 * @return value representing the amount of research resource
	 */
	public int getResearch() {
		return research;
	}
	
	/**
	 * Returns the amount of mass resource that is in this pack.
	 * @return value representing the amount of mass resource
	 */
	public int getMass() {
		return mass;
	}
	
	/**
	 * Returns the amount of power resource that is in this pack.
	 * @return value representing the amount of power resource
	 */
	public int getPower() {
		return power;
	}
	
}
