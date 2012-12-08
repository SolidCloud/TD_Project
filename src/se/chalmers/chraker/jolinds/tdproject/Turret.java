package se.chalmers.chraker.jolinds.tdproject;

import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Turret extends EconomyStructure {
	public enum TargetMode {
		FIRST, LAST, WEAK, STRONG, CLOSE, FAR;
		public TargetMode toggle() {
			switch(this) {
				case CLOSE:
					return FAR;
				case FAR:
					return CLOSE;
				case FIRST:
					return LAST;
				case LAST:
					return FIRST;
				case STRONG:
					return WEAK;
				case WEAK:
					return STRONG;
				default:
					return FIRST;
			}
		}
	}

	private Area range;
	private TargetMode targetMode;
	private int cooldown;
	protected int cooldownRemaining;
	
	/**
	 * Base constructor
	 *
	 * @param position the position where the structure will be placed
	 * @param bounds the bounds of the structure
	 * @param ao animation object
	 * @param cost the cost to build the structure
	 * @param economy 
	 * TODO what is economy???
	 */
	public Turret(CPosition position, Area bounds, AnimateObject ao,
			ResourcePack cost, ResourcePack economy, int cooldown, Area range) {
		super(position, bounds, ao, cost, economy);
		
		this.cooldown = cooldown;
		this.cooldownRemaining = cooldown;
		this.range = range;
		targetMode = TargetMode.FIRST;
	}
	
	public TargetMode getTargetMode() {
		return targetMode;
	}
	
	public Area getRange() {
		return (Area) range.clone();
	}
	
	public void setTargetMode(TargetMode targetMode) {
		this.targetMode = targetMode;
	}
	
	private Area getTarget(List<Unit> units) {
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
	public boolean checkFire(int elapsedTime, Area[] units) {
		return false;
	}

	private void fire() {
		
	}
	
	@Override
	public void update(int elapsedTime){
		cooldownRemaining -= elapsedTime;
	}
}
