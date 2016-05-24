package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Contact;
import model.User;

public interface ContactDaoInterface {
	public boolean addContact(Contact contact,int userId)throws SQLException;
	public Contact readContact(int contactId)throws SQLException;
	public ArrayList<Contact> reedContactByName(String name)throws SQLException;
	public ArrayList<Contact>listAllContacts(int userId)throws SQLException;
	public boolean updateContact(Contact contact)throws SQLException;
	public boolean deleteContact(Contact contact)throws SQLException;
	
	

}
