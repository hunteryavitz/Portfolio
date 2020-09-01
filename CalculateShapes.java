import java.util.Scanner;

public class CalculateShapes {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Sphere Dimension:");
		double inX = sc.nextDouble();
		System.out.println("Cube Dimension:");
		double inY = sc.nextDouble();
		Sphere mSphere = new Sphere(inX);
		Cube mCube = new Cube(inY);
		System.out.print("Sphere:");
		System.out.println("x = " + mSphere.getLinearDimension());
		System.out.print("Volume:");
		System.out.println("v = " + mSphere.getVolume());
		System.out.print("Cube:");
		System.out.println("x = " + mCube.getLinearDimension());
		System.out.print("Volume:");
		System.out.println("v = " + mCube.getVolume());
	}
}