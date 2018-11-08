/**
 * Class for storing user data and providing methods to operate on them.
 * @author Wojciech Rozowski (wkr1u18)
 */

public class User {
	//Private fields of User class
	private String username;
	private String userType;
	private String name;

	/**
	 * Public constructor for User class
	 * @param initialUsername This is the username meant to be set for created User object
	 * @param initialUserType This is the type of the created User object, can be "admin", "editor" or "user"
	 * @param initialName This is the factual user's name to be stored in created User object
	 */
	public User(String initialUsername, String initialUserType, String initialName) {
		username = initialUsername;
		userType = initialUserType;
		name = initialName;
	} 

	/**
	 * Getter to the username field
	 * @return Username of the user whose data is stored in this object
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Getter to userType field
	 * @return String containing user type, can be "admin", "editor" or "user"
	 */
	public String getUserType() {
		return userType;
	}
	
	/**
	 * Getter to the name field
	 * @return String containing user's factual name 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Changes user's type
	 * @param newUserType New userType value
	 */
	public void setUserType(String newUserType) {
		userType = newUserType;
	}
}