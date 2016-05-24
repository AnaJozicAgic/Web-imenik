package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

public class UserDaoImplementacija implements UserDaoInterface {
	Connection connection = ConectionManager.getInstance().getConnection();

	@Override
	public boolean addUser(User user)throws SQLException{
		//adding new user to the users table
		String query = "INSERT INTO users (username,password) VALUE (?,?)";
		try (PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());

			statement.executeUpdate();
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public User reedUser(String Username, String password) throws SQLException {
		//Reading user from database
	User user=null;
	ResultSet rs=null;
	String query= "SELECT * FROM users where username=?";
	
	PreparedStatement statement=connection.prepareStatement(query);
		statement.setString(1, Username);
		rs=statement.executeQuery();
		if(rs.next()){
			user = new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
		}
		rs.close();
		
		return user;	


		
	}


		@Override
		public boolean validate(String username,String pass) throws SQLException {
			//Check if user is contained in the database
			if(reedUser(username,pass).equals(null)){
			return false;	
			}else{
				return true;
			
			
		}
	}

}
