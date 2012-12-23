package se.chalmers.chraker.jolinds.tdproject.entities;

import java.awt.geom.Area;


public class Damage extends AbstractEntity {

	private DamagePack damage;
	private Area aoe;
	public Damage(String name, Position position, Area aoe, AnimateObject ao, 
			DamagePack damage) {
		super(name, position, ao);
		this.damage = damage;
		this.aoe = aoe;
		
		// TODO Auto-generated constructor stub
	}
	public DamagePack getDamagePack(){
		return damage;
	}
}
