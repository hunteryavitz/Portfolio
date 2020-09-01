public class Cube extends SymmetricalHedron implements VolumeFormula {

	public double getVolume() {
		return (x*x*x);
	}

	public Cube(double x) {
		this.setLinearDimension(x);
	}
}