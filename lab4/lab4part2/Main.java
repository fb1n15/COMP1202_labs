/**
 * Main class for the lab4part2 project. It tests the basic methods of {@link UserGroup}
 * @author Wojciech Rozowski (wkr1u18)
 *
 */
public class Main {
	/**
	 * Static method with all the testing procedures.
	 * @param args Command line arguments, which do not affect the program's behaviour.
	 */
	public static void main(String[] args) {
		UserGroup myUserGroup = new UserGroup();
		myUserGroup.addSampleData();
		myUserGroup.printUsernames();
	}
}
