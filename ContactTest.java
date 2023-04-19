package contacts;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
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
		void setIDtest() {
			Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
	      	//call setID with valid
	      test.setId("1234567891");
	      	//assert that it is set using the getter
	      assertEquals(test.getId(),"1234567891" );
	      	//call setId with invalid
	      test.setId("12345678910");
	      	//assert that it is NOT set using the getter
	      assertEquals(test.getId(),"1234567891");
		}
		
		@Test
		void setFirstnNametest() {
			Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
	      	//call setFirstName with valid
	      test.setFirstName("franz");
	      	//assert that it is set using the getter
	      assertEquals(test.getFirstName(),"franz" );
	      	//call setFirstName with invalid
	      test.setFirstName("franzferdinand");
	      	//assert that it is NOT set using the getter
	      assertEquals(test.getFirstName(),"franz");
		}
		//rest of these tests will follow a similar format to the above
		@Test
		void setLastNametest() {
			Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
	         
	      test.setLastName("franz");
	      	
	      assertEquals(test.getLastName(),"franz" );
	      	
	      test.setLastName("franzferdinand");
	      	
	      assertEquals(test.getLastName(),"franz");
		}
		
		@Test
		void setPhonetest() {
			Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
	      
	      test.setPhone("1234567891");
	      	
	      assertEquals(test.getPhone(),"1234567891");
	      	
	      test.setPhone("123456789");
	      	
	      assertEquals(test.getPhone(),"1234567891");
	      
	      test.setPhone("12345678912");
	      
	      assertEquals(test.getPhone(),"1234567891");
		}
		@Test
		void setAddresstest() {
			Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
	      
	      	         
	      test.setAddress("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	      	
	      assertEquals(test.getAddress(),"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	      	
	      test.setAddress("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	      	
	      assertEquals(test.getAddress(),"XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	     }
		
		@Test
		void setFirstNameNullTest() {
		    Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
		    test.setFirstName(null);
		    assertNull(test.getFirstName());
		}
		@Test
		void setLastNameNullTest() {
		    Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
		    test.setLastName(null);
		    assertNull(test.getLastName());
		}
		@Test
		void setIdInvalidTest() {
		    Contact test = new Contact("1234567891", "frank", "smith", "1222920927", "1234 test street");
		    assertThrows(IllegalArgumentException.class, () -> {
		        test.setId("12345678910");
		    });
		}
		@Test
		void setPhoneInvalidTest() {
		    Contact test = new Contact("1234567891", "frank", "smith", "1222920927", "1234 test street");
		    test.setPhone("abc");
		    assertEquals(test.getPhone(), "1222920927");
		}
		@Test
		void setIdMinBoundaryTest() {
		    Contact test = new Contact("0", "frank", "smith", "1222920927", "1234 test street");
		    assertEquals(test.getId(), "0");
		}

		@Test
		void setIdMaxBoundaryTest() {
		    Contact test = new Contact("9999999999", "frank", "smith", "1222920927", "1234 test street");
		    assertEquals(test.getId(), "9999999999");
		}
		@Test
		void setIdEmptyTest() {
		    Contact test = new Contact("1234567891", "frank", "smith", "1222920927", "1234 test street");
		    test.setId("");
		    assertEquals(test.getId(), "");
		}

		@Test
		void setFirstNameEmptyTest() {
		    Contact test = new Contact("1234567891", "frank", "smith", "1222920927", "1234 test street");
		    test.setFirstName("");
		    assertEquals(test.getFirstName(), "");
		}

		@Test
		void setLastNameEmptyTest() {
		    Contact test = new Contact("1234567891", "frank", "smith", "1222920927", "1234 test street");
		    test.setLastName("");
		    assertEquals(test.getLastName(), "");
		}

		@Test
		void setPhoneEmptyTest() {
		    Contact test = new Contact("1234567891", "frank", "smith", "1222920927", "1234 test street");
		    test.setPhone("");
		    assertEquals(test.getPhone(), "");
		}

		@Test
		void setAddressEmptyTest() {
		    Contact test = new Contact("1234567891", "frank", "smith", "1222920927", "1234 test street");
		    test.setAddress("");
		    assertEquals(test.getAddress(), "");
		}

		@Test
		void setInvalidPhoneTest() {
		    Contact test = new Contact("1234567891", "frank", "smith", "1222920927", "1234 test street");
		    test.setPhone("12");
		    assertEquals(test.getPhone(), "1222920927");
		}

		@Test
		void setInvalidAddressTest() {
		    Contact test = new Contact("1234567891", "frank", "smith", "1222920927", "1234 test street");
		    test.setAddress("12");
		    assertEquals(test.getAddress(), "1234 test street");
		}
		@Test
		void setIdNullTest() {
		    Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
		    test.setId(null);
		    assertNull(test.getId());
		}

		@Test
		void setPhoneNullTest() {
		    Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
		    test.setPhone(null);
		    assertNull(test.getPhone());
		}

		@Test
		void setAddressNullTest() {
		    Contact test = new Contact("1234567891", "frank", "smith",  "1222920927", "1234 test street");
		    test.setAddress(null);
		    assertNull(test.getAddress());
		}

		


}
