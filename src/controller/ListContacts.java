package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.ContactsBoImplementacija;
import model.Contact;
import model.User;

/**
 * Servlet implementation class ListContacts
 */
@WebServlet("/listcontacts")
public class ListContacts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListContacts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get the user from the session
		User user = (User) request.getSession(false).getAttribute("user");

		ContactsBoImplementacija bo = new ContactsBoImplementacija();

		List<Contact> contacts = bo.readAllContacts(user.getId());

		request.setAttribute("contacts", contacts);
		request.getSession().setAttribute("user", user);
		request.getRequestDispatcher("list_contact.jsp").forward(request, response);

	}
}
