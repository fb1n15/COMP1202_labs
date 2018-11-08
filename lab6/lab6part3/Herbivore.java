/**
 * Class for modelling herbivores. Extends {@link Animal} class.
 * @author Wojciech Rozowski (wkr1u18)
 *
 */

public class Herbivore extends Animal {
	/**
	 * Constructor which calls Animal class constructor.
	 * @param initialName String containing herbivore's name
	 * @param initialAge int containing herbivore's age
	 */
	public Herbivore(String initialName, int initialAge) {
		super(initialName,initialAge);
	}
	
	/**
	 * Method for eating food.
	 * @param currentFood Food object to be eaten
	 * @throws Exception, when provided Food which is not Plant.
	 */
	@Override
	public void eat(Food currentFood) throws Exception {
		//Throws exception when provided Food object is not a Meat object
		if (currentFood instanceof Plant) {
			System.out.println("Animal is currently eating: " + currentFood.getName());
		}
		else {
			throw new Exception("Herbivores can't eat meat!");
		}
	}
}