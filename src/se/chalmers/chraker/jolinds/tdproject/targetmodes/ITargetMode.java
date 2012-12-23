package se.chalmers.chraker.jolinds.tdproject.targetmodes;

import java.util.List;

import javax.naming.OperationNotSupportedException;

import se.chalmers.chraker.jolinds.tdproject.DamagePack;
import se.chalmers.chraker.jolinds.tdproject.Unit;

public interface ITargetMode {
	public String getName();
	public Unit getTarget(List<Unit> units,  DamagePack dmg);
}
