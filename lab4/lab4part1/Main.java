/**
 * Lab4 part1 Main class implementation
 * @author Wojciech Rozowski (wkr1u18)
 */

public class Main {
	public static void main(String[] args) {
		Toolbox myToolbox = new Toolbox();
		//Part 1 of the exercise - using "for" loop program calculates the first 20 multiples of a number entered by user
		System.out.println("Hello! What multiplication table would you like to have calculated?");
		int number = myToolbox.readIntegerFromCmd();
		for(int i = 1; i <= 20; i++) {
			System.out.print(i*number + ", ");
		}
		System.out.println();

		//Part 2 of the exercise - Program calculates how many successive integers needs to be summed, to make up a total over 500
		int currentNumber = 1;
		int amountOfNumbers = 0;
		int sumOfNumbers = 0;
		while(sumOfNumbers < 500) {
			sumOfNumbers += currentNumber;
			currentNumber++;
			amountOfNumbers++;
		}
		System.out.println("The amount of consecutive integers we need to add is: " + amountOfNumbers);
	}
}
