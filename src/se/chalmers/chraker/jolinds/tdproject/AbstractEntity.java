package se.chalmers.chraker.jolinds.tdproject;

import java.awt.Graphics;
import java.awt.geom.Area;

public class AbstractEntity implements Updateable, Drawable {
	private CPosition position;
	private int time;
	private Area bounds;
	private AnimateObject ao;
	private int rotation;
	
	/**
	 * Base constructor
	 *
	 * @param position the position where the entity will be placed
	 * @param bounds the bounds of the entity
	 * @param ao animation object
	 */
	protected AbstractEntity(CPosition position, Area bounds,
			AnimateObject ao) {
		this.position = position;
		this.bounds = bounds;
		this.ao = ao;
		this.rotation = 0;
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
	public void rotate(int degree){
		this.rotation = (this.rotation + degree) % 360;
	}
	public void setRotation(int degree){
		this.rotation = degree % 360;
	}
	public Area getBounds(){
		return this.bounds;
	}
	public CPosition getPosition(){
		return new CPosition(this.position.getX(), this.position.getY());
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
