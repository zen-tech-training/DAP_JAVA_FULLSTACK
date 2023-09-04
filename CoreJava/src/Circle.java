

// static import 

//import static 

//import java.lang.Math;

import static java.lang.Math.PI;

public class Circle implements AutoCloseable {
	
	private int radius;
	
	
	public Circle(){
		radius=10;
	}
	
	/*
	 * public Circle(int r) { this.radius=r; }
	 */
	
	
	/*
	 * public Circle() { radius=1; }
	 * 
	 * public Circle(int r) { radius=r; }
	 */
	
	public double area() {
		return PI * radius * radius;
		//return 3.14 * radius * radius;
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
