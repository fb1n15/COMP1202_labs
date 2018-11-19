import java.util.ArrayList;
import java.util.Scanner;

/**
 * method providing main quiz game functionality.
 * @author Wojciech Rozowski (wkr1u18)
 *
 */
public class Quiz {
	FlashCardReader myFlashCardReader;
	ArrayList<FlashCard> cardsList;
	Scanner textInput;
	Toolbox myToolbox;
	
	/**
	 * Creates a quiz object using given file containing set of flashcards
	 * @param filename String containing path to file with questions and answers
	 */
	public Quiz(String filename) {
		myFlashCardReader = new FlashCardReader(filename);
		cardsList = myFlashCardReader.getFlashCards();
		System.out.println(cardsList.size());
		myToolbox = new Toolbox();
		play();
	}
	
	/**
	 * Displays one flash card, gets user input and compares it to correct answer
	 * @param f Reference to {@link FlashCard} object to be displayed
	 */
	public void playFlashCard(FlashCard f) {
		System.out.println(f.getQuestion());
		String inputLine = myToolbox.readStringFromCmd();
		if(inputLine.equals(f.getAnswer())) {
			System.out.println("Correct!");
		}
		else {
			System.out.println("Wrong! The correct answer is: " + f.getAnswer());
		}
	}
	/**
	 * Calls playFlashCard for each {@link FlashCard} object from set of all flash cards.
	 */
	public void play() {
		for(FlashCard f: cardsList) {
			playFlashCard(f);
		}
	}
	/**
	 * Main method running the game
	 * @param args command line arguments, which are ignored
	 */
	public static void main(String [] args) {
		Quiz myQuiz = new Quiz("Questions.txt");
	}
}
