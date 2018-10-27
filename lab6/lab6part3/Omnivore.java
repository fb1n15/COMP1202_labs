/**
 * Implementation of Omnivore class for the third part of the lab
 * Lab 6 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */

public class Omnivore extends Animal {
	public Omnivore(String initialName, int initialAge) {
		super(initialName,initialAge);
	}
	
	public void eat(Food currentFood) {
		System.out.println("Animal is currently eating: " + currentFood.getName());
	}
}
