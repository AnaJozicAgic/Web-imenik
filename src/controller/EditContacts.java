package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.ContactsBoImplementacija;
import model.Contact;

/**
 * Servlet implementation class EditContacts
 */
@WebServlet("/edit")
public class EditContacts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditContacts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	ContactsBoImplementacija bo = new ContactsBoImplementacija();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get user id
		int id = Integer.parseInt(request.getParameter("id"));

		Contact contact = bo.readContact(id);

		request.setAttribute("contact", contact);
		request.getRequestDispatcher("edit_contact.jsp").forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");

		Contact contact = new Contact();
		contact.setId(id);
		contact.setName(name);
		contact.setLastname(lastname);
		contact.setEmail(email);
		contact.setPhone(phone);
		contact.setCity(city);

		if (bo.updateContact(contact)) {
			request.getRequestDispatcher("contactedited.jsp").forward(request, response);
		}

	}
}
