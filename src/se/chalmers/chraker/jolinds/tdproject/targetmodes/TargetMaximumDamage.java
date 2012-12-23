package se.chalmers.chraker.jolinds.tdproject.targetmodes;

import java.util.List;


import se.chalmers.chraker.jolinds.tdproject.entities.DamagePack;
import se.chalmers.chraker.jolinds.tdproject.GameUtils;
import se.chalmers.chraker.jolinds.tdproject.entities.Unit;

public class TargetMaximumDamage implements ITargetMode{

	@Override
	public String getName() {
		return "Maximum Damage";
	}

	@Override
	public Unit getTarget(List<Unit> targets, DamagePack dmg) {
		Unit target = targets.get(0);
		if(targets.size() > 1 ){
			int max = 0;
			for(int t = 0; t < targets.size(); t++){
				DamagePack prot1 = targets.get(t).getProtection();
				int dmg1 = GameUtils.modSub(dmg.getBallistic(),
						prot1.getBallistic())+ 
						GameUtils.modSub(dmg.getEnergy(),
								prot1.getEnergy())+ 
								GameUtils.modSub(dmg.getKinetic(),
										prot1.getKinetic());
				if(dmg1 > targets.get(t).getStructure()){
					dmg1 -= dmg1 -targets.get(t).getStructure();
				}
				if(t>0){
					if(max < dmg1){
						target = targets.get(t);
					}
				} else {
					max = dmg1;
				}
			}
		}
		return target;
	}

}
