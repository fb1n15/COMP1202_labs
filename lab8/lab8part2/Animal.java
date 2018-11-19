/**
 * Class describing animals.
 * @author Wojciech Rozowski (wkr1u18)
 */

public class Animal implements Comparable<Animal> {
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
	 * Constructor initialising Animal object with initial name "newborn" and initial age equal to zero.
	 */
	public Animal() {
		this("newborn", 0);
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
	
	/**
	 * Feeds the Animal the specified amount of times
	 * @param currentFood currentFood Food object to be eaten
	 * @param amount Integer object specifying the number of times to feed the Animal
	 * @throws Exception Exception, when provided wrong food
	 */
	public void eat(Food currentFood, Integer amount) throws Exception {
		for(int i = 0; i < amount; i++) {
			eat(currentFood);
		}
	}
	
	/**
	 * Implements comompareTo method of Comparable interface
	 * @return -1 if given Animal is older then current Animal, 0 if they have same age and 1 if given Animal is younger then current Animal
	 */
	public int compareTo(Animal givenAnimal) {
		if(this.getAge()>givenAnimal.getAge()) {
			return 1;
		}
		else if (this.getAge()==givenAnimal.getAge()) {
			return 0;
		}
		else {
			return -1;
		}
	}
}