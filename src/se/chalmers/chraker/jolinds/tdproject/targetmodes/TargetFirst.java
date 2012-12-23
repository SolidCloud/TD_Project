package se.chalmers.chraker.jolinds.tdproject.targetmodes;

import java.util.List;

import se.chalmers.chraker.jolinds.tdproject.entities.DamagePack;
import se.chalmers.chraker.jolinds.tdproject.entities.Unit;

public class TargetFirst implements ITargetMode {

	@Override
	public String getName() {
		return "First";
	}

	@Override
	public Unit getTarget(List<Unit> targets,  DamagePack dmg) {
		return targets.get(0);
	}
}
