package se.chalmers.chraker.jolinds.tdproject;

public class Position {
	private int x;
	private int y;
	public Position( int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}

	public double distance(Position p) {
		return (this.getY() - p.getY())/(this.getX() - p.getX());
	}

	public Position closest(Position p1, Position p2) {
		return Position.closest(this, p1, p2);
	}

	public static Position closest(Position target, Position p1, Position p2) {
		return (target.distance(p1) < target.distance(p2))?p1:p2;
	}

	@Override
	public boolean equals(Object o) {
		return o.getClass() == getClass() 
				&& ((Position) o).getX() == this.getX()
				&& ((Position) o).getY() == this.getY();
	}
}
