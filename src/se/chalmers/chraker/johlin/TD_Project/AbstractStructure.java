package se.chalmers.chraker.johlin.TD_Project;

import java.awt.geom.Area;

public class AbstractStructure extends AbstractEntity {
	
	private ResourcePack cost;
	private int techLevel = 1;
	
	protected AbstractStructure(CPosition position, Area bounds, 
			AnimateObject ao, ResourcePack cost) {
		super(position, bounds, ao);
		this.cost = cost;
	}
	
	public void Upgrade(){
		techLevel++;
	}
	
	public ResourcePack getUpgradeCost() {
		return new ResourcePack(
				cost.getResearch()*(techLevel+1),
				cost.getMass()*(techLevel+1),
				cost.getPower()*(techLevel+1));
	}
	
	public int getTechLevel() {
		return techLevel;
	}
}
