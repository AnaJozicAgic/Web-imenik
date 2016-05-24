package model;

public class Contact {
	private int id;
	private int userId;
	private String name;
	private String lastname;
	private String email;
	private String phone;
	private String city;
	public Contact(String name, String lastname, String email, String phone, String city) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}
	public Contact() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", userId=" + userId + ", name=" + name + ", lastname=" + lastname + ", email="
				+ email + ", phone=" + phone + ", city=" + city + "]";
	}


}
