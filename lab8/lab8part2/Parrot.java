/**
 * Class describing parrots. Extends {@link Omnivore} class.
 * @author Wojciech Rozowski (wkr1u18)
 */

public class Parrot extends Omnivore {
	/**
	 * Constructor which calls Animal class constructor.
	 * @param initialName String containing parrot's name
	 * @param initialAge int containing parrot's age
	 */
	public Parrot(String initialName, int initialAge) {
			super(initialName, initialAge);
	}
	
	/**
	 * Creates a Parrot object named "Polly" with given specified age.
	 * @param initialAge Integer object containing parrot's age
	 */
	public Parrot(Integer initialAge) {
		this("Polly", initialAge);
	}
	
	/**
	 * Method printing sound typical for parrots to the standard output.
	 */
	@Override
	public void makeNoise() {
		System.out.println("Screech");
	}
}