
public class MethodOverloadingDemo {  
	
	
	public void sum(int a,int b) {
		System.out.println("Sum is "+(a+b));   //Method Overloding
	}
	
	
	public int  sum(int a,int  b,int c) {
		return a+b+c;
	}
	
	
	
	
	
	public static void main(String[] args) {
		MethodOverloadingDemo demo=new MethodOverloadingDemo();
		demo.sum(10, 20);
		
	}

}
