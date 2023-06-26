package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInputInsertValues {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sangamonejdbc","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("insert into student values(?,?,?)");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the phone number");
	long phone=sc.nextLong();
	preparedStatement.setLong(1,phone);
	
	System.out.println("Enter the name");
	String name=sc.next();
	preparedStatement.setString(2,name);
	
	System.out.println("Enter the course");
	String course=sc.next();
	preparedStatement.setString(3,course);
	
	preparedStatement.execute();
	System.out.println("The values are updated");
}
}
