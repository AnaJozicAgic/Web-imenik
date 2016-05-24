package bo;

import model.Contact;
import model.User;

public class Helper {
	public static boolean isUserNotNull(User user) {
		if (user == null) {
			return false;
		}
		return true;
	}

	public static boolean isValidPassword(String password) {
		if ((password.length() < 6) || (password.trim() == "")) {
			return false;
		}
		return true;
	}

	public static boolean isValidUsername(String username) {
		if ((username.length() < 2) || (username.trim() == "")) {
			return false;
		}
		return true;
	}

	public static boolean isValidUser(User user) {
		if (isUserNotNull(user) && isValidPassword(user.getPassword()) && isValidUsername(user.getUsername())) {
			return true;
		}
		return false;
	}

	public static boolean isContactNotNull(Contact contact) {
		if (contact == null) {
			return false;
		}
		return true;
	}


	public static boolean isValidId(int userId) {

		if (userId > 0) {
			return true;
		}

		return false;
	}
}
