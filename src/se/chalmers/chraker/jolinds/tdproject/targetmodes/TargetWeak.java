package se.chalmers.chraker.jolinds.tdproject.targetmodes;

import java.util.List;

import se.chalmers.chraker.jolinds.tdproject.entities.DamagePack;
import se.chalmers.chraker.jolinds.tdproject.entities.Unit;

public class TargetWeak implements ITargetMode{

	@Override
	public String getName() {
		return "Weak";
	}

	@Override
	public Unit getTarget(List<Unit> targets,  DamagePack dmg) {
		Unit target = targets.get(0);
		if(targets.size() > 1 ){
			for(int t = 1; t < targets.size(); t++){
				if(targets.get(t).getStructure() <
						targets.get(t-1).getStructure()){
					target = targets.get(t);
				}
			}
		}
		return target;
	}
}
