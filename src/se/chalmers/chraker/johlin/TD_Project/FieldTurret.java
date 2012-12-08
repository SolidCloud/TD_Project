package se.chalmers.chraker.johlin.TD_Project;

import java.awt.geom.Area;

public class FieldTurret extends Turret {
	private Damage toBeFired;

	public FieldTurret(CPosition position, Area bounds, AnimateObject ao,
			double rotation, ResourcePack economy) {
		super(position, bounds, ao, rotation, economy);
		// TODO Auto-generated constructor stub
	}

	public Damage getDamage() {
		
	}
}
