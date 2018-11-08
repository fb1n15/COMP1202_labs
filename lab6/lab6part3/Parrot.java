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
	 * Method printing sound typical for parrots to the standard output.
	 */
	@Override
	public void makeNoise() {
		System.out.println("Screech");
	}
}