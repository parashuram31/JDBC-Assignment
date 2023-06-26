package staticprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTheValueUsingUserInput {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sangamonejdbc","root","root");
	PreparedStatement ps=connection.prepareStatement("delete from student1 where phone=?");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the phone number");
	long phone=sc.nextLong();
	ps.setLong(1, phone);
	
	ps.execute();
	System.out.println("The data is deleted from the table");
}
}
