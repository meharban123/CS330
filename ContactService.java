package contacts;
import java.util.ArrayList;
public class ContactService {
	ArrayList<Contact> listContact; //create list
	
	//constructor for list
	public ContactService() {
		listContact = new ArrayList<>();
	}
	//create a new contact
	public boolean newContact(Contact contact) {
		boolean contactAlready = false;//set to false initially and then set to true if already exists will use for tests
		for(Contact newCon: listContact) {//use for loop to go through contacts
			if(newCon.equals(contact)) {
				contactAlready = true;
			}
		}
		if(!contactAlready) { //if contact does not exist add them 
				listContact.add(contact);
				return true;
			}
			else //else test will return false
				return false;
			
		}
	public boolean deleteContact(String ID) {
		//did not use boolean for this one as it is not needed
		for(Contact newCon: listContact) { //again for loop
			if(newCon.getId().equals(ID)){
				listContact.remove(newCon);
				return true; //directly returning without assigning to a boolean variable
			}
			}//ending for loop
		
			return false;
		}
	/*
	 * rest of these tests will follow the same pattern outlined above but with different parameters according
	 * to what is needed for the method*/
	public boolean updateFname(String ID, String fName) {
		
		for(Contact newCon: listContact) {
			if(newCon.getId().equals(ID)){
				newCon.setFirstName(fName);
                return true;
			}
        }
			
				return false;
			
			}
		
	
	public boolean updateLname(String ID, String lName) {
		
		for(Contact newCon: listContact) {
			if(newCon.getId().equals(ID)){
				newCon.setLastName(lName);
              return true;
			}
        }
			
				return false;
			
		}
	public boolean updateNum(String ID, String num) {
		
		for(Contact newCon: listContact) {
			if(newCon.getId().equals(ID)){
				newCon.setPhone(num);
				return true;
			}
        }
			
				return false;
			
			
		
	}
	public boolean updateAddress(String ID, String address) {
		
		for(Contact newCon: listContact) {
			if(newCon.getId().equals(ID)){
				newCon.setAddress(address);
				return true;
			}
        }
			
              return false;
	}
	
	}

	
	



