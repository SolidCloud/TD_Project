package se.chalmers.chraker.jolinds.tdproject.entities;

import java.awt.geom.Area;

import se.chalmers.chraker.jolinds.tdproject.Position;

/**
 * Class for a generic projectile.
 *
 * @author Johan
 *
 */
public class Projectile extends AbstractMovingEntity {
	private Damage damage;

	public Projectile(String name, Position position, Area bounds, AnimateObject ao,
			double speed, Position target, Damage damage) {
		super(name, position, bounds, ao, speed, target);
		this.damage = damage;
	}
	public Damage getDamage() {
		return damage;
	}
}
