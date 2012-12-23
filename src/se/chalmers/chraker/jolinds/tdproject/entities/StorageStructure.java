package se.chalmers.chraker.jolinds.tdproject.entities;

import java.awt.geom.Area;

import se.chalmers.chraker.jolinds.tdproject.Position;

public class StorageStructure extends AbstractStructure {
	private ResourcePack maxStorage;

	public StorageStructure(String name, Position position,
			AnimateObject ao, double rotation, ResourcePack cost, 
			ResourcePack maxStorage) {
		super(name, position, ao, cost);
		this.maxStorage = maxStorage;
	}
	public ResourcePack getMaxStorage() {
		return maxStorage;
	}
}
