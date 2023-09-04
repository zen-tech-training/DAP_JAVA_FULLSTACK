import java.util.ArrayList;

public class Outer {

	private int a = 10;

	public void display() {
		
		 class Inner {    

			int b = 30;

			public void display() {
				// System.out.println(" Value of A" + a);
				System.out.println(" Value of B" + b);
			}

		}
		 
		 Inner in=new Inner();
		 in.display();
		
	}
	
	// Interfaces

	public static void main(String[] args) {
		
		
		new ArrayList() {
			
			public int size() {
				System.out.println("hi");
				return 10;
			}
			
		};

			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					System.out.println("Running !!!!");
					
				}
			};
			
			
			runnable.run();
		

	}

}
