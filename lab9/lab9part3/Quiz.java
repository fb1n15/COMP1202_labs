import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
	ArrayList<String> userAnswers;
	Scanner textInput;
	Toolbox myToolbox;
	PrintWriter textOutput;
	int totalScore = 0;
	
	/**
	 * Creates a quiz object using given file containing set of flashcards
	 * @param filename String containing path to file with questions and answers
	 */
	public Quiz(String filename) {
		try {
			textOutput = new PrintWriter(new File("save.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		userAnswers = new ArrayList<String>();
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
			inputLine = f.getQuestion()+","+inputLine+",right";
			totalScore++;
		}
		else {
			System.out.println("Wrong! The correct answer is: " + f.getAnswer());
			inputLine = f.getQuestion()+","+inputLine+",wrong";
		}
		userAnswers.add(inputLine);
	}
	/**
	 * Calls playFlashCard for each {@link FlashCard} object from set of all flash cards.
	 */
	public void play() {
		System.out.println("Do you want to have your answers saved?");
		String answer = myToolbox.readStringFromCmd();
		for(FlashCard f: cardsList) {
			playFlashCard(f);
		}
		if(answer.equals("yes")) {
			save();
		}

	}
	/**
	 * Main method running the game
	 * @param args command line arguments, which are ignored
	 */
	public static void main(String [] args) {
		Quiz myQuiz = new Quiz("Questions.txt");
	}
	/**
	 * Saves user answers to file
	 */
	public void save() {
		for(String s: userAnswers) {
			textOutput.println(s);
		}
		textOutput.println(totalScore + "," + cardsList.size() + "," + new Double(totalScore*100/cardsList.size()));
		textOutput.close();

	}
}
