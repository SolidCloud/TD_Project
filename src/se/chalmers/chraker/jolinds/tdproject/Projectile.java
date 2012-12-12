package se.chalmers.chraker.jolinds.tdproject;

import java.awt.geom.Area;

/**
 * Class for a generic projectile.
 *
 * @author Johan
 *
 */
public class Projectile extends AbstractMovingEntity {
	private Damage damage;

	public Projectile(Position position, Area bounds, AnimateObject ao,
			double speed, Position target, Damage damage) {
		super(position, bounds, ao, speed, target);
		this.damage = damage;
	}
	public Damage getDamage() {
		return damage;
	}
}
