/**
 * Implementation of Animal class for the first part of the lab
 * Lab 6 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */


public class Animal {
	private String name;
	private int age;
	
	//Constructor taking initial values for name and age fields
	
	public Animal(String initialName, int initialAge) {
		name = initialName;
		age = initialAge;
	}
	
	//Getter method to name field
	public String getName() {
		return name;
	}
	
	//Getter method to age field
	public int getAge() {
		return age;
	}
}