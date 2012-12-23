package se.chalmers.chraker.jolinds.tdproject.entities;

import java.awt.geom.Area;

import se.chalmers.chraker.jolinds.tdproject.Position;

public abstract class AbstractStructure extends AbstractEntity {

	private ResourcePack cost;
	private int techLevel = 1;

	/**
	 * Base constructor
	 *
	 * @param position the position where the structure will be placed
	 * @param bounds the bounds of the structure
	 * @param ao animation object
	 * @param cost the cost to build the structure
	 */
	protected AbstractStructure(String name, Position position, 
			AnimateObject ao, ResourcePack cost) {
		super(name,position, ao);
		this.cost = cost;
	}

	public void upgrade(){
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
