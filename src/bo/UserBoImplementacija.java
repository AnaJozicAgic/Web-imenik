package bo;

import java.sql.SQLException;

import dao.UserDaoImplementacija;
import model.User;

public class UserBoImplementacija implements UserBoInterface {
	UserDaoImplementacija dao = new UserDaoImplementacija();

	@Override
	public boolean addUser(User user) throws SQLException {
		// Adding user
		if ((Helper.isValidUser(user))) {
				try {
				dao.addUser(user);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public User reedUser(String Username, String password) throws SQLException {
		// Reading user
		User user;
//		if (Helper.isValidUsername(Username) && Helper.isValidPassword(password)) {

			try {
				user = dao.reedUser(Username, password);
				return user;
			} catch (SQLException e) {
				return null;
//			}

		} 

	}

}
