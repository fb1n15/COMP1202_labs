/**
 * Class describing wolves. Inherits from {@link Animal} class.
 * @author Wojciech Rozowski (wkr1u18)
 */

public class Wolf extends Animal {
	/**
	 * Constructor which calls Animal class constructor.
	 * @param initialName String containing wolf's name
	 * @param initialAge int containing wolf's age
	 */
	public Wolf(String initialName, int initialAge) {
		super(initialName, initialAge);
	}
	
	/**
	 * Method printing sound typical for wolves to the standard output.
	 */
	@Override
	public void makeNoise() {
		System.out.println("Wooof");
	}
}