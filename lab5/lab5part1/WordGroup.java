/**
 * Implementation of WordGroup class for first part of the lab
 * Lab 5 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */

package lab5part1;
import java.lang.String;

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
}