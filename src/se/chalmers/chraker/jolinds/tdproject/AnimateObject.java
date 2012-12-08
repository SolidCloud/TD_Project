package se.chalmers.chraker.jolinds.tdproject;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.text.Position;

/**
 * Support class for animating objects
 * @author Christopher
 *
 */
public class AnimateObject {
	/** ImageIcon with all the frames to be animated*/
	private ImageIcon []frames;
	/** Helper to keep track on the elapsed time to determine the frame to be animated */
	private int accumulatedTime;
	/** Frames per second, determines when the frames are switched */
	private int fps;
	/** The dimension of each frame, will be used together with frameCount to get the different frames from 
	 * the ImageIcon object */
	private Dimension frameDimension;
	
	/**
	 * Construct an AnimateObject
	 * @param frames[]
	 * @param frameDimension
	 * @param fps
	 * @throws IllegalArgumentException if illegal arguments
	 */
	public AnimateObject (
			ImageIcon []frames,
			Dimension frameDimension,
			int frameCount,
			int fps){

		if( frameDimension.width <= 0 || frameDimension.height <= 0){
			throw new IllegalArgumentException("Invalid frame dimensions, must be greater than zero");
		}
		if( fps <= 0 ){
			throw new IllegalArgumentException("Invalid fps, must be greater than zero");
		}
		if( frames == null ){
			throw new IllegalArgumentException("ImageIcon cannot be null");
		}
		this.accumulatedTime = 0;
		this.frames = frames;
		this.fps = fps;
		this.frameDimension = frameDimension;
	}
	
	/**
	 * Animates a frame on a certain position with a certain rotation, determining the
	 * frame based on the elapsed time as well as the accumulated time
	 * @param elapsedTime
	 * @param position
	 * @param rotation
	 * @param g
	 */
	public void animate(int elapsedTime, CPosition position, double rotation, Graphics g){
		if(elapsedTime < 0){
			throw new IllegalArgumentException("Invalid elapsed time");
		}
		this.accumulatedTime += elapsedTime;
		int currentFrame = (this.accumulatedTime / 1000 * this.fps) % this.frames.length;
		display(position,rotation,currentFrame,g);
	}
	
	/**
	 * Displays a frame at the choosen position with the choosen rotation
	 * @param position
	 * @param rotation
	 * @param frame
	 * @param g
	 */
	public void display(CPosition position, double rotation,int frame, Graphics g){
		if(position.getX() < 0 || position.getY() < 0){
			throw new IllegalArgumentException("Bad coord");
		}
		if(g == null){
			throw new IllegalArgumentException("Invalid graphic object");
		}
		double rotationRequired = Math.toRadians(rotation);
		Graphics2D g2 = (Graphics2D) g;
		double locationX = frames[frame].getIconWidth() / 2;
		double locationY = frames[frame].getIconWidth() / 2;
		AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired,locationX,locationY);
		AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
		g2.drawImage(op.filter((BufferedImage)frames[frame].getImage(), null), position.getX(), position.getY(), null);
	}
}
