package se.chalmers.chraker.jolinds.tdproject.targetmodes;

import java.util.List;

import se.chalmers.chraker.jolinds.tdproject.entities.DamagePack;
import se.chalmers.chraker.jolinds.tdproject.entities.Unit;

public interface ITargetMode {
	public String getName();
	public Unit getTarget(List<Unit> units,  DamagePack dmg);
}
