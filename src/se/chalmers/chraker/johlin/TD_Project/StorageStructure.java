package se.chalmers.chraker.johlin.TD_Project;

import java.awt.geom.Area;

public class StorageStructure extends AbstractStructure {
	private ResourcePack maxStorage;

	public StorageStructure(CPosition position, Area bounds,
			AnimateObject ao, double rotation, ResourcePack cost, 
				ResourcePack maxStorage) {
		super(position, bounds, ao, cost);
		this.maxStorage = maxStorage;
	}
	public ResourcePack getMaxStorage() {
		return maxStorage;
	}
}
