package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/info","root","Rajan@2003");
	
	Statement statement=connection.createStatement();
	statement.execute("Insert into data values('Tom',1)");
	statement.execute("Insert into data values('Bom',2)");
	statement.execute("Insert into data values('Harry',3)");
	
	statement.execute("Update data set name='Jerry' where id=2");
	
	statement.execute("Delete from data where id=3");
	
	
	
	ResultSet resultSet=statement.executeQuery("select * from data");
	
	while (resultSet.next()) {
		System.out.println(resultSet.getString(1));
		System.out.println(resultSet.getInt(2));
		
	}
	
	
	
	

}
}
