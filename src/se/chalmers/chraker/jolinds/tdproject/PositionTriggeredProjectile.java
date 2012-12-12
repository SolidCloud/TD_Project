package se.chalmers.chraker.jolinds.tdproject;

import java.awt.geom.Area;

/**
 * Class for a projectile that is to be triggered on a position.
 *
 * @author Johan
 *
 */
public class PositionTriggeredProjectile extends Projectile {

	public PositionTriggeredProjectile(Position position, Area bounds,
			AnimateObject ao, double speed, Position target,
			Damage damage) {
		super(position, bounds, ao, speed, target, damage);

	}
}
