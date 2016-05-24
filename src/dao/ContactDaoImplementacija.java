package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Contact;
import model.User;

public class ContactDaoImplementacija implements ContactDaoInterface {
	Connection connection = ConectionManager.getInstance().getConnection();

	@Override
	public boolean updateContact(Contact contact) {
		String query = "UPDATE contacts SET name=?, lastname=?, email=?, phone=?, city=?";
		try(PreparedStatement steatment = connection.prepareStatement(query)) {
			
			steatment.setString(1, contact.getName());
			steatment.setString(2, contact.getLastname());
			steatment.setString(3, contact.getEmail());
			steatment.setString(4, contact.getPhone());
			steatment.setString(5, contact.getCity());
			steatment.executeUpdate();
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@Override
	public boolean addContact(Contact contact, int userId) throws SQLException {
		// adding new user to the users table
				String query = "INSERT INTO contacts (name,lastname,email,phone,city,userId) VALUE (?,?,?,?,?,?)";
				try (PreparedStatement statement = connection.prepareStatement(query);) {
					statement.setString(1,contact.getName() );
					statement.setString(2, contact.getLastname());
					statement.setString(3, contact.getEmail());
					statement.setString(4, contact.getLastname());
					statement.setString(5, contact.getCity());
					statement.setInt(6, userId);

					statement.executeUpdate();

				} catch (Exception e) {
					return false;
				}
				return true;
	
	}

	@Override
	public Contact readContact(int contactId) throws SQLException {
		// Reading contact by Id
				Contact contact = null;
				ResultSet rs = null;
				String query = "SELECT * FROM contacts WHERE id = ?";

				try (PreparedStatement statement = connection.prepareStatement(query)) {
					statement.setInt(1, contactId);
					rs = statement.executeQuery();
					if (rs.next()) {
						contact = new Contact(rs.getString("name"), rs.getString("lastname"), rs.getString("email"),
								rs.getString("phone"), rs.getString("city"));
					}

				} catch (Exception e) {
					return null;
				}
				return contact;
	}


	@Override
	public ArrayList<Contact> listAllContacts(int userId) throws SQLException {
		//List all contacts
		ArrayList<Contact> contacts = new ArrayList<>();
		String query = "SELECT * FROM contacts WHERE userId = ?";
		ResultSet rs = null;
		try (PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setInt(1, userId);
			rs = statement.executeQuery();
			while (rs.next()) {
				contacts.add(new Contact(rs.getString("name"), rs.getString("lastname"), rs.getString("email"),
						rs.getString("phone"), rs.getString("city")));
			}
		} catch (Exception e) {
			return null;
		}
		return contacts;

	}

	@Override
	public boolean deleteContact(Contact contact) throws SQLException {
		// Removing  contact 
		String query = "DELETE FROM contacts WHERE id = ?";

		try (PreparedStatement statement = connection.prepareStatement(query);) {

		
			statement.setInt(1, contact.getId());

	
			statement.executeUpdate();
		}

		return true;

	}

	@Override
	public ArrayList<Contact> reedContactByName(String name) throws SQLException, NullPointerException {
		// Reading contact by lastname
		ArrayList<Contact> contact = null;
		ResultSet rs = null;
		String query = "SELECT * FROM contacts WHERE name = ?";

		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, name);
			
			rs = statement.executeQuery();
			if (rs.next()) {
				contact.add(new Contact(rs.getString("name"), rs.getString("lastname"), rs.getString("email"),
						rs.getString("phone"), rs.getString("city")));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return contact;
	}

}
