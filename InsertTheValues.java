package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTheValues {
	public static void main(String[] args) throws ClassNotFoundException ,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sangamonejdbc","root","root");
		System.out.println("Connection is established");
		Statement statement=connection.createStatement();
		statement.execute("insert into student1 values(1,'pacchii',8123313552)");
}
}
