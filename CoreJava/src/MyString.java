
public class MyString {

	public static void main(String[] args) {
		
		
		String s1="Zensar";  // Immutable strings
		
		String s3=s1.concat("Tech");
		
		System.out.println(s3);
		
		
		StringBuffer s2=new StringBuffer("Zensar");
		
		StringBuilder s4;
		
		s2.append("Tech");
		
		System.out.println(s2);
		
		
		

	}

}
