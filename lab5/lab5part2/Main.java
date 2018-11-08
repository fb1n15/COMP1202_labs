/**
 * Main class for the lab5part2. It tests the basic methods of {@link WordGroup} objects.
 * @author Wojciech Rozowski (wkr1u18)
 */

import java.util.HashSet;
import java.util.Iterator;

public class Main {
	/**
	 * Static main method containing all the testing procedures.
	 * @param args Command lines arguments passed to the program, which doesn't affect the behaviour of the program.
	 */
	public static void main(String[] args) {
		// Declaration and instantiation of two sample WordGroup objects
		WordGroup platoQuote = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup rooseveltQuote= new WordGroup("When you play play hard when you work dont play at all");

		//Create HashSet using getWordSet method on WordGroup object and get the iterator to it
		HashSet<String> myHashSet = platoQuote.getWordSet(rooseveltQuote);
		Iterator<String> myIterator = myHashSet.iterator();

		//Write out all the contents of myHashSet
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
	}
}