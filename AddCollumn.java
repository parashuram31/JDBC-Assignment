package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddCollumn {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sangamonejdbc","root","root");
	Statement statement=connection.createStatement();
	statement.execute("alter table student add course varchar(25)");
	System.out.println("Column Added");
}
}
