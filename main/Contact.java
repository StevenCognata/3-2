import java.util.UUID;

public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String firstName, String lastName, String phoneNumber, String address) {
		this.contactId = UUID.randomUUID().toString().substring(0, 10);
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	

	public String GetContactId(){
		return contactId;
	}
	
	public void SetContactId(String contactId) {
		this.contactId = contactId;
	}

	public String GetFirstName(){
		return firstName;
	}

	public void SetFirstName(String firstName){
		this.firstName = firstName;
	}

	public String GetLastName(){
		return lastName;
	}

	public void SetLastName(String lastname){
		this.lastName = lastname;
	}

	public String GetPhoneNumber(){
		return phoneNumber;
	}

	public void SetPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String GetAddress(){
		return address;
	}

	public void SetAddress(String address){
		this.address = address;
	}


}

