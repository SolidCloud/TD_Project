package se.chalmers.chraker.johlin.TD_Project;

import java.awt.Graphics;
import java.awt.geom.Area;
import java.util.ArrayList;

public class ProjectileTurret extends Turret {
	private Projectile toBeFired;
	private int turretRotation;
	private AnimatedObject ao;

	public ProjectileTurret(CPosition position, Area bounds, AnimateObject ao,
			double rotation, ResourcePack economy) {
		super(position, bounds, ao, rotation, economy);
		// TODO Auto-generated constructor stub
	}

	private Unit getTarget(Unit[] units) {
		if(cooldownRemaining <= 0){	
			ArrayList<Unit> targetArray = new ArrayList ();
			for(int unitIndex = 0; unitIndex < units.length; unitIndex++){
				Area checkIntersect = (Area)range.clone();
				checkIntersect.intersect(units[unitIndex]);
				if (checkIntersect.isEmpty()){
					targetArray.add(units[unitIndex]);
				}
			}
			switch (targetMode){
			case CLOSE:
				Area temp;
				for(int unitIndex = 0; unitIndex < targetArray.size(); unitIndex++ ){
					if()
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
	
	@Override
	public void draw(Graphics g) {
		
	}
}
