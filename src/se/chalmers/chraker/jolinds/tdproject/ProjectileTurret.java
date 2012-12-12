package se.chalmers.chraker.jolinds.tdproject;

import java.awt.Graphics;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

public class ProjectileTurret extends Turret {

	public enum TargetMode {
		FIRST, LAST, WEAK, STRONG, CLOSE, FAR, MAXIMUM_DAMAGE;
		public TargetMode toggle() {
			switch(this) {
				case CLOSE:
					return FAR;
				case FAR:
					return CLOSE;
				case FIRST:
					return LAST;
				case LAST:
					return FIRST;
				case STRONG:
					return WEAK;
				case WEAK:
					return STRONG;
				default:
					return FIRST;
			}
		}
	}
	private Projectile toBeFired;
	private int turretRotation;
	private AnimateObject ao;
	private TargetMode targetMode = TargetMode.FIRST;

	public void setTargetMode(TargetMode targetMode) {
		this.targetMode = targetMode;
	}
	public TargetMode getTargetMode() {
		return this.targetMode;
	}
	
	public ProjectileTurret(CPosition position, Area bounds, AnimateObject ao,
			ResourcePack cost, ResourcePack economy, int cooldown, 
				Area range, Projectile projectile) {
		super(position, bounds, ao, cost, economy, cooldown, range);
		this.toBeFired = projectile;
	}
	public Unit getTarget(List<Unit> units) {
		List<Unit> targets = super.getTargets(units);
		Unit target = targets.get(0);
		if(targets.size() > 1 ){	
			switch (getTargetMode()){
			case CLOSE:
				for(int t = 1; t < targets.size(); t++){
					if(targets.get(t).getPosition().closerThanToTarget(
							targets.get(t-1).getPosition(), 
							this.getPosition())){
						target = targets.get(t);
					}
				}
				break;
			case FAR:
				for(int t = 1; t < targets.size(); t++){
					if(!targets.get(t).getPosition().closerThanToTarget(
							targets.get(t-1).getPosition(), 
							this.getPosition())){
						target = targets.get(t);
					}
				}
				break;
			case LAST:
				target = targets.get(targets.size());
			case STRONG:
				for(int t = 1; t < targets.size(); t++){
					if(targets.get(t).getStructure() >
						targets.get(t-1).getStructure()){
						target = targets.get(t);
					}
				}
				break;
			case WEAK:
				for(int t = 1; t < targets.size(); t++){
					if(targets.get(t).getStructure() <
						targets.get(t-1).getStructure()){
						target = targets.get(t);
					}
				}
				break;
			case MAXIMUM_DAMAGE:
				int max = 0;
				DamagePack dmg = this.toBeFired.getDamage().getDamagePack();
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
				break;
			}
		}
		return target;
	}
	
	public Projectile getProjectile() {
		return toBeFired;
	}
	
	@Override
	public void draw(Graphics g) {
		
	}
}
