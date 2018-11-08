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
}