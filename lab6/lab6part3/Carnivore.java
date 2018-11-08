/**
 * Class for modelling carnivores. Extends {@link Animal} class.
 * @author Wojciech Rozowski (wkr1u18)
 *
 */

public class Carnivore extends Animal {
	/**
	 * Constructor which calls Animal class constructor.
	 * @param initialName String containing cornivore's name
	 * @param initialAge int containing cornivore's age
	 */
	public Carnivore(String initialName, int initialAge) {
		super(initialName,initialAge);
	}
	
	/**
	 * Method for eating food.
	 * @param currentFood Food object to be eaten
	 * @throws Exception, when provided Food which is not Meat
	 */
	@Override
	public void eat(Food currentFood) throws Exception{
		//Throws exception when provided Food object is not a Meat object
		if (currentFood instanceof Meat) {
			System.out.println("Animal is currently eating: " + currentFood.getName());
		}
		else {
			throw new Exception("Carnivores can't eat plants!");
		}
	}
}