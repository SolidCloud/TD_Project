package se.chalmers.chraker.johlin.TD_Project;

public class CPosition{
	private int x;
	private int y;
	public CPosition( int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public boolean closerThanToTarget (CPosition compare, CPosition target){
		return Math.sqrt(Math.pow(target.getX()-this.getX(),2) + Math.pow(target.getY()-this.getY(),2)) >
			Math.sqrt(Math.pow(target.getX()-compare.getX(),2) + Math.pow(target.getY()-compare.getY(),2));
	}
}
