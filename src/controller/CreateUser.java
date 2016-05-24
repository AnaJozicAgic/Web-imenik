package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.Helper;
import bo.UserBoImplementacija;
import model.User;

/**
 * Servlet implementation class CreateUser
 */
@WebServlet("/createuser")
public class CreateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			if (Helper.isValidUsername(username) && Helper.isValidPassword(password)) {

				// create a new user
				User user = new User(username, password);

				UserBoImplementacija bo = new UserBoImplementacija();

				if (bo.addUser(user)) {
					request.getRequestDispatcher("login_form.jsp").forward(request, response);
					return; // end the execution of the doPost
				}

			} else {
				request.getRequestDispatcher("register_form.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
