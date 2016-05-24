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
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user;
		UserBoImplementacija bo = new UserBoImplementacija();
try {
		if (Helper.isValidUsername(username) && Helper.isValidPassword(password)) {

			
				user = bo.reedUser(username, password);
			
			if (user == null) {
				request.getRequestDispatcher("login_form.jsp").forward(request, response);
				return; // end the execution of the doPost
			}

			request.getSession().setAttribute("user", user);
			request.getRequestDispatcher("my_home_page.jsp").forward(request, response);
			return; // end the execution of the doPost

		} else {
			request.getRequestDispatcher("login_form.jsp").forward(request, response);
		}
} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
	}
	}
}
