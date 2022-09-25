import org.junit.Before;
import org.junit.Test;

import javax.naming.directory.InvalidAttributesException;

import static org.junit.Assert.*;

public class ContactServiceTest {
	 private String firstName = null;
	 private String lastName = null;
	 private String phoneNumber = null;
	 private String address = null;
	
	 @Before
	 public void setUp() {
	 	firstName = "Steven";
	 	lastName = "Cognata";
	 	phoneNumber = "9085551270";
	 	address = "StreetName";
	 }

	/* Feature: Happy Path
	 * Given: All valid inputs for a new contact
	 * When: Creating a new contact
	 * Then: Contact is added to contact list
	 */
	@Test
	public void testCreatingNewContactHappyPath() throws InvalidAttributesException {
		ContactService service = new ContactService();

		Contact expectedContact = new Contact(firstName, lastName, phoneNumber, address);

		service.addContact(expectedContact.GetFirstName(), expectedContact.GetLastName(), expectedContact.GetPhoneNumber(), expectedContact.GetAddress());

		// Contact service list is not null
		assertNotNull(service.GetContactList());

		// Contact service list length is equal to 1
		assertEquals(1, service.GetContactList().size());

		// assert that the contact in the list has the correct values.
		assertEquals(service.GetContactList().get(0), expectedContact);
	}

	@Test
	public void deleteContact(){
		ContactService service = new ContactService();
		service.newContact();
		assertThrows(Exception.class, ()->service.deleteContact(GetContactId()));
		assertAll(()->service.deleteContact(service.getContactList().get(0).getContactID()));

	}


}