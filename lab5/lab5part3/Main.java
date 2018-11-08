/**
 * Main class for the lab5part2. It tests the basic methods of {@link WordGroup} objects.
 * @author Wojciech Rozowski (wkr1u18)
 */

import java.util.Set;
import java.util.HashMap;

public class Main {
	/**
	 * Static main method containing all the testing procedures.
	 * @param args Command lines arguments passed to the program, which doesn't affect the behaviour of the program.
	 */
	public static void main(String[] args) {
		// Declaration and instantiation of two sample WordGroup objects
		WordGroup platoQuote = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup rooseveltQuote= new WordGroup("When you play play hard when you work dont play at all");

		//Creates two HashMap using getWordsCount method on WordGroup objects
		HashMap<String, Integer> platoMap = platoQuote.getWordCounts();
		HashMap<String, Integer> rooseveltMap = rooseveltQuote.getWordCounts();
		
		//Prints the conents of both maps using the static printMapContents method.
		printMapContents(platoMap);
		printMapContents(rooseveltMap);
	}
	
	/**
	 * Prints out the contents of specified Map.
	 * @param currentMap HashMap of pairs of String and Integer objects to be outputed to the standard output.
	 */
	public static void printMapContents(HashMap<String, Integer> currentMap) {
		//Create Set object containing first object of pairs stored in HashMap
		Set<String> currentSet = currentMap.keySet();
		//Iterate through elements in Set
		for(String s : currentSet) {
			System.out.println(s + ": " + currentMap.get(s));
		}
	}
}