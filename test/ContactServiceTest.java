import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {
	// private String firstName = null;
	// private String lastName = null;
	// private String phoneNumber = null;
	// private String address = null;
	
	// @BeforeEach
	// private void setup() {
	// 	String this.firstName = "Steven";
	// 	String lastName = "Cognata";
	// 	String phoneNumber = "9085551270"
	// 	String address = "Sesame Street"
	// 	// TODO: Fill in the fields
	// }

	/* Feature: Happy Path
	 * Given: All valid inputs for a new contact
	 * When: Creating a new contact
	 * Then: Contact is added to contact list
	 */
	@Test
	void testCreatingNewContactHappyPath() {
		ContactService service = new ContactService();

		Contact expectedContact = new Contact(firstName, lastName, phoneNumber, address)

		service.newContact(expectedContact.GetFirstName(), expectedContact.GetLastName(), expectedContact.GetPhoneNumber(), expectedContact.GetAddress());

		// assert contact service list length is equal to 1

		// assert that the contact in the list has the correct values.
		
	}

	@Test
	void newContactTest(){
		
	}

}
