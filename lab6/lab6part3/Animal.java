/**
 * Class describing animals.
 * @author Wojciech Rozowski (wkr1u18)
 */

public class Animal {
	private String name;
	private int age;
	
	
	/**
	 * Constructor taking initial values for name and age fields.
	 * @param initialName String containing animal's name.
	 * @param initialAge int specifying animal's age.
	 */
	public Animal(String initialName, int initialAge) {
		name = initialName;
		age = initialAge;
	}
	/**
	 * Abstract method makeNoise.
	 */
	public void makeNoise() {
		
	}
	
	
	/**
	 * Getter method to name field.
	 * @return String containing animal's name;
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Getter method to age field.
	 * @return int containing animal's age.
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Abstract method for eating food.
	 * @param currentFood Food object to be eaten
	 * @throws Exception, when provided wrong food
	 */
	public void eat(Food currentFood) throws Exception{
		
	}
}