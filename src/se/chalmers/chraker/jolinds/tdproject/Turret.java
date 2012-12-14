package se.chalmers.chraker.jolinds.tdproject;

import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Turret extends EconomyStructure {

	private Area range;
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
	public Turret(String name, Position position, AnimateObject ao,
			ResourcePack cost, ResourcePack economy, int cooldown, Area range) {
		super(name, position, ao, cost, economy);

		this.cooldown = cooldown;
		this.cooldownRemaining = cooldown;
		this.range = range;
	}
	public Area getRange() {
		return (Area) range.clone();
	}


	protected List<Unit> getTargets(List<Unit> units) {
		List<Unit> targets = new ArrayList<Unit>();
		for (Unit unit : units){
			Area checkIntersect = getRange();
			checkIntersect.intersect(unit.getBounds());
			if (!checkIntersect.isEmpty()){
				targets.add(unit);
			}
		}
		return targets;
	}
	protected void fire(){
		this.cooldownRemaining = cooldown;
	}
	@Override
	public boolean update(int elapsedTime){
		cooldownRemaining = GameUtils.modSub(cooldownRemaining, elapsedTime);
		return false;
	}
}
