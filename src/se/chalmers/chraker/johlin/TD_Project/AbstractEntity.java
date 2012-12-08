package se.chalmers.chraker.johlin.TD_Project;

import java.awt.Graphics;
import java.awt.geom.Area;

public class AbstractEntity implements Updateable, Drawable{
	private CPosition position;
	private int time;
	private Area bounds;
	private AnimateObject ao;
	private double rotation;
	protected AbstractEntity( CPosition position, Area bounds, AnimateObject ao, 
			double rotation){
	}
	protected int getTime(){
		return time;
	}
	private AnimateObject getAnimateObject(){
		return ao;
	}
	public void place(CPosition position){
		this.position = position;
	}
	public void rotate(double rotation){
		this.rotation+=rotation;
		this.rotation%=360;
	}
	public Area getBounds(){
		return this.bounds;
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(int elapsedTime) {
		// TODO Auto-generated method stub
		
	}
}
