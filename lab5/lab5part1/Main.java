/**
 * Main class for the lab5part1. It tests the basic methods of {@link WordGroup} objects.
 * @author Wojciech Rozowski (wkr1u18)
 */
public class Main {
	/**
	 * Static main method containing all the testing procedures.
	 * @param args Command lines arguments passed to the program, which doesn't affect the behaviour of the program.
	 */
	public static void main(String[] args) {
		
		// Declaration and instantiation of two sample WordGroup objects
		WordGroup platoQuote = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
		WordGroup rooseveltQuote= new WordGroup("When you play play hard when you work dont play at all");

		// Creates two String arrays made by invoking getWordArray method on existing WordGroup objects
		String[] platoArray  = platoQuote.getWordArray();
		String[] rooseveltArray = rooseveltQuote.getWordArray();

		//Iterattion through both arrays and printing their contents.
		for(int i = 0; i < platoArray.length; i++) {
			System.out.println(platoArray[i]);
		}
		for(int i = 0; i < rooseveltArray.length; i++) {
			System.out.println(rooseveltArray[i]);
		}
	}
}