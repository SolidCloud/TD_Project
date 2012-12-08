package se.chalmers.chraker.johlin.TD_Project;

public class ResourcePack {
	private int research;
	private int mass;
	private int power;
	
	public ResourcePack(int research, int mass, int power) {
		this.research = research;
		this.mass = mass;
		this.power = power;
	}

	public int getResearch() {
		return research;
	}

	public int getMass() {
		return mass;
	}

	public int getPower() {
		return power;
	}
	
}
