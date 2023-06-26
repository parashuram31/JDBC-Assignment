package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertValue2 {
	public static void main(String[] args) throws ClassNotFoundException ,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sangamonejdbc","root","root");
		System.out.println("Connection is established");
		Statement statement=connection.createStatement();
		statement.execute("insert into student1 values(2,'prajwal',9123313552)");
		statement.execute("insert into student1 values(3,'govinda',7123313552)");
		statement.execute("insert into student1 values(4,'ram',8523313552)");
		statement.execute("insert into student1 values(5,'seeta',7623313552)");
		System.out.println("Created");
}
}

