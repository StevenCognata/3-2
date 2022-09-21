import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("322", "Steven", "Cognata", "9085553456", "Hogrefe");
		assertTrue(Contact.firstName.equals("Steven"));
		assertTrue(Contact.contactId.equals("322"));
		assertTrue(Contact.lastName.equals("Cognata"));
		assertTrue(Contact.phoneNumber.equals("9085553456"));
		assertTrue(Contact.address.equals("Hogrefe"));
		
	}
	
	@Test
	void testContactName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("322", "Steven", "Cognata", "9085553456", "Hogrefe");
		});
	}
	
	

}
