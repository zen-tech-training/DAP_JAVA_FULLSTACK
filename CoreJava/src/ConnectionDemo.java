import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) {
		
		
		FileInputStream fis;
		
		// Batch Updates    setAutoCommit(false)
		
		//AutoCommit 
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // loded and register the Driver

			// Connection
			// con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root",
			// "root");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testdb", "root", "root");

			// Connection con =
			// DriverManager.getConnection("jdbc:mysql://mydatabase.c7cty5rrfx0q.ap-south-1.rds.amazonaws.com:3306/testdb",
			// "admin", "admin123");

			Statement statement = con.createStatement();
			
			

			//boolean result = statement.execute("select * from employee ");

			//System.out.println(result);

			ResultSet rs = statement.executeQuery("select * from employee");
			
			// ResultSetMetaData
			
			// DatabaseMetaData

			while (rs.next()) {
				System.out.println(rs.getString("id") + " " + rs.getString("name"));//  1 not with Zero 
			}

			System.out.println("Connected .... ");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
