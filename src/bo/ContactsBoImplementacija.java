package bo;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.ContactDaoImplementacija;
import model.Contact;

public class ContactsBoImplementacija implements ContactsBoInterface {
	ContactDaoImplementacija dao = new ContactDaoImplementacija();

	@Override
	public boolean addContact(Contact contact, int userId) {
		if (Helper.isContactNotNull(contact) && Helper.isValidId(userId)) {

			try {

				if (dao.addContact(contact, userId)) {
					return true;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return false;
	}

	@Override
	public Contact readContact(int id) {
		Contact contact = null;

		if (Helper.isValidId(id)) {
			try {
				contact = dao.readContact(id);

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return contact;
	}

	@Override
	public boolean updateContact(Contact contact) {
		if (Helper.isContactNotNull(contact)) {
			dao.updateContact(contact);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteContact(Contact contact) {
		if (Helper.isContactNotNull(contact)) {
			try {
				if (dao.deleteContact(contact)) {
					return true;
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	@Override
	public List<Contact> searchContacts(String name) {

		List<Contact> list = new ArrayList<>();
		try {
			list = dao.reedContactByName(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Contact> readAllContacts(int userId) {
		ArrayList<Contact> list = null;
		if (Helper.isValidId(userId)) {
			try {
				list = dao.listAllContacts(userId);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

}
