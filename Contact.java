package contacts;

public class Contact {
	//create attributes
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	//create parameter constructor to initialize
	public Contact(String id, String firstName, String lastName, String phone, String address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	//getter and setters. All of them will test for null and for the required amount of characters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if(id != null && id.length() <= 10)  {//this conditional will be used to test for null and characters in the tests
		this.id = id;
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(firstName != null && firstName.length() <= 10) {
		this.firstName = firstName;
		}
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(lastName != null && lastName.length() <= 10) {
		this.lastName = lastName;
		}
	}
	public String getPhone() {
		
		return phone;
		
	}
	public void setPhone(String phone) {
		if(phone.length() == 10) {
		this.phone = phone;
		}
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address.length() <= 30) {
		this.address = address;
		}
	}
	
}
