package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bo.ContactsBoImplementacija;
import model.Contact;
import model.User;

/**
 * Servlet implementation class AddContact
 */
@WebServlet("/addcontact")
public class AddContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContact() {
        super();
     
    }



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactsBoImplementacija bo = new ContactsBoImplementacija();

		// get the user from the session
		User user = (User) request.getSession(false).getAttribute("user");

		String name = request.getParameter("name");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String city=request.getParameter("city");

		Contact contact = new Contact();

		// set contact values
		contact.setName(name);
		contact.setLastname(lastname);
		contact.setEmail(email);
		contact.setPhone(phone);

		if (bo.addContact(contact, user.getId())) {
			request.getSession().setAttribute("user", user);
			request.setAttribute("name", name);
			request.getRequestDispatcher("contact_aded.jsp").forward(request, response);
		} else {
			response.getWriter().println("fail");
		}

	}

}
