package se.chalmers.chraker.jolinds.tdproject;

import java.awt.geom.Area;

public class FieldTurret extends Turret {
	private Damage toBeFired;

	public FieldTurret(String name, Position position, AnimateObject ao,
			ResourcePack cost, ResourcePack economy, int cooldown, Area range,
			Damage damage) {
		super(name, position, ao, cost, economy, cooldown, range);
		this.toBeFired = damage;
	}

	public Damage getDamage() {
		return toBeFired;
	}
}
