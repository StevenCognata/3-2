import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactService {
	
	 private String uniqueId;
	 private List<Contact> contactList = new ArrayList<>();
	 
	 {
		    uniqueId = UUID.randomUUID().toString().substring(
		        0, Math.min(toString().length(), 10));
		  }

		  public void newFullContact() {
			    Contact contact = new Contact(newUniqueId(), uniqueId);
			    contactList.add(contact);
			  }

			  public void newContact(String firstname) {
			    Contact contact = new Contact(newUniqueId(), firstname);
			    contactList.add(contact);
			  }

			  public void newContact(String firstname, String lastname) {
			    Contact contact = new Contact(newUniqueId(), firstname, lastname, lastname, lastname);
			    contactList.add(contact);
			  }

			  public void newContact(String firstname, String lastname,
			                         String phonenumber) {
			    Contact contact =
			        new Contact(newUniqueId(), firstname, lastname, phonenumber, phonenumber);
			    contactList.add(contact);
			  }

			  public void newContact(String firstname, String lastname, String phonenumber,
			                         String address) {
			    Contact contact =
			        new Contact(newUniqueId(), firstname, lastname, phonenumber, address);
			    contactList.add(contact);
			  }
			private String newUniqueId() {
				// TODO Auto-generated method stub
				return null;
			}
			
			
			// delete contact
			 public void deleteContact(String id) throws Exception {
				    contactList.remove(searchForContact(id));
				  }

			private Object searchForContact(String id) {
				// TODO Auto-generated method stub
				return null;
			}
	
			
			// update contact
			 public void updateFirstName(String id, String firstName) throws Exception {
				    ((Contact) searchForContact(id)).updateFirstName(firstName);
				  }

				  public void updateLastName(String id, String lastName) throws Exception {
				    ((Contact) searchForContact(id)).updateLastName(lastName);
				  }

				  public void updatePhoneNumber(String id, String phoneNumber)
				      throws Exception {
				    ((Contact) searchForContact(id)).updatePhoneNumber(phoneNumber);
				  }

				  public void updateAddress(String id, String address) throws Exception {
				    ((Contact) searchForContact(id)).updateAddress(address);
				  }

				public Object getContactList() {
					// TODO Auto-generated method stub
					return null;
				}

				public Object get(int i) {
					// TODO Auto-generated method stub
					return null;
				}
	
	
}