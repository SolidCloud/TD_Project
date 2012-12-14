package se.chalmers.chraker.jolinds.tdproject;

import java.awt.geom.Area;

public class Unit extends AbstractMovingEntity implements Comparable<Unit> {
	private int structurePoints;
	private int massValue;
	private DamagePack protection;

	public Unit(String name, Position position, Area bounds, AnimateObject ao,
			double speed, Position target, int structurePoints, int massValue,
			DamagePack protection) {
		super(name, position, bounds, ao, speed, target);
		this.structurePoints = structurePoints;
		this.massValue = massValue;
		this.protection = protection;
	}

	public DamagePack getProtection() {
		return protection;
	}
	public int getStructure() {
		return 0;
	}
	public int getMassValue() {
		return massValue;
	}
	public void takeDamage(DamagePack damagePack) {

	}
	public void update() {

	}
	// TODO compare Units' position to other position

	/**
	 * Compares which unit is closer to the base.
	 *
	 * @return negative value if other object is closer,
	 * 	positive value on the contrary. Zero if the distance is equal.
	 */
	@Override
	public int compareTo(Unit u) {
		return 0;
	}

}
