package se.chalmers.chraker.johlin.TD_Project;

import java.awt.geom.Area;

public class Damage extends AbstractEntity {
	
	private DamagePack damage;

	public Damage(CPosition position, Area bounds, AnimateObject ao, 
			DamagePack damage) {
		super(position, bounds, ao);
		this.damage = damage;
		// TODO Auto-generated constructor stub
	}
 
}
 