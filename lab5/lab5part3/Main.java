/**
 * Implementation of Main class for the third part of the lab
 * Lab 5 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */

package lab5part3;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		// Declaration and instantiation of two sample WordGroup objects
		WordGroup platoQuote = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup rooseveltQuote= new WordGroup("When you play play hard when you work dont play at all");

		//Creates two HashMap using getWordsCount method on WordGroup objects
		HashMap<String, Integer> platoMap = platoQuote.getWordsCounts();
		HashMap<String, Integer> rooseveltMap = rooseveltQuote.getWordsCounts();
		
		printMapContents(platoMap);
		printMapContents(rooseveltMap);
	}
	
	//Prints out the contents of specified Map
	public static void printMapContents(Map currentMap) {
		//Creates iterator to Set object created from Map
		Iterator currentIterator = currentMap.entrySet().iterator();
		while (currentIterator.hasNext()) {
			//Create single map entry, containing the value pointed by iterator
			Map.Entry currentPair = (Map.Entry) currentIterator.next();
			System.out.println(currentPair.getKey() + ": " + currentPair.getValue());
		}
	}
}