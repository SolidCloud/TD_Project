package se.chalmers.chraker.johlin.TD_Project;

public class DamagePack {
	private int ballistic;
	private int kinetic;
	private int energy;

	public DamagePack(int ballistic, int kinetic, int energy) {
		this.ballistic = ballistic;
		this.kinetic = kinetic;
		this.energy = energy;
	}

	public int getBallistic() {
		return ballistic;
	}

	public int getKinetic() {
		return kinetic;
	}

	public int getEnergy() {
		return energy;
	}

}
