import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class providing basic methods for handling flash card quizes using files with questions.
 * @author Wojciech Rozowski (wkr1u18)
 *
 */

public class FlashCardReader {
	BufferedReader reader;
	/**
	 * Creates the instance of the class, while opening the specified file with questions.
	 * @param fileName String containing path to file with questions
	 */
	public FlashCardReader(String fileName) {
		try {
			reader = new BufferedReader(new FileReader(new File(fileName)));
		}
		catch (FileNotFoundException e){
			System.out.println(e);
		}
	}
	
	/**
	 * Get next line from input file.
	 * @return String containing read line
	 */
	public String getLine() {
		try {
			return reader.readLine();
		}
		catch (IOException ioe)
		{
			System.out.println(ioe);
			return null;
		}
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
}
