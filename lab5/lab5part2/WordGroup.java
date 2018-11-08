/**
 * Class for storing sentences and providing basic operations on them
 * @author Wojciech Rozowski (wkr1u18)
 */

import java.lang.String;
import java.util.HashSet;

public class WordGroup {
 	//Instance variable for storing sentence
 	private String words;

 	/**
 	 * Constructor initialising the words with lower-case converted String object
 	 * @param sentence {@link WordGroup} object for an another source for the words.
 	 */
	public WordGroup(String sentence) {
		//Uses String.toLowerCase() method
		words = sentence.toLowerCase();
	}
	
	/**
	 * Creates Array of String objects from stored sentence in object of that class.
	 * @return Array of String objects with, where each entry is reserved for each word of the sentence stored in that class.
	 */
	public String[] getWordArray() {
		//Uses String.split() method.
		return words.split(" ",0);
	}
	
	/**
	 * Method that that creates HashSet of Strings containing words from this {@link WordGroup} object and other one passed as an argument.
	 * @param otherWordGroup {@link WordGroup} object containing words to be added to created HashSet of String objects.
	 * @return HashSet of String objects containing words both from this object and passed one as an argument. 
	 */
	HashSet<String> getWordSet(WordGroup otherWordGroup) {
		//Createss new HashSet object
		HashSet<String> mySet = new HashSet<String>();
		//Gets arrays of Strings using getWordArray method
		String[] currentArray = this.getWordArray();
		String[] otherArray = otherWordGroup.getWordArray();
		//Iterates through the arrays and add the words to HashSet
		for (int i = 0; i < currentArray.length; i++) {
			mySet.add(currentArray[i]);
		}
		for (int i = 0; i < otherArray.length; i++) {
			mySet.add(otherArray[i]);
		}
		//Returns the HashSet object
		return mySet;
	}
}