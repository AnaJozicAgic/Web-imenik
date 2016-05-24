package bo;

import java.util.List;

import model.Contact;

public interface ContactsBoInterface {
	public boolean addContact(Contact contact, int userId);

	public Contact readContact(int id);

	public List<Contact> readAllContacts(int userId);

	public boolean updateContact(Contact contact);

	public boolean deleteContact(Contact contact);
	
	public List<Contact> searchContacts(String name);
}
