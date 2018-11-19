import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class providing basic methods for handling flash card quizes using files with questions.
 * @author Wojciech Rozowski (wkr1u18)
 *
 */

public class FlashCardReader {
	BufferedReader reader;
	ArrayList<FlashCard> cardsList;
	/**
	 * Creates the instance of the class
	 * @param fileName String containing path to file with questions
	 */
	public FlashCardReader(String fileName) {
		try {
			reader = new BufferedReader(new FileReader(new File(fileName)));
		}
		catch (FileNotFoundException e){
			System.out.println(e);
		}
		cardsList = new ArrayList<FlashCard>();
	}
	
	/**
	 * Reads the contents of the file into object's internal structures.
	 */
	public void readFlashCards() {
		String fileInput;
		//Read the file lines, split them, create FlashCard objects and add them to cardsList
		if(fileIsReady()) {
			while((fileInput=getLine())!=null) {
				String[] questionArray = fileInput.split(":");
				cardsList.add(new FlashCard(questionArray[0], questionArray[1]));
			}
		}
	}
	
	/**
	 * Get next line from input file.
	 * @return String containing read line
	 */
	public String getLine() {
		try {
			if(fileIsReady()) {
				return reader.readLine();
			}
		}
		catch (IOException ioe)
		{
			System.out.println(ioe);
		}
		return null;
	}
	
	/**
	 * Checks whether file is ready to be read.
	 * @return Boolean value specifying whether file is ready to be read
	 */
	public Boolean fileIsReady() {
		//If reader failed to be initialised return false
		if(reader == null) {
			return false;
		}
		//Otherwise try to use ready() method
		try {
			return reader.ready();
		}
		catch (IOException ioe) {
			System.out.println(ioe);
			return false;
		}
	}
	
	/**
	 * Getter to ArrayList of {@link FlashCard} objects created from input file.
	 * @return ArrayList of {@link FlashCard} objects
	 */
	public ArrayList<FlashCard> getFlashCards(){
		readFlashCards();
		return cardsList;
	}
}
