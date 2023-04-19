package contacts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest extends ContactService{

  	void ContactNew() {
	      Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
	      //assert whether these are all set
	      assertEquals(test.getId(),"1234567891" );
	      assertEquals(test.getFirstName(),"frank" );
	      assertEquals(test.getLastName(),"smith" );
	      assertEquals(test.getPhone(),"1222920927" );
	      assertEquals(test.getAddress(),"1234 test street" );
	    }
	@Test
	/*
	 * each of these tests will be based off of a similar format
	 * all of them will check the Id and then use a boolean to see if the tests are working correctly
	 * the only difference will be what is updated/deleted based off of the contact and/or contact ID*/
	void newContactTest(){
	ContactService test = new ContactService();
	Contact newCon = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
	assertEquals(true, test.newContact(newCon));
	
    }

	@Test
	void deleteContactTest(){
      Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
      ContactService newCon = new ContactService();
      
      assertEquals(false, newCon.deleteContact("1234567891"));
      
     }
	
	@Test
	void updateFnameTest(){
	      Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
	      ContactService newCon = new ContactService();
	      
	      assertEquals(false, newCon.updateFname("1234567891", "barney"));
    }
	@Test
	void updateLnameTest(){
	      Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
	      ContactService newCon = new ContactService();
	      
	      assertEquals(false, newCon.updateLname("1234567891", "jones"));
    }
	@Test
	void updateNumTest(){
	      Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
	      ContactService newCon = new ContactService();
	      
	      assertEquals(false, newCon.updateNum("1234567891", "1222920927"));
    }
	@Test
	void updateAddressTest(){
	      Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
	      ContactService newCon = new ContactService();
	      
	      assertEquals(false, newCon.updateAddress("1234567891", "122 maple drive"));
    }
	
	



}