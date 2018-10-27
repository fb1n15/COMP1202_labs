/**
 * Implementation of Main class for first part of the lab
 * Lab 5 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */

public class Main {
	public static void main(String[] args) {
		// Declaration and instantiation of two sample WordGroup objects
		WordGroup platoQuote = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup rooseveltQuote= new WordGroup("When you play play hard when you work dont play at all");

		// Creates two String arrays made by invoking getWordArray method on existing WordGroup objects
		String[] platoArray  = platoQuote.getWordArray();
		String[] rooseveltArray = rooseveltQuote.getWordArray();


		for(int i = 0; i < platoArray.length; i++) {
			System.out.println(platoArray[i]);
		}
		for(int i = 0; i < rooseveltArray.length; i++) {
			System.out.println(rooseveltArray[i]);
		}
	}
}