package se.chalmers.chraker.johlin.TD_Project;

import java.awt.Graphics;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

public class ProjectileTurret extends Turret {
	private Projectile toBeFired;
	private int turretRotation;
	private AnimateObject ao;

	public ProjectileTurret(CPosition position, Area bounds, AnimateObject ao,
			ResourcePack cost, ResourcePack economy, int cooldown, 
				Area range, Projectile projectile) {
		super(position, bounds, ao, cost, economy, cooldown, range);
		this.toBeFired = projectile;
	}
	private Unit getTarget(Unit[] units) {
		List<Unit> targets = new ArrayList<Unit>();
		if(cooldownRemaining <= 0){	
			for (Unit unit : units){
				Area checkIntersect = getRange();
				checkIntersect.intersect(unit.getBounds());
				if (checkIntersect.isEmpty()){
					targets.add(unit);
				}
			}
			switch (getTargetMode()){
			case CLOSE:
				Area temp;
				for(Unit target : targets){
					//if()
					// TODO something is not finished here
				}
				break;
			case FAR:
				break;
			case FIRST:
				break;
			case LAST:
				break;
			case STRONG:
				break;
			case WEAK:
				break;
			}

		}
		return null;
	}
	private void fire() {
		
	}
		
	public Projectile getProjectile() {
		return null;
	}
	
	@Override
	public void draw(Graphics g) {
		
	}
}
