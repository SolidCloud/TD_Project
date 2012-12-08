package se.chalmers.chraker.johlin.TD_Project;

import java.awt.geom.Area;

public class AbstractMovingEntity extends AbstractEntity {
	private double speed;
	private Area[] targetAreas;
	private CPosition target;
	private boolean atTarget;
	protected AbstractMovingEntity(CPosition position, Area bounds, 
			AnimateObject ao, double rotation, double speed, Area[] targetAreas,
			CPosition target) {
		super(position, bounds, ao, rotation);
	}
	protected void moveWithTempTargets(CPosition position, Area[] tempTargets){
		
	}
	public boolean atTarget(){
		return atTarget;
	}
	
	@Override
	public void update( int elapsedTime){
		
	}
	
} 
