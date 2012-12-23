package se.chalmers.chraker.jolinds.tdproject.targetmodes;

import java.util.List;

import se.chalmers.chraker.jolinds.tdproject.DamagePack;
import se.chalmers.chraker.jolinds.tdproject.Unit;

public class TargetLast implements ITargetMode {

	@Override
	public String getName() {
		return "Last";
	}

	@Override
	public Unit getTarget(List<Unit> targets,  DamagePack dmg) {
		return targets.get(targets.size());
	}

}
