/**
 * Class for modelling plants. Inherits from {@link Food} class.
 * @author Wojciech Rozowski (wkr1u18)
 */


public class Plant extends Food {
	/**
	 * Public contructor taking initial name for the plant.
	 * @param initialName String containing plant's name
	 */
	public Plant(String initialName) {
		//Calls Food class constructor
		super(initialName);
	}
}