package bo;

import java.sql.SQLException;
import model.User;

public interface UserBoInterface {
	public boolean addUser(User user)throws SQLException;
	public User reedUser(String Username, String password)throws SQLException;
	
}
