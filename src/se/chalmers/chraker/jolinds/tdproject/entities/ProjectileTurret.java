package se.chalmers.chraker.jolinds.tdproject.entities;
import se.chalmers.chraker.jolinds.tdproject.Position;
import se.chalmers.chraker.jolinds.tdproject.targetmodes.*;

import java.awt.Graphics;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

import javax.naming.OperationNotSupportedException;

public class ProjectileTurret extends Turret {
	private Projectile toBeFired;
	private int turretRotation;
	private AnimateObject ao;
	private ITargetMode targetMode;
	private Unit currentTarget;

	public void setTargetMode(ITargetMode targetMode) {
		this.targetMode = targetMode;
	}
	public String getTargetModeName() {
		return this.targetMode.getName();
	}

	public ProjectileTurret(String name, Position position, AnimateObject ao,
			ResourcePack cost, ResourcePack economy, int cooldown, 
			Area range, Projectile projectile) {
		super(name, position, ao, cost, economy, cooldown, range);
		this.toBeFired = projectile;
	}
	
	private void getTarget() {
		this.currentTarget = targetMode.getTarget(super.getTargets(), 
				toBeFired.getDamage().getDamagePack());
	}
	public Projectile getProjectile() {
		return toBeFired;
	}

	@Override
	public void draw(Graphics g) {
	}
}
