package se.chalmers.chraker.johlin.TD_Project;

import java.awt.geom.Area;

public class AbstractStructure extends AbstractEntity {
	private ResourcePack cost;
	private int techLevel;
	protected AbstractStructure(CPosition position, Area bounds, AnimateObject ao, double rotation) {
		super(position, bounds, ao, rotation);
		// TODO Auto-generated constructor stub
	}
	public ResourcePack getUpgradeCost() {
		return cost;
	}
	public int getTechLevel() {
		return techLevel;
	}
}
