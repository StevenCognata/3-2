public class Contact {
	static String contactId;
	static String firstName;
	static String lastName;
	static String phoneNumber;
	static String address;
	
	
	
	public Contact(String contactId, String firstName) {
		if (contactId == null || contactId.length()>10) {
			throw new IllegalArgumentException("Invalid");
			
		}
		
		if (firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid");
		}
		
		if (lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid");
		}
		
		if (phoneNumber == null || phoneNumber.length()>10) {
			throw new IllegalArgumentException("Invalid");
		}
		
		if (address == null || address.length()>10) {
			throw new IllegalArgumentException("Invalid");
		}
		
		
		this.address = address;
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		
		
		

		
		
	}



	public Contact(String newUniqueId, String firstname2, String lastname2, String phonenumber2, String address2) {
		// TODO Auto-generated constructor stub
	}



	public void updateFirstName(String firstName2) {
		// TODO Auto-generated method stub
		
	}



	public void updateLastName(String lastName2) {
		// TODO Auto-generated method stub
		
	}



	public void updatePhoneNumber(String phoneNumber2) {
		// TODO Auto-generated method stub
		
	}



	public void updateAddress(String address2) {
		// TODO Auto-generated method stub
		
	}
	
	
	






}

