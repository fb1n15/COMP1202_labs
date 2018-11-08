/**
 * Class for modelling omnivores. Extends {@link Animal} class.
 * @author Wojciech Rozowski (wkr1u18)
 *
 */

public class Omnivore extends Animal {
	/**
	 * Constructor which calls Animal class constructor.
	 * @param initialName String containing omnivore's name
	 * @param initialAge int containing omnivore's age
	 */
	public Omnivore(String initialName, int initialAge) {
		super(initialName,initialAge);
	}
}