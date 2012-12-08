package se.chalmers.chraker.johlin.TD_Project;

import java.awt.geom.Area;

public class FieldTurret extends Turret {
	private Damage toBeFired;

	public FieldTurret(CPosition position, Area bounds, AnimateObject ao,
			ResourcePack cost, ResourcePack economy, int cooldown, Area range,
			Damage damage) {
		super(position, bounds, ao, cost, economy, cooldown, range);
		this.toBeFired = damage;
	}

	public Damage getDamage() {
		return toBeFired;
	}
}
