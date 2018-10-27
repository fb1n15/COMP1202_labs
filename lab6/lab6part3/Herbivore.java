/**
 * Implementation of Herbivore class for the third part of the lab
 * Lab 6 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */

public class Herbivore extends Animal {
	public Herbivore(String initialName, int initialAge) {
		super(initialName,initialAge);
	}
	
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
