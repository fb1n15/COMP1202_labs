/**
 * Class for storing sentences and providing basic operations on them
 * @author Wojciech Rozowski (wkr1u18)
 */

import java.lang.String;

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
}