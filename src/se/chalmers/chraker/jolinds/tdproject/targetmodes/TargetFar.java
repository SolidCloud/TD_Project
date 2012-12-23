package se.chalmers.chraker.jolinds.tdproject.targetmodes;

import java.util.List;

import se.chalmers.chraker.jolinds.tdproject.DamagePack;
import se.chalmers.chraker.jolinds.tdproject.Unit;

public class TargetFar implements ITargetMode{

	@Override
	public String getName() {
		return "Far";
	}

	@Override
	public Unit getTarget(List<Unit> targets,  DamagePack dmg) {
		Unit target = targets.get(0);
		if(targets.size() > 1 ){
			for(int t = 0; t < targets.size(); t++){
				if (target.getPosition().closest(
						target.getPosition(), 
						targets.get(t).getPosition()).equals(
								target.getPosition()
						)
					) {
					target = targets.get(t);
				}
			}
		}
		return target;
	}

}
