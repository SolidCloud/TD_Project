package se.chalmers.chraker.jolinds.tdproject.entities;

import java.awt.geom.Area;


/**
 * Class for a projectile that is to be triggered on a position.
 *
 * @author Johan
 *
 */
public class PositionTriggeredProjectile extends Projectile {

	public PositionTriggeredProjectile(String name, Position position, Area bounds,
			AnimateObject ao, double speed, Position target,
			Damage damage) {
		super(name, position, bounds, ao, speed, target, damage);

	}
}
