package se.chalmers.chraker.jolinds.tdproject;

import java.awt.geom.Area;

/**
 * Class for moving entities.
 *
 *
 * @author Johan
 *
 */
public abstract class AbstractMovingEntity extends AbstractEntity {
	private double speed;
	private Area[] targetAreas;
	private Position target;
	private boolean atTarget;

	/**
	 * Base constructor
	 *
	 * @param position the position where the entity will be placed
	 * @param bounds the bounds of the entity
	 * @param ao animation object
	 * @param speed the speed of the entity
	 * @param target the position where the entity will be moving towards
	 */
	protected AbstractMovingEntity(Position position, Area bounds, 
			AnimateObject ao, double speed, Position target) {
		super(position, bounds, ao);
		this.speed = speed;
		this.target = target;
	}
	/**
	 * Moves the entity and checks collision
	 * @param position end position
	 * @param tempTargets collision areas to detect
	 */
	protected void moveWithTempTargets(Position position, Area[] tempTargets){

	}
	/**
	 * Checks if the entity has arrived at the end position
	 * @return true if current position is equal to target position
	 */
	public boolean atTarget(){
		return atTarget;
	}

	// TODO Javadoc missing!!!
	@Override
	public void update(int elapsedTime){

	}

} 
