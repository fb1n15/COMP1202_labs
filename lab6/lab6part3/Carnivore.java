/**
 * Implementation of Carnivore class for the third part of the lab
 * Lab 6 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */

public class Carnivore extends Animal {
	public Carnivore(String initialName, int initialAge) {
		super(initialName,initialAge);
	}
	
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
