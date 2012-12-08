package se.chalmers.chraker.johlin.TD_Project;

import java.awt.geom.Area;

public class Turret extends EconomyStructure {
	public enum TargetMode {
		FIRST, LAST, WEAK, STRONG, CLOSE, FAR
	}


	private Area triggerArea;
	private TargetMode targetMode;
	private int cooldown;
	private int cooldownRemaining;
	
	
	public Turret(CPosition position, Area bounds, AnimateObject ao,
			double rotation, ResourcePack economy) {
		super(position, bounds, ao, rotation, economy);
		// TODO Auto-generated constructor stub
	}
	
	public TargetMode getTargetMode() {
		return targetMode;
	}
	public void setTargetMode(TargetMode targetMode) {
		this.targetMode = targetMode;
	}
	public boolean checkFire(int elapsedTime, Area[] units) {
		
	}
	
	private Unit getTarget(Area[] units) {
		
	}
	private void fire() {
		
	}
}
