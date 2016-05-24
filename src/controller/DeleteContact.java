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
 * Servlet implementation class DeleteContact
 */
@WebServlet("/delete")
public class DeleteContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ContactsBoImplementacija bo = new ContactsBoImplementacija();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteContact() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get user id
				int id = Integer.parseInt(request.getParameter("id"));

				Contact contact = bo.readContact(id);

				request.setAttribute("contact", contact);
				request.getRequestDispatcher("delete_contact.jsp").forward(request, response);

			}

			@Override
			protected void doPost(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {

				int id = Integer.parseInt(request.getParameter("id"));

				Contact contact = bo.readContact(id);

				if (bo.deleteContact(contact)) {
					request.getRequestDispatcher("contact_deleted.jsp").forward(request, response);
				}

			}



}
