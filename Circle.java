public class circle {
	
	public int radius;
	public int x_axis, y_axis;
	private int arbitraryRadius = 10;
	private int arbitraryLocus = 0;
	
	// Overloading and Chaining Constructor
	public circle(int x, int y, int r) {
		
		this.x_axis = x;
		this.y_axis = y;
		this.radius = r;
		
	}

	public circle(int r) {
		
		this(arbitraryLocus, arbitraryLocus, r);
		
	}
	
	public circle() {
		
		this(arbitraryRadius);
		
	}
	
}