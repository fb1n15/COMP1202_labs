public class GuessingGame {
	public static void main(String[] args) {
		//declarations of objects
		Integer numberToGuess, guessedNumber;
		Toolbox myToolbox = new Toolbox();
			
		numberToGuess = myToolbox.getRandomInteger(10); //assign random number from range [1,10] to variable numberToGuess
		guessedNumber = myToolbox.readIntegerFromCmd(); //assign value from input using myToolbox class to variable guessedNumber
			
		if(numberToGuess.equals(guessedNumber)){ //case when the numbers are equal
			System.out.println("right");
		}
		//method compareTo of class Integer returns value bigger than zero, if the value of the stored Integer is bigger than value of Integer passed as an argument to this method.
		else if(guessedNumber.compareTo(numberToGuess)>0) { //case when the guessedNumber is bigger than numberToGuess
			System.out.println("too high");
		}
		else { //case when guessedNumber is both not equal and not bigger than numberToGuess, so it must be smaller
			System.out.println("too low");
		}
	}
}
