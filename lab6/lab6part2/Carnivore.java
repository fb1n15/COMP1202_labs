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
}