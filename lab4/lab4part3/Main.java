/**
 * Main class for the lab4part3 project. Provides further testing of the User and UserGroup objects.
 * @author Wojciech Rozowski (wkr1u18)
 */

import java.util.Iterator;

public class Main {
	/**
	 * Static method with all the testing procedures.
	 * @param args Command line arguments, which do not affect the program's behaviour.
	 */
	public static void main(String[] args) {
		//Creates new UserGroup objeect, populates it with sample data and tests its printUserData method.
		UserGroup myUserGroup = new UserGroup();
		myUserGroup.addSampleData();
		
		//Creates new UserGroup to store UserGroup objects
		UserGroup administrators = new UserGroup();
		//Iterate through myUserGroup looking for User objects having "admin" in userType field
		Iterator<User> myUserGroupIterator = myUserGroup.getUserIterator();
		while (myUserGroupIterator.hasNext()) {
			User currentUser = myUserGroupIterator.next();
			if (currentUser.getUserType().equals("admin")) {
				//After finding such user, add him to administrator UserGroup object
				administrators.getUsers().add(new User (currentUser.getUsername(),"admin", currentUser.getName()));
			}
		}
		//Access the last User object from administrators UserGroup and change it's userType field to "user"
		administrators.getUsers().get(administrators.getUsers().size()-1).setUserType("user");
		//NOTE to marker: Changing last user type in administrators UserGroup can lead to inconsistency, as it only changes the fields of User object stored in administrator UserGroup, but it doesn't affect the fields of equivalent object in other UserGroup object.  
		myUserGroup.printUsernames();
		administrators.printUsernames();
		

	}
}