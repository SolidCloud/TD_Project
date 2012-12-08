package se.chalmers.chraker.johlin.TD_Project;

import java.awt.Graphics;
import java.awt.geom.Area;

public class AbstractEntity implements Updateable, Drawable {
	private CPosition position;
	private int time;
	private Area bounds;
	private AnimateObject ao;
	private Direction direction = Direction.SOUTH;
	
	private enum Direction {
		NORTH, EAST, SOUTH, WEST;
		private Direction rotate() {
			switch(this) {
				case NORTH:
					return EAST;
				case EAST:
					return SOUTH;
				case SOUTH:
					return WEST;
				case WEST:
					return NORTH;
				default:
					return SOUTH;
			}
		}
	}
	
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
	public void rotate(){
		this.direction = this.direction.rotate();
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
