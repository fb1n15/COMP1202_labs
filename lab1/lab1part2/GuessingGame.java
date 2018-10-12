/**
 * Implementation of GuessingGame class for second part of the lab
 * Lab 1 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */

public class GuessingGame {
	public static void main(String[] args) {
		//Declarations of objects
		Integer numberToGuess, guessedNumber;
		Toolbox myToolbox = new Toolbox();
			
		numberToGuess = myToolbox.getRandomInteger(10); //Assign random number from range [1,10] to variable numberToGuess
		guessedNumber = myToolbox.readIntegerFromCmd(); //Assign value from input using myToolbox class to variable guessedNumber
			
		if(numberToGuess.equals(guessedNumber)) { //Case when the numbers are equal
			System.out.println("right");
		}
		//Method compareTo of class Integer returns value bigger than zero, if the value of the stored Integer is bigger than value of Integer passed as an argument to this method.
		else if(guessedNumber.compareTo(numberToGuess)>0) { //Case when the guessedNumber is bigger than numberToGuess
			System.out.println("too high");
		}
		else { //Case when guessedNumber is both not equal and not bigger than numberToGuess, so it must be smaller
			System.out.println("too low");
		}
	}
}
