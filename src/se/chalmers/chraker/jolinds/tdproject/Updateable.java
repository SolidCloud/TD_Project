package se.chalmers.chraker.jolinds.tdproject;


/**
 * Interface for any object that should be able to update it's state.
 * @author Johan
 *
 */
public interface Updateable {
	/**
	 * Action method to call to give the objects a chance to update their state.
	 * 
	 * @param elapsedTime
	 * @return false if the Updateable object is invalid and should be removed.
	 */
	public boolean update(int elapsedTime);
}
