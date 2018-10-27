/**
 * Implementation of Wolf class for the first part of the lab
 * Lab 6 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */


public class Wolf extends Animal {
	//Constructor which calls Animal class constructor
	public Wolf(String initialName, int initialAge) {
		super(initialName, initialAge);
	}
	
	public void makeNoise() {
		System.out.println("Wooof");
	}
}
