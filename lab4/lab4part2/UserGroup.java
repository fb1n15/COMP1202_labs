/**
 * Class storing multiple user's data and providing basic operations on collections of {@link}User objects
 * @author Wojciech Rozowski (wkr1u18)
 *
 */

import java.util.ArrayList;
import java.util.List;

public class UserGroup {
	//Arraylist contatining User objects
	private ArrayList<User> userList;

	/**
	 * Public constructor for the class. It initialises the data structures.
	 */
	public UserGroup() {
		userList = new ArrayList<User> ();
	}

	/**
	 * Getter to ArrayList object storing {@link User} objects.
	 * @return Stored ArrayList of User objects
	 */
	public ArrayList<User> getUsers() {
		return userList;
	} 
	
	/**
	 * Method filling the ArrayList with sample User objects for testing purposes.
	 */
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

	/**
	 * This method accesses the data of specified user.
	 * @param i Index of element in ArrayList object
	 * @return {@link User} object stored in ArrayList on position i
	 */
	public User getUser(int i) {
		return userList.get(i);
	}

	/**
	 * Prints all the user's information to standard output.
	 */
	public void printUsernames() {
		//Iterates through ArrayList using enhanced for loop
		for(User currentUser : userList) {
			System.out.println(currentUser.getUsername() + " " + currentUser.getUserType());			
		}
	}
}
