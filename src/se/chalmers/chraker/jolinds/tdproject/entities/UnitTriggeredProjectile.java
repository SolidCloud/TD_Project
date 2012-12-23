package se.chalmers.chraker.jolinds.tdproject.entities;

import java.awt.geom.Area;


/**
 * Class for a projectile that is triggered by collision with a unit.
 *
 * @author Johan
 *
 */
public class UnitTriggeredProjectile extends Projectile {

	public UnitTriggeredProjectile(String name, Position position, Area bounds,
			AnimateObject ao, double speed, Position target,
			Damage damage) {
		super(name, position, bounds, ao, speed, target, damage);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method for updating the state of the projectile, checks collision.
	 *
	 * @param units check these units for collision.
	 */
	public void update(Unit[] units) {

	}

}
