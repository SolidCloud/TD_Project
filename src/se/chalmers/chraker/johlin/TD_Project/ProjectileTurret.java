package se.chalmers.chraker.johlin.TD_Project;

import java.awt.Graphics;
import java.awt.geom.Area;

public class ProjectileTurret extends Turret {
	private Projectile toBeFired;
	private int turretRotation;
	private AnimatedObject ao;

	public ProjectileTurret(CPosition position, Area bounds, AnimateObject ao,
			double rotation, ResourcePack economy) {
		super(position, bounds, ao, rotation, economy);
		// TODO Auto-generated constructor stub
	}

	public Projectile getProjectile() {
		
	}
	
	@Override
	public void draw(Graphics g) {
		
	}
}
