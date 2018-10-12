/**
 * Completed FizzBuzz exercise
 * Lab 1 COMP1202.
 * @author Wojciech Rozowski (wkr1u18)
 */

public class FizzBuzz { //Wrapper of FizzBuzz class
	public static void main(String[] args) { //Main method wrapper
		for(Integer i = new Integer(1); i < 61; i++){ //Execute the for loop, for all values of Integer i in the range of [1,10]
			if(i % 3 != 0 && i % 5 != 0){ //If value of Integer I is not divisible both by 3 and 5, execute following procedures 
					System.out.print(i); //Put the value of Integer I to the standard output
				} //End of if statement
			if(i % 3 == 0){ //If the value of Integer I is divisible by 3, execute following procedures
				System.out.print("Fizz"); //Pass the string "Fizz" to the standard output
			} //End of if statement
			if(i % 5 == 0){ //If the value of Integer I is divisible by 5, execute following procedures
				System.out.print("Buzz"); //Pass the string "Buzz" to the standard output
			} //End of if statement
			System.out.println(); //Go to new line - pass character '\n' to the standard output
			} //End of if statement
	} //End of main method wrapper	
} //End of wrapper of FizzBuzz class
