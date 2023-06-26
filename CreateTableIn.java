package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableIn {
public static void main(String[] args) throws ClassNotFoundException ,SQLException{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sangamonejdbc","root","root");
	System.out.println("Connection is established");
	Statement statement=connection.createStatement();
	statement.execute("create table Student(Student_Id integer Primary Key,name varchar(20) not null,phone bigint not null unique)");
	System.out.println("Table is created in the database sangamonejdbc");
	
}
}
