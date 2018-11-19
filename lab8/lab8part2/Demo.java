import java.util.ArrayList;
import java.util.Collections;

/**
 * Class providing demo for sorting ArrayList of {@link Animal} objects
 * @author Wojciech Rozowski (wkr1u18)
 *
 */
public class Demo {
	/**
	 * Main method running all the tests
	 * @param args Array of String objects passed from console input, which are ignored
	 */
	public static void main(String[] args) {
		//Creates ArrayList of Animal objects, populates it with sample data and prints out animals' names and ages
		ArrayList<Animal> myList = new ArrayList<Animal>();
		myList.add(new Parrot("Mike", 7));
		myList.add(new Wolf());
		myList.add(new Parrot("John", 2));
		myList.add(new Wolf("Stacey", 1));
		printList(myList);
		
		//Sorts Animal objects by their age and prints out their name and age
		Collections.sort(myList);
		printList(myList);
		
		//Reverses the order of the sorted list and prints out animals' names and ages
		Collections.reverse(myList);
		printList(myList);
		
	}
	
	/**
	 * Prints out names and ages of {@link Animal} objects of the given ArrayList.
	 * @param currentList reference to ArrayList containing {@link Animal} objects 
	 */
	public static void printList(ArrayList<Animal> currentList) {
		System.out.println("Printing contents...");
		for(Animal a : currentList) {
			System.out.println("name: " + a.getName() + " age: " + a.getAge());
		}
	}
}
