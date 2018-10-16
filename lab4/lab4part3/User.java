/**
 * Lab4 part3 user class implementation
 * @author Wojciech Rozowski (wkr1u18)
 */

public class User {
	//Private fields of User class
	private String username;
	private String userType;
	private String name;

	//Constructor for the User class
	public User(String initialUsername, String initialUserType, String initialName) {
		username = initialUsername;
		userType = initialUserType;
		name = initialName;
	} 

	//Accessor to username field	
	public String getUsername() {
		return username;
	}

	//Accessor to userType field	
	public String getUserType() {
		return userType;
	}
	
	//Accessor to name field	
	public String getName() {
		return name;
	}

	//Mutator for userType field
	public void setUserType(String newUserType) {
		userType = newUserType;
	}
}
