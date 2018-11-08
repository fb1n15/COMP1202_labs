/**
 * Class for modelling food.
 * @author Wojciech Rozowski (wkr1u18)
 */


public class Food {
	private String name;
	
	/**
	 * Constructor taking initial value of name field.
	 * @param initialName String containing food's name.
	 */
	public Food(String initialName) {
		name = initialName;
	}
	
	/**
	 * Getter method for name field
	 * @return String containing food's name
	 */
	public String getName() {
		return name;
	}
}