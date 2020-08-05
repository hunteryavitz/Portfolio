public class box {
	
	public int length, width, height;
	private int arbitraryDimension = 10;
	
	// Overloading and Chaining Constructor
	public box(int l, int w, int h) {
		
		this.length = l;
		this.width = w;
		this.height = h;
		
	}
	
	public box(int d) {
		
		this(d, d, d);
		
	}
	
	public box() {
	
		this(arbitraryDimension);
		
	}
	
}