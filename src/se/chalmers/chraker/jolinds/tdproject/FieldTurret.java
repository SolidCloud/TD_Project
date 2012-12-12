package se.chalmers.chraker.jolinds.tdproject;

import java.awt.geom.Area;

public class FieldTurret extends Turret {
	private Damage toBeFired;

	public FieldTurret(Position position, Area bounds, AnimateObject ao,
			ResourcePack cost, ResourcePack economy, int cooldown, Area range,
			Damage damage) {
		super(position, bounds, ao, cost, economy, cooldown, range);
		this.toBeFired = damage;
	}

	public Damage getDamage() {
		return toBeFired;
	}
}
