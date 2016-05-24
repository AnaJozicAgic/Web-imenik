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

/**
 * Servlet implementation class SearchContacts
 */
@WebServlet("/search")
public class SearchContacts extends HttpServlet {
	ContactsBoImplementacija bo = new ContactsBoImplementacija();
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchContacts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");

		response.getWriter().print(name);

		List<Contact> contacts = bo.searchContacts(name);

		request.setAttribute("contacts", contacts);
		request.getRequestDispatcher("list_contact.jsp").forward(request, response);
	}

}
