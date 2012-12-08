package se.chalmers.chraker.jolinds.tdproject;

import java.awt.geom.Area;

public class EconomyStructure extends AbstractStructure {
	private ResourcePack economy;
	private boolean enabled;

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
	public EconomyStructure(CPosition position, Area bounds,
			AnimateObject ao, ResourcePack cost, ResourcePack economy) {
		super(position, bounds, ao, cost);
		this.economy = economy;
		this.enabled = true;
	}
	/**
	 * Enable or disable the structure.
	 * @param enabled if true structure will be enabled.
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public ResourcePack getEconomy() {
		return economy;
	}
	public boolean getEnabled() {
		return enabled;
	}
	public void setEfficiency(int efficiency) {
		
	}
}
