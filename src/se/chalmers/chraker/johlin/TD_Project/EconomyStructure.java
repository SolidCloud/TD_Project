package se.chalmers.chraker.johlin.TD_Project;

import java.awt.geom.Area;

public class EconomyStructure extends AbstractStructure {
	private ResourcePack economy;
	private boolean enabled;

	public EconomyStructure(CPosition position, Area bounds,
			AnimateObject ao, double rotation, ResourcePack economy) {
		super(position, bounds, ao, rotation);
		this.economy = economy;
		this.enabled = true;
	}
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
