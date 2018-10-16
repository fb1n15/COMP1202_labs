/**
 * Lab4 part3 user class implementation
 * @author Wojciech Rozowski (wkr1u18)
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class UserGroup {
	//Private fields of class
	private ArrayList<User> userList;

	//Constructor for userGroup class
	public UserGroup() {
		userList = new ArrayList<User> ();
	}

	//Accessor to userList field
	public ArrayList<User> getUsers() {
		return userList;
	} 
	
	//Method creating 10 sample User objects and inserts them into userList
	public void addSampleData() {
		userList.add(new User("jd1", "user", "John"));
		userList.add(new User("m12", "editor", "Mike"));
		userList.add(new User("rd1324", "admin", "Rebecca"));
		userList.add(new User("cbd2", "user", "Catherine"));
		userList.add(new User("jack1234", "editor", "Jack"));
		userList.add(new User("janedoe1234", "admin", "Jane"));
		userList.add(new User("b_doe56", "user", "Bob"));
		userList.add(new User("mary_ann_1234", "editor", "Mary"));
		userList.add(new User("christopher987", "admin", "Chris"));
		userList.add(new User("el54321", "user", "Elisabeth"));
	}

	//Returns User object being in userList ArrayList at position i
	public User getUser(int i) {
		return userList.get(i);
	}

	//Method printing all usernames and userTypes of User objects in userList array using enchanced for loop
	public void printUsernames() {
		for(User currentUser : userList) {
			System.out.println(currentUser.getUsername() + " " + currentUser.getUserType());			
		}
	}

	//Removes first User object from userList
	public void removeFirstUser() {
		userList.remove(0);
	}

	//Removes last User object from userList
	public void removeLastUser() {
		userList.remove(userList.size()-1);
	}

	//Removes an User object having specified username from userList
	public void removeUser(String usernameToRemove) {
		Iterator<User> userListIterator = userList.iterator();
		//Iterate through userList looking for User object having the specified username

		while (userListIterator.hasNext()) {
			User currentUser = userListIterator.next();
			if (currentUser.getUsername() == usernameToRemove) {
				userListIterator.remove(); //Remove element if it matches the search conditions
			}
			
		}
	}

	//returns an Iterator to userList
	public Iterator<User> getUserIterator() {
		return userList.iterator();
	}
}
