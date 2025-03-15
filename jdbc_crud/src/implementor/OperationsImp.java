package implementor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db_connect.DbConnection;

public class OperationsImp implements operations.Operation {

	@Override
	public void insertData() {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = DbConnection.getConnection().prepareStatement("Insert into info values(?,?)");
			preparedStatement.setString(1, "Rajan");
			preparedStatement.setInt(2, 3);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Inserted successfully");
	}

	@Override
	public void updateData() {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = DbConnection.getConnection().prepareStatement("Update info set name=? where id=?");
			preparedStatement.setString(1, "developer");
			preparedStatement.setInt(2, 3);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Updated successfully");
		
	}

	@Override
	public void deleteData() {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = DbConnection.getConnection().prepareStatement("Delete from info where id=?");
			
			preparedStatement.setInt(1, 3);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Deleted successfully");
		
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = DbConnection.getConnection().prepareStatement("Select * from info");
			ResultSet resultSet=preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				System.out.println(resultSet.getString(1) + " " +resultSet.getInt(2));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
