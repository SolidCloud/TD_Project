package se.chalmers.chraker.johlin.TD_Project;

import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Arrays;

public class Turret extends EconomyStructure {
	public enum TargetMode {
		FIRST, LAST, WEAK, STRONG, CLOSE, FAR
	}

	private Area range;
	private TargetMode targetMode;
	private int cooldown;
	private int cooldownRemaining;
	
	public Turret(CPosition position, Area bounds, AnimateObject ao,
			double rotation, ResourcePack economy, int cooldown,
			Area range) {
		super(position, bounds, ao, rotation, economy);
		
		this.cooldown = cooldown;
		this.cooldownRemaining = this.cooldown;
		this.range = range;
		targetMode = TargetMode.FIRST;
	}
	
	public TargetMode getTargetMode() {
		return targetMode;
	}
	
	public void setTargetMode(TargetMode targetMode) {
		this.targetMode = targetMode;
	}
	
	private Area getTarget(Unit[] units) {
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
	public void update(int elapsedTime){
		cooldownRemaining -= elapsedTime;
	}
}
