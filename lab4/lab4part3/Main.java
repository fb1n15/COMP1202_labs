/**
 * Lab4 part3 Main class implementation
 * @author Wojciech Rozowski (wkr1u18)
 */

//import java.util.ArrayList;
//import java.util.List;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		//Creates new UserGroup obeject, populates it with sample data and tests its printUserData method
		UserGroup myUserGroup = new UserGroup();
		myUserGroup.addSampleData();
		
		UserGroup administrators = new UserGroup();
		//Iterate through myUserGroup looking for User objects having "admin" in userType field
		Iterator<User> myUserGroupIterator = myUserGroup.getUserIterator();
		while (myUserGroupIterator.hasNext()) {
			User currentUser = myUserGroupIterator.next();
			if (currentUser.getUserType() == "admin") {
				//After finding such user, add him to adminisrator UserGroup object
				administrators.getUsers().add(new User (currentUser.getUsername(),"admin", currentUser.getName()));
			}
		}
		//Access the last User object from administrators UserGroup and change it's userType field to "user"
		administrators.getUsers().get(administrators.getUsers().size()-1).setUserType("user");
		//Changing last user type in administartos UserGroup can lead to inconsistency, as it only changes the fields of User object stored in administrator UserGroup, but it doesn't affect the fields of equivalent object in other UserGroup object.  
		myUserGroup.printUsernames();
		administrators.printUsernames();
		

	}
}
