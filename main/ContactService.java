import java.util.ArrayList;
import java.util.List;


public class ContactService {
	
	private List<Contact> contactList = new ArrayList<>();

	public void newContact(String firstname, String lastname, String phonenumber, String address) {

		if (!IsValidateContactInfo(firstname, lastname, phonenumber, address)) {
			throw new IllegalArgumentException("invalid");
		}
		
		Contact contact = new Contact(firstname, lastname, phonenumber, address);
		contactList.add(contact);
	}

	private boolean IsValidateContactInfo(String firstName, String lastName, String phoneNumber, String address) {
		
		if (firstName == null || firstName.length()>10) {
			return false;
		}
		
		if (lastName == null || lastName.length()>10) {
			return false;
		}
		
		if (phoneNumber == null || phoneNumber.length()>10) {
			return false;
		}
		
		if (address == null || address.length()>10) {
			return false;
		}

		return true;
	}

	public List<Contact> GetContactList() {
		return contactList;
	}

	public void SetContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

	public static void deleteContact(String uniqueId) {
		for (int i = 0; i < contactList.size(); i++) {
			if (uniqueId.compareTo(contactList.get(i).getId()) == 0) {
				int position = i;
				contactList.remove(position);
			}
		}
	}


}