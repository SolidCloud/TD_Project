package se.chalmers.chraker.jolinds.tdproject.entities;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;


import java.util.Collections;

public class Unit extends AbstractMovingEntity implements Comparable<Unit> {
	static List<Unit> units= new ArrayList<Unit>();
	private int structurePoints;
	private int massValue;
	private DamagePack protection;
	private double distanceLeft;

	public Unit(String name, Position position, Area bounds, AnimateObject ao,
			double speed, Position target, int structurePoints, int massValue,
			DamagePack protection) {
		super(name, position, bounds, ao, speed, target);
		this.structurePoints = structurePoints;
		this.massValue = massValue;
		this.protection = protection;
		units.add(this);
		Collections.sort(Unit.units);
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
	public boolean update() {
		return false;
		
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
		return (int)(this.distanceLeft - u.distanceLeft);
	}

}
