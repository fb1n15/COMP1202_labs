/**
 * Lab4 part2 Main class implementation
 * @author Wojciech Rozowski (wkr1u18)
 */

public class Main {
	public static void main(String[] args) {
		//Creates new UserGroup obeject, populates it with sample data and tests its printUserData method
		UserGroup myUserGroup = new UserGroup();
		myUserGroup.addSampleData();
		myUserGroup.printUsernames();
	}
}
