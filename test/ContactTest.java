import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("322", "Steven", "Cognata", "9085553456");
		assertTrue(contact.GetFirstName().equals("Steven"));
		assertTrue(contact.GetContactId().equals("322"));
		assertTrue(contact.GetLastName().equals("Cognata"));
		assertTrue(contact.GetPhoneNumber().equals("9085553456"));
		assertTrue(contact.GetAddress().equals("Hogrefe"));
		
	}
	
	@Test
	void testContactName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("322", "Steven", "Cognata", "9085553456");
		});
	}
	
	

}
