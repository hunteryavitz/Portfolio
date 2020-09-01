public class Sphere extends SymmetricalHedron implements VolumeFormula {

	public double getVolume() {
		return (4*22*x*x*x)/(3*7);
	}

	public Sphere(double x) {
		this.setLinearDimension(x);
	}
}