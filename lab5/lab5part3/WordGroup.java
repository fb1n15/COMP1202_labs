/**
 * Implementation of WordGroup class for the third part of the lab
 * Lab 5 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */

import java.lang.String;
import java.util.HashSet;
import java.util.HashMap;

public class WordGroup {
 	//instance variable
 	private String words;

	//Constructor takes string, converts it to lowercase and stores in instance variable words.
	public WordGroup(String sentence) {
		words = sentence.toLowerCase();
	}
	
	//Method which returns array of strings created by splitting words instace variable
	public String[] getWordArray() {
		return words.split(" ",0);
	}
	
	//Method that takes another WordGroup object, creates a HashSet for String objects, inserts all the words stored in current and parameter WordGroup Objects and returns this HashSet
	HashSet<String> getWordSet(WordGroup otherWordGroup) {
		HashSet<String> mySet = new HashSet<String>();
		String[] currentArray = this.getWordArray();
		String[] otherArray = otherWordGroup.getWordArray();
		for (int i = 0; i < currentArray.length; i++) {
			mySet.add(currentArray[i]);
		}
		for (int i = 0; i < otherArray.length; i++) {
			mySet.add(otherArray[i]);
		}
		return mySet;
	}
	
	//Method that returns created HashMap containing count of all words stored in WordGroup objects
	HashMap<String,Integer> getWordsCounts() {
		//Creates new HasMap object
		HashMap<String,Integer> myMap = new HashMap<String,Integer>();
		String[] myArray = this.getWordArray();
		//Iterates through wordArray
		
		for (int i = 0; i < myArray.length; i++) {
			//If HashMap has no entry (i.e. value equal to null), then set it's valur to one
			if (myMap.get(myArray[i])==null) {
				myMap.put(myArray[i], new Integer(1));
			}
			//Otherwise just increment the Value for certain Key
			else {
				myMap.put(myArray[i], new Integer(myMap.get(myArray[i])+1));
			}
		}
		return myMap;
	}
}